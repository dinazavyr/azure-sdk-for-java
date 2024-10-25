// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mediaservices.MediaServicesManager;
import com.azure.resourcemanager.mediaservices.models.Hls;
import com.azure.resourcemanager.mediaservices.models.LiveOutput;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class LiveOutputsCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"description\":\"qowxwcom\",\"assetName\":\"ikytwvczcswka\",\"archiveWindowLength\":\"PT206H19M22S\",\"rewindWindowLength\":\"PT81H56M32S\",\"manifestName\":\"fdv\",\"hls\":{\"fragmentsPerTsSegment\":133046174},\"outputSnapTime\":506262228039984631,\"created\":\"2021-07-08T00:02:29Z\",\"lastModified\":\"2021-08-22T01:15:59Z\",\"provisioningState\":\"Succeeded\",\"resourceState\":\"Deleting\"},\"id\":\"yank\",\"name\":\"oe\",\"type\":\"swankltytmh\"}";

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

        MediaServicesManager manager = MediaServicesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        LiveOutput response = manager.liveOutputs()
            .define("hcecybmrqbr")
            .withExistingLiveEvent("qejo", "ovyrrleaesinu", "tljqobbpih")
            .withDescription("mpxdlvy")
            .withAssetName("frexcrseqw")
            .withArchiveWindowLength(Duration.parse("PT110H29M37S"))
            .withRewindWindowLength(Duration.parse("PT48H32M10S"))
            .withManifestName("udgzhxogjgg")
            .withHls(new Hls().withFragmentsPerTsSegment(210376116))
            .withOutputSnapTime(8090537844238536185L)
            .create();

        Assertions.assertEquals("qowxwcom", response.description());
        Assertions.assertEquals("ikytwvczcswka", response.assetName());
        Assertions.assertEquals(Duration.parse("PT206H19M22S"), response.archiveWindowLength());
        Assertions.assertEquals(Duration.parse("PT81H56M32S"), response.rewindWindowLength());
        Assertions.assertEquals("fdv", response.manifestName());
        Assertions.assertEquals(133046174, response.hls().fragmentsPerTsSegment());
        Assertions.assertEquals(506262228039984631L, response.outputSnapTime());
    }
}
