/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The HttpSettings model.
 */
@JsonFlatten
public class HttpSettings extends ProxyOnlyResource {
    /**
     * The requireHttps property.
     */
    @JsonProperty(value = "properties.requireHttps")
    private Boolean requireHttps;

    /**
     * The routes property.
     */
    @JsonProperty(value = "properties.routes")
    private HttpSettingsRoutes routes;

    /**
     * The forwardProxy property.
     */
    @JsonProperty(value = "properties.forwardProxy")
    private ForwardProxy forwardProxy;

    /**
     * Get the requireHttps value.
     *
     * @return the requireHttps value
     */
    public Boolean requireHttps() {
        return this.requireHttps;
    }

    /**
     * Set the requireHttps value.
     *
     * @param requireHttps the requireHttps value to set
     * @return the HttpSettings object itself.
     */
    public HttpSettings withRequireHttps(Boolean requireHttps) {
        this.requireHttps = requireHttps;
        return this;
    }

    /**
     * Get the routes value.
     *
     * @return the routes value
     */
    public HttpSettingsRoutes routes() {
        return this.routes;
    }

    /**
     * Set the routes value.
     *
     * @param routes the routes value to set
     * @return the HttpSettings object itself.
     */
    public HttpSettings withRoutes(HttpSettingsRoutes routes) {
        this.routes = routes;
        return this;
    }

    /**
     * Get the forwardProxy value.
     *
     * @return the forwardProxy value
     */
    public ForwardProxy forwardProxy() {
        return this.forwardProxy;
    }

    /**
     * Set the forwardProxy value.
     *
     * @param forwardProxy the forwardProxy value to set
     * @return the HttpSettings object itself.
     */
    public HttpSettings withForwardProxy(ForwardProxy forwardProxy) {
        this.forwardProxy = forwardProxy;
        return this;
    }

}
