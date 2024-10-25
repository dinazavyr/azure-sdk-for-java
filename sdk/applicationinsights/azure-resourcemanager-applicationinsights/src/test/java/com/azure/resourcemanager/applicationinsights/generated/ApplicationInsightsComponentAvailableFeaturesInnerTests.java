// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentAvailableFeaturesInner;

public final class ApplicationInsightsComponentAvailableFeaturesInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationInsightsComponentAvailableFeaturesInner model = BinaryData.fromString(
            "{\"Result\":[{\"FeatureName\":\"vkaozwyiftyhxhur\",\"MeterId\":\"ftyxolniw\",\"MeterRateFrequency\":\"cukjf\",\"ResouceId\":\"iawxklry\",\"IsHidden\":true,\"Capabilities\":[{\"Name\":\"asy\",\"Description\":\"nddhsgcbacph\",\"Value\":\"koty\",\"Unit\":\"gou\",\"MeterId\":\"ndlik\",\"MeterRateFrequency\":\"qkgfgibma\"},{\"Name\":\"akeqs\",\"Description\":\"yb\",\"Value\":\"qedqytbciqfoufl\",\"Unit\":\"nkzsmodmglou\",\"MeterId\":\"b\",\"MeterRateFrequency\":\"tmut\"}],\"Title\":\"qktapspwgcuert\",\"IsMainFeature\":false,\"SupportedAddonFeatures\":\"o\"}]}")
            .toObject(ApplicationInsightsComponentAvailableFeaturesInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationInsightsComponentAvailableFeaturesInner model
            = new ApplicationInsightsComponentAvailableFeaturesInner();
        model = BinaryData.fromObject(model).toObject(ApplicationInsightsComponentAvailableFeaturesInner.class);
    }
}
