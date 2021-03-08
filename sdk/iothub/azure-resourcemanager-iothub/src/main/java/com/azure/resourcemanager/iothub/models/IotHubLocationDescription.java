// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Public representation of one of the locations where a resource is provisioned. */
@Fluent
public final class IotHubLocationDescription {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotHubLocationDescription.class);

    /*
     * The name of the Azure region
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * The role of the region, can be either primary or secondary. The primary
     * region is where the IoT hub is currently provisioned. The secondary
     * region is the Azure disaster recovery (DR) paired region and also the
     * region where the IoT hub can failover to.
     */
    @JsonProperty(value = "role")
    private IotHubReplicaRoleType role;

    /**
     * Get the location property: The name of the Azure region.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The name of the Azure region.
     *
     * @param location the location value to set.
     * @return the IotHubLocationDescription object itself.
     */
    public IotHubLocationDescription withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the role property: The role of the region, can be either primary or secondary. The primary region is where
     * the IoT hub is currently provisioned. The secondary region is the Azure disaster recovery (DR) paired region and
     * also the region where the IoT hub can failover to.
     *
     * @return the role value.
     */
    public IotHubReplicaRoleType role() {
        return this.role;
    }

    /**
     * Set the role property: The role of the region, can be either primary or secondary. The primary region is where
     * the IoT hub is currently provisioned. The secondary region is the Azure disaster recovery (DR) paired region and
     * also the region where the IoT hub can failover to.
     *
     * @param role the role value to set.
     * @return the IotHubLocationDescription object itself.
     */
    public IotHubLocationDescription withRole(IotHubReplicaRoleType role) {
        this.role = role;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
