// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.agrifood.fluent.models.ExtensionProperties;
import org.junit.jupiter.api.Test;

public final class ExtensionPropertiesTests {
    @Test
    public void testDeserialize() {
        ExtensionProperties model = BinaryData.fromString(
            "{\"extensionId\":\"qsoqijgkd\",\"extensionCategory\":\"pazlobcufpdz\",\"installedExtensionVersion\":\"btcqq\",\"extensionAuthLink\":\"qglhq\",\"extensionApiDocsLink\":\"ufo\"}")
            .toObject(ExtensionProperties.class);
    }

    @Test
    public void testSerialize() {
        ExtensionProperties model = new ExtensionProperties();
        model = BinaryData.fromObject(model).toObject(ExtensionProperties.class);
    }
}
