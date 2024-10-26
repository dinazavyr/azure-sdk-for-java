// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.reservations.fluent.models.MergeProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MergePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MergeProperties model
            = BinaryData.fromString("{\"sources\":[\"yocf\",\"fksymddystki\",\"uxh\",\"yudxorrqnbp\"]}")
                .toObject(MergeProperties.class);
        Assertions.assertEquals("yocf", model.sources().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MergeProperties model
            = new MergeProperties().withSources(Arrays.asList("yocf", "fksymddystki", "uxh", "yudxorrqnbp"));
        model = BinaryData.fromObject(model).toObject(MergeProperties.class);
        Assertions.assertEquals("yocf", model.sources().get(0));
    }
}
