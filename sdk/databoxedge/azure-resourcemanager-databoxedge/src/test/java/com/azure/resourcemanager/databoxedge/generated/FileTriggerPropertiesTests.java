// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databoxedge.fluent.models.FileTriggerProperties;
import com.azure.resourcemanager.databoxedge.models.FileSourceInfo;
import com.azure.resourcemanager.databoxedge.models.RoleSinkInfo;
import org.junit.jupiter.api.Assertions;

public final class FileTriggerPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FileTriggerProperties model = BinaryData.fromString(
            "{\"sourceInfo\":{\"shareId\":\"odn\"},\"sinkInfo\":{\"roleId\":\"zxltjcvn\"},\"customContextTag\":\"tiugcxnav\"}")
            .toObject(FileTriggerProperties.class);
        Assertions.assertEquals("odn", model.sourceInfo().shareId());
        Assertions.assertEquals("zxltjcvn", model.sinkInfo().roleId());
        Assertions.assertEquals("tiugcxnav", model.customContextTag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FileTriggerProperties model
            = new FileTriggerProperties().withSourceInfo(new FileSourceInfo().withShareId("odn"))
                .withSinkInfo(new RoleSinkInfo().withRoleId("zxltjcvn"))
                .withCustomContextTag("tiugcxnav");
        model = BinaryData.fromObject(model).toObject(FileTriggerProperties.class);
        Assertions.assertEquals("odn", model.sourceInfo().shareId());
        Assertions.assertEquals("zxltjcvn", model.sinkInfo().roleId());
        Assertions.assertEquals("tiugcxnav", model.customContextTag());
    }
}
