// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.fluent.models.McasCheckRequirementsProperties;
import org.junit.jupiter.api.Assertions;

public final class McasCheckRequirementsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        McasCheckRequirementsProperties model
            = BinaryData.fromString("{\"tenantId\":\"xvecbbwjt\"}").toObject(McasCheckRequirementsProperties.class);
        Assertions.assertEquals("xvecbbwjt", model.tenantId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        McasCheckRequirementsProperties model = new McasCheckRequirementsProperties().withTenantId("xvecbbwjt");
        model = BinaryData.fromObject(model).toObject(McasCheckRequirementsProperties.class);
        Assertions.assertEquals("xvecbbwjt", model.tenantId());
    }
}
