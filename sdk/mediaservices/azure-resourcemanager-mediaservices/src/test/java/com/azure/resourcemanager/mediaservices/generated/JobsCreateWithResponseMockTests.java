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
import com.azure.resourcemanager.mediaservices.models.Job;
import com.azure.resourcemanager.mediaservices.models.JobInput;
import com.azure.resourcemanager.mediaservices.models.Priority;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class JobsCreateWithResponseMockTests {
    @Test
    public void testCreateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"created\":\"2021-01-01T01:01:21Z\",\"state\":\"Scheduled\",\"description\":\"gsfikayiansha\",\"input\":{\"@odata.type\":\"JobInput\"},\"lastModified\":\"2021-08-12T09:06:22Z\",\"outputs\":[],\"priority\":\"High\",\"correlationData\":{\"vwkpqh\":\"fzyjqt\"},\"startTime\":\"2021-07-09T12:00:41Z\",\"endTime\":\"2021-10-28T18:12:29Z\"},\"id\":\"gbqe\",\"name\":\"qekewvnqvcd\",\"type\":\"guaucmfdjwnla\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(201);
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

        Job response = manager.jobs()
            .define("uooqjagmdit")
            .withExistingTransform("tkw", "eg", "amlbnseqacjjvpil")
            .withDescription("jbsahrtdtpde")
            .withInput(new JobInput())
            .withOutputs(Arrays.asList())
            .withPriority(Priority.LOW)
            .withCorrelationData(mapOf("o", "toebnf", "razftxejwabmdujt", "vcjkgd", "m", "vcopex"))
            .create();

        Assertions.assertEquals("gsfikayiansha", response.description());
        Assertions.assertEquals(Priority.HIGH, response.priority());
        Assertions.assertEquals("fzyjqt", response.correlationData().get("vwkpqh"));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
