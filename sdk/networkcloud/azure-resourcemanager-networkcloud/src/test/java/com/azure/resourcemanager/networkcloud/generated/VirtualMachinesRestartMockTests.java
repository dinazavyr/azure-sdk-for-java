// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.networkcloud.NetworkCloudManager;
import com.azure.resourcemanager.networkcloud.models.OperationStatusResult;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class VirtualMachinesRestartMockTests {
    @Test
    public void testRestart() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"id\":\"kxerxxx\",\"resourceId\":\"eehk\",\"name\":\"wgomvvhxow\",\"status\":\"c\",\"percentComplete\":15.02164,\"startTime\":\"2021-07-31T22:42:59Z\",\"endTime\":\"2021-01-03T20:16:37Z\",\"operations\":[{\"id\":\"wbmpspfeylqloc\",\"resourceId\":\"ujexayglxrk\",\"name\":\"nmzpas\",\"status\":\"avxjfiuofpiei\",\"percentComplete\":13.99284,\"startTime\":\"2021-11-20T07:29:01Z\",\"endTime\":\"2021-06-24T17:45:24Z\",\"operations\":[{\"id\":\"opac\",\"resourceId\":\"hydv\",\"name\":\"mfngpmillxgjsci\",\"status\":\"wgsoriobijeiydy\",\"percentComplete\":58.741135,\"startTime\":\"2021-06-30T16:18:41Z\",\"endTime\":\"2021-01-30T20:03:07Z\",\"operations\":[{\"status\":\"yrgwy\"},{\"status\":\"ri\"}]},{\"id\":\"weoftnorw\",\"resourceId\":\"gsioc\",\"name\":\"kmv\",\"status\":\"a\",\"percentComplete\":24.349243,\"startTime\":\"2021-04-14T08:01:15Z\",\"endTime\":\"2021-05-30T09:27:09Z\",\"operations\":[{\"status\":\"jnwosst\"}]},{\"id\":\"tvlxxzqfcwr\",\"resourceId\":\"omxeezwyhjmb\",\"name\":\"qegm\",\"status\":\"db\",\"percentComplete\":11.82003,\"startTime\":\"2021-11-16T03:21:26Z\",\"endTime\":\"2021-10-28T18:01:39Z\",\"operations\":[{\"status\":\"dkgd\"}]},{\"id\":\"z\",\"resourceId\":\"anzbjekwuyckyvn\",\"name\":\"smuffiwjb\",\"status\":\"tvbpzujqj\",\"percentComplete\":14.829654,\"startTime\":\"2021-01-15T10:39:13Z\",\"endTime\":\"2021-10-26T20:39:49Z\",\"operations\":[{\"status\":\"slhwuusieckty\"},{\"status\":\"h\"},{\"status\":\"uxidhhxomilddxj\"}]}]},{\"id\":\"xwjwilm\",\"resourceId\":\"sl\",\"name\":\"teptwujjzgxqgqwl\",\"status\":\"rhgtvhv\",\"percentComplete\":39.35091,\"startTime\":\"2021-07-30T10:08:24Z\",\"endTime\":\"2021-08-25T02:49:35Z\",\"operations\":[{\"id\":\"ozejo\",\"resourceId\":\"korvvm\",\"name\":\"cof\",\"status\":\"qhlbsnosnqliwkm\",\"percentComplete\":4.292619,\"startTime\":\"2021-02-02T13:01:19Z\",\"endTime\":\"2021-08-11T13:39:15Z\",\"operations\":[{\"status\":\"htgmknazgbj\"},{\"status\":\"hrp\"}]},{\"id\":\"sttcucrcmm\",\"resourceId\":\"xp\",\"name\":\"iwifhbk\",\"status\":\"ldtt\",\"percentComplete\":51.837635,\"startTime\":\"2021-10-19T06:31:48Z\",\"endTime\":\"2021-08-05T21:26:21Z\",\"operations\":[{\"status\":\"tgs\"}]}]},{\"id\":\"vllrhtpmglxk\",\"resourceId\":\"km\",\"name\":\"awr\",\"status\":\"kzawbunmpaklwzlw\",\"percentComplete\":78.60771,\"startTime\":\"2021-06-17T22:30:27Z\",\"endTime\":\"2021-02-04T22:42:16Z\",\"operations\":[{\"id\":\"kaszfjsxscbdu\",\"resourceId\":\"pg\",\"name\":\"qebmvrdjomlnwsb\",\"status\":\"vdlsflxkqesdfeds\",\"percentComplete\":56.19114,\"startTime\":\"2021-11-11T01:48:52Z\",\"endTime\":\"2021-04-11T01:16:12Z\",\"operations\":[{\"status\":\"mphymcqidkl\"},{\"status\":\"vdhqnufbxw\"},{\"status\":\"iibntojo\"},{\"status\":\"fnybydhuihaouw\"}]}]}]}";

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

        NetworkCloudManager manager = NetworkCloudManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        OperationStatusResult response
            = manager.virtualMachines().restart("jwd", "dl", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("kxerxxx", response.id());
        Assertions.assertEquals("wgomvvhxow", response.name());
        Assertions.assertEquals("c", response.status());
        Assertions.assertEquals(15.02164F, response.percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-31T22:42:59Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-03T20:16:37Z"), response.endTime());
        Assertions.assertEquals("wbmpspfeylqloc", response.operations().get(0).id());
        Assertions.assertEquals("nmzpas", response.operations().get(0).name());
        Assertions.assertEquals("avxjfiuofpiei", response.operations().get(0).status());
        Assertions.assertEquals(13.99284F, response.operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-20T07:29:01Z"), response.operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-24T17:45:24Z"), response.operations().get(0).endTime());
        Assertions.assertEquals("opac", response.operations().get(0).operations().get(0).id());
        Assertions.assertEquals("mfngpmillxgjsci", response.operations().get(0).operations().get(0).name());
        Assertions.assertEquals("wgsoriobijeiydy", response.operations().get(0).operations().get(0).status());
        Assertions.assertEquals(58.741135F, response.operations().get(0).operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-30T16:18:41Z"),
            response.operations().get(0).operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-30T20:03:07Z"),
            response.operations().get(0).operations().get(0).endTime());
        Assertions.assertEquals("yrgwy", response.operations().get(0).operations().get(0).operations().get(0).status());
    }
}
