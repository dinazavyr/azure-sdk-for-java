// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loadtesting.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.loadtesting.models.QuotaBucketRequestPropertiesDimensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class QuotaBucketRequestPropertiesDimensionsTests {
    @Test
    public void testDeserialize() throws Exception {
        QuotaBucketRequestPropertiesDimensions model
            = BinaryData.fromString("{\"subscriptionId\":\"mdvpjhulsu\",\"location\":\"mkjozkrwf\"}")
                .toObject(QuotaBucketRequestPropertiesDimensions.class);
        Assertions.assertEquals("mdvpjhulsu", model.subscriptionId());
        Assertions.assertEquals("mkjozkrwf", model.location());
    }

    @Test
    public void testSerialize() throws Exception {
        QuotaBucketRequestPropertiesDimensions model
            = new QuotaBucketRequestPropertiesDimensions().withSubscriptionId("mdvpjhulsu").withLocation("mkjozkrwf");
        model = BinaryData.fromObject(model).toObject(QuotaBucketRequestPropertiesDimensions.class);
        Assertions.assertEquals("mdvpjhulsu", model.subscriptionId());
        Assertions.assertEquals("mkjozkrwf", model.location());
    }
}
