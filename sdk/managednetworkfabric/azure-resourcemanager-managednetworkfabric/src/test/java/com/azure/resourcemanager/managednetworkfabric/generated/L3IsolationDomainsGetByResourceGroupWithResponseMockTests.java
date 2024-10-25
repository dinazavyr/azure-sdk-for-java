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
import com.azure.resourcemanager.managednetworkfabric.models.L3IsolationDomain;
import com.azure.resourcemanager.managednetworkfabric.models.RedistributeConnectedSubnets;
import com.azure.resourcemanager.managednetworkfabric.models.RedistributeStaticRoutes;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class L3IsolationDomainsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"networkFabricId\":\"vdjlww\",\"configurationState\":\"Accepted\",\"provisioningState\":\"Succeeded\",\"administrativeState\":\"MAT\",\"redistributeConnectedSubnets\":\"True\",\"redistributeStaticRoutes\":\"True\",\"aggregateRouteConfiguration\":{\"ipv4Routes\":[{\"prefix\":\"oyvfwgkz\"},{\"prefix\":\"h\"}],\"ipv6Routes\":[{\"prefix\":\"xjkckwbqwjyfmmkw\"}]},\"connectedSubnetRoutePolicy\":{\"exportRoutePolicyId\":\"ooyzhob\",\"exportRoutePolicy\":{\"exportIpv4RoutePolicyId\":\"uepaco\",\"exportIpv6RoutePolicyId\":\"ohex\"}},\"annotation\":\"gukfkbsycbdymb\"},\"location\":\"eenlqtqyvlfb\",\"tags\":{\"sqephtoshqtua\":\"qdvfj\",\"xaeypyqoizf\":\"jwgujrc\",\"omiflrvfeowc\":\"asyddqbwscjwyy\",\"bvau\":\"shwfrhhas\"},\"id\":\"nwwumkbpg\",\"name\":\"ilbwtpwbjlpfwuq\",\"type\":\"rpdgitenyuksli\"}";

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

        L3IsolationDomain response = manager.l3IsolationDomains()
            .getByResourceGroupWithResponse("nat", "vgcm", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("eenlqtqyvlfb", response.location());
        Assertions.assertEquals("qdvfj", response.tags().get("sqephtoshqtua"));
        Assertions.assertEquals("vdjlww", response.networkFabricId());
        Assertions.assertEquals(RedistributeConnectedSubnets.TRUE, response.redistributeConnectedSubnets());
        Assertions.assertEquals(RedistributeStaticRoutes.TRUE, response.redistributeStaticRoutes());
        Assertions.assertEquals("oyvfwgkz", response.aggregateRouteConfiguration().ipv4Routes().get(0).prefix());
        Assertions.assertEquals("xjkckwbqwjyfmmkw",
            response.aggregateRouteConfiguration().ipv6Routes().get(0).prefix());
        Assertions.assertEquals("ooyzhob", response.connectedSubnetRoutePolicy().exportRoutePolicyId());
        Assertions.assertEquals("uepaco",
            response.connectedSubnetRoutePolicy().exportRoutePolicy().exportIpv4RoutePolicyId());
        Assertions.assertEquals("ohex",
            response.connectedSubnetRoutePolicy().exportRoutePolicy().exportIpv6RoutePolicyId());
        Assertions.assertEquals("gukfkbsycbdymb", response.annotation());
    }
}
