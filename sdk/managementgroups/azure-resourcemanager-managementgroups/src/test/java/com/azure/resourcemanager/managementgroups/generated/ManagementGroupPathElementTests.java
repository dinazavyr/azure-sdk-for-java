// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managementgroups.models.ManagementGroupPathElement;
import org.junit.jupiter.api.Assertions;

public final class ManagementGroupPathElementTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagementGroupPathElement model = BinaryData.fromString("{\"name\":\"sgcbac\",\"displayName\":\"ejk\"}")
            .toObject(ManagementGroupPathElement.class);
        Assertions.assertEquals("sgcbac", model.name());
        Assertions.assertEquals("ejk", model.displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagementGroupPathElement model = new ManagementGroupPathElement().withName("sgcbac").withDisplayName("ejk");
        model = BinaryData.fromObject(model).toObject(ManagementGroupPathElement.class);
        Assertions.assertEquals("sgcbac", model.name());
        Assertions.assertEquals("ejk", model.displayName());
    }
}
