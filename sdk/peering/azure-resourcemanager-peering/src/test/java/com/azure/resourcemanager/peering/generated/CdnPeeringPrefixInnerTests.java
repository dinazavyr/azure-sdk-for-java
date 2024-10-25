// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.peering.fluent.models.CdnPeeringPrefixInner;

public final class CdnPeeringPrefixInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CdnPeeringPrefixInner model = BinaryData.fromString(
            "{\"properties\":{\"prefix\":\"kfo\",\"azureRegion\":\"nygj\",\"azureService\":\"jddeqsrdeupewnw\",\"isPrimaryRegion\":false,\"bgpCommunity\":\"jzyflu\"},\"id\":\"arhmofcqhsmy\",\"name\":\"rkdtmlxh\",\"type\":\"kuksjtxukcdm\"}")
            .toObject(CdnPeeringPrefixInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CdnPeeringPrefixInner model = new CdnPeeringPrefixInner();
        model = BinaryData.fromObject(model).toObject(CdnPeeringPrefixInner.class);
    }
}
