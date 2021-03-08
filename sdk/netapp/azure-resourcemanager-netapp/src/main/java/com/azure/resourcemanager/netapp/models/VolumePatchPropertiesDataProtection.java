// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DataProtection type volumes include an object containing details of the replication. */
@Fluent
public final class VolumePatchPropertiesDataProtection {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VolumePatchPropertiesDataProtection.class);

    /*
     * Backup Properties
     */
    @JsonProperty(value = "backup")
    private VolumeBackupProperties backup;

    /**
     * Get the backup property: Backup Properties.
     *
     * @return the backup value.
     */
    public VolumeBackupProperties backup() {
        return this.backup;
    }

    /**
     * Set the backup property: Backup Properties.
     *
     * @param backup the backup value to set.
     * @return the VolumePatchPropertiesDataProtection object itself.
     */
    public VolumePatchPropertiesDataProtection withBackup(VolumeBackupProperties backup) {
        this.backup = backup;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (backup() != null) {
            backup().validate();
        }
    }
}
