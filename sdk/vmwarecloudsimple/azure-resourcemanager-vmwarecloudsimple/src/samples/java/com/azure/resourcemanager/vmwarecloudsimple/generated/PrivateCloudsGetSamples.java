// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.generated;

/**
 * Samples for PrivateClouds Get.
 */
public final class PrivateCloudsGetSamples {
    /*
     * x-ms-original-file:
     * specification/vmwarecloudsimple/resource-manager/Microsoft.VMwareCloudSimple/stable/2019-04-01/examples/
     * GetPrivateCloud.json
     */
    /**
     * Sample code: GetPrivateCloud.
     * 
     * @param manager Entry point to VMwareCloudSimpleManager.
     */
    public static void getPrivateCloud(com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager manager) {
        manager.privateClouds().getWithResponse("myPrivateCloud", "westus2", com.azure.core.util.Context.NONE);
    }
}
