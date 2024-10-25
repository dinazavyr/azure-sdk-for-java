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
import com.azure.resourcemanager.managednetworkfabric.models.BfdConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.BooleanEnumProperty;
import com.azure.resourcemanager.managednetworkfabric.models.ConnectedSubnet;
import com.azure.resourcemanager.managednetworkfabric.models.ExportRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.Extension;
import com.azure.resourcemanager.managednetworkfabric.models.ImportRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.InternalNetwork;
import com.azure.resourcemanager.managednetworkfabric.models.InternalNetworkPropertiesBgpConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.InternalNetworkPropertiesStaticRouteConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.IsMonitoringEnabled;
import com.azure.resourcemanager.managednetworkfabric.models.NeighborAddress;
import com.azure.resourcemanager.managednetworkfabric.models.StaticRouteProperties;
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

public final class InternalNetworksCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"vlanId\":1818610195,\"bgpConfiguration\":{\"bfdConfiguration\":{\"administrativeState\":\"RMA\",\"intervalInMilliSeconds\":574566752,\"multiplier\":1367524324},\"defaultRouteOriginate\":\"False\",\"allowAS\":1959640018,\"allowASOverride\":\"Disable\",\"fabricASN\":178761878052758363,\"peerASN\":3211289839298869603,\"ipv4ListenRangePrefixes\":[\"kedaxkuyorfj\"],\"ipv6ListenRangePrefixes\":[\"odaweo\"],\"ipv4NeighborAddress\":[{\"address\":\"yihuzsbpwn\",\"configurationState\":\"ErrorProvisioning\"},{\"address\":\"ypazwiimdlzg\",\"configurationState\":\"Rejected\"},{\"address\":\"grlw\",\"configurationState\":\"Deprovisioning\"}],\"ipv6NeighborAddress\":[{\"address\":\"twqade\",\"configurationState\":\"Failed\"},{\"address\":\"xkyxiatfamrna\",\"configurationState\":\"ErrorProvisioning\"},{\"address\":\"xccpr\",\"configurationState\":\"Rejected\"}],\"annotation\":\"ozwhomydxgt\"},\"staticRouteConfiguration\":{\"extension\":\"NoExtension\",\"bfdConfiguration\":{\"administrativeState\":\"RMA\",\"intervalInMilliSeconds\":1392142414,\"multiplier\":1334408206},\"ipv4Routes\":[{\"prefix\":\"vvketyd\",\"nextHop\":[\"qok\",\"ssgvq\",\"erxrmhrr\",\"qgbbj\"]},{\"prefix\":\"vihylrxsiyzsyium\",\"nextHop\":[\"tlqycfvernnk\",\"pkayqivbig\",\"rqgzetbo\"]},{\"prefix\":\"ztgnmuxppw\",\"nextHop\":[\"fmgrmtgwhz\"]}],\"ipv6Routes\":[{\"prefix\":\"wrjenco\",\"nextHop\":[\"ii\",\"wibdtpljo\",\"majokbxxcdkhxjwt\"]},{\"prefix\":\"ftg\",\"nextHop\":[\"juepmewsj\",\"gbmlbxjhgvtep\"]},{\"prefix\":\"runudmakkshrna\",\"nextHop\":[\"czkwohdigeyuocf\",\"samodwq\",\"a\"]}]},\"configurationState\":\"ErrorProvisioning\",\"provisioningState\":\"Succeeded\",\"administrativeState\":\"Disabled\",\"mtu\":192902937,\"connectedIPv4Subnets\":[{\"prefix\":\"rnnbegrafeonmto\",\"annotation\":\"g\"},{\"prefix\":\"ofmazhkqqs\",\"annotation\":\"na\"},{\"prefix\":\"szbwgpmdmwi\",\"annotation\":\"vve\"}],\"connectedIPv6Subnets\":[{\"prefix\":\"hh\",\"annotation\":\"qhdldargkwimtcce\"}],\"importRoutePolicyId\":\"uqu\",\"exportRoutePolicyId\":\"czzc\",\"importRoutePolicy\":{\"importIpv4RoutePolicyId\":\"xvbkirgknhfwlajw\",\"importIpv6RoutePolicyId\":\"jydjb\"},\"exportRoutePolicy\":{\"exportIpv4RoutePolicyId\":\"pvspewyzhydtk\",\"exportIpv6RoutePolicyId\":\"trsdp\"},\"ingressAclId\":\"iaigarmawokgcn\",\"egressAclId\":\"iccwbqy\",\"isMonitoringEnabled\":\"True\",\"extension\":\"NoExtension\",\"annotation\":\"giynqryo\"},\"id\":\"weofvsxauphzefi\",\"name\":\"eyydx\",\"type\":\"gtiivzkd\"}";

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
            .define("blnlmpuyypaggpai")
            .withExistingL3IsolationDomain("thfwl", "vqacbyfi")
            .withVlanId(2101185466)
            .withBgpConfiguration(new InternalNetworkPropertiesBgpConfiguration().withAnnotation("ctbxzj")
                .withBfdConfiguration(
                    new BfdConfiguration().withIntervalInMilliSeconds(1738694664).withMultiplier(426444436))
                .withDefaultRouteOriginate(BooleanEnumProperty.TRUE)
                .withAllowAS(47352357)
                .withAllowASOverride(AllowASOverride.DISABLE)
                .withPeerAsn(996176222973422710L)
                .withIpv4ListenRangePrefixes(
                    Arrays.asList("wukhjdspll", "txrrgkwiyoyhq", "ivxcodwkwoytcach", "sizfuewlf"))
                .withIpv6ListenRangePrefixes(Arrays.asList("ikqcdnzsfiuhgne", "o", "mcrxlyzoaho", "ufakrxjjwnbrmdwt"))
                .withIpv4NeighborAddress(Arrays.asList(new NeighborAddress().withAddress("syiaanist"),
                    new NeighborAddress().withAddress("tclpphcs")))
                .withIpv6NeighborAddress(Arrays.asList(new NeighborAddress().withAddress("anapfaoiz"),
                    new NeighborAddress().withAddress("pxngzzxqbgq"))))
            .withStaticRouteConfiguration(new InternalNetworkPropertiesStaticRouteConfiguration()
                .withBfdConfiguration(
                    new BfdConfiguration().withIntervalInMilliSeconds(1104440707).withMultiplier(1297511755))
                .withIpv4Routes(
                    Arrays.asList(new StaticRouteProperties().withPrefix("bsk").withNextHop(Arrays.asList("afzsq"))))
                .withIpv6Routes(Arrays.asList(new StaticRouteProperties().withPrefix("npxmiwtkqifp")
                    .withNextHop(Arrays.asList("dukcdnzoxla", "uxtwgbawshram"))))
                .withExtension(Extension.NPB))
            .withMtu(63592879)
            .withConnectedIPv4Subnets(Arrays.asList(new ConnectedSubnet().withAnnotation("vqlauuag").withPrefix("fzto"),
                new ConnectedSubnet().withAnnotation("zwjipssvnon").withPrefix("ayfmcerfxfeiqbas"),
                new ConnectedSubnet().withAnnotation("pdqqbtok").withPrefix("jcqcjozzjk"),
                new ConnectedSubnet().withAnnotation("wettohgpz").withPrefix("ocuzxllbpwa")))
            .withConnectedIPv6Subnets(Arrays.asList(new ConnectedSubnet().withAnnotation("xpu").withPrefix("vtkzbh")))
            .withImportRoutePolicyId("dmwnfhmjusuqn")
            .withExportRoutePolicyId("shv")
            .withImportRoutePolicy(new ImportRoutePolicy().withImportIpv4RoutePolicyId("dhekaqnirmidtv")
                .withImportIpv6RoutePolicyId("cgszfbqygkxrlfo"))
            .withExportRoutePolicy(new ExportRoutePolicy().withExportIpv4RoutePolicyId("lpumveybodhrvyk")
                .withExportIpv6RoutePolicyId("umwbcu"))
            .withIngressAclId("vegpdxts")
            .withEgressAclId("jtcooj")
            .withIsMonitoringEnabled(IsMonitoringEnabled.FALSE)
            .withExtension(Extension.NO_EXTENSION)
            .withAnnotation("xuptsliivmlkw")
            .create();

        Assertions.assertEquals(1818610195, response.vlanId());
        Assertions.assertEquals("ozwhomydxgt", response.bgpConfiguration().annotation());
        Assertions.assertEquals(574566752, response.bgpConfiguration().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(1367524324, response.bgpConfiguration().bfdConfiguration().multiplier());
        Assertions.assertEquals(BooleanEnumProperty.FALSE, response.bgpConfiguration().defaultRouteOriginate());
        Assertions.assertEquals(1959640018, response.bgpConfiguration().allowAS());
        Assertions.assertEquals(AllowASOverride.DISABLE, response.bgpConfiguration().allowASOverride());
        Assertions.assertEquals(3211289839298869603L, response.bgpConfiguration().peerAsn());
        Assertions.assertEquals("kedaxkuyorfj", response.bgpConfiguration().ipv4ListenRangePrefixes().get(0));
        Assertions.assertEquals("odaweo", response.bgpConfiguration().ipv6ListenRangePrefixes().get(0));
        Assertions.assertEquals("yihuzsbpwn", response.bgpConfiguration().ipv4NeighborAddress().get(0).address());
        Assertions.assertEquals("twqade", response.bgpConfiguration().ipv6NeighborAddress().get(0).address());
        Assertions.assertEquals(1392142414,
            response.staticRouteConfiguration().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(1334408206, response.staticRouteConfiguration().bfdConfiguration().multiplier());
        Assertions.assertEquals("vvketyd", response.staticRouteConfiguration().ipv4Routes().get(0).prefix());
        Assertions.assertEquals("qok", response.staticRouteConfiguration().ipv4Routes().get(0).nextHop().get(0));
        Assertions.assertEquals("wrjenco", response.staticRouteConfiguration().ipv6Routes().get(0).prefix());
        Assertions.assertEquals("ii", response.staticRouteConfiguration().ipv6Routes().get(0).nextHop().get(0));
        Assertions.assertEquals(Extension.NO_EXTENSION, response.staticRouteConfiguration().extension());
        Assertions.assertEquals(192902937, response.mtu());
        Assertions.assertEquals("g", response.connectedIPv4Subnets().get(0).annotation());
        Assertions.assertEquals("rnnbegrafeonmto", response.connectedIPv4Subnets().get(0).prefix());
        Assertions.assertEquals("qhdldargkwimtcce", response.connectedIPv6Subnets().get(0).annotation());
        Assertions.assertEquals("hh", response.connectedIPv6Subnets().get(0).prefix());
        Assertions.assertEquals("uqu", response.importRoutePolicyId());
        Assertions.assertEquals("czzc", response.exportRoutePolicyId());
        Assertions.assertEquals("xvbkirgknhfwlajw", response.importRoutePolicy().importIpv4RoutePolicyId());
        Assertions.assertEquals("jydjb", response.importRoutePolicy().importIpv6RoutePolicyId());
        Assertions.assertEquals("pvspewyzhydtk", response.exportRoutePolicy().exportIpv4RoutePolicyId());
        Assertions.assertEquals("trsdp", response.exportRoutePolicy().exportIpv6RoutePolicyId());
        Assertions.assertEquals("iaigarmawokgcn", response.ingressAclId());
        Assertions.assertEquals("iccwbqy", response.egressAclId());
        Assertions.assertEquals(IsMonitoringEnabled.TRUE, response.isMonitoringEnabled());
        Assertions.assertEquals(Extension.NO_EXTENSION, response.extension());
        Assertions.assertEquals("giynqryo", response.annotation());
    }
}
