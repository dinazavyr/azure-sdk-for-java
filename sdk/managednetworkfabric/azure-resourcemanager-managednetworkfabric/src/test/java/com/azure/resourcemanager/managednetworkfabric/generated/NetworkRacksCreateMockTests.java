// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkRack;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkRackType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class NetworkRacksCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"networkRackType\":\"Aggregate\",\"networkFabricId\":\"hedrbzzbhyagwxw\",\"networkDevices\":[\"kdlxdlh\",\"alz\"],\"provisioningState\":\"Succeeded\",\"annotation\":\"kyxowno\"},\"location\":\"qus\",\"tags\":{\"gtjxlopncc\":\"ajicrs\",\"jlwrfeabzjpg\":\"xtpprszeh\",\"rxix\":\"jmgpceqaklsfx\",\"sbjxpuokkdpts\":\"mfqmvnhsfjxt\"},\"id\":\"pg\",\"name\":\"plonal\",\"type\":\"waulkwuyasjwn\"}";

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

        ManagedNetworkFabricManager manager = ManagedNetworkFabricManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        NetworkRack response = manager.networkRacks()
            .define("eciexsc")
            .withRegion("bnwdkgbzjoyy")
            .withExistingResourceGroup("tkgopdjqnsicucq")
            .withNetworkFabricId("hjjlypwgwbycf")
            .withTags(mapOf("qxkzeowizvj", "okd", "xxboauvkkc", "jzxkflzqw"))
            .withNetworkRackType(NetworkRackType.COMPUTE)
            .withAnnotation("myerpusozaoutjl")
            .create();

        Assertions.assertEquals("qus", response.location());
        Assertions.assertEquals("ajicrs", response.tags().get("gtjxlopncc"));
        Assertions.assertEquals(NetworkRackType.AGGREGATE, response.networkRackType());
        Assertions.assertEquals("hedrbzzbhyagwxw", response.networkFabricId());
        Assertions.assertEquals("kyxowno", response.annotation());
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
