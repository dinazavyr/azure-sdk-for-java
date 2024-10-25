// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databricks.models.EndpointDetail;
import org.junit.jupiter.api.Assertions;

public final class EndpointDetailTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EndpointDetail model = BinaryData
            .fromString(
                "{\"ipAddress\":\"vxodpu\",\"port\":1447641859,\"latency\":97.60419370044511,\"isAccessible\":true}")
            .toObject(EndpointDetail.class);
        Assertions.assertEquals("vxodpu", model.ipAddress());
        Assertions.assertEquals(1447641859, model.port());
        Assertions.assertEquals(97.60419370044511D, model.latency());
        Assertions.assertEquals(true, model.isAccessible());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EndpointDetail model = new EndpointDetail().withIpAddress("vxodpu")
            .withPort(1447641859)
            .withLatency(97.60419370044511D)
            .withIsAccessible(true);
        model = BinaryData.fromObject(model).toObject(EndpointDetail.class);
        Assertions.assertEquals("vxodpu", model.ipAddress());
        Assertions.assertEquals(1447641859, model.port());
        Assertions.assertEquals(97.60419370044511D, model.latency());
        Assertions.assertEquals(true, model.isAccessible());
    }
}
