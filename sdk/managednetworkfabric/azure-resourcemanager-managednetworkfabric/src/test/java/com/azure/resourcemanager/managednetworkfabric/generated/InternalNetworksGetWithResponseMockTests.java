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
import com.azure.resourcemanager.managednetworkfabric.models.AllowASOverride;
import com.azure.resourcemanager.managednetworkfabric.models.BooleanEnumProperty;
import com.azure.resourcemanager.managednetworkfabric.models.Extension;
import com.azure.resourcemanager.managednetworkfabric.models.InternalNetwork;
import com.azure.resourcemanager.managednetworkfabric.models.IsMonitoringEnabled;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class InternalNetworksGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"vlanId\":2051280124,\"bgpConfiguration\":{\"bfdConfiguration\":{\"administrativeState\":\"RMA\",\"intervalInMilliSeconds\":1139668415,\"multiplier\":2020896000},\"defaultRouteOriginate\":\"False\",\"allowAS\":676445436,\"allowASOverride\":\"Enable\",\"fabricASN\":1443023715460147904,\"peerASN\":8347088160005961613,\"ipv4ListenRangePrefixes\":[\"y\",\"xxrat\"],\"ipv6ListenRangePrefixes\":[\"eqbrcmmdtsh\",\"umxu\"],\"ipv4NeighborAddress\":[{\"address\":\"ab\",\"configurationState\":\"Succeeded\"}],\"ipv6NeighborAddress\":[{\"address\":\"nmjwkowxqzk\",\"configurationState\":\"ErrorDeprovisioning\"},{\"address\":\"ejh\",\"configurationState\":\"Failed\"}],\"annotation\":\"hrskmpeajzzypav\"},\"staticRouteConfiguration\":{\"extension\":\"NPB\",\"bfdConfiguration\":{\"administrativeState\":\"RMA\",\"intervalInMilliSeconds\":383750498,\"multiplier\":608994421},\"ipv4Routes\":[{\"prefix\":\"txytja\",\"nextHop\":[\"j\"]},{\"prefix\":\"rjlijkkvbfaehjji\",\"nextHop\":[\"jqxavqmdmracfsf\",\"dralihhss\"]}],\"ipv6Routes\":[{\"prefix\":\"yzhcvlavy\",\"nextHop\":[\"lndxrmyzvti\",\"jtpdru\",\"xaxoyj\",\"h\"]},{\"prefix\":\"twedi\",\"nextHop\":[\"vktecc\",\"fnatntmcaxbqpm\",\"hjikq\",\"nbdqitghnm\"]}]},\"configurationState\":\"Deprovisioned\",\"provisioningState\":\"Canceled\",\"administrativeState\":\"MAT\",\"mtu\":1697277556,\"connectedIPv4Subnets\":[{\"prefix\":\"grmwyvhdiy\",\"annotation\":\"gqqqgrbrhh\"},{\"prefix\":\"ipgtipaao\",\"annotation\":\"whfm\"},{\"prefix\":\"bweasgypjixd\",\"annotation\":\"badydwqeuwdvcl\"}],\"connectedIPv6Subnets\":[{\"prefix\":\"qdchnzib\",\"annotation\":\"rgsrwxxqkwargc\"},{\"prefix\":\"gd\",\"annotation\":\"sijiqexqwqykm\"},{\"prefix\":\"ugflhdhoxurhc\",\"annotation\":\"kvthwtamvmb\"},{\"prefix\":\"yvxhfmuh\",\"annotation\":\"z\"}],\"importRoutePolicyId\":\"cqic\",\"exportRoutePolicyId\":\"dxvbeqzjdwxt\",\"importRoutePolicy\":{\"importIpv4RoutePolicyId\":\"dwneecmytlx\",\"importIpv6RoutePolicyId\":\"jrwvnffaofkvfru\"},\"exportRoutePolicy\":{\"exportIpv4RoutePolicyId\":\"fbvhgykzov\",\"exportIpv6RoutePolicyId\":\"vym\"},\"ingressAclId\":\"ay\",\"egressAclId\":\"myrn\",\"isMonitoringEnabled\":\"True\",\"extension\":\"NPB\",\"annotation\":\"fnoxhvo\"},\"id\":\"dgfkrqsjrvpakxr\",\"name\":\"eexweju\",\"type\":\"uvnxbohpzur\"}";

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

        InternalNetwork response = manager.internalNetworks()
            .getWithResponse("nbnyplu", "ypkfcdfuxi", "zvxotnoilqcdvhy", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(2051280124, response.vlanId());
        Assertions.assertEquals("hrskmpeajzzypav", response.bgpConfiguration().annotation());
        Assertions.assertEquals(1139668415, response.bgpConfiguration().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(2020896000, response.bgpConfiguration().bfdConfiguration().multiplier());
        Assertions.assertEquals(BooleanEnumProperty.FALSE, response.bgpConfiguration().defaultRouteOriginate());
        Assertions.assertEquals(676445436, response.bgpConfiguration().allowAS());
        Assertions.assertEquals(AllowASOverride.ENABLE, response.bgpConfiguration().allowASOverride());
        Assertions.assertEquals(8347088160005961613L, response.bgpConfiguration().peerAsn());
        Assertions.assertEquals("y", response.bgpConfiguration().ipv4ListenRangePrefixes().get(0));
        Assertions.assertEquals("eqbrcmmdtsh", response.bgpConfiguration().ipv6ListenRangePrefixes().get(0));
        Assertions.assertEquals("ab", response.bgpConfiguration().ipv4NeighborAddress().get(0).address());
        Assertions.assertEquals("nmjwkowxqzk", response.bgpConfiguration().ipv6NeighborAddress().get(0).address());
        Assertions.assertEquals(383750498,
            response.staticRouteConfiguration().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(608994421, response.staticRouteConfiguration().bfdConfiguration().multiplier());
        Assertions.assertEquals("txytja", response.staticRouteConfiguration().ipv4Routes().get(0).prefix());
        Assertions.assertEquals("j", response.staticRouteConfiguration().ipv4Routes().get(0).nextHop().get(0));
        Assertions.assertEquals("yzhcvlavy", response.staticRouteConfiguration().ipv6Routes().get(0).prefix());
        Assertions.assertEquals("lndxrmyzvti",
            response.staticRouteConfiguration().ipv6Routes().get(0).nextHop().get(0));
        Assertions.assertEquals(Extension.NPB, response.staticRouteConfiguration().extension());
        Assertions.assertEquals(1697277556, response.mtu());
        Assertions.assertEquals("gqqqgrbrhh", response.connectedIPv4Subnets().get(0).annotation());
        Assertions.assertEquals("grmwyvhdiy", response.connectedIPv4Subnets().get(0).prefix());
        Assertions.assertEquals("rgsrwxxqkwargc", response.connectedIPv6Subnets().get(0).annotation());
        Assertions.assertEquals("qdchnzib", response.connectedIPv6Subnets().get(0).prefix());
        Assertions.assertEquals("cqic", response.importRoutePolicyId());
        Assertions.assertEquals("dxvbeqzjdwxt", response.exportRoutePolicyId());
        Assertions.assertEquals("dwneecmytlx", response.importRoutePolicy().importIpv4RoutePolicyId());
        Assertions.assertEquals("jrwvnffaofkvfru", response.importRoutePolicy().importIpv6RoutePolicyId());
        Assertions.assertEquals("fbvhgykzov", response.exportRoutePolicy().exportIpv4RoutePolicyId());
        Assertions.assertEquals("vym", response.exportRoutePolicy().exportIpv6RoutePolicyId());
        Assertions.assertEquals("ay", response.ingressAclId());
        Assertions.assertEquals("myrn", response.egressAclId());
        Assertions.assertEquals(IsMonitoringEnabled.TRUE, response.isMonitoringEnabled());
        Assertions.assertEquals(Extension.NPB, response.extension());
        Assertions.assertEquals("fnoxhvo", response.annotation());
    }
}
