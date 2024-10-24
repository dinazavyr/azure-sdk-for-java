// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deploymentmanager.models.HealthCheckStepAttributes;
import com.azure.resourcemanager.deploymentmanager.models.HealthCheckStepProperties;
import org.junit.jupiter.api.Assertions;

public final class HealthCheckStepPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HealthCheckStepProperties model = BinaryData.fromString(
            "{\"stepType\":\"HealthCheck\",\"attributes\":{\"type\":\"HealthCheckStepAttributes\",\"waitDuration\":\"kgshwa\",\"maxElasticDuration\":\"ixzbinjeputtmryw\",\"healthyStateDuration\":\"uzoqft\"}}")
            .toObject(HealthCheckStepProperties.class);
        Assertions.assertEquals("kgshwa", model.attributes().waitDuration());
        Assertions.assertEquals("ixzbinjeputtmryw", model.attributes().maxElasticDuration());
        Assertions.assertEquals("uzoqft", model.attributes().healthyStateDuration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HealthCheckStepProperties model
            = new HealthCheckStepProperties().withAttributes(new HealthCheckStepAttributes().withWaitDuration("kgshwa")
                .withMaxElasticDuration("ixzbinjeputtmryw")
                .withHealthyStateDuration("uzoqft"));
        model = BinaryData.fromObject(model).toObject(HealthCheckStepProperties.class);
        Assertions.assertEquals("kgshwa", model.attributes().waitDuration());
        Assertions.assertEquals("ixzbinjeputtmryw", model.attributes().maxElasticDuration());
        Assertions.assertEquals("uzoqft", model.attributes().healthyStateDuration());
    }
}
