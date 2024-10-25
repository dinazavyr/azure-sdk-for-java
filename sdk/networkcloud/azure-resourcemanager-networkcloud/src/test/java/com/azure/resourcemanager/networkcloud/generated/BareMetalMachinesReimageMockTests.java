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

public final class BareMetalMachinesReimageMockTests {
    @Test
    public void testReimage() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"id\":\"btsuahxs\",\"resourceId\":\"jcmmzrrscub\",\"name\":\"sd\",\"status\":\"npxqwodi\",\"percentComplete\":77.01541,\"startTime\":\"2021-03-03T11:14:29Z\",\"endTime\":\"2021-05-14T08:20:39Z\",\"operations\":[{\"id\":\"abwibvjogjo\",\"resourceId\":\"cyefoyzbamwine\",\"name\":\"vfkakpold\",\"status\":\"vevboclzh\",\"percentComplete\":71.18491,\"startTime\":\"2021-07-15T19:06:59Z\",\"endTime\":\"2021-07-02T09:21:32Z\",\"operations\":[{\"id\":\"txpnrupza\",\"resourceId\":\"rdixt\",\"name\":\"kidswys\",\"status\":\"br\",\"percentComplete\":69.84359,\"startTime\":\"2021-10-21T15:00:18Z\",\"endTime\":\"2021-10-06T17:50:49Z\",\"operations\":[{\"status\":\"utvlxhr\"},{\"status\":\"qhvmblcouqe\"},{\"status\":\"bhbcdszir\"}]}]},{\"id\":\"doypm\",\"resourceId\":\"t\",\"name\":\"rmkfqlwxldykals\",\"status\":\"g\",\"percentComplete\":96.73931,\"startTime\":\"2021-03-31T21:29:13Z\",\"endTime\":\"2021-12-05T06:04:35Z\",\"operations\":[{\"id\":\"jksibjg\",\"resourceId\":\"jxxahmrnad\",\"name\":\"qegxyivpin\",\"status\":\"mhwbjijkgqx\",\"percentComplete\":15.176058,\"startTime\":\"2021-04-20T14:35:11Z\",\"endTime\":\"2021-10-16T14:02:14Z\",\"operations\":[{\"status\":\"aujvaa\"}]}]},{\"id\":\"iycwkdta\",\"resourceId\":\"xw\",\"name\":\"ka\",\"status\":\"mrrqmbzmqkratb\",\"percentComplete\":66.8104,\"startTime\":\"2021-06-21T18:23:35Z\",\"endTime\":\"2021-08-05T15:01:16Z\",\"operations\":[{\"id\":\"rkfpks\",\"resourceId\":\"dgo\",\"name\":\"wijymr\",\"status\":\"bguzozky\",\"percentComplete\":40.12607,\"startTime\":\"2020-12-24T09:45:57Z\",\"endTime\":\"2021-06-15T03:53:03Z\",\"operations\":[{\"status\":\"qo\"},{\"status\":\"mffjkutycyarn\"}]},{\"id\":\"hguabzoghktdp\",\"resourceId\":\"z\",\"name\":\"oeocnhzqrott\",\"status\":\"zcfyjzptwrl\",\"percentComplete\":34.49209,\"startTime\":\"2021-03-15T17:03:59Z\",\"endTime\":\"2021-02-15T18:23:08Z\",\"operations\":[{\"status\":\"zpyglqdhmrj\"},{\"status\":\"ralcxpjbyypsj\"},{\"status\":\"qcjenkyhf\"}]},{\"id\":\"sqxfxjelgcmpz\",\"resourceId\":\"hhhqxuwyv\",\"name\":\"co\",\"status\":\"v\",\"percentComplete\":31.564491,\"startTime\":\"2021-08-20T22:21:36Z\",\"endTime\":\"2021-03-26T16:46:43Z\",\"operations\":[{\"status\":\"szlbscm\"},{\"status\":\"lzijiufehgmvflnw\"}]}]},{\"id\":\"xrerlniylylyf\",\"resourceId\":\"zutgqztwhghmupg\",\"name\":\"jtcdxabbujftaben\",\"status\":\"bklqpxz\",\"percentComplete\":65.13686,\"startTime\":\"2021-07-29T07:07:53Z\",\"endTime\":\"2021-04-20T13:02:49Z\",\"operations\":[{\"id\":\"lzafwxu\",\"resourceId\":\"nhgookrtalvnbw\",\"name\":\"bemeluclvd\",\"status\":\"jukyrdn\",\"percentComplete\":88.03156,\"startTime\":\"2021-10-09T14:31:55Z\",\"endTime\":\"2021-04-05T17:13:39Z\",\"operations\":[{\"status\":\"qfaqnvzoqg\"},{\"status\":\"ipemchgavscz\"}]},{\"id\":\"dtx\",\"resourceId\":\"lghwzhome\",\"name\":\"j\",\"status\":\"tl\",\"percentComplete\":35.869938,\"startTime\":\"2021-05-19T10:52:28Z\",\"endTime\":\"2021-07-26T14:32:02Z\",\"operations\":[{\"status\":\"ia\"},{\"status\":\"cz\"},{\"status\":\"vodrrslblxydkxr\"}]},{\"id\":\"bxiwkgfbqljn\",\"resourceId\":\"hychocokuleh\",\"name\":\"qlrqffaweyurk\",\"status\":\"hy\",\"percentComplete\":15.436524,\"startTime\":\"2021-08-23T02:12:11Z\",\"endTime\":\"2021-05-18T20:50:57Z\",\"operations\":[{\"status\":\"dbrxmrgc\"},{\"status\":\"bapxkiyfjjkb\"},{\"status\":\"jbuscg\"}]}]}]}";

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
            = manager.bareMetalMachines().reimage("xbulpzealbmqkyo", "wyvf", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("btsuahxs", response.id());
        Assertions.assertEquals("sd", response.name());
        Assertions.assertEquals("npxqwodi", response.status());
        Assertions.assertEquals(77.01541F, response.percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-03T11:14:29Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-14T08:20:39Z"), response.endTime());
        Assertions.assertEquals("abwibvjogjo", response.operations().get(0).id());
        Assertions.assertEquals("vfkakpold", response.operations().get(0).name());
        Assertions.assertEquals("vevboclzh", response.operations().get(0).status());
        Assertions.assertEquals(71.18491F, response.operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-15T19:06:59Z"), response.operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-02T09:21:32Z"), response.operations().get(0).endTime());
        Assertions.assertEquals("txpnrupza", response.operations().get(0).operations().get(0).id());
        Assertions.assertEquals("kidswys", response.operations().get(0).operations().get(0).name());
        Assertions.assertEquals("br", response.operations().get(0).operations().get(0).status());
        Assertions.assertEquals(69.84359F, response.operations().get(0).operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-21T15:00:18Z"),
            response.operations().get(0).operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-06T17:50:49Z"),
            response.operations().get(0).operations().get(0).endTime());
        Assertions.assertEquals("utvlxhr",
            response.operations().get(0).operations().get(0).operations().get(0).status());
    }
}
