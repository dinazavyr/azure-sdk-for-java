// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.CommunityActionTypes;
import com.azure.resourcemanager.managednetworkfabric.models.Condition;
import com.azure.resourcemanager.managednetworkfabric.models.IpPrefixRule;
import org.junit.jupiter.api.Assertions;

public final class IpPrefixRuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IpPrefixRule model = BinaryData.fromString(
            "{\"action\":\"Deny\",\"sequenceNumber\":9177404831605341592,\"networkPrefix\":\"hkhg\",\"condition\":\"GreaterThanOrEqualTo\",\"subnetMaskLength\":\"wwkpphefsb\"}")
            .toObject(IpPrefixRule.class);
        Assertions.assertEquals(CommunityActionTypes.DENY, model.action());
        Assertions.assertEquals(9177404831605341592L, model.sequenceNumber());
        Assertions.assertEquals("hkhg", model.networkPrefix());
        Assertions.assertEquals(Condition.GREATER_THAN_OR_EQUAL_TO, model.condition());
        Assertions.assertEquals("wwkpphefsb", model.subnetMaskLength());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IpPrefixRule model = new IpPrefixRule().withAction(CommunityActionTypes.DENY)
            .withSequenceNumber(9177404831605341592L)
            .withNetworkPrefix("hkhg")
            .withCondition(Condition.GREATER_THAN_OR_EQUAL_TO)
            .withSubnetMaskLength("wwkpphefsb");
        model = BinaryData.fromObject(model).toObject(IpPrefixRule.class);
        Assertions.assertEquals(CommunityActionTypes.DENY, model.action());
        Assertions.assertEquals(9177404831605341592L, model.sequenceNumber());
        Assertions.assertEquals("hkhg", model.networkPrefix());
        Assertions.assertEquals(Condition.GREATER_THAN_OR_EQUAL_TO, model.condition());
        Assertions.assertEquals("wwkpphefsb", model.subnetMaskLength());
    }
}
