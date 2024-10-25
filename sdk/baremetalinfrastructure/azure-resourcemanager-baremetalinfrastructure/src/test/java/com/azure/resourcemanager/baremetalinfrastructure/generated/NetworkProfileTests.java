// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.baremetalinfrastructure.models.NetworkInterface;
import com.azure.resourcemanager.baremetalinfrastructure.models.NetworkProfile;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkProfile model = BinaryData.fromString(
            "{\"networkInterfaces\":[{\"ipAddress\":\"mjgr\"},{\"ipAddress\":\"wvukx\"},{\"ipAddress\":\"udccsnhsjc\"}],\"circuitId\":\"ejhkry\"}")
            .toObject(NetworkProfile.class);
        Assertions.assertEquals("mjgr", model.networkInterfaces().get(0).ipAddress());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkProfile model
            = new NetworkProfile().withNetworkInterfaces(Arrays.asList(new NetworkInterface().withIpAddress("mjgr"),
                new NetworkInterface().withIpAddress("wvukx"), new NetworkInterface().withIpAddress("udccsnhsjc")));
        model = BinaryData.fromObject(model).toObject(NetworkProfile.class);
        Assertions.assertEquals("mjgr", model.networkInterfaces().get(0).ipAddress());
    }
}
