// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.costmanagement.models.QueryDatasetConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class QueryDatasetConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QueryDatasetConfiguration model
            = BinaryData.fromString("{\"columns\":[\"xysmoc\",\"bq\",\"qvmkcxo\",\"apvhelxprgly\"]}")
                .toObject(QueryDatasetConfiguration.class);
        Assertions.assertEquals("xysmoc", model.columns().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QueryDatasetConfiguration model
            = new QueryDatasetConfiguration().withColumns(Arrays.asList("xysmoc", "bq", "qvmkcxo", "apvhelxprgly"));
        model = BinaryData.fromObject(model).toObject(QueryDatasetConfiguration.class);
        Assertions.assertEquals("xysmoc", model.columns().get(0));
    }
}
