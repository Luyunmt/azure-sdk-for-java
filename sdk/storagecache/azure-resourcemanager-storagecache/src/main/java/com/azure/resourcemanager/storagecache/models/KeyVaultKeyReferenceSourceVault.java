// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a resource Id to source Key Vault. */
@Fluent
public final class KeyVaultKeyReferenceSourceVault {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyVaultKeyReferenceSourceVault.class);

    /*
     * Resource Id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: Resource Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource Id.
     *
     * @param id the id value to set.
     * @return the KeyVaultKeyReferenceSourceVault object itself.
     */
    public KeyVaultKeyReferenceSourceVault withId(String id) {
        this.id = id;
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
