// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.IoTSecurityAggregatedRecommendationProperties;
import org.junit.jupiter.api.Assertions;

public final class IoTSecurityAggregatedRecommendationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IoTSecurityAggregatedRecommendationProperties model =
            BinaryData
                .fromString(
                    "{\"recommendationName\":\"ifthnz\",\"recommendationDisplayName\":\"dslgnayqigynduh\",\"description\":\"hqlkthumaqo\",\"recommendationTypeId\":\"gycdu\",\"detectedBy\":\"r\",\"remediationSteps\":\"ccymvaolpsslql\",\"reportedSeverity\":\"High\",\"healthyDevices\":245140836582564523,\"unhealthyDeviceCount\":2285407320964329848,\"logAnalyticsQuery\":\"pswiydmcwyh\"}")
                .toObject(IoTSecurityAggregatedRecommendationProperties.class);
        Assertions.assertEquals("ifthnz", model.recommendationName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IoTSecurityAggregatedRecommendationProperties model =
            new IoTSecurityAggregatedRecommendationProperties().withRecommendationName("ifthnz");
        model = BinaryData.fromObject(model).toObject(IoTSecurityAggregatedRecommendationProperties.class);
        Assertions.assertEquals("ifthnz", model.recommendationName());
    }
}