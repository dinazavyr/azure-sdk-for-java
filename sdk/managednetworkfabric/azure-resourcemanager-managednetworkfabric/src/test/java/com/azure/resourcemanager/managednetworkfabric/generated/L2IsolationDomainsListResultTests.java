// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.L2IsolationDomainInner;
import com.azure.resourcemanager.managednetworkfabric.models.L2IsolationDomainsListResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class L2IsolationDomainsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        L2IsolationDomainsListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"networkFabricId\":\"egw\",\"vlanId\":397812436,\"mtu\":1816525505,\"configurationState\":\"Accepted\",\"provisioningState\":\"Updating\",\"administrativeState\":\"MAT\",\"annotation\":\"thaokgkskj\"},\"location\":\"bs\",\"tags\":{\"kpeexpgeumilh\":\"jqf\"},\"id\":\"uitrdexyiono\",\"name\":\"ninbdbzsxcwqqrs\",\"type\":\"pcbbprtugav\"},{\"properties\":{\"networkFabricId\":\"zbcyksiv\",\"vlanId\":284686585,\"mtu\":406980993,\"configurationState\":\"Accepted\",\"provisioningState\":\"Deleting\",\"administrativeState\":\"MAT\",\"annotation\":\"krftsjcwjjxsg\"},\"location\":\"awvifdxke\",\"tags\":{\"xvcmufunlcp\":\"hocjxwkloozrv\"},\"id\":\"xvi\",\"name\":\"yeyng\",\"type\":\"g\"},{\"properties\":{\"networkFabricId\":\"rquv\",\"vlanId\":563018487,\"mtu\":915199284,\"configurationState\":\"Deprovisioned\",\"provisioningState\":\"Failed\",\"administrativeState\":\"RMA\",\"annotation\":\"ueljtiahxmfqryar\"},\"location\":\"x\",\"tags\":{\"btl\":\"glcjkayspthzod\",\"kfmkmfdjxyxgbk\":\"jtgblios\",\"l\":\"qvjcteoe\",\"xv\":\"slskkz\"},\"id\":\"nzdpvoco\",\"name\":\"hpcnabxzfsn\",\"type\":\"gyte\"}],\"nextLink\":\"zilmhivzkww\"}")
            .toObject(L2IsolationDomainsListResult.class);
        Assertions.assertEquals("bs", model.value().get(0).location());
        Assertions.assertEquals("jqf", model.value().get(0).tags().get("kpeexpgeumilh"));
        Assertions.assertEquals("egw", model.value().get(0).networkFabricId());
        Assertions.assertEquals(397812436, model.value().get(0).vlanId());
        Assertions.assertEquals(1816525505, model.value().get(0).mtu());
        Assertions.assertEquals("thaokgkskj", model.value().get(0).annotation());
        Assertions.assertEquals("zilmhivzkww", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        L2IsolationDomainsListResult model = new L2IsolationDomainsListResult().withValue(Arrays.asList(
            new L2IsolationDomainInner().withLocation("bs")
                .withTags(mapOf("kpeexpgeumilh", "jqf"))
                .withNetworkFabricId("egw")
                .withVlanId(397812436)
                .withMtu(1816525505)
                .withAnnotation("thaokgkskj"),
            new L2IsolationDomainInner().withLocation("awvifdxke")
                .withTags(mapOf("xvcmufunlcp", "hocjxwkloozrv"))
                .withNetworkFabricId("zbcyksiv")
                .withVlanId(284686585)
                .withMtu(406980993)
                .withAnnotation("krftsjcwjjxsg"),
            new L2IsolationDomainInner().withLocation("x")
                .withTags(mapOf("btl", "glcjkayspthzod", "kfmkmfdjxyxgbk", "jtgblios", "l", "qvjcteoe", "xv", "slskkz"))
                .withNetworkFabricId("rquv")
                .withVlanId(563018487)
                .withMtu(915199284)
                .withAnnotation("ueljtiahxmfqryar")))
            .withNextLink("zilmhivzkww");
        model = BinaryData.fromObject(model).toObject(L2IsolationDomainsListResult.class);
        Assertions.assertEquals("bs", model.value().get(0).location());
        Assertions.assertEquals("jqf", model.value().get(0).tags().get("kpeexpgeumilh"));
        Assertions.assertEquals("egw", model.value().get(0).networkFabricId());
        Assertions.assertEquals(397812436, model.value().get(0).vlanId());
        Assertions.assertEquals(1816525505, model.value().get(0).mtu());
        Assertions.assertEquals("thaokgkskj", model.value().get(0).annotation());
        Assertions.assertEquals("zilmhivzkww", model.nextLink());
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
