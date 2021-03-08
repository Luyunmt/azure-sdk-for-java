/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kubernetesconfiguration.v2021_03_01.implementation;

import com.microsoft.azure.management.kubernetesconfiguration.v2021_03_01.ResourceProviderOperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Supported operation of this resource provider.
 */
public class ResourceProviderOperationInner {
    /**
     * Operation name, in format of {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Display metadata associated with the operation.
     */
    @JsonProperty(value = "display")
    private ResourceProviderOperationDisplay display;

    /**
     * The flag that indicates whether the operation applies to data plane.
     */
    @JsonProperty(value = "isDataAction", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDataAction;

    /**
     * Get operation name, in format of {provider}/{resource}/{operation}.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set operation name, in format of {provider}/{resource}/{operation}.
     *
     * @param name the name value to set
     * @return the ResourceProviderOperationInner object itself.
     */
    public ResourceProviderOperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get display metadata associated with the operation.
     *
     * @return the display value
     */
    public ResourceProviderOperationDisplay display() {
        return this.display;
    }

    /**
     * Set display metadata associated with the operation.
     *
     * @param display the display value to set
     * @return the ResourceProviderOperationInner object itself.
     */
    public ResourceProviderOperationInner withDisplay(ResourceProviderOperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the flag that indicates whether the operation applies to data plane.
     *
     * @return the isDataAction value
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

}
