// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.LiveEventEndpoint;
import org.junit.jupiter.api.Assertions;

public final class LiveEventEndpointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LiveEventEndpoint model = BinaryData.fromString("{\"protocol\":\"edyatrwyhqmibzyh\",\"url\":\"tsmypyynpcdp\"}")
            .toObject(LiveEventEndpoint.class);
        Assertions.assertEquals("edyatrwyhqmibzyh", model.protocol());
        Assertions.assertEquals("tsmypyynpcdp", model.url());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LiveEventEndpoint model = new LiveEventEndpoint().withProtocol("edyatrwyhqmibzyh").withUrl("tsmypyynpcdp");
        model = BinaryData.fromObject(model).toObject(LiveEventEndpoint.class);
        Assertions.assertEquals("edyatrwyhqmibzyh", model.protocol());
        Assertions.assertEquals("tsmypyynpcdp", model.url());
    }
}
