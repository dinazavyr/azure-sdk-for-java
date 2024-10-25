// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.consumption.models.ModernSingleScopeReservationRecommendationProperties;

public final class ModernSingleScopeReservationRecommendationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ModernSingleScopeReservationRecommendationProperties model = BinaryData.fromString(
            "{\"scope\":\"Single\",\"subscriptionId\":\"9ae65ab9-fb49-4006-bf2b-fd7afabbffb1\",\"location\":\"zkatb\",\"lookBackPeriod\":1903197758,\"instanceFlexibilityRatio\":54.313797,\"instanceFlexibilityGroup\":\"bsoqeqala\",\"normalizedSize\":\"lagun\",\"recommendedQuantityNormalized\":49.933304,\"meterId\":\"53b7fb33-edcc-48d3-b044-b36043f65bd4\",\"term\":\"bwln\",\"costWithNoReservedInstances\":{\"currency\":\"yreeudz\"},\"resourceType\":\"pdqmjxlyyzglgouw\",\"totalCostWithReservedInstances\":{\"currency\":\"jjyuojqtobax\"},\"netSavings\":{\"currency\":\"tu\"},\"firstUsageDate\":\"2021-07-22T08:57:15Z\",\"skuProperties\":[{\"name\":\"rusnk\",\"value\":\"hsyrqunj\"}],\"skuName\":\"denxau\"}")
            .toObject(ModernSingleScopeReservationRecommendationProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ModernSingleScopeReservationRecommendationProperties model
            = new ModernSingleScopeReservationRecommendationProperties();
        model = BinaryData.fromObject(model).toObject(ModernSingleScopeReservationRecommendationProperties.class);
    }
}
