// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.reservations.fluent.models.PatchProperties;
import com.azure.resourcemanager.reservations.models.AppliedScopeProperties;
import com.azure.resourcemanager.reservations.models.AppliedScopeType;
import com.azure.resourcemanager.reservations.models.InstanceFlexibility;
import com.azure.resourcemanager.reservations.models.PatchPropertiesRenewProperties;
import com.azure.resourcemanager.reservations.models.PurchaseRequest;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PatchPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PatchProperties model = BinaryData.fromString(
            "{\"appliedScopeType\":\"Shared\",\"appliedScopes\":[\"bh\",\"bnlankxmyskpb\",\"enbtkcxywny\"],\"appliedScopeProperties\":{\"tenantId\":\"synlqidybyxczfc\",\"managementGroupId\":\"aaxdbabphlwrq\",\"subscriptionId\":\"ktsthsucocmny\",\"resourceGroupId\":\"zt\",\"displayName\":\"twwrqp\"},\"instanceFlexibility\":\"Off\",\"name\":\"kzywbiex\",\"renew\":true,\"renewProperties\":{\"purchaseProperties\":{\"location\":\"xibxujwbhqwalm\"}},\"reviewDateTime\":\"2021-04-22T03:08:20Z\"}")
            .toObject(PatchProperties.class);
        Assertions.assertEquals(AppliedScopeType.SHARED, model.appliedScopeType());
        Assertions.assertEquals("bh", model.appliedScopes().get(0));
        Assertions.assertEquals("synlqidybyxczfc", model.appliedScopeProperties().tenantId());
        Assertions.assertEquals("aaxdbabphlwrq", model.appliedScopeProperties().managementGroupId());
        Assertions.assertEquals("ktsthsucocmny", model.appliedScopeProperties().subscriptionId());
        Assertions.assertEquals("zt", model.appliedScopeProperties().resourceGroupId());
        Assertions.assertEquals("twwrqp", model.appliedScopeProperties().displayName());
        Assertions.assertEquals(InstanceFlexibility.OFF, model.instanceFlexibility());
        Assertions.assertEquals("kzywbiex", model.name());
        Assertions.assertEquals(true, model.renew());
        Assertions.assertEquals("xibxujwbhqwalm", model.renewProperties().purchaseProperties().location());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-22T03:08:20Z"), model.reviewDateTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PatchProperties model = new PatchProperties().withAppliedScopeType(AppliedScopeType.SHARED)
            .withAppliedScopes(Arrays.asList("bh", "bnlankxmyskpb", "enbtkcxywny"))
            .withAppliedScopeProperties(new AppliedScopeProperties().withTenantId("synlqidybyxczfc")
                .withManagementGroupId("aaxdbabphlwrq")
                .withSubscriptionId("ktsthsucocmny")
                .withResourceGroupId("zt")
                .withDisplayName("twwrqp"))
            .withInstanceFlexibility(InstanceFlexibility.OFF)
            .withName("kzywbiex")
            .withRenew(true)
            .withRenewProperties(new PatchPropertiesRenewProperties()
                .withPurchaseProperties(new PurchaseRequest().withLocation("xibxujwbhqwalm")))
            .withReviewDateTime(OffsetDateTime.parse("2021-04-22T03:08:20Z"));
        model = BinaryData.fromObject(model).toObject(PatchProperties.class);
        Assertions.assertEquals(AppliedScopeType.SHARED, model.appliedScopeType());
        Assertions.assertEquals("bh", model.appliedScopes().get(0));
        Assertions.assertEquals("synlqidybyxczfc", model.appliedScopeProperties().tenantId());
        Assertions.assertEquals("aaxdbabphlwrq", model.appliedScopeProperties().managementGroupId());
        Assertions.assertEquals("ktsthsucocmny", model.appliedScopeProperties().subscriptionId());
        Assertions.assertEquals("zt", model.appliedScopeProperties().resourceGroupId());
        Assertions.assertEquals("twwrqp", model.appliedScopeProperties().displayName());
        Assertions.assertEquals(InstanceFlexibility.OFF, model.instanceFlexibility());
        Assertions.assertEquals("kzywbiex", model.name());
        Assertions.assertEquals(true, model.renew());
        Assertions.assertEquals("xibxujwbhqwalm", model.renewProperties().purchaseProperties().location());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-22T03:08:20Z"), model.reviewDateTime());
    }
}
