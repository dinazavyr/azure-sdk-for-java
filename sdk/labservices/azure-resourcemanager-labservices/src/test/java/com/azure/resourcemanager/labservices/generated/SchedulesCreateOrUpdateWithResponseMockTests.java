// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.labservices.LabServicesManager;
import com.azure.resourcemanager.labservices.models.RecurrenceFrequency;
import com.azure.resourcemanager.labservices.models.RecurrencePattern;
import com.azure.resourcemanager.labservices.models.Schedule;
import com.azure.resourcemanager.labservices.models.WeekDay;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SchedulesCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Locked\",\"startAt\":\"2021-10-19T02:59:28Z\",\"stopAt\":\"2021-04-06T05:11:36Z\",\"recurrencePattern\":{\"frequency\":\"Weekly\",\"weekDays\":[\"Monday\",\"Friday\",\"Saturday\"],\"interval\":451636472,\"expirationDate\":\"2021-01-22T04:30Z\"},\"timeZoneId\":\"x\",\"notes\":\"n\"},\"id\":\"rxcpjuisavo\",\"name\":\"qdzfvazivjlfrqtt\",\"type\":\"ajlkatnw\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        LabServicesManager manager = LabServicesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Schedule response = manager.schedules()
            .define("pi")
            .withExistingLab("hjoxo", "smsks")
            .withStartAt(OffsetDateTime.parse("2021-02-24T02:21:25Z"))
            .withStopAt(OffsetDateTime.parse("2021-01-28T22:40:19Z"))
            .withRecurrencePattern(new RecurrencePattern().withFrequency(RecurrenceFrequency.WEEKLY)
                .withWeekDays(Arrays.asList(WeekDay.TUESDAY))
                .withInterval(640904651)
                .withExpirationDate(OffsetDateTime.parse("2021-11-22T22:55:42Z")))
            .withTimeZoneId("gcvizqzdwlvwlyou")
            .withNotes("gfbkjubdyh")
            .create();

        Assertions.assertEquals(OffsetDateTime.parse("2021-10-19T02:59:28Z"), response.startAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-06T05:11:36Z"), response.stopAt());
        Assertions.assertEquals(RecurrenceFrequency.WEEKLY, response.recurrencePattern().frequency());
        Assertions.assertEquals(WeekDay.MONDAY, response.recurrencePattern().weekDays().get(0));
        Assertions.assertEquals(451636472, response.recurrencePattern().interval());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-22T04:30Z"),
            response.recurrencePattern().expirationDate());
        Assertions.assertEquals("x", response.timeZoneId());
        Assertions.assertEquals("n", response.notes());
    }
}
