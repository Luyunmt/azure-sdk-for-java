/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ThreatIntel Whitelist for Firewall Policy.
 */
public class FirewallPolicyThreatIntelWhitelist {
    /**
     * List of IP addresses for the ThreatIntel Whitelist.
     */
    @JsonProperty(value = "ipAddresses")
    private List<String> ipAddresses;

    /**
     * List of FQDNs for the ThreatIntel Whitelist.
     */
    @JsonProperty(value = "fqdns")
    private List<String> fqdns;

    /**
     * Get list of IP addresses for the ThreatIntel Whitelist.
     *
     * @return the ipAddresses value
     */
    public List<String> ipAddresses() {
        return this.ipAddresses;
    }

    /**
     * Set list of IP addresses for the ThreatIntel Whitelist.
     *
     * @param ipAddresses the ipAddresses value to set
     * @return the FirewallPolicyThreatIntelWhitelist object itself.
     */
    public FirewallPolicyThreatIntelWhitelist withIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
        return this;
    }

    /**
     * Get list of FQDNs for the ThreatIntel Whitelist.
     *
     * @return the fqdns value
     */
    public List<String> fqdns() {
        return this.fqdns;
    }

    /**
     * Set list of FQDNs for the ThreatIntel Whitelist.
     *
     * @param fqdns the fqdns value to set
     * @return the FirewallPolicyThreatIntelWhitelist object itself.
     */
    public FirewallPolicyThreatIntelWhitelist withFqdns(List<String> fqdns) {
        this.fqdns = fqdns;
        return this;
    }

}
