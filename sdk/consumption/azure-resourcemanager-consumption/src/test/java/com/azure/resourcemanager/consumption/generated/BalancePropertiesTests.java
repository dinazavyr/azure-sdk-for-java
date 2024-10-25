// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.consumption.fluent.models.BalanceProperties;
import com.azure.resourcemanager.consumption.models.BillingFrequency;
import org.junit.jupiter.api.Assertions;

public final class BalancePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BalanceProperties model = BinaryData.fromString(
            "{\"currency\":\"gwyzm\",\"billingFrequency\":\"Year\",\"priceHidden\":false,\"newPurchasesDetails\":[{\"name\":\"p\"},{\"name\":\"nftguvriuhpr\"},{\"name\":\"yvxqtayriwwroy\"}],\"adjustmentDetails\":[{\"name\":\"mcqibycnojv\"},{\"name\":\"e\"},{\"name\":\"gzva\"},{\"name\":\"jyzhpvgq\"}]}")
            .toObject(BalanceProperties.class);
        Assertions.assertEquals(BillingFrequency.YEAR, model.billingFrequency());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BalanceProperties model = new BalanceProperties().withBillingFrequency(BillingFrequency.YEAR);
        model = BinaryData.fromObject(model).toObject(BalanceProperties.class);
        Assertions.assertEquals(BillingFrequency.YEAR, model.billingFrequency());
    }
}
