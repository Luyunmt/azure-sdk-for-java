// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.MediaservicesManager;
import com.azure.resourcemanager.mediaservices.fluent.StreamingPoliciesClient;
import com.azure.resourcemanager.mediaservices.fluent.models.StreamingPolicyInner;
import com.azure.resourcemanager.mediaservices.models.StreamingPolicies;
import com.azure.resourcemanager.mediaservices.models.StreamingPolicy;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class StreamingPoliciesImpl implements StreamingPolicies {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StreamingPoliciesImpl.class);

    private final StreamingPoliciesClient innerClient;

    private final MediaservicesManager serviceManager;

    public StreamingPoliciesImpl(StreamingPoliciesClient innerClient, MediaservicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<StreamingPolicy> list(String resourceGroupName, String accountName) {
        PagedIterable<StreamingPolicyInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new StreamingPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<StreamingPolicy> list(
        String resourceGroupName, String accountName, String filter, Integer top, String orderby, Context context) {
        PagedIterable<StreamingPolicyInner> inner =
            this.serviceClient().list(resourceGroupName, accountName, filter, top, orderby, context);
        return Utils.mapPage(inner, inner1 -> new StreamingPolicyImpl(inner1, this.manager()));
    }

    public StreamingPolicy get(String resourceGroupName, String accountName, String streamingPolicyName) {
        StreamingPolicyInner inner = this.serviceClient().get(resourceGroupName, accountName, streamingPolicyName);
        if (inner != null) {
            return new StreamingPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<StreamingPolicy> getWithResponse(
        String resourceGroupName, String accountName, String streamingPolicyName, Context context) {
        Response<StreamingPolicyInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, streamingPolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StreamingPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String streamingPolicyName) {
        this.serviceClient().delete(resourceGroupName, accountName, streamingPolicyName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String streamingPolicyName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, streamingPolicyName, context);
    }

    public StreamingPolicy getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaServices'.", id)));
        }
        String streamingPolicyName = Utils.getValueFromIdByName(id, "streamingPolicies");
        if (streamingPolicyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'streamingPolicies'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, streamingPolicyName, Context.NONE).getValue();
    }

    public Response<StreamingPolicy> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaServices'.", id)));
        }
        String streamingPolicyName = Utils.getValueFromIdByName(id, "streamingPolicies");
        if (streamingPolicyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'streamingPolicies'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, streamingPolicyName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaServices'.", id)));
        }
        String streamingPolicyName = Utils.getValueFromIdByName(id, "streamingPolicies");
        if (streamingPolicyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'streamingPolicies'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, streamingPolicyName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaServices'.", id)));
        }
        String streamingPolicyName = Utils.getValueFromIdByName(id, "streamingPolicies");
        if (streamingPolicyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'streamingPolicies'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, streamingPolicyName, context);
    }

    private StreamingPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private MediaservicesManager manager() {
        return this.serviceManager;
    }

    public StreamingPolicyImpl define(String name) {
        return new StreamingPolicyImpl(name, this.manager());
    }
}
