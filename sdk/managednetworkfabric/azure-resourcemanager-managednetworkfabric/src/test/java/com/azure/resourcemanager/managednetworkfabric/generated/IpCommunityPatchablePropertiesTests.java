// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.IpCommunityPatchableProperties;
import com.azure.resourcemanager.managednetworkfabric.models.CommunityActionTypes;
import com.azure.resourcemanager.managednetworkfabric.models.IpCommunityRule;
import com.azure.resourcemanager.managednetworkfabric.models.WellKnownCommunities;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class IpCommunityPatchablePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IpCommunityPatchableProperties model = BinaryData.fromString(
            "{\"ipCommunityRules\":[{\"action\":\"Deny\",\"sequenceNumber\":1928417575349186903,\"wellKnownCommunities\":[\"GShut\",\"NoExport\",\"LocalAS\",\"NoExport\"],\"communityMembers\":[\"htuwgmev\",\"afpwzyifrkgwl\"]},{\"action\":\"Permit\",\"sequenceNumber\":1109055211295154941,\"wellKnownCommunities\":[\"Internet\",\"GShut\",\"NoAdvertise\",\"NoExport\"],\"communityMembers\":[\"imsfayorp\",\"avkjog\",\"sl\"]},{\"action\":\"Deny\",\"sequenceNumber\":7242894455052354139,\"wellKnownCommunities\":[\"NoAdvertise\",\"NoAdvertise\",\"GShut\",\"NoAdvertise\"],\"communityMembers\":[\"xa\",\"kqsykvwjtqpke\",\"myltj\"]},{\"action\":\"Permit\",\"sequenceNumber\":6735926581234061180,\"wellKnownCommunities\":[\"Internet\",\"LocalAS\"],\"communityMembers\":[\"cclfgxannn\"]}]}")
            .toObject(IpCommunityPatchableProperties.class);
        Assertions.assertEquals(CommunityActionTypes.DENY, model.ipCommunityRules().get(0).action());
        Assertions.assertEquals(1928417575349186903L, model.ipCommunityRules().get(0).sequenceNumber());
        Assertions.assertEquals(WellKnownCommunities.GSHUT,
            model.ipCommunityRules().get(0).wellKnownCommunities().get(0));
        Assertions.assertEquals("htuwgmev", model.ipCommunityRules().get(0).communityMembers().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IpCommunityPatchableProperties model = new IpCommunityPatchableProperties().withIpCommunityRules(Arrays.asList(
            new IpCommunityRule().withAction(CommunityActionTypes.DENY)
                .withSequenceNumber(1928417575349186903L)
                .withWellKnownCommunities(Arrays.asList(WellKnownCommunities.GSHUT, WellKnownCommunities.NO_EXPORT,
                    WellKnownCommunities.LOCAL_AS, WellKnownCommunities.NO_EXPORT))
                .withCommunityMembers(Arrays.asList("htuwgmev", "afpwzyifrkgwl")),
            new IpCommunityRule().withAction(CommunityActionTypes.PERMIT)
                .withSequenceNumber(1109055211295154941L)
                .withWellKnownCommunities(Arrays.asList(WellKnownCommunities.INTERNET, WellKnownCommunities.GSHUT,
                    WellKnownCommunities.NO_ADVERTISE, WellKnownCommunities.NO_EXPORT))
                .withCommunityMembers(Arrays.asList("imsfayorp", "avkjog", "sl")),
            new IpCommunityRule().withAction(CommunityActionTypes.DENY)
                .withSequenceNumber(7242894455052354139L)
                .withWellKnownCommunities(Arrays.asList(WellKnownCommunities.NO_ADVERTISE,
                    WellKnownCommunities.NO_ADVERTISE, WellKnownCommunities.GSHUT, WellKnownCommunities.NO_ADVERTISE))
                .withCommunityMembers(Arrays.asList("xa", "kqsykvwjtqpke", "myltj")),
            new IpCommunityRule().withAction(CommunityActionTypes.PERMIT)
                .withSequenceNumber(6735926581234061180L)
                .withWellKnownCommunities(Arrays.asList(WellKnownCommunities.INTERNET, WellKnownCommunities.LOCAL_AS))
                .withCommunityMembers(Arrays.asList("cclfgxannn"))));
        model = BinaryData.fromObject(model).toObject(IpCommunityPatchableProperties.class);
        Assertions.assertEquals(CommunityActionTypes.DENY, model.ipCommunityRules().get(0).action());
        Assertions.assertEquals(1928417575349186903L, model.ipCommunityRules().get(0).sequenceNumber());
        Assertions.assertEquals(WellKnownCommunities.GSHUT,
            model.ipCommunityRules().get(0).wellKnownCommunities().get(0));
        Assertions.assertEquals("htuwgmev", model.ipCommunityRules().get(0).communityMembers().get(0));
    }
}
