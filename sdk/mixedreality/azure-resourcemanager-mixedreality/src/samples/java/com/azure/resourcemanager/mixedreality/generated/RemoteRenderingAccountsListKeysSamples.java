// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.generated;

/**
 * Samples for RemoteRenderingAccounts ListKeys.
 */
public final class RemoteRenderingAccountsListKeysSamples {
    /*
     * x-ms-original-file:
     * specification/mixedreality/resource-manager/Microsoft.MixedReality/stable/2021-01-01/examples/remote-rendering/
     * ListKeys.json
     */
    /**
     * Sample code: List remote rendering account key.
     * 
     * @param manager Entry point to MixedRealityManager.
     */
    public static void
        listRemoteRenderingAccountKey(com.azure.resourcemanager.mixedreality.MixedRealityManager manager) {
        manager.remoteRenderingAccounts()
            .listKeysWithResponse("MyResourceGroup", "MyAccount", com.azure.core.util.Context.NONE);
    }
}
