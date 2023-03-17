// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.ReplicationInner;
import com.azure.resourcemanager.netapp.models.EndpointType;
import com.azure.resourcemanager.netapp.models.ReplicationSchedule;
import org.junit.jupiter.api.Assertions;

public final class ReplicationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReplicationInner model =
            BinaryData
                .fromString(
                    "{\"endpointType\":\"dst\",\"replicationSchedule\":\"hourly\",\"remoteVolumeResourceId\":\"hashsfwxosow\",\"remoteVolumeRegion\":\"cugicjoox\"}")
                .toObject(ReplicationInner.class);
        Assertions.assertEquals(EndpointType.DST, model.endpointType());
        Assertions.assertEquals(ReplicationSchedule.HOURLY, model.replicationSchedule());
        Assertions.assertEquals("hashsfwxosow", model.remoteVolumeResourceId());
        Assertions.assertEquals("cugicjoox", model.remoteVolumeRegion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReplicationInner model =
            new ReplicationInner()
                .withEndpointType(EndpointType.DST)
                .withReplicationSchedule(ReplicationSchedule.HOURLY)
                .withRemoteVolumeResourceId("hashsfwxosow")
                .withRemoteVolumeRegion("cugicjoox");
        model = BinaryData.fromObject(model).toObject(ReplicationInner.class);
        Assertions.assertEquals(EndpointType.DST, model.endpointType());
        Assertions.assertEquals(ReplicationSchedule.HOURLY, model.replicationSchedule());
        Assertions.assertEquals("hashsfwxosow", model.remoteVolumeResourceId());
        Assertions.assertEquals("cugicjoox", model.remoteVolumeRegion());
    }
}