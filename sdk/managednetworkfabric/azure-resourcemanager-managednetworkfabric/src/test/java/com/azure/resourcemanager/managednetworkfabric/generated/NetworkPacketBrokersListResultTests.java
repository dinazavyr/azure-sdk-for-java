// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkPacketBrokerInner;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkPacketBrokersListResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class NetworkPacketBrokersListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkPacketBrokersListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"networkFabricId\":\"igqkzjuqwqa\",\"networkDeviceIds\":[\"zxpixhyo\"],\"sourceInterfaceIds\":[\"f\",\"bgsosc\",\"enezfvbennmfkbpj\",\"rtek\"],\"networkTapIds\":[\"thr\",\"pmdudsyiurzt\",\"ktjhffe\",\"q\"],\"neighborGroupIds\":[\"youergaghp\",\"zxkpyehhfdyld\"],\"provisioningState\":\"Accepted\"},\"location\":\"d\",\"tags\":{\"htdereun\":\"qiyu\",\"edznmxrfomckewv\":\"kakzwhpjlwy\",\"fjjtpdyzou\":\"yifop\"},\"id\":\"xfptofh\",\"name\":\"nuywe\",\"type\":\"ygv\"}],\"nextLink\":\"gaaqw\"}")
            .toObject(NetworkPacketBrokersListResult.class);
        Assertions.assertEquals("d", model.value().get(0).location());
        Assertions.assertEquals("qiyu", model.value().get(0).tags().get("htdereun"));
        Assertions.assertEquals("igqkzjuqwqa", model.value().get(0).networkFabricId());
        Assertions.assertEquals("gaaqw", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkPacketBrokersListResult model = new NetworkPacketBrokersListResult()
            .withValue(Arrays.asList(new NetworkPacketBrokerInner().withLocation("d")
                .withTags(mapOf("htdereun", "qiyu", "edznmxrfomckewv", "kakzwhpjlwy", "fjjtpdyzou", "yifop"))
                .withNetworkFabricId("igqkzjuqwqa")))
            .withNextLink("gaaqw");
        model = BinaryData.fromObject(model).toObject(NetworkPacketBrokersListResult.class);
        Assertions.assertEquals("d", model.value().get(0).location());
        Assertions.assertEquals("qiyu", model.value().get(0).tags().get("htdereun"));
        Assertions.assertEquals("igqkzjuqwqa", model.value().get(0).networkFabricId());
        Assertions.assertEquals("gaaqw", model.nextLink());
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
