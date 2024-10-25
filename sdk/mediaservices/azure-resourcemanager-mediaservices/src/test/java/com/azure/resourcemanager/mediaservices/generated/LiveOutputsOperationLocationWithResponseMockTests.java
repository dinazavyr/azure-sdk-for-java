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

public final class LiveOutputsOperationLocationWithResponseMockTests {
    @Test
    public void testOperationLocationWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"description\":\"zmtksjci\",\"assetName\":\"digsxcdgl\",\"archiveWindowLength\":\"PT200H1M7S\",\"rewindWindowLength\":\"PT39H56M9S\",\"manifestName\":\"ua\",\"hls\":{\"fragmentsPerTsSegment\":734144074},\"outputSnapTime\":3217232205937864406,\"created\":\"2021-03-19T13:19:35Z\",\"lastModified\":\"2021-09-29T06:45:15Z\",\"provisioningState\":\"fpfmdgycxnmskwh\",\"resourceState\":\"Running\"},\"id\":\"slurlpshhkvpe\",\"name\":\"wqslsrhmpqvw\",\"type\":\"skondcbrwimu\"}";

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
            .operationLocationWithResponse("bgj", "kglklbyulidwcw", "mzegjon", "hj", "rwgdnqzbrfks",
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("zmtksjci", response.description());
        Assertions.assertEquals("digsxcdgl", response.assetName());
        Assertions.assertEquals(Duration.parse("PT200H1M7S"), response.archiveWindowLength());
        Assertions.assertEquals(Duration.parse("PT39H56M9S"), response.rewindWindowLength());
        Assertions.assertEquals("ua", response.manifestName());
        Assertions.assertEquals(734144074, response.hls().fragmentsPerTsSegment());
        Assertions.assertEquals(3217232205937864406L, response.outputSnapTime());
    }
}
