// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.ResourceQuotaInner;

public final class ResourceQuotaInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceQuotaInner model = BinaryData.fromString(
            "{\"id\":\"rdqmhjjdhtldwkyz\",\"amlWorkspaceLocation\":\"utknc\",\"type\":\"cwsvlxotog\",\"name\":{\"value\":\"upqsx\",\"localizedValue\":\"micykvceoveilo\"},\"limit\":2837447101588730204,\"unit\":\"Count\"}")
            .toObject(ResourceQuotaInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceQuotaInner model = new ResourceQuotaInner();
        model = BinaryData.fromObject(model).toObject(ResourceQuotaInner.class);
    }
}
