// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.reservations.ReservationsManager;
import com.azure.resourcemanager.reservations.models.AppliedScopeType;
import com.azure.resourcemanager.reservations.models.InstanceFlexibility;
import com.azure.resourcemanager.reservations.models.Kind;
import com.azure.resourcemanager.reservations.models.ProvisioningState;
import com.azure.resourcemanager.reservations.models.ReservationBillingPlan;
import com.azure.resourcemanager.reservations.models.ReservationResponse;
import com.azure.resourcemanager.reservations.models.ReservationTerm;
import com.azure.resourcemanager.reservations.models.ReservedResourceType;
import com.azure.resourcemanager.reservations.models.SplitRequest;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ReservationsSplitMockTests {
    @Test
    public void testSplit() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "[{\"location\":\"juetaebur\",\"etag\":1552436434,\"sku\":{\"name\":\"vsmzlxwab\"},\"properties\":{\"reservedResourceType\":\"MySql\",\"instanceFlexibility\":\"On\",\"displayName\":\"frvtpuqu\",\"appliedScopes\":[\"lgkfbt\",\"doaon\"],\"appliedScopeType\":\"ManagementGroup\",\"archived\":false,\"capabilities\":\"ujitcjedftww\",\"quantity\":1066178212,\"provisioningState\":\"Failed\",\"effectiveDateTime\":\"2021-09-05T14:44:59Z\",\"benefitStartTime\":\"2021-11-20T03:19:25Z\",\"lastUpdatedDateTime\":\"2021-03-02T02:07:21Z\",\"expiryDateTime\":\"2021-04-26T07:38:56Z\",\"reviewDateTime\":\"2021-11-11T00:37:26Z\",\"skuDescription\":\"cybxa\",\"billingPlan\":\"Monthly\",\"displayProvisioningState\":\"ufoxc\",\"provisioningSubState\":\"opidoamciodh\",\"purchaseDateTime\":\"2020-12-30T04:50:02Z\",\"billingScopeId\":\"bon\",\"renew\":false,\"renewSource\":\"oegokdwbwh\",\"renewDestination\":\"z\",\"term\":\"P1Y\",\"userFriendlyAppliedScopeType\":\"exztvbtq\",\"userFriendlyRenewState\":\"frao\"},\"kind\":\"Microsoft.Compute\",\"id\":\"wtl\",\"name\":\"nguxawqaldsy\",\"type\":\"uximerqfobw\"},{\"location\":\"nkbykutwpfhp\",\"etag\":145025413,\"sku\":{\"name\":\"skdsnfdsdoakg\"},\"properties\":{\"reservedResourceType\":\"BlockBlob\",\"instanceFlexibility\":\"Off\",\"displayName\":\"evdlh\",\"appliedScopes\":[\"usdsttwv\",\"gvbbejdcng\"],\"appliedScopeType\":\"Shared\",\"archived\":false,\"capabilities\":\"ufgmjzrwrdg\",\"quantity\":739471239,\"provisioningState\":\"Creating\",\"effectiveDateTime\":\"2021-01-31T20:09:39Z\",\"benefitStartTime\":\"2021-09-26T20:30:12Z\",\"lastUpdatedDateTime\":\"2021-01-01T18:08:14Z\",\"expiryDateTime\":\"2021-08-27T02:00:49Z\",\"reviewDateTime\":\"2021-11-09T23:56:32Z\",\"skuDescription\":\"fdwoyuhh\",\"billingPlan\":\"Monthly\",\"displayProvisioningState\":\"fozbhdmsmlmzqhof\",\"provisioningSubState\":\"maequiahxicslfa\",\"purchaseDateTime\":\"2021-04-27T14:59:29Z\",\"billingScopeId\":\"alnswhccsphk\",\"renew\":true,\"renewSource\":\"itqscywuggwoluhc\",\"renewDestination\":\"wem\",\"term\":\"P5Y\",\"userFriendlyAppliedScopeType\":\"brgz\",\"userFriendlyRenewState\":\"msweypqwdxggicc\"},\"kind\":\"Microsoft.Compute\",\"id\":\"uexmkttlst\",\"name\":\"lzywemhzrncsdtc\",\"type\":\"u\"},{\"location\":\"ypbsfgytguslfead\",\"etag\":358703588,\"sku\":{\"name\":\"kyhejhzisxgf\"},\"properties\":{\"reservedResourceType\":\"BlockBlob\",\"instanceFlexibility\":\"On\",\"displayName\":\"vk\",\"appliedScopes\":[\"qvujzraehtwdwrf\",\"swibyr\",\"dl\",\"h\"],\"appliedScopeType\":\"ManagementGroup\",\"archived\":false,\"capabilities\":\"acstwityk\",\"quantity\":1926336888,\"provisioningState\":\"Failed\",\"effectiveDateTime\":\"2021-05-11T18:58:40Z\",\"benefitStartTime\":\"2021-07-25T05:48:03Z\",\"lastUpdatedDateTime\":\"2021-08-06T07:57:29Z\",\"expiryDateTime\":\"2021-01-12T18:57:55Z\",\"reviewDateTime\":\"2021-04-17T23:56:48Z\",\"skuDescription\":\"wzxltjc\",\"billingPlan\":\"Monthly\",\"displayProvisioningState\":\"iugcxnavvwxq\",\"provisioningSubState\":\"y\",\"purchaseDateTime\":\"2021-05-22T21:00:43Z\",\"billingScopeId\":\"mdjrkvfgbvfvp\",\"renew\":false,\"renewSource\":\"acizsjqlhkrr\",\"renewDestination\":\"deibqip\",\"term\":\"P5Y\",\"userFriendlyAppliedScopeType\":\"xndzwm\",\"userFriendlyRenewState\":\"efajpj\"},\"kind\":\"Microsoft.Compute\",\"id\":\"nyhgbijtji\",\"name\":\"fxzsjabibsyst\",\"type\":\"wfsdjpvkvpbj\"},{\"location\":\"kzbzkdvncjabudu\",\"etag\":2102044737,\"sku\":{\"name\":\"mokzhjjklf\"},\"properties\":{\"reservedResourceType\":\"RedisCache\",\"instanceFlexibility\":\"On\",\"displayName\":\"lgzrfzeeyeb\",\"appliedScopes\":[\"kayuhqlbjbs\",\"bbqwrvtldg\",\"fp\",\"vm\"],\"appliedScopeType\":\"Single\",\"archived\":false,\"capabilities\":\"thaqfxssmwu\",\"quantity\":1363759065,\"provisioningState\":\"PendingBilling\",\"effectiveDateTime\":\"2021-05-03T05:48:17Z\",\"benefitStartTime\":\"2021-08-26T22:24:43Z\",\"lastUpdatedDateTime\":\"2021-11-25T18:05:49Z\",\"expiryDateTime\":\"2021-08-18T10:27:03Z\",\"reviewDateTime\":\"2021-09-27T12:02:20Z\",\"skuDescription\":\"wqkdwytisibi\",\"billingPlan\":\"Upfront\",\"displayProvisioningState\":\"kpzi\",\"provisioningSubState\":\"j\",\"purchaseDateTime\":\"2021-08-20T15:03:31Z\",\"billingScopeId\":\"vrmbzono\",\"renew\":true,\"renewSource\":\"jq\",\"renewDestination\":\"rgz\",\"term\":\"P1Y\",\"userFriendlyAppliedScopeType\":\"zszrnwoiindfpw\",\"userFriendlyRenewState\":\"ylwbtlhflsjcdhsz\"},\"kind\":\"Microsoft.Compute\",\"id\":\"gofel\",\"name\":\"a\",\"type\":\"rqmq\"}]";

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

        ReservationsManager manager = ReservationsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        List<ReservationResponse> response = manager.reservations()
            .split("dknnqvsazn", new SplitRequest().withQuantities(Arrays.asList(1165613569, 1262179758))
                .withReservationId("sgsahmkycgr"), com.azure.core.util.Context.NONE);

        Assertions.assertEquals("juetaebur", response.get(0).location());
        Assertions.assertEquals(1552436434, response.get(0).etag());
        Assertions.assertEquals("vsmzlxwab", response.get(0).sku().name());
        Assertions.assertEquals(ReservedResourceType.MY_SQL, response.get(0).properties().reservedResourceType());
        Assertions.assertEquals(InstanceFlexibility.ON, response.get(0).properties().instanceFlexibility());
        Assertions.assertEquals("frvtpuqu", response.get(0).properties().displayName());
        Assertions.assertEquals("lgkfbt", response.get(0).properties().appliedScopes().get(0));
        Assertions.assertEquals(AppliedScopeType.MANAGEMENT_GROUP, response.get(0).properties().appliedScopeType());
        Assertions.assertEquals(false, response.get(0).properties().archived());
        Assertions.assertEquals("ujitcjedftww", response.get(0).properties().capabilities());
        Assertions.assertEquals(1066178212, response.get(0).properties().quantity());
        Assertions.assertEquals(ProvisioningState.FAILED, response.get(0).properties().provisioningState());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-05T14:44:59Z"),
            response.get(0).properties().effectiveDateTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-20T03:19:25Z"),
            response.get(0).properties().benefitStartTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-26T07:38:56Z"),
            response.get(0).properties().expiryDateTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-11T00:37:26Z"),
            response.get(0).properties().reviewDateTime());
        Assertions.assertEquals("cybxa", response.get(0).properties().skuDescription());
        Assertions.assertEquals(ReservationBillingPlan.MONTHLY, response.get(0).properties().billingPlan());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-30T04:50:02Z"),
            response.get(0).properties().purchaseDateTime());
        Assertions.assertEquals("bon", response.get(0).properties().billingScopeId());
        Assertions.assertEquals(false, response.get(0).properties().renew());
        Assertions.assertEquals("oegokdwbwh", response.get(0).properties().renewSource());
        Assertions.assertEquals("z", response.get(0).properties().renewDestination());
        Assertions.assertEquals(ReservationTerm.P1Y, response.get(0).properties().term());
        Assertions.assertEquals(Kind.MICROSOFT_COMPUTE, response.get(0).kind());
    }
}
