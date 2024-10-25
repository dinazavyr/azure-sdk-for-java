// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.orbital.fluent.models.AvailableGroundStationProperties;
import com.azure.resourcemanager.orbital.models.ReleaseMode;
import org.junit.jupiter.api.Assertions;

public final class AvailableGroundStationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AvailableGroundStationProperties model = BinaryData.fromString(
            "{\"city\":\"yxczfclh\",\"providerName\":\"xdbabphlwr\",\"longitudeDegrees\":19.05045,\"latitudeDegrees\":56.638123,\"altitudeMeters\":23.375446,\"releaseMode\":\"GA\"}")
            .toObject(AvailableGroundStationProperties.class);
        Assertions.assertEquals("yxczfclh", model.city());
        Assertions.assertEquals("xdbabphlwr", model.providerName());
        Assertions.assertEquals(19.05045F, model.longitudeDegrees());
        Assertions.assertEquals(56.638123F, model.latitudeDegrees());
        Assertions.assertEquals(23.375446F, model.altitudeMeters());
        Assertions.assertEquals(ReleaseMode.GA, model.releaseMode());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AvailableGroundStationProperties model = new AvailableGroundStationProperties().withCity("yxczfclh")
            .withProviderName("xdbabphlwr")
            .withLongitudeDegrees(19.05045F)
            .withLatitudeDegrees(56.638123F)
            .withAltitudeMeters(23.375446F)
            .withReleaseMode(ReleaseMode.GA);
        model = BinaryData.fromObject(model).toObject(AvailableGroundStationProperties.class);
        Assertions.assertEquals("yxczfclh", model.city());
        Assertions.assertEquals("xdbabphlwr", model.providerName());
        Assertions.assertEquals(19.05045F, model.longitudeDegrees());
        Assertions.assertEquals(56.638123F, model.latitudeDegrees());
        Assertions.assertEquals(23.375446F, model.altitudeMeters());
        Assertions.assertEquals(ReleaseMode.GA, model.releaseMode());
    }
}
