// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.LiveEventIngestInterruption;
import java.time.Duration;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class LiveEventIngestInterruptionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LiveEventIngestInterruption model = BinaryData.fromString(
            "{\"begin\":\"2021-10-30T20:25:20Z\",\"end\":\"2021-11-18T02:26Z\",\"duration\":\"PT61H59M50S\",\"reason\":\"kooebwnu\"}")
            .toObject(LiveEventIngestInterruption.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-30T20:25:20Z"), model.begin());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-18T02:26Z"), model.end());
        Assertions.assertEquals(Duration.parse("PT61H59M50S"), model.duration());
        Assertions.assertEquals("kooebwnu", model.reason());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LiveEventIngestInterruption model
            = new LiveEventIngestInterruption().withBegin(OffsetDateTime.parse("2021-10-30T20:25:20Z"))
                .withEnd(OffsetDateTime.parse("2021-11-18T02:26Z"))
                .withDuration(Duration.parse("PT61H59M50S"))
                .withReason("kooebwnu");
        model = BinaryData.fromObject(model).toObject(LiveEventIngestInterruption.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-30T20:25:20Z"), model.begin());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-18T02:26Z"), model.end());
        Assertions.assertEquals(Duration.parse("PT61H59M50S"), model.duration());
        Assertions.assertEquals("kooebwnu", model.reason());
    }
}
