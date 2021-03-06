// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;

/**
 * A builder for creating a new instance of the TextAnalyticsClient type.
 */
@ServiceClientBuilder(serviceClients = {TextAnalyticsClientImpl.class})
public final class TextAnalyticsClientBuilder {
    /*
     * Supported Cognitive Services endpoints (protocol and hostname, for
     * example: https://westus.api.cognitive.microsoft.com).
     */
    private String endpoint;

    /**
     * Sets Supported Cognitive Services endpoints (protocol and hostname, for example:
     * https://westus.api.cognitive.microsoft.com).
     *
     * @param endpoint the endpoint value.
     * @return the TextAnalyticsClientBuilder.
     */
    public TextAnalyticsClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the TextAnalyticsClientBuilder.
     */
    public TextAnalyticsClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of TextAnalyticsClientImpl with the provided parameters.
     *
     * @return an instance of TextAnalyticsClientImpl.
     */
    public TextAnalyticsClientImpl buildClient() {
        if (pipeline == null) {
            this.pipeline = new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(),
                new CookiePolicy()).build();
        }
        TextAnalyticsClientImpl client = new TextAnalyticsClientImpl(pipeline, endpoint);
        return client;
    }
}
