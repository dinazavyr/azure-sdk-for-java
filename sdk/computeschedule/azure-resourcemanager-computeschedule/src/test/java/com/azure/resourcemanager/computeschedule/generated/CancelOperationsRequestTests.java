// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computeschedule.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.computeschedule.models.CancelOperationsRequest;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CancelOperationsRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CancelOperationsRequest model = BinaryData
            .fromString("{\"operationIds\":[\"e\",\"qytbciq\",\"ouf\",\"mmnkzsmodmgl\"],\"correlationid\":\"ugpbkw\"}")
            .toObject(CancelOperationsRequest.class);
        Assertions.assertEquals("e", model.operationIds().get(0));
        Assertions.assertEquals("ugpbkw", model.correlationid());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CancelOperationsRequest model
            = new CancelOperationsRequest().withOperationIds(Arrays.asList("e", "qytbciq", "ouf", "mmnkzsmodmgl"))
                .withCorrelationid("ugpbkw");
        model = BinaryData.fromObject(model).toObject(CancelOperationsRequest.class);
        Assertions.assertEquals("e", model.operationIds().get(0));
        Assertions.assertEquals("ugpbkw", model.correlationid());
    }
}
