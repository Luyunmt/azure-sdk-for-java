/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import com.microsoft.azure.management.synapse.v2020_12_01.PrivateLinkHubPrivateLinkResource;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2020_12_01.PrivateLinkResourceProperties;

class PrivateLinkHubPrivateLinkResourceImpl extends IndexableRefreshableWrapperImpl<PrivateLinkHubPrivateLinkResource, PrivateLinkResourceInner> implements PrivateLinkHubPrivateLinkResource {
    private final SynapseManager manager;
    private String resourceGroupName;
    private String privateLinkHubName;
    private String privateLinkResourceName;

    PrivateLinkHubPrivateLinkResourceImpl(PrivateLinkResourceInner inner,  SynapseManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.privateLinkHubName = IdParsingUtils.getValueFromIdByName(inner.id(), "privateLinkHubs");
        this.privateLinkResourceName = IdParsingUtils.getValueFromIdByName(inner.id(), "privateLinkResources");
    }

    @Override
    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<PrivateLinkResourceInner> getInnerAsync() {
        PrivateLinkHubPrivateLinkResourcesInner client = this.manager().inner().privateLinkHubPrivateLinkResources();
        return client.getAsync(this.resourceGroupName, this.privateLinkHubName, this.privateLinkResourceName);
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public PrivateLinkResourceProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
