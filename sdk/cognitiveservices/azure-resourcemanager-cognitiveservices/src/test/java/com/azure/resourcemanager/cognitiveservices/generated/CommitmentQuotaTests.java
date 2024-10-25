// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentQuota;
import org.junit.jupiter.api.Assertions;

public final class CommitmentQuotaTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CommitmentQuota model = BinaryData.fromString("{\"quantity\":6504833090063292182,\"unit\":\"mehhseyvjusrtsl\"}")
            .toObject(CommitmentQuota.class);
        Assertions.assertEquals(6504833090063292182L, model.quantity());
        Assertions.assertEquals("mehhseyvjusrtsl", model.unit());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CommitmentQuota model = new CommitmentQuota().withQuantity(6504833090063292182L).withUnit("mehhseyvjusrtsl");
        model = BinaryData.fromObject(model).toObject(CommitmentQuota.class);
        Assertions.assertEquals(6504833090063292182L, model.quantity());
        Assertions.assertEquals("mehhseyvjusrtsl", model.unit());
    }
}
