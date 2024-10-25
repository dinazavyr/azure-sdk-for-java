// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.largeinstance.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.largeinstance.LargeInstanceManager;
import com.azure.resourcemanager.largeinstance.models.AzureLargeInstanceHardwareTypeNamesEnum;
import com.azure.resourcemanager.largeinstance.models.AzureLargeStorageInstance;
import com.azure.resourcemanager.largeinstance.models.AzureLargeStorageInstanceTagsUpdate;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AzureLargeStorageInstancesUpdateWithResponseMockTests {
    @Test
    public void testUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"azureLargeStorageInstanceUniqueIdentifier\":\"ylsyxkqjnsje\",\"storageProperties\":{\"provisioningState\":\"Migrating\",\"offeringType\":\"gxsds\",\"storageType\":\"e\",\"generation\":\"sbzkf\",\"hardwareType\":\"SDFLEX\",\"workloadType\":\"v\",\"storageBillingProperties\":{\"billingMode\":\"icvi\",\"sku\":\"kjj\"}}},\"location\":\"xrbuukzclew\",\"tags\":{\"aztz\":\"lw\",\"yq\":\"ofncckwyfzqwhxxb\"},\"id\":\"xzfe\",\"name\":\"ztppriolxorjalto\",\"type\":\"mncwsobqwcsdb\"}";

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

        LargeInstanceManager manager = LargeInstanceManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        AzureLargeStorageInstance response
            = manager.azureLargeStorageInstances()
                .updateWithResponse("odtji", "fw",
                    new AzureLargeStorageInstanceTagsUpdate()
                        .withTags(mapOf("acjvefkd", "lt", "fpagaowpulp", "foakgg")),
                    com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("xrbuukzclew", response.location());
        Assertions.assertEquals("lw", response.tags().get("aztz"));
        Assertions.assertEquals("ylsyxkqjnsje", response.properties().azureLargeStorageInstanceUniqueIdentifier());
        Assertions.assertEquals("gxsds", response.properties().storageProperties().offeringType());
        Assertions.assertEquals("e", response.properties().storageProperties().storageType());
        Assertions.assertEquals("sbzkf", response.properties().storageProperties().generation());
        Assertions.assertEquals(AzureLargeInstanceHardwareTypeNamesEnum.SDFLEX,
            response.properties().storageProperties().hardwareType());
        Assertions.assertEquals("v", response.properties().storageProperties().workloadType());
        Assertions.assertEquals("icvi",
            response.properties().storageProperties().storageBillingProperties().billingMode());
        Assertions.assertEquals("kjj", response.properties().storageProperties().storageBillingProperties().sku());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
