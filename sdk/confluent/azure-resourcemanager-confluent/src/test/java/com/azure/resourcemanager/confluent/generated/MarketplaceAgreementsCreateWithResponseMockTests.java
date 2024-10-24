// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.confluent.ConfluentManager;
import com.azure.resourcemanager.confluent.fluent.models.ConfluentAgreementResourceInner;
import com.azure.resourcemanager.confluent.models.ConfluentAgreementResource;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class MarketplaceAgreementsCreateWithResponseMockTests {
    @Test
    public void testCreateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"publisher\":\"kmr\",\"product\":\"mvvhmxtdrjfuta\",\"plan\":\"ebjvewzcjzn\",\"licenseTextLink\":\"cpmguaadraufact\",\"privacyPolicyLink\":\"hzovaj\",\"retrieveDatetime\":\"2021-02-15T15:09:11Z\",\"signature\":\"xxpshneeku\",\"accepted\":false},\"id\":\"slqubkwdl\",\"name\":\"nrdsutujbazpjuoh\",\"type\":\"inyflnorwmduvwp\"}";

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

        ConfluentManager manager = ConfluentManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ConfluentAgreementResource response = manager.marketplaceAgreements()
            .createWithResponse(new ConfluentAgreementResourceInner().withPublisher("oookkqfq")
                .withProduct("vleo")
                .withPlan("ml")
                .withLicenseTextLink("qtqzfavyv")
                .withPrivacyPolicyLink("qybaryeua")
                .withRetrieveDatetime(OffsetDateTime.parse("2021-06-23T02:25:47Z"))
                .withSignature("abqgzslesjcbh")
                .withAccepted(false), com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("kmr", response.publisher());
        Assertions.assertEquals("mvvhmxtdrjfuta", response.product());
        Assertions.assertEquals("ebjvewzcjzn", response.plan());
        Assertions.assertEquals("cpmguaadraufact", response.licenseTextLink());
        Assertions.assertEquals("hzovaj", response.privacyPolicyLink());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-15T15:09:11Z"), response.retrieveDatetime());
        Assertions.assertEquals("xxpshneeku", response.signature());
        Assertions.assertEquals(false, response.accepted());
    }
}
