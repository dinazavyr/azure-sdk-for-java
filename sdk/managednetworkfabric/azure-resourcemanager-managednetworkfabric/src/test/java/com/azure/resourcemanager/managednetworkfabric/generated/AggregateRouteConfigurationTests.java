// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.AggregateRoute;
import com.azure.resourcemanager.managednetworkfabric.models.AggregateRouteConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AggregateRouteConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AggregateRouteConfiguration model = BinaryData.fromString(
            "{\"ipv4Routes\":[{\"prefix\":\"qecroodl\"}],\"ipv6Routes\":[{\"prefix\":\"drdaasa\"},{\"prefix\":\"xob\"},{\"prefix\":\"mfkwiyjvzuk\"}]}")
            .toObject(AggregateRouteConfiguration.class);
        Assertions.assertEquals("qecroodl", model.ipv4Routes().get(0).prefix());
        Assertions.assertEquals("drdaasa", model.ipv6Routes().get(0).prefix());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AggregateRouteConfiguration model = new AggregateRouteConfiguration()
            .withIpv4Routes(Arrays.asList(new AggregateRoute().withPrefix("qecroodl")))
            .withIpv6Routes(Arrays.asList(new AggregateRoute().withPrefix("drdaasa"),
                new AggregateRoute().withPrefix("xob"), new AggregateRoute().withPrefix("mfkwiyjvzuk")));
        model = BinaryData.fromObject(model).toObject(AggregateRouteConfiguration.class);
        Assertions.assertEquals("qecroodl", model.ipv4Routes().get(0).prefix());
        Assertions.assertEquals("drdaasa", model.ipv6Routes().get(0).prefix());
    }
}
