// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.models.LogSpecification;
import com.azure.resourcemanager.desktopvirtualization.models.OperationProperties;
import com.azure.resourcemanager.desktopvirtualization.models.ServiceSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationProperties model = BinaryData.fromString(
            "{\"serviceSpecification\":{\"logSpecifications\":[{\"name\":\"th\",\"displayName\":\"hab\",\"blobDuration\":\"pikxwczbyscnpqxu\"}]}}")
            .toObject(OperationProperties.class);
        Assertions.assertEquals("th", model.serviceSpecification().logSpecifications().get(0).name());
        Assertions.assertEquals("hab", model.serviceSpecification().logSpecifications().get(0).displayName());
        Assertions.assertEquals("pikxwczbyscnpqxu",
            model.serviceSpecification().logSpecifications().get(0).blobDuration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationProperties model = new OperationProperties()
            .withServiceSpecification(new ServiceSpecification().withLogSpecifications(Arrays.asList(
                new LogSpecification().withName("th").withDisplayName("hab").withBlobDuration("pikxwczbyscnpqxu"))));
        model = BinaryData.fromObject(model).toObject(OperationProperties.class);
        Assertions.assertEquals("th", model.serviceSpecification().logSpecifications().get(0).name());
        Assertions.assertEquals("hab", model.serviceSpecification().logSpecifications().get(0).displayName());
        Assertions.assertEquals("pikxwczbyscnpqxu",
            model.serviceSpecification().logSpecifications().get(0).blobDuration());
    }
}
