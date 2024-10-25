// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.L3OptionBProperties;
import com.azure.resourcemanager.managednetworkfabric.models.RouteTargetInformation;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class L3OptionBPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        L3OptionBProperties model = BinaryData.fromString(
            "{\"importRouteTargets\":[\"ysemtmesrfsvpin\"],\"exportRouteTargets\":[\"atqtdiswxspvckoj\"],\"routeTargets\":{\"importIpv4RouteTargets\":[\"gspftesu\",\"zpvpvdyly\"],\"importIpv6RouteTargets\":[\"vqseus\",\"fjb\",\"xzfxn\",\"mlbmuoswkjm\"],\"exportIpv4RouteTargets\":[\"dcyyyzlwhb\",\"zjnufzrfg\",\"dq\",\"nn\"],\"exportIpv6RouteTargets\":[\"tftedz\",\"ubjtvgjsxmtyjjv\"]}}")
            .toObject(L3OptionBProperties.class);
        Assertions.assertEquals("ysemtmesrfsvpin", model.importRouteTargets().get(0));
        Assertions.assertEquals("atqtdiswxspvckoj", model.exportRouteTargets().get(0));
        Assertions.assertEquals("gspftesu", model.routeTargets().importIpv4RouteTargets().get(0));
        Assertions.assertEquals("vqseus", model.routeTargets().importIpv6RouteTargets().get(0));
        Assertions.assertEquals("dcyyyzlwhb", model.routeTargets().exportIpv4RouteTargets().get(0));
        Assertions.assertEquals("tftedz", model.routeTargets().exportIpv6RouteTargets().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        L3OptionBProperties model = new L3OptionBProperties().withImportRouteTargets(Arrays.asList("ysemtmesrfsvpin"))
            .withExportRouteTargets(Arrays.asList("atqtdiswxspvckoj"))
            .withRouteTargets(
                new RouteTargetInformation().withImportIpv4RouteTargets(Arrays.asList("gspftesu", "zpvpvdyly"))
                    .withImportIpv6RouteTargets(Arrays.asList("vqseus", "fjb", "xzfxn", "mlbmuoswkjm"))
                    .withExportIpv4RouteTargets(Arrays.asList("dcyyyzlwhb", "zjnufzrfg", "dq", "nn"))
                    .withExportIpv6RouteTargets(Arrays.asList("tftedz", "ubjtvgjsxmtyjjv")));
        model = BinaryData.fromObject(model).toObject(L3OptionBProperties.class);
        Assertions.assertEquals("ysemtmesrfsvpin", model.importRouteTargets().get(0));
        Assertions.assertEquals("atqtdiswxspvckoj", model.exportRouteTargets().get(0));
        Assertions.assertEquals("gspftesu", model.routeTargets().importIpv4RouteTargets().get(0));
        Assertions.assertEquals("vqseus", model.routeTargets().importIpv6RouteTargets().get(0));
        Assertions.assertEquals("dcyyyzlwhb", model.routeTargets().exportIpv4RouteTargets().get(0));
        Assertions.assertEquals("tftedz", model.routeTargets().exportIpv6RouteTargets().get(0));
    }
}
