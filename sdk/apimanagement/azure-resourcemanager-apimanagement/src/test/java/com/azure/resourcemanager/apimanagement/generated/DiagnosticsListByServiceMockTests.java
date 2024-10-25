// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.apimanagement.ApiManagementManager;
import com.azure.resourcemanager.apimanagement.models.AlwaysLog;
import com.azure.resourcemanager.apimanagement.models.DiagnosticContract;
import com.azure.resourcemanager.apimanagement.models.HttpCorrelationProtocol;
import com.azure.resourcemanager.apimanagement.models.OperationNameFormat;
import com.azure.resourcemanager.apimanagement.models.SamplingType;
import com.azure.resourcemanager.apimanagement.models.Verbosity;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DiagnosticsListByServiceMockTests {
    @Test
    public void testListByService() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"alwaysLog\":\"allErrors\",\"loggerId\":\"t\",\"sampling\":{\"samplingType\":\"fixed\",\"percentage\":57.608927926240675},\"frontend\":{\"request\":{\"headers\":[\"dkv\"],\"body\":{\"bytes\":224078839},\"dataMasking\":{\"queryParams\":[{},{}],\"headers\":[{}]}},\"response\":{\"headers\":[\"kqyipgkmjtda\",\"mdzesime\",\"tgdrfzj\"],\"body\":{\"bytes\":1810386395},\"dataMasking\":{\"queryParams\":[{},{}],\"headers\":[{},{},{}]}}},\"backend\":{\"request\":{\"headers\":[\"iefcorzbida\",\"beznicew\",\"fajw\",\"ylciobb\"],\"body\":{\"bytes\":2107103772},\"dataMasking\":{\"queryParams\":[{}],\"headers\":[{},{}]}},\"response\":{\"headers\":[\"uuuexsm\",\"teevfgaxfez\",\"aqsddk\",\"d\"],\"body\":{\"bytes\":262978243},\"dataMasking\":{\"queryParams\":[{}],\"headers\":[{},{}]}}},\"logClientIp\":false,\"httpCorrelationProtocol\":\"Legacy\",\"verbosity\":\"information\",\"operationNameFormat\":\"Name\",\"metrics\":false},\"id\":\"fsspfegaoksd\",\"name\":\"kkraj\",\"type\":\"yuklxkel\"}]}";

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

        ApiManagementManager manager = ApiManagementManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<DiagnosticContract> response = manager.diagnostics()
            .listByService("ehczbnivcohsxv", "pkjealkdbewhotv", "myzuqfd", 639231796, 500409243,
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals(AlwaysLog.ALL_ERRORS, response.iterator().next().alwaysLog());
        Assertions.assertEquals("t", response.iterator().next().loggerId());
        Assertions.assertEquals(SamplingType.FIXED, response.iterator().next().sampling().samplingType());
        Assertions.assertEquals(57.608927926240675D, response.iterator().next().sampling().percentage());
        Assertions.assertEquals("dkv", response.iterator().next().frontend().request().headers().get(0));
        Assertions.assertEquals(224078839, response.iterator().next().frontend().request().body().bytes());
        Assertions.assertEquals("kqyipgkmjtda", response.iterator().next().frontend().response().headers().get(0));
        Assertions.assertEquals(1810386395, response.iterator().next().frontend().response().body().bytes());
        Assertions.assertEquals("iefcorzbida", response.iterator().next().backend().request().headers().get(0));
        Assertions.assertEquals(2107103772, response.iterator().next().backend().request().body().bytes());
        Assertions.assertEquals("uuuexsm", response.iterator().next().backend().response().headers().get(0));
        Assertions.assertEquals(262978243, response.iterator().next().backend().response().body().bytes());
        Assertions.assertEquals(false, response.iterator().next().logClientIp());
        Assertions.assertEquals(HttpCorrelationProtocol.LEGACY, response.iterator().next().httpCorrelationProtocol());
        Assertions.assertEquals(Verbosity.INFORMATION, response.iterator().next().verbosity());
        Assertions.assertEquals(OperationNameFormat.NAME, response.iterator().next().operationNameFormat());
        Assertions.assertEquals(false, response.iterator().next().metrics());
    }
}
