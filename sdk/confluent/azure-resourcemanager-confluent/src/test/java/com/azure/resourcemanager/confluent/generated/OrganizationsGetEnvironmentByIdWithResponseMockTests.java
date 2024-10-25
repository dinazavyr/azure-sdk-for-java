// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.confluent.ConfluentManager;
import com.azure.resourcemanager.confluent.models.SCEnvironmentRecord;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class OrganizationsGetEnvironmentByIdWithResponseMockTests {
    @Test
    public void testGetEnvironmentByIdWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"kind\":\"lds\",\"id\":\"stjbkkdmfl\",\"properties\":{\"metadata\":{\"self\":\"mjlxrrilozapeewc\",\"resourceName\":\"xlktwkuzi\",\"createdTimestamp\":\"slevufuztc\",\"updatedTimestamp\":\"yhjtqedcgzu\",\"deletedTimestamp\":\"mmrqz\"}},\"name\":\"rjvpglydzgkrvqee\"}";

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

        ConfluentManager manager = ConfluentManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        SCEnvironmentRecord response = manager.organizations()
            .getEnvironmentByIdWithResponse("wzjbh", "zsxjrkambtrneg", "mnvuqe", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("lds", response.kind());
        Assertions.assertEquals("stjbkkdmfl", response.id());
        Assertions.assertEquals("rjvpglydzgkrvqee", response.name());
        Assertions.assertEquals("mjlxrrilozapeewc", response.metadata().self());
        Assertions.assertEquals("xlktwkuzi", response.metadata().resourceName());
        Assertions.assertEquals("slevufuztc", response.metadata().createdTimestamp());
        Assertions.assertEquals("yhjtqedcgzu", response.metadata().updatedTimestamp());
        Assertions.assertEquals("mmrqz", response.metadata().deletedTimestamp());
    }
}
