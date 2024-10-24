// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.models.UserAssignedProperties;
import org.junit.jupiter.api.Assertions;

public final class UserAssignedPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserAssignedProperties model
            = BinaryData.fromString("{\"resourceId\":\"skghsauuimj\"}").toObject(UserAssignedProperties.class);
        Assertions.assertEquals("skghsauuimj", model.resourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserAssignedProperties model = new UserAssignedProperties().withResourceId("skghsauuimj");
        model = BinaryData.fromObject(model).toObject(UserAssignedProperties.class);
        Assertions.assertEquals("skghsauuimj", model.resourceId());
    }
}
