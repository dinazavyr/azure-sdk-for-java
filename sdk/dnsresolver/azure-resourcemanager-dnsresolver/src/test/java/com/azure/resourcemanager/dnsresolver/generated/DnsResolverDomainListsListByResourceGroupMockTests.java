// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.dnsresolver.DnsResolverManager;
import com.azure.resourcemanager.dnsresolver.models.DnsResolverDomainList;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DnsResolverDomainListsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"etag\":\"vhxnk\",\"properties\":{\"domains\":[\"tkubotppn\"],\"provisioningState\":\"Updating\",\"resourceGuid\":\"xhihfrbbcevqagtl\"},\"location\":\"hlfkqojpy\",\"tags\":{\"ymbrnysuxmpraf\":\"trdcnifmzzs\"},\"id\":\"g\",\"name\":\"khocxvdfffwaf\",\"type\":\"roud\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DnsResolverManager manager = DnsResolverManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<DnsResolverDomainList> response = manager.dnsResolverDomainLists()
            .listByResourceGroup("qgnjdgkynscli", 1532884453, com.azure.core.util.Context.NONE);

        Assertions.assertEquals("hlfkqojpy", response.iterator().next().location());
        Assertions.assertEquals("trdcnifmzzs", response.iterator().next().tags().get("ymbrnysuxmpraf"));
        Assertions.assertEquals("tkubotppn", response.iterator().next().domains().get(0));
    }
}
