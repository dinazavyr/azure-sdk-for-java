// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databricks.models.ManagedIdentityConfiguration;

public final class ManagedIdentityConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedIdentityConfiguration model = BinaryData.fromString(
            "{\"principalId\":\"cd54fb4b-3070-47cb-acc9-e7afb33f8dd5\",\"tenantId\":\"6fb3425d-6960-4eed-ae98-9704248d7083\",\"type\":\"ablgphuticndvk\"}")
            .toObject(ManagedIdentityConfiguration.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedIdentityConfiguration model = new ManagedIdentityConfiguration();
        model = BinaryData.fromObject(model).toObject(ManagedIdentityConfiguration.class);
    }
}
