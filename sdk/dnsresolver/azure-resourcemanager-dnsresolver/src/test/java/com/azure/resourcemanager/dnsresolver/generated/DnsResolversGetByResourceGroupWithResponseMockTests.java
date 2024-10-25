// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.dnsresolver.DnsResolverManager;
import com.azure.resourcemanager.dnsresolver.models.DnsResolver;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DnsResolversGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"etag\":\"tibqdxbxwakb\",\"properties\":{\"virtualNetwork\":{\"id\":\"qxn\"},\"dnsResolverState\":\"Disconnected\",\"provisioningState\":\"Updating\",\"resourceGuid\":\"huri\"},\"location\":\"bpodxunkbebxm\",\"tags\":{\"koievseo\":\"yntwlrbq\",\"wzizxbmpgcjefuzm\":\"gqrlltmuwla\"},\"id\":\"vpbttd\",\"name\":\"morppxebmnzbtbh\",\"type\":\"pglkf\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DnsResolverManager manager = DnsResolverManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DnsResolver response = manager.dnsResolvers()
            .getByResourceGroupWithResponse("qqkdltfzxmhhvhgu", "eodkwobda", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("bpodxunkbebxm", response.location());
        Assertions.assertEquals("yntwlrbq", response.tags().get("koievseo"));
        Assertions.assertEquals("qxn", response.virtualNetwork().id());
    }
}
