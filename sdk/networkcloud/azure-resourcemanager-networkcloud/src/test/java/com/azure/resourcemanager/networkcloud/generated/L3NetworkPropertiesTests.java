// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.L3NetworkProperties;
import com.azure.resourcemanager.networkcloud.models.HybridAksIpamEnabled;
import com.azure.resourcemanager.networkcloud.models.HybridAksPluginType;
import com.azure.resourcemanager.networkcloud.models.IpAllocationType;
import org.junit.jupiter.api.Assertions;

public final class L3NetworkPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        L3NetworkProperties model = BinaryData.fromString(
            "{\"associatedResourceIds\":[\"rribd\",\"ibqipqkg\",\"vxndz\"],\"clusterId\":\"krefajpjo\",\"detailedStatus\":\"Provisioning\",\"detailedStatusMessage\":\"nyhgbijtji\",\"hybridAksClustersAssociatedIds\":[\"zs\",\"ab\"],\"hybridAksIpamEnabled\":\"False\",\"hybridAksPluginType\":\"DPDK\",\"interfaceName\":\"awfsdjpvkvpbjxbk\",\"ipAllocationType\":\"DualStack\",\"ipv4ConnectedPrefix\":\"dvncjabudurgk\",\"ipv6ConnectedPrefix\":\"mokzhjjklf\",\"l3IsolationDomainId\":\"hmouwqlgzrfze\",\"provisioningState\":\"Accepted\",\"virtualMachinesAssociatedIds\":[\"zi\",\"ayuhqlbjbsy\",\"bqwrvtldgm\"],\"vlan\":8878391256590645383}")
            .toObject(L3NetworkProperties.class);
        Assertions.assertEquals(HybridAksIpamEnabled.FALSE, model.hybridAksIpamEnabled());
        Assertions.assertEquals(HybridAksPluginType.DPDK, model.hybridAksPluginType());
        Assertions.assertEquals("awfsdjpvkvpbjxbk", model.interfaceName());
        Assertions.assertEquals(IpAllocationType.DUAL_STACK, model.ipAllocationType());
        Assertions.assertEquals("dvncjabudurgk", model.ipv4ConnectedPrefix());
        Assertions.assertEquals("mokzhjjklf", model.ipv6ConnectedPrefix());
        Assertions.assertEquals("hmouwqlgzrfze", model.l3IsolationDomainId());
        Assertions.assertEquals(8878391256590645383L, model.vlan());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        L3NetworkProperties model = new L3NetworkProperties().withHybridAksIpamEnabled(HybridAksIpamEnabled.FALSE)
            .withHybridAksPluginType(HybridAksPluginType.DPDK)
            .withInterfaceName("awfsdjpvkvpbjxbk")
            .withIpAllocationType(IpAllocationType.DUAL_STACK)
            .withIpv4ConnectedPrefix("dvncjabudurgk")
            .withIpv6ConnectedPrefix("mokzhjjklf")
            .withL3IsolationDomainId("hmouwqlgzrfze")
            .withVlan(8878391256590645383L);
        model = BinaryData.fromObject(model).toObject(L3NetworkProperties.class);
        Assertions.assertEquals(HybridAksIpamEnabled.FALSE, model.hybridAksIpamEnabled());
        Assertions.assertEquals(HybridAksPluginType.DPDK, model.hybridAksPluginType());
        Assertions.assertEquals("awfsdjpvkvpbjxbk", model.interfaceName());
        Assertions.assertEquals(IpAllocationType.DUAL_STACK, model.ipAllocationType());
        Assertions.assertEquals("dvncjabudurgk", model.ipv4ConnectedPrefix());
        Assertions.assertEquals("mokzhjjklf", model.ipv6ConnectedPrefix());
        Assertions.assertEquals("hmouwqlgzrfze", model.l3IsolationDomainId());
        Assertions.assertEquals(8878391256590645383L, model.vlan());
    }
}
