// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphManagementAgentType. */
public final class MicrosoftGraphManagementAgentType extends ExpandableStringEnum<MicrosoftGraphManagementAgentType> {
    /** Static value eas for MicrosoftGraphManagementAgentType. */
    public static final MicrosoftGraphManagementAgentType EAS = fromString("eas");

    /** Static value mdm for MicrosoftGraphManagementAgentType. */
    public static final MicrosoftGraphManagementAgentType MDM = fromString("mdm");

    /** Static value easMdm for MicrosoftGraphManagementAgentType. */
    public static final MicrosoftGraphManagementAgentType EAS_MDM = fromString("easMdm");

    /** Static value intuneClient for MicrosoftGraphManagementAgentType. */
    public static final MicrosoftGraphManagementAgentType INTUNE_CLIENT = fromString("intuneClient");

    /** Static value easIntuneClient for MicrosoftGraphManagementAgentType. */
    public static final MicrosoftGraphManagementAgentType EAS_INTUNE_CLIENT = fromString("easIntuneClient");

    /** Static value configurationManagerClient for MicrosoftGraphManagementAgentType. */
    public static final MicrosoftGraphManagementAgentType CONFIGURATION_MANAGER_CLIENT =
        fromString("configurationManagerClient");

    /** Static value configurationManagerClientMdm for MicrosoftGraphManagementAgentType. */
    public static final MicrosoftGraphManagementAgentType CONFIGURATION_MANAGER_CLIENT_MDM =
        fromString("configurationManagerClientMdm");

    /** Static value configurationManagerClientMdmEas for MicrosoftGraphManagementAgentType. */
    public static final MicrosoftGraphManagementAgentType CONFIGURATION_MANAGER_CLIENT_MDM_EAS =
        fromString("configurationManagerClientMdmEas");

    /** Static value unknown for MicrosoftGraphManagementAgentType. */
    public static final MicrosoftGraphManagementAgentType UNKNOWN = fromString("unknown");

    /** Static value jamf for MicrosoftGraphManagementAgentType. */
    public static final MicrosoftGraphManagementAgentType JAMF = fromString("jamf");

    /** Static value googleCloudDevicePolicyController for MicrosoftGraphManagementAgentType. */
    public static final MicrosoftGraphManagementAgentType GOOGLE_CLOUD_DEVICE_POLICY_CONTROLLER =
        fromString("googleCloudDevicePolicyController");

    /**
     * Creates or finds a MicrosoftGraphManagementAgentType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphManagementAgentType.
     */
    @JsonCreator
    public static MicrosoftGraphManagementAgentType fromString(String name) {
        return fromString(name, MicrosoftGraphManagementAgentType.class);
    }

    /** @return known MicrosoftGraphManagementAgentType values. */
    public static Collection<MicrosoftGraphManagementAgentType> values() {
        return values(MicrosoftGraphManagementAgentType.class);
    }
}
