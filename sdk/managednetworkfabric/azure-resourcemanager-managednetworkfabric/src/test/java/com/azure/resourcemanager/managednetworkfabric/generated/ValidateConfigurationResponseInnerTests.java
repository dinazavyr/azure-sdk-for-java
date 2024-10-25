// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.ValidateConfigurationResponseInner;
import org.junit.jupiter.api.Assertions;

public final class ValidateConfigurationResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ValidateConfigurationResponseInner model
            = BinaryData.fromString("{\"configurationState\":\"Rejected\",\"url\":\"kukjtasb\"}")
                .toObject(ValidateConfigurationResponseInner.class);
        Assertions.assertEquals("kukjtasb", model.url());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ValidateConfigurationResponseInner model = new ValidateConfigurationResponseInner().withUrl("kukjtasb");
        model = BinaryData.fromObject(model).toObject(ValidateConfigurationResponseInner.class);
        Assertions.assertEquals("kukjtasb", model.url());
    }
}
