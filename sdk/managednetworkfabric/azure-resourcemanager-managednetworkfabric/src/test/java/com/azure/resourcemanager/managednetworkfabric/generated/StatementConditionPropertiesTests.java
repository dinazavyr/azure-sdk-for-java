// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.RoutePolicyConditionType;
import com.azure.resourcemanager.managednetworkfabric.models.StatementConditionProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class StatementConditionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StatementConditionProperties model = BinaryData.fromString(
            "{\"type\":\"Or\",\"ipPrefixId\":\"nfff\",\"ipExtendedCommunityIds\":[\"daw\",\"lmlcufbbjiu\"],\"ipCommunityIds\":[\"fhoajjylsyqyjn\"]}")
            .toObject(StatementConditionProperties.class);
        Assertions.assertEquals("fhoajjylsyqyjn", model.ipCommunityIds().get(0));
        Assertions.assertEquals(RoutePolicyConditionType.OR, model.type());
        Assertions.assertEquals("nfff", model.ipPrefixId());
        Assertions.assertEquals("daw", model.ipExtendedCommunityIds().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StatementConditionProperties model
            = new StatementConditionProperties().withIpCommunityIds(Arrays.asList("fhoajjylsyqyjn"))
                .withType(RoutePolicyConditionType.OR)
                .withIpPrefixId("nfff")
                .withIpExtendedCommunityIds(Arrays.asList("daw", "lmlcufbbjiu"));
        model = BinaryData.fromObject(model).toObject(StatementConditionProperties.class);
        Assertions.assertEquals("fhoajjylsyqyjn", model.ipCommunityIds().get(0));
        Assertions.assertEquals(RoutePolicyConditionType.OR, model.type());
        Assertions.assertEquals("nfff", model.ipPrefixId());
        Assertions.assertEquals("daw", model.ipExtendedCommunityIds().get(0));
    }
}
