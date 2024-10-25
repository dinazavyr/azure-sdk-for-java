// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.reservations.models.SplitRequest;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SplitRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SplitRequest model = BinaryData.fromString(
            "{\"properties\":{\"quantities\":[389510865,1054713689,996084293,1344764188],\"reservationId\":\"hy\"}}")
            .toObject(SplitRequest.class);
        Assertions.assertEquals(389510865, model.quantities().get(0));
        Assertions.assertEquals("hy", model.reservationId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SplitRequest model
            = new SplitRequest().withQuantities(Arrays.asList(389510865, 1054713689, 996084293, 1344764188))
                .withReservationId("hy");
        model = BinaryData.fromObject(model).toObject(SplitRequest.class);
        Assertions.assertEquals(389510865, model.quantities().get(0));
        Assertions.assertEquals("hy", model.reservationId());
    }
}
