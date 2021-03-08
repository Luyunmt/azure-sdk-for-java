// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.fluent.ExtensionTopicsClient;
import com.azure.resourcemanager.eventgrid.fluent.models.ExtensionTopicInner;
import com.azure.resourcemanager.eventgrid.models.ExtensionTopic;
import com.azure.resourcemanager.eventgrid.models.ExtensionTopics;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ExtensionTopicsImpl implements ExtensionTopics {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExtensionTopicsImpl.class);

    private final ExtensionTopicsClient innerClient;

    private final EventGridManager serviceManager;

    public ExtensionTopicsImpl(ExtensionTopicsClient innerClient, EventGridManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ExtensionTopic get(String scope) {
        ExtensionTopicInner inner = this.serviceClient().get(scope);
        if (inner != null) {
            return new ExtensionTopicImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExtensionTopic> getWithResponse(String scope, Context context) {
        Response<ExtensionTopicInner> inner = this.serviceClient().getWithResponse(scope, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExtensionTopicImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ExtensionTopicsClient serviceClient() {
        return this.innerClient;
    }

    private EventGridManager manager() {
        return this.serviceManager;
    }
}
