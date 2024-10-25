// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.models.AatpDataConnector;
import com.azure.resourcemanager.securityinsights.models.AlertsDataTypeOfDataConnector;
import com.azure.resourcemanager.securityinsights.models.DataConnectorDataTypeCommon;
import com.azure.resourcemanager.securityinsights.models.DataTypeState;
import org.junit.jupiter.api.Assertions;

public final class AatpDataConnectorTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AatpDataConnector model = BinaryData.fromString(
            "{\"kind\":\"AzureAdvancedThreatProtection\",\"properties\":{\"dataTypes\":{\"alerts\":{\"state\":\"Enabled\"}},\"tenantId\":\"mfd\"},\"etag\":\"vlkpzwb\",\"id\":\"recchdidrmu\",\"name\":\"kahmjedbiucvkhhw\",\"type\":\"jpjbweunxcqr\"}")
            .toObject(AatpDataConnector.class);
        Assertions.assertEquals("vlkpzwb", model.etag());
        Assertions.assertEquals(DataTypeState.ENABLED, model.dataTypes().alerts().state());
        Assertions.assertEquals("mfd", model.tenantId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AatpDataConnector model = new AatpDataConnector().withEtag("vlkpzwb")
            .withDataTypes(new AlertsDataTypeOfDataConnector()
                .withAlerts(new DataConnectorDataTypeCommon().withState(DataTypeState.ENABLED)))
            .withTenantId("mfd");
        model = BinaryData.fromObject(model).toObject(AatpDataConnector.class);
        Assertions.assertEquals("vlkpzwb", model.etag());
        Assertions.assertEquals(DataTypeState.ENABLED, model.dataTypes().alerts().state());
        Assertions.assertEquals("mfd", model.tenantId());
    }
}
