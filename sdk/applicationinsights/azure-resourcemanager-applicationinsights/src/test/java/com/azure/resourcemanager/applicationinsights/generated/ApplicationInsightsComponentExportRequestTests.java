// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.applicationinsights.models.ApplicationInsightsComponentExportRequest;
import org.junit.jupiter.api.Assertions;

public final class ApplicationInsightsComponentExportRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationInsightsComponentExportRequest model = BinaryData.fromString(
            "{\"RecordTypes\":\"nmayhuybb\",\"DestinationType\":\"odepoogin\",\"DestinationAddress\":\"amiheognarxz\",\"IsEnabled\":\"heotusiv\",\"NotificationQueueEnabled\":\"v\",\"NotificationQueueUri\":\"iqihn\",\"DestinationStorageSubscriptionId\":\"ngbwjz\",\"DestinationStorageLocationId\":\"fygxgispemvtzfk\",\"DestinationAccountId\":\"ubljofxqe\"}")
            .toObject(ApplicationInsightsComponentExportRequest.class);
        Assertions.assertEquals("nmayhuybb", model.recordTypes());
        Assertions.assertEquals("odepoogin", model.destinationType());
        Assertions.assertEquals("amiheognarxz", model.destinationAddress());
        Assertions.assertEquals("heotusiv", model.isEnabled());
        Assertions.assertEquals("v", model.notificationQueueEnabled());
        Assertions.assertEquals("iqihn", model.notificationQueueUri());
        Assertions.assertEquals("ngbwjz", model.destinationStorageSubscriptionId());
        Assertions.assertEquals("fygxgispemvtzfk", model.destinationStorageLocationId());
        Assertions.assertEquals("ubljofxqe", model.destinationAccountId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationInsightsComponentExportRequest model
            = new ApplicationInsightsComponentExportRequest().withRecordTypes("nmayhuybb")
                .withDestinationType("odepoogin")
                .withDestinationAddress("amiheognarxz")
                .withIsEnabled("heotusiv")
                .withNotificationQueueEnabled("v")
                .withNotificationQueueUri("iqihn")
                .withDestinationStorageSubscriptionId("ngbwjz")
                .withDestinationStorageLocationId("fygxgispemvtzfk")
                .withDestinationAccountId("ubljofxqe");
        model = BinaryData.fromObject(model).toObject(ApplicationInsightsComponentExportRequest.class);
        Assertions.assertEquals("nmayhuybb", model.recordTypes());
        Assertions.assertEquals("odepoogin", model.destinationType());
        Assertions.assertEquals("amiheognarxz", model.destinationAddress());
        Assertions.assertEquals("heotusiv", model.isEnabled());
        Assertions.assertEquals("v", model.notificationQueueEnabled());
        Assertions.assertEquals("iqihn", model.notificationQueueUri());
        Assertions.assertEquals("ngbwjz", model.destinationStorageSubscriptionId());
        Assertions.assertEquals("fygxgispemvtzfk", model.destinationStorageLocationId());
        Assertions.assertEquals("ubljofxqe", model.destinationAccountId());
    }
}
