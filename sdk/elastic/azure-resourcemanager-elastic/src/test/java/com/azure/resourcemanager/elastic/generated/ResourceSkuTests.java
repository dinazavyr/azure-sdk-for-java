// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elastic.models.ResourceSku;
import org.junit.jupiter.api.Assertions;

public final class ResourceSkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceSku model = BinaryData.fromString("{\"name\":\"abkyqduujitcjcz\"}").toObject(ResourceSku.class);
        Assertions.assertEquals("abkyqduujitcjcz", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceSku model = new ResourceSku().withName("abkyqduujitcjcz");
        model = BinaryData.fromObject(model).toObject(ResourceSku.class);
        Assertions.assertEquals("abkyqduujitcjcz", model.name());
    }
}
