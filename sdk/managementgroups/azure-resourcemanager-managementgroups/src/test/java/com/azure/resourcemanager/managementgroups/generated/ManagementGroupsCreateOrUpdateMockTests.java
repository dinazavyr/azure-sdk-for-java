// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.managementgroups.ManagementGroupsManager;
import com.azure.resourcemanager.managementgroups.models.CreateManagementGroupDetails;
import com.azure.resourcemanager.managementgroups.models.CreateManagementGroupRequest;
import com.azure.resourcemanager.managementgroups.models.ManagementGroup;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ManagementGroupsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"tenantId\":\"wwfvov\",\"displayName\":\"meue\",\"details\":{\"version\":783632971,\"updatedTime\":\"2021-09-10T06:10:55Z\",\"updatedBy\":\"euojgjrwju\",\"path\":[],\"managementGroupAncestors\":[],\"managementGroupAncestorsChain\":[]},\"children\":[]},\"id\":\"dytdxwitx\",\"name\":\"rjaw\",\"type\":\"qwgxhniskx\"}";

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

        ManagementGroupsManager manager = ManagementGroupsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ManagementGroup response = manager.managementGroups()
            .createOrUpdate("hcdhmdual",
                new CreateManagementGroupRequest().withName("auhashsfwx")
                    .withDisplayName("xpvgo")
                    .withDetails(new CreateManagementGroupDetails()),
                "jooxdjebw", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("wwfvov", response.tenantId());
        Assertions.assertEquals("meue", response.displayName());
        Assertions.assertEquals(783632971, response.details().version());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-10T06:10:55Z"), response.details().updatedTime());
        Assertions.assertEquals("euojgjrwju", response.details().updatedBy());
    }
}
