// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.IpExtendedCommunityIdList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class IpExtendedCommunityIdListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IpExtendedCommunityIdList model
            = BinaryData.fromString("{\"ipExtendedCommunityIds\":[\"ssijuaxxfd\",\"ypkcpwsrqnn\",\"ju\"]}")
                .toObject(IpExtendedCommunityIdList.class);
        Assertions.assertEquals("ssijuaxxfd", model.ipExtendedCommunityIds().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IpExtendedCommunityIdList model = new IpExtendedCommunityIdList()
            .withIpExtendedCommunityIds(Arrays.asList("ssijuaxxfd", "ypkcpwsrqnn", "ju"));
        model = BinaryData.fromObject(model).toObject(IpExtendedCommunityIdList.class);
        Assertions.assertEquals("ssijuaxxfd", model.ipExtendedCommunityIds().get(0));
    }
}
