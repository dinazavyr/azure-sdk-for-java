// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.attestation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.attestation.fluent.models.OperationListInner;
import com.azure.resourcemanager.attestation.models.OperationsDefinition;
import com.azure.resourcemanager.attestation.models.OperationsDisplayDefinition;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationListInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListInner model = BinaryData.fromString(
            "{\"value\":[{\"name\":\"uv\",\"display\":{\"provider\":\"pybczmehmtzopb\",\"resource\":\"h\",\"operation\":\"pidgsybbejhphoyc\",\"description\":\"xaobhdxbmtqioqjz\"}}]}")
            .toObject(OperationListInner.class);
        Assertions.assertEquals("uv", model.value().get(0).name());
        Assertions.assertEquals("pybczmehmtzopb", model.value().get(0).display().provider());
        Assertions.assertEquals("h", model.value().get(0).display().resource());
        Assertions.assertEquals("pidgsybbejhphoyc", model.value().get(0).display().operation());
        Assertions.assertEquals("xaobhdxbmtqioqjz", model.value().get(0).display().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationListInner model
            = new OperationListInner().withValue(Arrays.asList(new OperationsDefinition().withName("uv")
                .withDisplay(new OperationsDisplayDefinition().withProvider("pybczmehmtzopb")
                    .withResource("h")
                    .withOperation("pidgsybbejhphoyc")
                    .withDescription("xaobhdxbmtqioqjz"))));
        model = BinaryData.fromObject(model).toObject(OperationListInner.class);
        Assertions.assertEquals("uv", model.value().get(0).name());
        Assertions.assertEquals("pybczmehmtzopb", model.value().get(0).display().provider());
        Assertions.assertEquals("h", model.value().get(0).display().resource());
        Assertions.assertEquals("pidgsybbejhphoyc", model.value().get(0).display().operation());
        Assertions.assertEquals("xaobhdxbmtqioqjz", model.value().get(0).display().description());
    }
}
