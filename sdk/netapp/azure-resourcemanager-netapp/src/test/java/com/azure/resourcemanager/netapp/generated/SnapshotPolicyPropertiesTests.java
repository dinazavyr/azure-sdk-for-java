// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.SnapshotPolicyProperties;
import com.azure.resourcemanager.netapp.models.DailySchedule;
import com.azure.resourcemanager.netapp.models.HourlySchedule;
import com.azure.resourcemanager.netapp.models.MonthlySchedule;
import com.azure.resourcemanager.netapp.models.WeeklySchedule;
import org.junit.jupiter.api.Assertions;

public final class SnapshotPolicyPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnapshotPolicyProperties model = BinaryData.fromString(
            "{\"hourlySchedule\":{\"snapshotsToKeep\":510651029,\"minute\":541688375,\"usedBytes\":8840780603115522856},\"dailySchedule\":{\"snapshotsToKeep\":83276112,\"hour\":2115458799,\"minute\":2022074677,\"usedBytes\":8461554007976160781},\"weeklySchedule\":{\"snapshotsToKeep\":1285484058,\"day\":\"t\",\"hour\":125773376,\"minute\":505924755,\"usedBytes\":5726976908156025789},\"monthlySchedule\":{\"snapshotsToKeep\":234908956,\"daysOfMonth\":\"wtl\",\"hour\":1663606623,\"minute\":1523878268,\"usedBytes\":8390359388948965260},\"enabled\":true,\"provisioningState\":\"syuuximerq\"}")
            .toObject(SnapshotPolicyProperties.class);
        Assertions.assertEquals(510651029, model.hourlySchedule().snapshotsToKeep());
        Assertions.assertEquals(541688375, model.hourlySchedule().minute());
        Assertions.assertEquals(8840780603115522856L, model.hourlySchedule().usedBytes());
        Assertions.assertEquals(83276112, model.dailySchedule().snapshotsToKeep());
        Assertions.assertEquals(2115458799, model.dailySchedule().hour());
        Assertions.assertEquals(2022074677, model.dailySchedule().minute());
        Assertions.assertEquals(8461554007976160781L, model.dailySchedule().usedBytes());
        Assertions.assertEquals(1285484058, model.weeklySchedule().snapshotsToKeep());
        Assertions.assertEquals("t", model.weeklySchedule().day());
        Assertions.assertEquals(125773376, model.weeklySchedule().hour());
        Assertions.assertEquals(505924755, model.weeklySchedule().minute());
        Assertions.assertEquals(5726976908156025789L, model.weeklySchedule().usedBytes());
        Assertions.assertEquals(234908956, model.monthlySchedule().snapshotsToKeep());
        Assertions.assertEquals("wtl", model.monthlySchedule().daysOfMonth());
        Assertions.assertEquals(1663606623, model.monthlySchedule().hour());
        Assertions.assertEquals(1523878268, model.monthlySchedule().minute());
        Assertions.assertEquals(8390359388948965260L, model.monthlySchedule().usedBytes());
        Assertions.assertEquals(true, model.enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SnapshotPolicyProperties model = new SnapshotPolicyProperties()
            .withHourlySchedule(new HourlySchedule().withSnapshotsToKeep(510651029)
                .withMinute(541688375)
                .withUsedBytes(8840780603115522856L))
            .withDailySchedule(new DailySchedule().withSnapshotsToKeep(83276112)
                .withHour(2115458799)
                .withMinute(2022074677)
                .withUsedBytes(8461554007976160781L))
            .withWeeklySchedule(new WeeklySchedule().withSnapshotsToKeep(1285484058)
                .withDay("t")
                .withHour(125773376)
                .withMinute(505924755)
                .withUsedBytes(5726976908156025789L))
            .withMonthlySchedule(new MonthlySchedule().withSnapshotsToKeep(234908956)
                .withDaysOfMonth("wtl")
                .withHour(1663606623)
                .withMinute(1523878268)
                .withUsedBytes(8390359388948965260L))
            .withEnabled(true);
        model = BinaryData.fromObject(model).toObject(SnapshotPolicyProperties.class);
        Assertions.assertEquals(510651029, model.hourlySchedule().snapshotsToKeep());
        Assertions.assertEquals(541688375, model.hourlySchedule().minute());
        Assertions.assertEquals(8840780603115522856L, model.hourlySchedule().usedBytes());
        Assertions.assertEquals(83276112, model.dailySchedule().snapshotsToKeep());
        Assertions.assertEquals(2115458799, model.dailySchedule().hour());
        Assertions.assertEquals(2022074677, model.dailySchedule().minute());
        Assertions.assertEquals(8461554007976160781L, model.dailySchedule().usedBytes());
        Assertions.assertEquals(1285484058, model.weeklySchedule().snapshotsToKeep());
        Assertions.assertEquals("t", model.weeklySchedule().day());
        Assertions.assertEquals(125773376, model.weeklySchedule().hour());
        Assertions.assertEquals(505924755, model.weeklySchedule().minute());
        Assertions.assertEquals(5726976908156025789L, model.weeklySchedule().usedBytes());
        Assertions.assertEquals(234908956, model.monthlySchedule().snapshotsToKeep());
        Assertions.assertEquals("wtl", model.monthlySchedule().daysOfMonth());
        Assertions.assertEquals(1663606623, model.monthlySchedule().hour());
        Assertions.assertEquals(1523878268, model.monthlySchedule().minute());
        Assertions.assertEquals(8390359388948965260L, model.monthlySchedule().usedBytes());
        Assertions.assertEquals(true, model.enabled());
    }
}
