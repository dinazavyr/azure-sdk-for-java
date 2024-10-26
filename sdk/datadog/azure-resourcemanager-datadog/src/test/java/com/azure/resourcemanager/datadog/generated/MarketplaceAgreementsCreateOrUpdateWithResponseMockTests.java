// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.datadog.MicrosoftDatadogManager;
import com.azure.resourcemanager.datadog.fluent.models.DatadogAgreementResourceInner;
import com.azure.resourcemanager.datadog.models.DatadogAgreementProperties;
import com.azure.resourcemanager.datadog.models.DatadogAgreementResource;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class MarketplaceAgreementsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"publisher\":\"nhijggmebfsi\",\"product\":\"butr\",\"plan\":\"pnazzm\",\"licenseTextLink\":\"runmp\",\"privacyPolicyLink\":\"tdbhrbnla\",\"retrieveDatetime\":\"2021-04-13T18:59:18Z\",\"signature\":\"yskpbhen\",\"accepted\":false},\"id\":\"xywnytnrsynlqidy\",\"name\":\"yxczfclh\",\"type\":\"axdbabph\"}";

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

        MicrosoftDatadogManager manager = MicrosoftDatadogManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DatadogAgreementResource response = manager.marketplaceAgreements()
            .createOrUpdateWithResponse(new DatadogAgreementResourceInner()
                .withProperties(new DatadogAgreementProperties().withPublisher("txfvgx")
                    .withProduct("smx")
                    .withPlan("hmpvecx")
                    .withLicenseTextLink("debfqkkrbmpukgri")
                    .withPrivacyPolicyLink("lzlfbxzpuz")
                    .withRetrieveDatetime(OffsetDateTime.parse("2021-01-20T14:00:46Z"))
                    .withSignature("pnq")
                    .withAccepted(true)),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("nhijggmebfsi", response.properties().publisher());
        Assertions.assertEquals("butr", response.properties().product());
        Assertions.assertEquals("pnazzm", response.properties().plan());
        Assertions.assertEquals("runmp", response.properties().licenseTextLink());
        Assertions.assertEquals("tdbhrbnla", response.properties().privacyPolicyLink());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-13T18:59:18Z"), response.properties().retrieveDatetime());
        Assertions.assertEquals("yskpbhen", response.properties().signature());
        Assertions.assertEquals(false, response.properties().accepted());
    }
}
