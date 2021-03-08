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
 * Class representing certificate renew request.
 */
@JsonFlatten
public class RenewCertificateOrderRequest extends ProxyOnlyResource {
    /**
     * Certificate Key Size.
     */
    @JsonProperty(value = "properties.keySize")
    private Integer keySize;

    /**
     * Csr to be used for re-key operation.
     */
    @JsonProperty(value = "properties.csr")
    private String csr;

    /**
     * Should we change the ASC type (from managed private key to external
     * private key and vice versa).
     */
    @JsonProperty(value = "properties.isPrivateKeyExternal")
    private Boolean isPrivateKeyExternal;

    /**
     * Get certificate Key Size.
     *
     * @return the keySize value
     */
    public Integer keySize() {
        return this.keySize;
    }

    /**
     * Set certificate Key Size.
     *
     * @param keySize the keySize value to set
     * @return the RenewCertificateOrderRequest object itself.
     */
    public RenewCertificateOrderRequest withKeySize(Integer keySize) {
        this.keySize = keySize;
        return this;
    }

    /**
     * Get csr to be used for re-key operation.
     *
     * @return the csr value
     */
    public String csr() {
        return this.csr;
    }

    /**
     * Set csr to be used for re-key operation.
     *
     * @param csr the csr value to set
     * @return the RenewCertificateOrderRequest object itself.
     */
    public RenewCertificateOrderRequest withCsr(String csr) {
        this.csr = csr;
        return this;
    }

    /**
     * Get should we change the ASC type (from managed private key to external private key and vice versa).
     *
     * @return the isPrivateKeyExternal value
     */
    public Boolean isPrivateKeyExternal() {
        return this.isPrivateKeyExternal;
    }

    /**
     * Set should we change the ASC type (from managed private key to external private key and vice versa).
     *
     * @param isPrivateKeyExternal the isPrivateKeyExternal value to set
     * @return the RenewCertificateOrderRequest object itself.
     */
    public RenewCertificateOrderRequest withIsPrivateKeyExternal(Boolean isPrivateKeyExternal) {
        this.isPrivateKeyExternal = isPrivateKeyExternal;
        return this;
    }

}
