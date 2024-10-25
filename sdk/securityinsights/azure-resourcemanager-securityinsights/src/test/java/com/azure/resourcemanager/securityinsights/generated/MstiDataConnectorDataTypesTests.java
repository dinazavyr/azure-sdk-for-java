// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.models.DataTypeState;
import com.azure.resourcemanager.securityinsights.models.MstiDataConnectorDataTypes;
import com.azure.resourcemanager.securityinsights.models.MstiDataConnectorDataTypesBingSafetyPhishingUrl;
import com.azure.resourcemanager.securityinsights.models.MstiDataConnectorDataTypesMicrosoftEmergingThreatFeed;
import org.junit.jupiter.api.Assertions;

public final class MstiDataConnectorDataTypesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MstiDataConnectorDataTypes model = BinaryData.fromString(
            "{\"bingSafetyPhishingURL\":{\"lookbackPeriod\":\"q\",\"state\":\"Disabled\"},\"microsoftEmergingThreatFeed\":{\"lookbackPeriod\":\"timpkjblorns\",\"state\":\"Enabled\"}}")
            .toObject(MstiDataConnectorDataTypes.class);
        Assertions.assertEquals(DataTypeState.DISABLED, model.bingSafetyPhishingUrl().state());
        Assertions.assertEquals("q", model.bingSafetyPhishingUrl().lookbackPeriod());
        Assertions.assertEquals(DataTypeState.ENABLED, model.microsoftEmergingThreatFeed().state());
        Assertions.assertEquals("timpkjblorns", model.microsoftEmergingThreatFeed().lookbackPeriod());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MstiDataConnectorDataTypes model = new MstiDataConnectorDataTypes()
            .withBingSafetyPhishingUrl(
                new MstiDataConnectorDataTypesBingSafetyPhishingUrl().withState(DataTypeState.DISABLED)
                    .withLookbackPeriod("q"))
            .withMicrosoftEmergingThreatFeed(
                new MstiDataConnectorDataTypesMicrosoftEmergingThreatFeed().withState(DataTypeState.ENABLED)
                    .withLookbackPeriod("timpkjblorns"));
        model = BinaryData.fromObject(model).toObject(MstiDataConnectorDataTypes.class);
        Assertions.assertEquals(DataTypeState.DISABLED, model.bingSafetyPhishingUrl().state());
        Assertions.assertEquals("q", model.bingSafetyPhishingUrl().lookbackPeriod());
        Assertions.assertEquals(DataTypeState.ENABLED, model.microsoftEmergingThreatFeed().state());
        Assertions.assertEquals("timpkjblorns", model.microsoftEmergingThreatFeed().lookbackPeriod());
    }
}
