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
import com.azure.resourcemanager.networkcloud.models.ClusterDeployParameters;
import com.azure.resourcemanager.networkcloud.models.OperationStatusResult;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ClustersDeployMockTests {
    @Test
    public void testDeploy() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"id\":\"hwzdanojisgglmv\",\"resourceId\":\"atuztjct\",\"name\":\"pvbkaehxsmzyg\",\"status\":\"fwakw\",\"percentComplete\":35.292667,\"startTime\":\"2021-10-24T14:28:17Z\",\"endTime\":\"2021-05-09T21:41:34Z\",\"operations\":[{\"id\":\"so\",\"resourceId\":\"juxlkbectvtfjm\",\"name\":\"dchmaiubavlz\",\"status\":\"pvgmfa\",\"percentComplete\":28.783613,\"startTime\":\"2021-03-01T09:22:06Z\",\"endTime\":\"2021-08-06T15:10:58Z\",\"operations\":[{\"id\":\"dgjqafkmkro\",\"resourceId\":\"rthqe\",\"name\":\"pqrtvaoznqni\",\"status\":\"iezeagm\",\"percentComplete\":6.5347433,\"startTime\":\"2021-06-06T13:22:55Z\",\"endTime\":\"2021-03-13T23:18Z\",\"operations\":[{\"status\":\"hfpjstlzmbls\"},{\"status\":\"jdeolctae\"},{\"status\":\"fsyrledjc\"}]},{\"id\":\"bvt\",\"resourceId\":\"gdxzvsgeafgfoseh\",\"name\":\"zsxezppkkwaae\",\"status\":\"k\",\"percentComplete\":66.895615,\"startTime\":\"2021-10-16T12:43:35Z\",\"endTime\":\"2021-12-09T00:38:09Z\",\"operations\":[{\"status\":\"oyrplixl\"},{\"status\":\"jmllpquevhamfow\"},{\"status\":\"w\"},{\"status\":\"tmk\"}]}]},{\"id\":\"kzwaqxofq\",\"resourceId\":\"chiqbplvfid\",\"name\":\"ztekxbyjgmsfep\",\"status\":\"yihpqadagrh\",\"percentComplete\":50.432777,\"startTime\":\"2021-03-27T17:09:38Z\",\"endTime\":\"2021-02-10T13:07:29Z\",\"operations\":[{\"id\":\"owxwyovcxjsgbip\",\"resourceId\":\"kdveksb\",\"name\":\"oduchvlscr\",\"status\":\"pibfdy\",\"percentComplete\":62.67252,\"startTime\":\"2021-05-01T03:19:26Z\",\"endTime\":\"2021-04-26T01:58:47Z\",\"operations\":[{\"status\":\"ekbhwlkaa\"},{\"status\":\"gkrehbf\"},{\"status\":\"n\"}]},{\"id\":\"ff\",\"resourceId\":\"fiimreoagsqt\",\"name\":\"dusr\",\"status\":\"xxfavsqwudohzilf\",\"percentComplete\":2.8192937,\"startTime\":\"2021-03-12T12:37:46Z\",\"endTime\":\"2021-10-25T06:45:33Z\",\"operations\":[{\"status\":\"s\"},{\"status\":\"eypofqpm\"},{\"status\":\"hyqgsdrmmttjx\"}]}]},{\"id\":\"erhsmvgohtw\",\"resourceId\":\"qilrixysfn\",\"name\":\"sqywwwmhkru\",\"status\":\"aedrympmlqoin\",\"percentComplete\":57.032158,\"startTime\":\"2021-06-28T12:08:40Z\",\"endTime\":\"2021-04-12T09:43:02Z\",\"operations\":[{\"id\":\"fjiiknjdiqf\",\"resourceId\":\"ejhpclbiedfsbwc\",\"name\":\"vbvzipbwxgo\",\"status\":\"oxzpr\",\"percentComplete\":37.58685,\"startTime\":\"2021-05-01T16:17:20Z\",\"endTime\":\"2021-07-15T01:25:19Z\",\"operations\":[{\"status\":\"dgzigjsugswhgs\"},{\"status\":\"odkwwnbafocto\"},{\"status\":\"zhaquvwsxb\"},{\"status\":\"nvkervq\"}]},{\"id\":\"adhrsxqvzvspa\",\"resourceId\":\"sr\",\"name\":\"ajglzrsubklr\",\"status\":\"hjnlt\",\"percentComplete\":84.322235,\"startTime\":\"2021-05-16T23:15:11Z\",\"endTime\":\"2021-09-16T18:33:55Z\",\"operations\":[{\"status\":\"ie\"}]}]},{\"id\":\"aruwdxvqzxoebw\",\"resourceId\":\"xbibanbaupw\",\"name\":\"vpaklozkxbz\",\"status\":\"pejplssa\",\"percentComplete\":22.423506,\"startTime\":\"2021-08-25T22:39:27Z\",\"endTime\":\"2021-07-31T16:17:28Z\",\"operations\":[{\"id\":\"unrswgkpjhboyik\",\"resourceId\":\"huhkslgwlok\",\"name\":\"eoijyzcqypzqzufg\",\"status\":\"yfejyvdwtf\",\"percentComplete\":13.5335865,\"startTime\":\"2021-10-01T23:24:47Z\",\"endTime\":\"2021-08-21T00:51Z\",\"operations\":[{\"status\":\"k\"},{\"status\":\"cf\"},{\"status\":\"ybmx\"},{\"status\":\"nxocuul\"}]},{\"id\":\"kpoy\",\"resourceId\":\"wwdjuxdbdl\",\"name\":\"gdyrcvuqbsgzl\",\"status\":\"qhbjnqogdxwbsfpy\",\"percentComplete\":58.86224,\"startTime\":\"2021-10-15T21:46:21Z\",\"endTime\":\"2021-03-03T16:51:07Z\",\"operations\":[{\"status\":\"ominxojjlu\"},{\"status\":\"xdhilz\"},{\"status\":\"dzzqjmu\"},{\"status\":\"za\"}]}]}]}";

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

        OperationStatusResult response = manager.clusters()
            .deploy("adxkxeqbwpntghy", "sa", new ClusterDeployParameters().withSkipValidationsForMachines(
                Arrays.asList("rnxsluvlzlad", "t", "kpbqhvfdqqjw")), com.azure.core.util.Context.NONE);

        Assertions.assertEquals("hwzdanojisgglmv", response.id());
        Assertions.assertEquals("pvbkaehxsmzyg", response.name());
        Assertions.assertEquals("fwakw", response.status());
        Assertions.assertEquals(35.292667F, response.percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-24T14:28:17Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-09T21:41:34Z"), response.endTime());
        Assertions.assertEquals("so", response.operations().get(0).id());
        Assertions.assertEquals("dchmaiubavlz", response.operations().get(0).name());
        Assertions.assertEquals("pvgmfa", response.operations().get(0).status());
        Assertions.assertEquals(28.783613F, response.operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-01T09:22:06Z"), response.operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-06T15:10:58Z"), response.operations().get(0).endTime());
        Assertions.assertEquals("dgjqafkmkro", response.operations().get(0).operations().get(0).id());
        Assertions.assertEquals("pqrtvaoznqni", response.operations().get(0).operations().get(0).name());
        Assertions.assertEquals("iezeagm", response.operations().get(0).operations().get(0).status());
        Assertions.assertEquals(6.5347433F, response.operations().get(0).operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-06T13:22:55Z"),
            response.operations().get(0).operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-13T23:18Z"),
            response.operations().get(0).operations().get(0).endTime());
        Assertions.assertEquals("hfpjstlzmbls",
            response.operations().get(0).operations().get(0).operations().get(0).status());
    }
}
