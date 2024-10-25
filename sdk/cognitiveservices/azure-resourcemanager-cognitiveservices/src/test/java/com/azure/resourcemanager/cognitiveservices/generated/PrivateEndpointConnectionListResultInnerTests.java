// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.cognitiveservices.fluent.models.PrivateEndpointConnectionListResultInner;
import com.azure.resourcemanager.cognitiveservices.models.PrivateEndpoint;
import com.azure.resourcemanager.cognitiveservices.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.cognitiveservices.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.cognitiveservices.models.PrivateLinkServiceConnectionState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionListResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionListResultInner model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"privateEndpoint\":{\"id\":\"jw\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"sluicpdggkzz\",\"actionsRequired\":\"mbmpaxmodfvuefy\"},\"provisioningState\":\"Creating\",\"groupIds\":[\"vmwy\",\"rfouyftaakcpw\"]},\"location\":\"vqtmnub\",\"etag\":\"kpzksmondjmq\",\"id\":\"xvy\",\"name\":\"omgkopkwho\",\"type\":\"v\"},{\"properties\":{\"privateEndpoint\":{\"id\":\"gxysmocmbqfqvm\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"zapvhelx\",\"actionsRequired\":\"glyatddckcbcuej\"},\"provisioningState\":\"Succeeded\",\"groupIds\":[\"iqi\",\"rhos\",\"sdqrhzoymibmrq\"]},\"location\":\"ahwfluszdtmhrk\",\"etag\":\"fyyvoq\",\"id\":\"cpi\",\"name\":\"xpbtgiwbwo\",\"type\":\"nwashrtd\"}]}")
            .toObject(PrivateEndpointConnectionListResultInner.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.PENDING,
            model.value().get(0).properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("sluicpdggkzz",
            model.value().get(0).properties().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("mbmpaxmodfvuefy",
            model.value().get(0).properties().privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("vmwy", model.value().get(0).properties().groupIds().get(0));
        Assertions.assertEquals("vqtmnub", model.value().get(0).location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionListResultInner model
            = new PrivateEndpointConnectionListResultInner()
                .withValue(
                    Arrays.asList(
                        new PrivateEndpointConnectionInner()
                            .withProperties(
                                new PrivateEndpointConnectionProperties().withPrivateEndpoint(new PrivateEndpoint())
                                    .withPrivateLinkServiceConnectionState(new PrivateLinkServiceConnectionState()
                                        .withStatus(PrivateEndpointServiceConnectionStatus.PENDING)
                                        .withDescription("sluicpdggkzz")
                                        .withActionsRequired("mbmpaxmodfvuefy"))
                                    .withGroupIds(Arrays.asList("vmwy", "rfouyftaakcpw")))
                            .withLocation("vqtmnub"),
                        new PrivateEndpointConnectionInner()
                            .withProperties(
                                new PrivateEndpointConnectionProperties().withPrivateEndpoint(new PrivateEndpoint())
                                    .withPrivateLinkServiceConnectionState(new PrivateLinkServiceConnectionState()
                                        .withStatus(PrivateEndpointServiceConnectionStatus.PENDING)
                                        .withDescription("zapvhelx")
                                        .withActionsRequired("glyatddckcbcuej"))
                                    .withGroupIds(Arrays.asList("iqi", "rhos", "sdqrhzoymibmrq")))
                            .withLocation("ahwfluszdtmhrk")));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionListResultInner.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.PENDING,
            model.value().get(0).properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("sluicpdggkzz",
            model.value().get(0).properties().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("mbmpaxmodfvuefy",
            model.value().get(0).properties().privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("vmwy", model.value().get(0).properties().groupIds().get(0));
        Assertions.assertEquals("vqtmnub", model.value().get(0).location());
    }
}
