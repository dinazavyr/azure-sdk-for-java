// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.fluidrelay.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.fluidrelay.models.FluidRelayEndpoints;

public final class FluidRelayEndpointsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FluidRelayEndpoints model = BinaryData.fromString(
            "{\"ordererEndpoints\":[\"jsprozvcpute\"],\"storageEndpoints\":[\"wmfdatscmdvpjhul\"],\"serviceEndpoints\":[\"vmkjozkrwfndiodj\"]}")
            .toObject(FluidRelayEndpoints.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FluidRelayEndpoints model = new FluidRelayEndpoints();
        model = BinaryData.fromObject(model).toObject(FluidRelayEndpoints.class);
    }
}
