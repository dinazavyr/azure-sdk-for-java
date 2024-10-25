// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mariadb.fluent.models.ConfigurationProperties;
import org.junit.jupiter.api.Assertions;

public final class ConfigurationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConfigurationProperties model = BinaryData.fromString(
            "{\"value\":\"bhj\",\"description\":\"igeho\",\"defaultValue\":\"bowsk\",\"dataType\":\"yktz\",\"allowedValues\":\"u\",\"source\":\"wgqyw\"}")
            .toObject(ConfigurationProperties.class);
        Assertions.assertEquals("bhj", model.value());
        Assertions.assertEquals("wgqyw", model.source());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConfigurationProperties model = new ConfigurationProperties().withValue("bhj").withSource("wgqyw");
        model = BinaryData.fromObject(model).toObject(ConfigurationProperties.class);
        Assertions.assertEquals("bhj", model.value());
        Assertions.assertEquals("wgqyw", model.source());
    }
}
