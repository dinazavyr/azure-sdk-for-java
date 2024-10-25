// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managementgroups.fluent.models.SubscriptionUnderManagementGroupInner;
import com.azure.resourcemanager.managementgroups.models.ListSubscriptionUnderManagementGroup;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ListSubscriptionUnderManagementGroupTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ListSubscriptionUnderManagementGroup model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"tenant\":\"wxdndnvowgujjug\",\"displayName\":\"kcglhslaz\",\"state\":\"ggd\"},\"id\":\"jixhbk\",\"name\":\"ofqweykhmenevfye\",\"type\":\"fwhybcibvy\"},{\"properties\":{\"tenant\":\"sit\",\"displayName\":\"naamde\",\"state\":\"hfiqscjeypvhe\"},\"id\":\"rkgqhcjrefo\",\"name\":\"gm\",\"type\":\"qsl\"}],\"nextLink\":\"yvxyqjp\"}")
            .toObject(ListSubscriptionUnderManagementGroup.class);
        Assertions.assertEquals("wxdndnvowgujjug", model.value().get(0).tenant());
        Assertions.assertEquals("kcglhslaz", model.value().get(0).displayName());
        Assertions.assertEquals("ggd", model.value().get(0).state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ListSubscriptionUnderManagementGroup model = new ListSubscriptionUnderManagementGroup().withValue(Arrays.asList(
            new SubscriptionUnderManagementGroupInner().withTenant("wxdndnvowgujjug")
                .withDisplayName("kcglhslaz")
                .withState("ggd"),
            new SubscriptionUnderManagementGroupInner().withTenant("sit")
                .withDisplayName("naamde")
                .withState("hfiqscjeypvhe")));
        model = BinaryData.fromObject(model).toObject(ListSubscriptionUnderManagementGroup.class);
        Assertions.assertEquals("wxdndnvowgujjug", model.value().get(0).tenant());
        Assertions.assertEquals("kcglhslaz", model.value().get(0).displayName());
        Assertions.assertEquals("ggd", model.value().get(0).state());
    }
}
