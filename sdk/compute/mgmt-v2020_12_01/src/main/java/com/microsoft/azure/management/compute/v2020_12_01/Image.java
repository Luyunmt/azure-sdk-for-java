/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2020_12_01.implementation.ComputeManager;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.compute.v2020_12_01.implementation.ImageInner;

/**
 * Type representing Image.
 */
public interface Image extends HasInner<ImageInner>, Resource, GroupableResourceCore<ComputeManager, ImageInner>, HasResourceGroup, Refreshable<Image>, Updatable<Image.Update>, HasManager<ComputeManager> {
    /**
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * @return the hyperVGeneration value.
     */
    HyperVGenerationTypes hyperVGeneration();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the sourceVirtualMachine value.
     */
    SubResource sourceVirtualMachine();

    /**
     * @return the storageProfile value.
     */
    ImageStorageProfile storageProfile();

    /**
     * The entirety of the Image definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Image definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Image definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Image definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the image definition allowing to specify ExtendedLocation.
         */
        interface WithExtendedLocation {
            /**
             * Specifies extendedLocation.
             * @param extendedLocation The extended location of the Image
             * @return the next definition stage
             */
            WithCreate withExtendedLocation(ExtendedLocation extendedLocation);
        }

        /**
         * The stage of the image definition allowing to specify HyperVGeneration.
         */
        interface WithHyperVGeneration {
            /**
             * Specifies hyperVGeneration.
             * @param hyperVGeneration Gets the HyperVGenerationType of the VirtualMachine created from the image. Possible values include: 'V1', 'V2'
             * @return the next definition stage
             */
            WithCreate withHyperVGeneration(HyperVGenerationTypes hyperVGeneration);
        }

        /**
         * The stage of the image definition allowing to specify SourceVirtualMachine.
         */
        interface WithSourceVirtualMachine {
            /**
             * Specifies sourceVirtualMachine.
             * @param sourceVirtualMachine The source virtual machine from which Image is created
             * @return the next definition stage
             */
            WithCreate withSourceVirtualMachine(SubResource sourceVirtualMachine);
        }

        /**
         * The stage of the image definition allowing to specify StorageProfile.
         */
        interface WithStorageProfile {
            /**
             * Specifies storageProfile.
             * @param storageProfile Specifies the storage settings for the virtual machine disks
             * @return the next definition stage
             */
            WithCreate withStorageProfile(ImageStorageProfile storageProfile);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Image>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithExtendedLocation, DefinitionStages.WithHyperVGeneration, DefinitionStages.WithSourceVirtualMachine, DefinitionStages.WithStorageProfile {
        }
    }
    /**
     * The template for a Image update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Image>, Resource.UpdateWithTags<Update>, UpdateStages.WithHyperVGeneration, UpdateStages.WithSourceVirtualMachine, UpdateStages.WithStorageProfile {
    }

    /**
     * Grouping of Image update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the image update allowing to specify HyperVGeneration.
         */
        interface WithHyperVGeneration {
            /**
             * Specifies hyperVGeneration.
             * @param hyperVGeneration Gets the HyperVGenerationType of the VirtualMachine created from the image. Possible values include: 'V1', 'V2'
             * @return the next update stage
             */
            Update withHyperVGeneration(HyperVGenerationTypes hyperVGeneration);
        }

        /**
         * The stage of the image update allowing to specify SourceVirtualMachine.
         */
        interface WithSourceVirtualMachine {
            /**
             * Specifies sourceVirtualMachine.
             * @param sourceVirtualMachine The source virtual machine from which Image is created
             * @return the next update stage
             */
            Update withSourceVirtualMachine(SubResource sourceVirtualMachine);
        }

        /**
         * The stage of the image update allowing to specify StorageProfile.
         */
        interface WithStorageProfile {
            /**
             * Specifies storageProfile.
             * @param storageProfile Specifies the storage settings for the virtual machine disks
             * @return the next update stage
             */
            Update withStorageProfile(ImageStorageProfile storageProfile);
        }

    }
}
