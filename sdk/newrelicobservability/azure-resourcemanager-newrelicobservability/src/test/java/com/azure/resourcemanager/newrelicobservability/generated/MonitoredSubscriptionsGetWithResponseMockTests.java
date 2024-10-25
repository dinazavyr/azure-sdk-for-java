// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager;
import com.azure.resourcemanager.newrelicobservability.models.ConfigurationName;
import com.azure.resourcemanager.newrelicobservability.models.MonitoredSubscriptionProperties;
import com.azure.resourcemanager.newrelicobservability.models.PatchOperation;
import com.azure.resourcemanager.newrelicobservability.models.Status;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class MonitoredSubscriptionsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"patchOperation\":\"AddComplete\",\"monitoredSubscriptionList\":[{\"subscriptionId\":\"kfpagao\",\"status\":\"Deleting\",\"error\":\"pqblylsyxkqjnsj\",\"tagRules\":{\"provisioningState\":\"Updating\",\"logRules\":{},\"metricRules\":{}}},{\"subscriptionId\":\"xsdszuempsb\",\"status\":\"InProgress\",\"error\":\"beyvpnqicvinvkjj\",\"tagRules\":{\"provisioningState\":\"Canceled\",\"logRules\":{},\"metricRules\":{}}},{\"subscriptionId\":\"kzclewyh\",\"status\":\"InProgress\",\"error\":\"aztz\",\"tagRules\":{\"provisioningState\":\"Creating\",\"logRules\":{},\"metricRules\":{}}},{\"subscriptionId\":\"wyfzqwhxxbuyqa\",\"status\":\"Failed\",\"error\":\"qztpp\",\"tagRules\":{\"provisioningState\":\"Updating\",\"logRules\":{},\"metricRules\":{}}}],\"provisioningState\":\"NotSpecified\"},\"id\":\"altol\",\"name\":\"ncwsob\",\"type\":\"wcsdbnwdcfhucq\"}";

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

        NewRelicObservabilityManager manager = NewRelicObservabilityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        MonitoredSubscriptionProperties response = manager.monitoredSubscriptions()
            .getWithResponse("vdkcrodtj", "nfwjlfltkacjvefk", ConfigurationName.DEFAULT,
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(PatchOperation.ADD_COMPLETE, response.properties().patchOperation());
        Assertions.assertEquals("kfpagao", response.properties().monitoredSubscriptionList().get(0).subscriptionId());
        Assertions.assertEquals(Status.DELETING, response.properties().monitoredSubscriptionList().get(0).status());
        Assertions.assertEquals("pqblylsyxkqjnsj", response.properties().monitoredSubscriptionList().get(0).error());
    }
}
