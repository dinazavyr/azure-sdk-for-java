// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.models.PlaybookActionProperties;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class PlaybookActionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PlaybookActionProperties model = BinaryData
            .fromString("{\"logicAppResourceId\":\"eoxinhgre\",\"tenantId\":\"7a5639f0-d8aa-4afe-bc72-240bb426f5c0\"}")
            .toObject(PlaybookActionProperties.class);
        Assertions.assertEquals("eoxinhgre", model.logicAppResourceId());
        Assertions.assertEquals(UUID.fromString("7a5639f0-d8aa-4afe-bc72-240bb426f5c0"), model.tenantId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PlaybookActionProperties model = new PlaybookActionProperties().withLogicAppResourceId("eoxinhgre")
            .withTenantId(UUID.fromString("7a5639f0-d8aa-4afe-bc72-240bb426f5c0"));
        model = BinaryData.fromObject(model).toObject(PlaybookActionProperties.class);
        Assertions.assertEquals("eoxinhgre", model.logicAppResourceId());
        Assertions.assertEquals(UUID.fromString("7a5639f0-d8aa-4afe-bc72-240bb426f5c0"), model.tenantId());
    }
}
