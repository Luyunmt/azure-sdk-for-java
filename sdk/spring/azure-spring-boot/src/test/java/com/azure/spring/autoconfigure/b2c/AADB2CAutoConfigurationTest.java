// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.autoconfigure.b2c;

import org.junit.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.WebApplicationContextRunner;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class AADB2CAutoConfigurationTest {

    private final WebApplicationContextRunner contextRunner = new WebApplicationContextRunner()
        .withConfiguration(AutoConfigurations.of(AADB2CAutoConfiguration.class))
        .withPropertyValues(
            String.format("%s=%s", AADB2CConstants.BASE_URI, AADB2CConstants.TEST_BASE_URI),
            String.format("%s=%s", AADB2CConstants.TENANT_ID, AADB2CConstants.TEST_TENANT_ID),
            String.format("%s=%s", AADB2CConstants.CLIENT_ID, AADB2CConstants.TEST_CLIENT_ID),
            String.format("%s=%s", AADB2CConstants.CLIENT_SECRET, AADB2CConstants.TEST_CLIENT_SECRET),
            String.format("%s=%s", AADB2CConstants.LOGOUT_SUCCESS_URL, AADB2CConstants.TEST_LOGOUT_SUCCESS_URL),
            String.format("%s=%s", AADB2CConstants.LOGIN_FLOW, AADB2CConstants.TEST_KEY_SIGN_UP_OR_IN),
            String.format("%s.%s=%s", AADB2CConstants.USER_FLOWS,
                AADB2CConstants.TEST_KEY_SIGN_UP_OR_IN, AADB2CConstants.TEST_SIGN_UP_OR_IN_NAME),
            String.format("%s.%s=%s", AADB2CConstants.USER_FLOWS,
                AADB2CConstants.TEST_KEY_SIGN_IN, AADB2CConstants.TEST_SIGN_IN_NAME),
            String.format("%s.%s=%s", AADB2CConstants.USER_FLOWS,
                AADB2CConstants.TEST_KEY_SIGN_UP, AADB2CConstants.TEST_SIGN_UP_NAME),
            String.format("%s=%s", AADB2CConstants.CONFIG_PROMPT, AADB2CConstants.TEST_PROMPT),
            String.format("%s=%s", AADB2CConstants.CONFIG_LOGIN_HINT, AADB2CConstants.TEST_LOGIN_HINT),
            String.format("%s=%s", AADB2CConstants.USER_NAME_ATTRIBUTE_NAME, AADB2CConstants.TEST_ATTRIBUTE_NAME)
        );

    @Test
    public void testAutoConfigurationBean() {
        this.contextRunner.run(c -> {
            final AADB2CAutoConfiguration config = c.getBean(AADB2CAutoConfiguration.class);

            assertThat(config).isNotNull();
        });
    }

    @Test
    public void testPropertiesBean() {
        this.contextRunner.run(c -> {
            final AADB2CProperties properties = c.getBean(AADB2CProperties.class);

            assertThat(properties).isNotNull();
            assertThat(properties.getClientId()).isEqualTo(AADB2CConstants.TEST_CLIENT_ID);
            assertThat(properties.getClientSecret()).isEqualTo(AADB2CConstants.TEST_CLIENT_SECRET);
            assertThat(properties.getUserNameAttributeName()).isEqualTo(AADB2CConstants.TEST_ATTRIBUTE_NAME);

            Map<String, String> userFlows = properties.getUserFlows();
            final Object prompt = properties.getAuthenticateAdditionalParameters().get(AADB2CConstants.PROMPT);
            final String loginHint =
                String.valueOf(properties.getAuthenticateAdditionalParameters().get(AADB2CConstants.LOGIN_HINT));
            for (String clientName: userFlows.keySet()) {
                assertThat(userFlows.get(clientName)).isIn(AADB2CConstants.TEST_SIGN_IN_NAME,
                    AADB2CConstants.TEST_SIGN_UP_NAME, AADB2CConstants.TEST_SIGN_UP_OR_IN_NAME);
            }
            assertThat(prompt).isEqualTo(AADB2CConstants.TEST_PROMPT);
            assertThat(loginHint).isEqualTo(AADB2CConstants.TEST_LOGIN_HINT);
        });
    }

    @Test
    public void testAADB2CAuthorizationRequestResolverBean() {
        this.contextRunner.run(c -> {
            final AADB2CAuthorizationRequestResolver resolver = c.getBean(AADB2CAuthorizationRequestResolver.class);

            assertThat(resolver).isNotNull();
        });
    }

    @Test
    public void testLogoutSuccessHandlerBean() {
        this.contextRunner.run(c -> {
            final AADB2CLogoutSuccessHandler handler = c.getBean(AADB2CLogoutSuccessHandler.class);

            assertThat(handler).isNotNull();
        });
    }

    @Test
    public void testFilterBean() {
        this.contextRunner.run(c -> {
            final ClientRegistrationRepository repository = c.getBean(ClientRegistrationRepository.class);

            assertThat(repository).isNotNull();
        });
    }
}
