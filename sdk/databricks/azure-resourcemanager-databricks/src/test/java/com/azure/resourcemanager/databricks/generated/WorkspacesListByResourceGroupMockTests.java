// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.databricks.AzureDatabricksManager;
import com.azure.resourcemanager.databricks.models.PublicNetworkAccess;
import com.azure.resourcemanager.databricks.models.RequiredNsgRules;
import com.azure.resourcemanager.databricks.models.Workspace;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class WorkspacesListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"managedResourceGroupId\":\"udxytlmoyrx\",\"parameters\":{},\"provisioningState\":\"Updating\",\"uiDefinitionUri\":\"ck\",\"authorizations\":[],\"createdBy\":{\"oid\":\"e4be9bd1-128c-4ef3-8d44-b9a6f901bde7\",\"puid\":\"sbkyvpycanuzbp\",\"applicationId\":\"8094609e-dfa3-42c5-836b-3ab83087d859\"},\"updatedBy\":{\"oid\":\"bd92074b-bc28-4ad2-95ee-f13175da1627\",\"puid\":\"uwbc\",\"applicationId\":\"02706fd9-920d-4b1e-aa94-96bfc4057f3f\"},\"createdDateTime\":\"2021-02-06T08:20:06Z\",\"workspaceId\":\"ehhseyvjusrts\",\"workspaceUrl\":\"spkdee\",\"storageAccountIdentity\":{\"principalId\":\"7e484482-6c21-422d-aaea-8d0238b5bea4\",\"tenantId\":\"25287f50-030a-490c-8552-8810538c2520\",\"type\":\"xagkvtmelmqkrh\"},\"managedDiskIdentity\":{\"principalId\":\"2bae85f5-a62f-48e1-aa14-d1e4b84fbd67\",\"tenantId\":\"ace640f7-bb30-4ef0-aa76-54e054f11869\",\"type\":\"uahaquhcdhmd\"},\"diskEncryptionSetId\":\"laexqp\",\"encryption\":{},\"privateEndpointConnections\":[],\"publicNetworkAccess\":\"Enabled\",\"requiredNsgRules\":\"NoAzureServiceRules\"},\"sku\":{\"name\":\"r\",\"tier\":\"xpvgo\"},\"location\":\"lf\",\"tags\":{\"b\":\"gwb\",\"dawkzbali\":\"e\",\"hashsfwxosow\":\"urqhaka\"},\"id\":\"xcug\",\"name\":\"cjooxdjebwpucwwf\",\"type\":\"ovbvmeueciv\"}]}";

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

        AzureDatabricksManager manager = AzureDatabricksManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Workspace> response
            = manager.workspaces().listByResourceGroup("g", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("lf", response.iterator().next().location());
        Assertions.assertEquals("gwb", response.iterator().next().tags().get("b"));
        Assertions.assertEquals("r", response.iterator().next().sku().name());
        Assertions.assertEquals("xpvgo", response.iterator().next().sku().tier());
        Assertions.assertEquals("udxytlmoyrx", response.iterator().next().managedResourceGroupId());
        Assertions.assertEquals("ck", response.iterator().next().uiDefinitionUri());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, response.iterator().next().publicNetworkAccess());
        Assertions.assertEquals(RequiredNsgRules.NO_AZURE_SERVICE_RULES, response.iterator().next().requiredNsgRules());
    }
}
