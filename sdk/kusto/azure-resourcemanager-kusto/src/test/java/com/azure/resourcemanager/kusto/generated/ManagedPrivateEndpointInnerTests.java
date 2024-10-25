// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.ManagedPrivateEndpointInner;
import org.junit.jupiter.api.Assertions;

public final class ManagedPrivateEndpointInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedPrivateEndpointInner model = BinaryData.fromString(
            "{\"properties\":{\"privateLinkResourceId\":\"xbaaabjyv\",\"privateLinkResourceRegion\":\"ffimrzrtuzqogsex\",\"groupId\":\"evfdnwnwm\",\"requestMessage\":\"zsyyceuzso\",\"provisioningState\":\"Canceled\"},\"id\":\"dpfrxtrthzvaytdw\",\"name\":\"qbrqubpaxhexiili\",\"type\":\"pdtii\"}")
            .toObject(ManagedPrivateEndpointInner.class);
        Assertions.assertEquals("xbaaabjyv", model.privateLinkResourceId());
        Assertions.assertEquals("ffimrzrtuzqogsex", model.privateLinkResourceRegion());
        Assertions.assertEquals("evfdnwnwm", model.groupId());
        Assertions.assertEquals("zsyyceuzso", model.requestMessage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedPrivateEndpointInner model = new ManagedPrivateEndpointInner().withPrivateLinkResourceId("xbaaabjyv")
            .withPrivateLinkResourceRegion("ffimrzrtuzqogsex")
            .withGroupId("evfdnwnwm")
            .withRequestMessage("zsyyceuzso");
        model = BinaryData.fromObject(model).toObject(ManagedPrivateEndpointInner.class);
        Assertions.assertEquals("xbaaabjyv", model.privateLinkResourceId());
        Assertions.assertEquals("ffimrzrtuzqogsex", model.privateLinkResourceRegion());
        Assertions.assertEquals("evfdnwnwm", model.groupId());
        Assertions.assertEquals("zsyyceuzso", model.requestMessage());
    }
}
