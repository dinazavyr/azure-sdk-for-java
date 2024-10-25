// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager;
import com.azure.resourcemanager.hardwaresecuritymodules.models.DedicatedHsm;
import com.azure.resourcemanager.hardwaresecuritymodules.models.SkuName;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DedicatedHsmsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"systemData\":{\"createdBy\":\"ybar\",\"createdByType\":\"Application\",\"createdAt\":\"2021-02-15T18:43:44Z\",\"lastModifiedBy\":\"kq\",\"lastModifiedByType\":\"Application\",\"lastModifiedAt\":\"2021-11-18T10:38:36Z\"},\"properties\":{\"networkProfile\":{\"subnet\":{\"id\":\"sjc\"},\"networkInterfaces\":[{\"id\":\"n\",\"privateIpAddress\":\"iew\"},{\"id\":\"cv\",\"privateIpAddress\":\"uwrbehwagoh\"},{\"id\":\"f\",\"privateIpAddress\":\"mrqemvvhmx\"},{\"id\":\"rjfut\",\"privateIpAddress\":\"oe\"}]},\"managementNetworkProfile\":{\"subnet\":{\"id\":\"wzcjznmwcpmgua\"},\"networkInterfaces\":[{\"id\":\"ufactk\",\"privateIpAddress\":\"zov\"},{\"id\":\"j\",\"privateIpAddress\":\"uxxpshne\"},{\"id\":\"ulfgslqu\",\"privateIpAddress\":\"wdlenrdsut\"},{\"id\":\"bazpjuohmi\",\"privateIpAddress\":\"flnorwmduvwp\"}]},\"stampId\":\"vxwmygd\",\"statusMessage\":\"gpqch\",\"provisioningState\":\"Deleting\"},\"sku\":{\"name\":\"SafeNet Luna Network HSM A790\"},\"zones\":[\"jcrxgibbdaxcon\",\"ozauorsukokwb\",\"plhlvnuuepzlrp\",\"wzsoldweyuqdunv\"],\"location\":\"nnrwrbiork\",\"tags\":{\"sivfomilo\":\"ywjhhgdnhx\",\"ao\":\"ggdufiqndieu\"},\"id\":\"jchvcyy\",\"name\":\"s\",\"type\":\"gdotcubiipuipwo\"}";

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

        HardwareSecurityModulesManager manager = HardwareSecurityModulesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DedicatedHsm response = manager.dedicatedHsms()
            .getByResourceGroupWithResponse("qjbvleorfmlu", "qtqzfavyv", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("nnrwrbiork", response.location());
        Assertions.assertEquals("ywjhhgdnhx", response.tags().get("sivfomilo"));
        Assertions.assertEquals(SkuName.SAFE_NET_LUNA_NETWORK_HSM_A790, response.sku().name());
        Assertions.assertEquals("jcrxgibbdaxcon", response.zones().get(0));
        Assertions.assertEquals("sjc", response.properties().networkProfile().subnet().id());
        Assertions.assertEquals("iew",
            response.properties().networkProfile().networkInterfaces().get(0).privateIpAddress());
        Assertions.assertEquals("wzcjznmwcpmgua", response.properties().managementNetworkProfile().subnet().id());
        Assertions.assertEquals("zov",
            response.properties().managementNetworkProfile().networkInterfaces().get(0).privateIpAddress());
        Assertions.assertEquals("vxwmygd", response.properties().stampId());
    }
}
