// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.DocumentationContractProperties;
import org.junit.jupiter.api.Assertions;

public final class DocumentationContractPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DocumentationContractProperties model
            = BinaryData.fromString("{\"title\":\"upjxvtrkfkgenjqn\",\"content\":\"jwkosnyxigf\"}")
                .toObject(DocumentationContractProperties.class);
        Assertions.assertEquals("upjxvtrkfkgenjqn", model.title());
        Assertions.assertEquals("jwkosnyxigf", model.content());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DocumentationContractProperties model
            = new DocumentationContractProperties().withTitle("upjxvtrkfkgenjqn").withContent("jwkosnyxigf");
        model = BinaryData.fromObject(model).toObject(DocumentationContractProperties.class);
        Assertions.assertEquals("upjxvtrkfkgenjqn", model.title());
        Assertions.assertEquals("jwkosnyxigf", model.content());
    }
}
