// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.applicationinsights.fluent.models.WorkbookProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WorkbookPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkbookProperties model = BinaryData.fromString(
            "{\"displayName\":\"l\",\"serializedData\":\"ptramxj\",\"version\":\"wlwnwxuqlcv\",\"timeModified\":\"2021-06-21T00:43:05Z\",\"category\":\"patdooaojkniodko\",\"tags\":[\"wnujhemmsbvdk\"],\"userId\":\"odtji\",\"sourceId\":\"wj\",\"storageUri\":\"lt\",\"description\":\"cjvefkdlfo\",\"revision\":\"ggkfpagaowpul\"}")
            .toObject(WorkbookProperties.class);
        Assertions.assertEquals("l", model.displayName());
        Assertions.assertEquals("ptramxj", model.serializedData());
        Assertions.assertEquals("wlwnwxuqlcv", model.version());
        Assertions.assertEquals("patdooaojkniodko", model.category());
        Assertions.assertEquals("wnujhemmsbvdk", model.tags().get(0));
        Assertions.assertEquals("wj", model.sourceId());
        Assertions.assertEquals("lt", model.storageUri());
        Assertions.assertEquals("cjvefkdlfo", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkbookProperties model = new WorkbookProperties().withDisplayName("l")
            .withSerializedData("ptramxj")
            .withVersion("wlwnwxuqlcv")
            .withCategory("patdooaojkniodko")
            .withTags(Arrays.asList("wnujhemmsbvdk"))
            .withSourceId("wj")
            .withStorageUri("lt")
            .withDescription("cjvefkdlfo");
        model = BinaryData.fromObject(model).toObject(WorkbookProperties.class);
        Assertions.assertEquals("l", model.displayName());
        Assertions.assertEquals("ptramxj", model.serializedData());
        Assertions.assertEquals("wlwnwxuqlcv", model.version());
        Assertions.assertEquals("patdooaojkniodko", model.category());
        Assertions.assertEquals("wnujhemmsbvdk", model.tags().get(0));
        Assertions.assertEquals("wj", model.sourceId());
        Assertions.assertEquals("lt", model.storageUri());
        Assertions.assertEquals("cjvefkdlfo", model.description());
    }
}
