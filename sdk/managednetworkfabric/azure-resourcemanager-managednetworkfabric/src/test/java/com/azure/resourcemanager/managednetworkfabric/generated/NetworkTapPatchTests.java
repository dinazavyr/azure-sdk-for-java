// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.DestinationType;
import com.azure.resourcemanager.managednetworkfabric.models.Encapsulation;
import com.azure.resourcemanager.managednetworkfabric.models.IsolationDomainProperties;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapPatch;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapPatchableParametersDestinationsItem;
import com.azure.resourcemanager.managednetworkfabric.models.PollingType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class NetworkTapPatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkTapPatch model = BinaryData.fromString(
            "{\"properties\":{\"pollingType\":\"Push\",\"destinations\":[{\"name\":\"mbzquu\",\"destinationType\":\"IsolationDomain\",\"destinationId\":\"hbtqyzy\",\"isolationDomainProperties\":{\"encapsulation\":\"None\",\"neighborGroupIds\":[\"y\",\"vxjdqosxzmdz\",\"ybqfufkekzfkicxh\",\"evmnk\"]},\"destinationTapRuleId\":\"hvsr\"},{\"name\":\"ok\",\"destinationType\":\"IsolationDomain\",\"destinationId\":\"bjsarxsvmfpa\",\"isolationDomainProperties\":{\"encapsulation\":\"GRE\",\"neighborGroupIds\":[\"fgqpud\",\"gxgieabbfp\",\"xavlozukgs\",\"uhwyxjsfmaxcebn\"]},\"destinationTapRuleId\":\"oskemq\"}],\"annotation\":\"rwqxpjpvem\"},\"tags\":{\"mhyt\":\"httuobrx\"}}")
            .toObject(NetworkTapPatch.class);
        Assertions.assertEquals("httuobrx", model.tags().get("mhyt"));
        Assertions.assertEquals(PollingType.PUSH, model.pollingType());
        Assertions.assertEquals("mbzquu", model.destinations().get(0).name());
        Assertions.assertEquals(DestinationType.ISOLATION_DOMAIN, model.destinations().get(0).destinationType());
        Assertions.assertEquals("hbtqyzy", model.destinations().get(0).destinationId());
        Assertions.assertEquals(Encapsulation.NONE,
            model.destinations().get(0).isolationDomainProperties().encapsulation());
        Assertions.assertEquals("y", model.destinations().get(0).isolationDomainProperties().neighborGroupIds().get(0));
        Assertions.assertEquals("hvsr", model.destinations().get(0).destinationTapRuleId());
        Assertions.assertEquals("rwqxpjpvem", model.annotation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkTapPatch model = new NetworkTapPatch().withTags(mapOf("mhyt", "httuobrx"))
            .withPollingType(PollingType.PUSH)
            .withDestinations(Arrays.asList(
                new NetworkTapPatchableParametersDestinationsItem().withName("mbzquu")
                    .withDestinationType(DestinationType.ISOLATION_DOMAIN)
                    .withDestinationId("hbtqyzy")
                    .withIsolationDomainProperties(new IsolationDomainProperties().withEncapsulation(Encapsulation.NONE)
                        .withNeighborGroupIds(Arrays.asList("y", "vxjdqosxzmdz", "ybqfufkekzfkicxh", "evmnk")))
                    .withDestinationTapRuleId("hvsr"),
                new NetworkTapPatchableParametersDestinationsItem().withName("ok")
                    .withDestinationType(DestinationType.ISOLATION_DOMAIN)
                    .withDestinationId("bjsarxsvmfpa")
                    .withIsolationDomainProperties(new IsolationDomainProperties().withEncapsulation(Encapsulation.GRE)
                        .withNeighborGroupIds(Arrays.asList("fgqpud", "gxgieabbfp", "xavlozukgs", "uhwyxjsfmaxcebn")))
                    .withDestinationTapRuleId("oskemq")))
            .withAnnotation("rwqxpjpvem");
        model = BinaryData.fromObject(model).toObject(NetworkTapPatch.class);
        Assertions.assertEquals("httuobrx", model.tags().get("mhyt"));
        Assertions.assertEquals(PollingType.PUSH, model.pollingType());
        Assertions.assertEquals("mbzquu", model.destinations().get(0).name());
        Assertions.assertEquals(DestinationType.ISOLATION_DOMAIN, model.destinations().get(0).destinationType());
        Assertions.assertEquals("hbtqyzy", model.destinations().get(0).destinationId());
        Assertions.assertEquals(Encapsulation.NONE,
            model.destinations().get(0).isolationDomainProperties().encapsulation());
        Assertions.assertEquals("y", model.destinations().get(0).isolationDomainProperties().neighborGroupIds().get(0));
        Assertions.assertEquals("hvsr", model.destinations().get(0).destinationTapRuleId());
        Assertions.assertEquals("rwqxpjpvem", model.annotation());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
