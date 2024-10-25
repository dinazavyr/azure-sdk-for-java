// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.costmanagement.models.ExportRecurrencePeriod;
import com.azure.resourcemanager.costmanagement.models.ExportSchedule;
import com.azure.resourcemanager.costmanagement.models.RecurrenceType;
import com.azure.resourcemanager.costmanagement.models.StatusType;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class ExportScheduleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExportSchedule model = BinaryData.fromString(
            "{\"status\":\"Active\",\"recurrence\":\"Monthly\",\"recurrencePeriod\":{\"from\":\"2021-05-06T02:47:02Z\",\"to\":\"2021-06-02T00:19:10Z\"}}")
            .toObject(ExportSchedule.class);
        Assertions.assertEquals(StatusType.ACTIVE, model.status());
        Assertions.assertEquals(RecurrenceType.MONTHLY, model.recurrence());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-06T02:47:02Z"), model.recurrencePeriod().from());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-02T00:19:10Z"), model.recurrencePeriod().to());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExportSchedule model = new ExportSchedule().withStatus(StatusType.ACTIVE)
            .withRecurrence(RecurrenceType.MONTHLY)
            .withRecurrencePeriod(new ExportRecurrencePeriod().withFrom(OffsetDateTime.parse("2021-05-06T02:47:02Z"))
                .withTo(OffsetDateTime.parse("2021-06-02T00:19:10Z")));
        model = BinaryData.fromObject(model).toObject(ExportSchedule.class);
        Assertions.assertEquals(StatusType.ACTIVE, model.status());
        Assertions.assertEquals(RecurrenceType.MONTHLY, model.recurrence());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-06T02:47:02Z"), model.recurrencePeriod().from());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-02T00:19:10Z"), model.recurrencePeriod().to());
    }
}
