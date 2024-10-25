// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.Layer3IpPrefixProperties;
import org.junit.jupiter.api.Assertions;

public final class Layer3IpPrefixPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Layer3IpPrefixProperties model = BinaryData.fromString(
            "{\"primaryIpv4Prefix\":\"ypanhxmpdxxzet\",\"primaryIpv6Prefix\":\"zjwotnxlkfhglh\",\"secondaryIpv4Prefix\":\"oxqwecrsnhpcse\",\"secondaryIpv6Prefix\":\"xovppqibukklvzr\"}")
            .toObject(Layer3IpPrefixProperties.class);
        Assertions.assertEquals("ypanhxmpdxxzet", model.primaryIpv4Prefix());
        Assertions.assertEquals("zjwotnxlkfhglh", model.primaryIpv6Prefix());
        Assertions.assertEquals("oxqwecrsnhpcse", model.secondaryIpv4Prefix());
        Assertions.assertEquals("xovppqibukklvzr", model.secondaryIpv6Prefix());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Layer3IpPrefixProperties model = new Layer3IpPrefixProperties().withPrimaryIpv4Prefix("ypanhxmpdxxzet")
            .withPrimaryIpv6Prefix("zjwotnxlkfhglh")
            .withSecondaryIpv4Prefix("oxqwecrsnhpcse")
            .withSecondaryIpv6Prefix("xovppqibukklvzr");
        model = BinaryData.fromObject(model).toObject(Layer3IpPrefixProperties.class);
        Assertions.assertEquals("ypanhxmpdxxzet", model.primaryIpv4Prefix());
        Assertions.assertEquals("zjwotnxlkfhglh", model.primaryIpv6Prefix());
        Assertions.assertEquals("oxqwecrsnhpcse", model.secondaryIpv4Prefix());
        Assertions.assertEquals("xovppqibukklvzr", model.secondaryIpv6Prefix());
    }
}
