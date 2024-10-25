// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.fluent.models.LiveEventStatusInner;
import com.azure.resourcemanager.mediaservices.models.LiveEventHealthStatus;
import com.azure.resourcemanager.mediaservices.models.LiveEventIngestInterruption;
import com.azure.resourcemanager.mediaservices.models.LiveEventIngestion;
import com.azure.resourcemanager.mediaservices.models.LiveEventState;
import com.azure.resourcemanager.mediaservices.models.LiveEventTrackStatus;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LiveEventStatusInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LiveEventStatusInner model = BinaryData.fromString(
            "{\"state\":\"Stopped\",\"healthStatus\":\"Excellent\",\"healthDescriptions\":[\"hyxxrwlycoduhpk\",\"kgymareqnajxqug\"],\"lastUpdatedTime\":\"2020-12-30T20:00:15Z\",\"ingestion\":{\"streamName\":\"ubeddg\",\"begin\":\"2021-05-14T12:39:32Z\",\"end\":\"2021-06-13T04:37:53Z\",\"endReason\":\"mzqa\",\"ingestInterruptions\":[{\"begin\":\"2021-08-03T18:11:10Z\",\"end\":\"2020-12-24T01:34:19Z\",\"duration\":\"PT83H29M35S\",\"reason\":\"acqqudfnbyxbaaab\"},{\"begin\":\"2021-12-04T00:51:34Z\",\"end\":\"2021-02-14T21:18:32Z\",\"duration\":\"PT66H47M1S\",\"reason\":\"m\"}]},\"trackStatus\":[{\"trackId\":\"uzqogsexnevf\",\"expectedBitrate\":9043108785325273712,\"incomingBitrate\":8846945468622284044,\"ingestDrift\":\"zsyyceuzso\",\"requestReceived\":8701091086223812338,\"requestSucceeded\":3706325358985550286},{\"trackId\":\"xtrthz\",\"expectedBitrate\":4537388686790142089,\"incomingBitrate\":7184151913556268269,\"ingestDrift\":\"brqubp\",\"requestReceived\":134576264669262403,\"requestSucceeded\":6786807909891437356}]}")
            .toObject(LiveEventStatusInner.class);
        Assertions.assertEquals(LiveEventState.STOPPED, model.state());
        Assertions.assertEquals(LiveEventHealthStatus.EXCELLENT, model.healthStatus());
        Assertions.assertEquals("hyxxrwlycoduhpk", model.healthDescriptions().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-30T20:00:15Z"), model.lastUpdatedTime());
        Assertions.assertEquals("ubeddg", model.ingestion().streamName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-14T12:39:32Z"), model.ingestion().begin());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-13T04:37:53Z"), model.ingestion().end());
        Assertions.assertEquals("mzqa", model.ingestion().endReason());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-03T18:11:10Z"),
            model.ingestion().ingestInterruptions().get(0).begin());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-24T01:34:19Z"),
            model.ingestion().ingestInterruptions().get(0).end());
        Assertions.assertEquals(Duration.parse("PT83H29M35S"),
            model.ingestion().ingestInterruptions().get(0).duration());
        Assertions.assertEquals("acqqudfnbyxbaaab", model.ingestion().ingestInterruptions().get(0).reason());
        Assertions.assertEquals("uzqogsexnevf", model.trackStatus().get(0).trackId());
        Assertions.assertEquals(9043108785325273712L, model.trackStatus().get(0).expectedBitrate());
        Assertions.assertEquals(8846945468622284044L, model.trackStatus().get(0).incomingBitrate());
        Assertions.assertEquals("zsyyceuzso", model.trackStatus().get(0).ingestDrift());
        Assertions.assertEquals(8701091086223812338L, model.trackStatus().get(0).requestReceived());
        Assertions.assertEquals(3706325358985550286L, model.trackStatus().get(0).requestSucceeded());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LiveEventStatusInner model = new LiveEventStatusInner().withState(LiveEventState.STOPPED)
            .withHealthStatus(LiveEventHealthStatus.EXCELLENT)
            .withHealthDescriptions(Arrays.asList("hyxxrwlycoduhpk", "kgymareqnajxqug"))
            .withLastUpdatedTime(OffsetDateTime.parse("2020-12-30T20:00:15Z"))
            .withIngestion(new LiveEventIngestion().withStreamName("ubeddg")
                .withBegin(OffsetDateTime.parse("2021-05-14T12:39:32Z"))
                .withEnd(OffsetDateTime.parse("2021-06-13T04:37:53Z"))
                .withEndReason("mzqa")
                .withIngestInterruptions(Arrays.asList(
                    new LiveEventIngestInterruption().withBegin(OffsetDateTime.parse("2021-08-03T18:11:10Z"))
                        .withEnd(OffsetDateTime.parse("2020-12-24T01:34:19Z"))
                        .withDuration(Duration.parse("PT83H29M35S"))
                        .withReason("acqqudfnbyxbaaab"),
                    new LiveEventIngestInterruption().withBegin(OffsetDateTime.parse("2021-12-04T00:51:34Z"))
                        .withEnd(OffsetDateTime.parse("2021-02-14T21:18:32Z"))
                        .withDuration(Duration.parse("PT66H47M1S"))
                        .withReason("m"))))
            .withTrackStatus(Arrays.asList(
                new LiveEventTrackStatus().withTrackId("uzqogsexnevf")
                    .withExpectedBitrate(9043108785325273712L)
                    .withIncomingBitrate(8846945468622284044L)
                    .withIngestDrift("zsyyceuzso")
                    .withRequestReceived(8701091086223812338L)
                    .withRequestSucceeded(3706325358985550286L),
                new LiveEventTrackStatus().withTrackId("xtrthz")
                    .withExpectedBitrate(4537388686790142089L)
                    .withIncomingBitrate(7184151913556268269L)
                    .withIngestDrift("brqubp")
                    .withRequestReceived(134576264669262403L)
                    .withRequestSucceeded(6786807909891437356L)));
        model = BinaryData.fromObject(model).toObject(LiveEventStatusInner.class);
        Assertions.assertEquals(LiveEventState.STOPPED, model.state());
        Assertions.assertEquals(LiveEventHealthStatus.EXCELLENT, model.healthStatus());
        Assertions.assertEquals("hyxxrwlycoduhpk", model.healthDescriptions().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-30T20:00:15Z"), model.lastUpdatedTime());
        Assertions.assertEquals("ubeddg", model.ingestion().streamName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-14T12:39:32Z"), model.ingestion().begin());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-13T04:37:53Z"), model.ingestion().end());
        Assertions.assertEquals("mzqa", model.ingestion().endReason());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-03T18:11:10Z"),
            model.ingestion().ingestInterruptions().get(0).begin());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-24T01:34:19Z"),
            model.ingestion().ingestInterruptions().get(0).end());
        Assertions.assertEquals(Duration.parse("PT83H29M35S"),
            model.ingestion().ingestInterruptions().get(0).duration());
        Assertions.assertEquals("acqqudfnbyxbaaab", model.ingestion().ingestInterruptions().get(0).reason());
        Assertions.assertEquals("uzqogsexnevf", model.trackStatus().get(0).trackId());
        Assertions.assertEquals(9043108785325273712L, model.trackStatus().get(0).expectedBitrate());
        Assertions.assertEquals(8846945468622284044L, model.trackStatus().get(0).incomingBitrate());
        Assertions.assertEquals("zsyyceuzso", model.trackStatus().get(0).ingestDrift());
        Assertions.assertEquals(8701091086223812338L, model.trackStatus().get(0).requestReceived());
        Assertions.assertEquals(3706325358985550286L, model.trackStatus().get(0).requestSucceeded());
    }
}
