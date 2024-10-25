// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.generated;

/**
 * Samples for DnsResolverDomainLists GetByResourceGroup.
 */
public final class DnsResolverDomainListsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/dnsresolver/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/
     * DnsResolverDomainList_Get.json
     */
    /**
     * Sample code: Retrieve DNS resolver domain list.
     * 
     * @param manager Entry point to DnsResolverManager.
     */
    public static void retrieveDNSResolverDomainList(com.azure.resourcemanager.dnsresolver.DnsResolverManager manager) {
        manager.dnsResolverDomainLists()
            .getByResourceGroupWithResponse("sampleResourceGroup", "sampleDnsResolverDomainList",
                com.azure.core.util.Context.NONE);
    }
}
