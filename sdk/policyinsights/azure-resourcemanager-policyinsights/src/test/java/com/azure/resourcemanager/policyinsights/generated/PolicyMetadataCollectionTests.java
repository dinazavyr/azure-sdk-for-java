// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.policyinsights.models.PolicyMetadataCollection;

public final class PolicyMetadataCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PolicyMetadataCollection model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"metadataId\":\"jzhajoy\",\"category\":\"jlmuoyxprimrsopt\",\"title\":\"cjmeislstvasy\",\"owner\":\"xdza\",\"additionalContentUrl\":\"weoohguufuzboyj\",\"metadata\":\"datahwtzolb\"},\"id\":\"mwmdxmebwjscjpa\",\"type\":\"xveabf\",\"name\":\"nmwmqtibx\"}],\"nextLink\":\"jddtvqct\"}")
            .toObject(PolicyMetadataCollection.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PolicyMetadataCollection model = new PolicyMetadataCollection();
        model = BinaryData.fromObject(model).toObject(PolicyMetadataCollection.class);
    }
}
