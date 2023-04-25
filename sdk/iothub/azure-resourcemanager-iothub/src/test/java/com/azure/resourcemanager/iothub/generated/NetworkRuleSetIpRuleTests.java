// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.NetworkRuleIpAction;
import com.azure.resourcemanager.iothub.models.NetworkRuleSetIpRule;
import org.junit.jupiter.api.Assertions;

public final class NetworkRuleSetIpRuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkRuleSetIpRule model =
            BinaryData
                .fromString("{\"filterName\":\"vd\",\"action\":\"Allow\",\"ipMask\":\"grtfwvu\"}")
                .toObject(NetworkRuleSetIpRule.class);
        Assertions.assertEquals("vd", model.filterName());
        Assertions.assertEquals(NetworkRuleIpAction.ALLOW, model.action());
        Assertions.assertEquals("grtfwvu", model.ipMask());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkRuleSetIpRule model =
            new NetworkRuleSetIpRule().withFilterName("vd").withAction(NetworkRuleIpAction.ALLOW).withIpMask("grtfwvu");
        model = BinaryData.fromObject(model).toObject(NetworkRuleSetIpRule.class);
        Assertions.assertEquals("vd", model.filterName());
        Assertions.assertEquals(NetworkRuleIpAction.ALLOW, model.action());
        Assertions.assertEquals("grtfwvu", model.ipMask());
    }
}