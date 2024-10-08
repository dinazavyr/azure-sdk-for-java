// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.models.DataDisksGroups;
import org.junit.jupiter.api.Assertions;

public final class DataDisksGroupsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataDisksGroups model = BinaryData
            .fromString("{\"disksPerNode\":1173289641,\"storageAccountType\":\"qyud\",\"diskSizeGB\":2120884016}")
            .toObject(DataDisksGroups.class);
        Assertions.assertEquals(1173289641, model.disksPerNode());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataDisksGroups model = new DataDisksGroups().withDisksPerNode(1173289641);
        model = BinaryData.fromObject(model).toObject(DataDisksGroups.class);
        Assertions.assertEquals(1173289641, model.disksPerNode());
    }
}
