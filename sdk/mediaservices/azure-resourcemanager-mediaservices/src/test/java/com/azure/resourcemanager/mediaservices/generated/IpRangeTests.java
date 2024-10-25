// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.IpRange;
import org.junit.jupiter.api.Assertions;

public final class IpRangeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IpRange model = BinaryData
            .fromString("{\"name\":\"pzbchck\",\"address\":\"zqioxiysuii\",\"subnetPrefixLength\":1822288960}")
            .toObject(IpRange.class);
        Assertions.assertEquals("pzbchck", model.name());
        Assertions.assertEquals("zqioxiysuii", model.address());
        Assertions.assertEquals(1822288960, model.subnetPrefixLength());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IpRange model = new IpRange().withName("pzbchck").withAddress("zqioxiysuii").withSubnetPrefixLength(1822288960);
        model = BinaryData.fromObject(model).toObject(IpRange.class);
        Assertions.assertEquals("pzbchck", model.name());
        Assertions.assertEquals("zqioxiysuii", model.address());
        Assertions.assertEquals(1822288960, model.subnetPrefixLength());
    }
}
