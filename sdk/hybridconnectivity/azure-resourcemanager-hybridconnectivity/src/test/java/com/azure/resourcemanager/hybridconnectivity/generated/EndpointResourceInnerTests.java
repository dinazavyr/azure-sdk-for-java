// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridconnectivity.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridconnectivity.fluent.models.EndpointResourceInner;
import com.azure.resourcemanager.hybridconnectivity.models.EndpointProperties;
import com.azure.resourcemanager.hybridconnectivity.models.Type;
import org.junit.jupiter.api.Assertions;

public final class EndpointResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EndpointResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"type\":\"custom\",\"resourceId\":\"s\",\"provisioningState\":\"nyejhkryhtnap\"},\"id\":\"wlokjyem\",\"name\":\"kvnipjoxz\",\"type\":\"nchgej\"}")
            .toObject(EndpointResourceInner.class);
        Assertions.assertEquals(Type.CUSTOM, model.properties().type());
        Assertions.assertEquals("s", model.properties().resourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EndpointResourceInner model = new EndpointResourceInner()
            .withProperties(new EndpointProperties().withType(Type.CUSTOM).withResourceId("s"));
        model = BinaryData.fromObject(model).toObject(EndpointResourceInner.class);
        Assertions.assertEquals(Type.CUSTOM, model.properties().type());
        Assertions.assertEquals("s", model.properties().resourceId());
    }
}
