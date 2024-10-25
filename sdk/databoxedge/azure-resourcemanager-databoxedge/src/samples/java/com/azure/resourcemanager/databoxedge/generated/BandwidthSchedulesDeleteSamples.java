// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

/**
 * Samples for BandwidthSchedules Delete.
 */
public final class BandwidthSchedulesDeleteSamples {
    /*
     * x-ms-original-file: specification/databoxedge/resource-manager/Microsoft.DataBoxEdge/stable/2019-08-01/examples/
     * BandwidthScheduleDelete.json
     */
    /**
     * Sample code: BandwidthScheduleDelete.
     * 
     * @param manager Entry point to DataBoxEdgeManager.
     */
    public static void bandwidthScheduleDelete(com.azure.resourcemanager.databoxedge.DataBoxEdgeManager manager) {
        manager.bandwidthSchedules()
            .delete("testedgedevice", "bandwidth-1", "GroupForEdgeAutomation", com.azure.core.util.Context.NONE);
    }
}
