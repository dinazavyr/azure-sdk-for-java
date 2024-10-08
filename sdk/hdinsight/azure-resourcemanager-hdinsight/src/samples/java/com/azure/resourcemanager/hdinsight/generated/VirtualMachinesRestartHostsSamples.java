// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import java.util.Arrays;

/**
 * Samples for VirtualMachines RestartHosts.
 */
public final class VirtualMachinesRestartHostsSamples {
    /*
     * x-ms-original-file:
     * specification/hdinsight/resource-manager/Microsoft.HDInsight/preview/2024-08-01-preview/examples/
     * RestartVirtualMachinesOperation.json
     */
    /**
     * Sample code: Restarts the specified HDInsight cluster hosts.
     * 
     * @param manager Entry point to HDInsightManager.
     */
    public static void
        restartsTheSpecifiedHDInsightClusterHosts(com.azure.resourcemanager.hdinsight.HDInsightManager manager) {
        manager.virtualMachines()
            .restartHosts("rg1", "cluster1", Arrays.asList("gateway1", "gateway3"), com.azure.core.util.Context.NONE);
    }
}
