// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.models.AgentUpdateProperties;
import com.azure.resourcemanager.desktopvirtualization.models.DayOfWeek;
import com.azure.resourcemanager.desktopvirtualization.models.MaintenanceWindowProperties;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostComponentUpdateType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AgentUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AgentUpdateProperties model =
            BinaryData
                .fromString(
                    "{\"type\":\"Default\",\"useSessionHostLocalTime\":true,\"maintenanceWindowTimeZone\":\"railvpnppfuf\",\"maintenanceWindows\":[{\"hour\":395833055,\"dayOfWeek\":\"Friday\"},{\"hour\":1444401866,\"dayOfWeek\":\"Friday\"},{\"hour\":1095036678,\"dayOfWeek\":\"Sunday\"}]}")
                .toObject(AgentUpdateProperties.class);
        Assertions.assertEquals(SessionHostComponentUpdateType.DEFAULT, model.type());
        Assertions.assertEquals(true, model.useSessionHostLocalTime());
        Assertions.assertEquals("railvpnppfuf", model.maintenanceWindowTimeZone());
        Assertions.assertEquals(395833055, model.maintenanceWindows().get(0).hour());
        Assertions.assertEquals(DayOfWeek.FRIDAY, model.maintenanceWindows().get(0).dayOfWeek());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AgentUpdateProperties model =
            new AgentUpdateProperties()
                .withType(SessionHostComponentUpdateType.DEFAULT)
                .withUseSessionHostLocalTime(true)
                .withMaintenanceWindowTimeZone("railvpnppfuf")
                .withMaintenanceWindows(
                    Arrays
                        .asList(
                            new MaintenanceWindowProperties().withHour(395833055).withDayOfWeek(DayOfWeek.FRIDAY),
                            new MaintenanceWindowProperties().withHour(1444401866).withDayOfWeek(DayOfWeek.FRIDAY),
                            new MaintenanceWindowProperties().withHour(1095036678).withDayOfWeek(DayOfWeek.SUNDAY)));
        model = BinaryData.fromObject(model).toObject(AgentUpdateProperties.class);
        Assertions.assertEquals(SessionHostComponentUpdateType.DEFAULT, model.type());
        Assertions.assertEquals(true, model.useSessionHostLocalTime());
        Assertions.assertEquals("railvpnppfuf", model.maintenanceWindowTimeZone());
        Assertions.assertEquals(395833055, model.maintenanceWindows().get(0).hour());
        Assertions.assertEquals(DayOfWeek.FRIDAY, model.maintenanceWindows().get(0).dayOfWeek());
    }
}