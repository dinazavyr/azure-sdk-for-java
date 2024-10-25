// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.dynatrace.DynatraceManager;
import com.azure.resourcemanager.dynatrace.models.AutoUpdateSetting;
import com.azure.resourcemanager.dynatrace.models.AvailabilityState;
import com.azure.resourcemanager.dynatrace.models.LogModule;
import com.azure.resourcemanager.dynatrace.models.MonitoringType;
import com.azure.resourcemanager.dynatrace.models.UpdateStatus;
import com.azure.resourcemanager.dynatrace.models.VMInfo;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class MonitorsListHostsMockTests {
    @Test
    public void testListHosts() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"resourceId\":\"alpbuxwgipwhon\",\"version\":\"kgshwa\",\"monitoringType\":\"FULL_STACK\",\"autoUpdateSetting\":\"DISABLED\",\"updateStatus\":\"UP2DATE\",\"availabilityState\":\"UNEXPECTED_SHUTDOWN\",\"logModule\":\"ENABLED\",\"hostGroup\":\"ttmrywnuzoqf\",\"hostName\":\"yqzrnkcqvyxlw\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        DynatraceManager manager = DynatraceManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<VMInfo> response
            = manager.monitors().listHosts("ttgzfbis", "cbkhajdeyeamdph", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("alpbuxwgipwhon", response.iterator().next().resourceId());
        Assertions.assertEquals("kgshwa", response.iterator().next().version());
        Assertions.assertEquals(MonitoringType.FULL_STACK, response.iterator().next().monitoringType());
        Assertions.assertEquals(AutoUpdateSetting.DISABLED, response.iterator().next().autoUpdateSetting());
        Assertions.assertEquals(UpdateStatus.UP2DATE, response.iterator().next().updateStatus());
        Assertions.assertEquals(AvailabilityState.UNEXPECTED_SHUTDOWN, response.iterator().next().availabilityState());
        Assertions.assertEquals(LogModule.ENABLED, response.iterator().next().logModule());
        Assertions.assertEquals("ttmrywnuzoqf", response.iterator().next().hostGroup());
        Assertions.assertEquals("yqzrnkcqvyxlw", response.iterator().next().hostname());
    }
}
