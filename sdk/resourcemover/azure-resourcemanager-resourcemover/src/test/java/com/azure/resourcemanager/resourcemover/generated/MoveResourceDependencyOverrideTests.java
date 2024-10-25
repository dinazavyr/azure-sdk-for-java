// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.MoveResourceDependencyOverride;
import org.junit.jupiter.api.Assertions;

public final class MoveResourceDependencyOverrideTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MoveResourceDependencyOverride model = BinaryData.fromString("{\"id\":\"qqwx\",\"targetId\":\"feallnwsu\"}")
            .toObject(MoveResourceDependencyOverride.class);
        Assertions.assertEquals("qqwx", model.id());
        Assertions.assertEquals("feallnwsu", model.targetId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MoveResourceDependencyOverride model
            = new MoveResourceDependencyOverride().withId("qqwx").withTargetId("feallnwsu");
        model = BinaryData.fromObject(model).toObject(MoveResourceDependencyOverride.class);
        Assertions.assertEquals("qqwx", model.id());
        Assertions.assertEquals("feallnwsu", model.targetId());
    }
}
