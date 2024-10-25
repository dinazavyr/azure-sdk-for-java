// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loadtesting.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.loadtesting.fluent.models.QuotaResourceProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class QuotaResourcePropertiesTests {
    @Test
    public void testDeserialize() throws Exception {
        QuotaResourceProperties model
            = BinaryData.fromString("{\"limit\":1833864756,\"usage\":1656493513,\"provisioningState\":\"Canceled\"}")
                .toObject(QuotaResourceProperties.class);
        Assertions.assertEquals(1833864756, model.limit());
        Assertions.assertEquals(1656493513, model.usage());
    }

    @Test
    public void testSerialize() throws Exception {
        QuotaResourceProperties model = new QuotaResourceProperties().withLimit(1833864756).withUsage(1656493513);
        model = BinaryData.fromObject(model).toObject(QuotaResourceProperties.class);
        Assertions.assertEquals(1833864756, model.limit());
        Assertions.assertEquals(1656493513, model.usage());
    }
}
