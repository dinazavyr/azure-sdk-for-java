// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.generated;

/**
 * Samples for DedicatedCloudServices GetByResourceGroup.
 */
public final class DedicatedCloudServicesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/vmwarecloudsimple/resource-manager/Microsoft.VMwareCloudSimple/stable/2019-04-01/examples/
     * GetDedicatedCloudService.json
     */
    /**
     * Sample code: GetDedicatedCloudService.
     * 
     * @param manager Entry point to VMwareCloudSimpleManager.
     */
    public static void
        getDedicatedCloudService(com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager manager) {
        manager.dedicatedCloudServices()
            .getByResourceGroupWithResponse("myResourceGroup", "myService", com.azure.core.util.Context.NONE);
    }
}
