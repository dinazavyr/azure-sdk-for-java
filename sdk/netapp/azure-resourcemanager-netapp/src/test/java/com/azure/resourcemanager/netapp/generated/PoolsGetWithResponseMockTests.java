// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.CapacityPool;
import com.azure.resourcemanager.netapp.models.EncryptionType;
import com.azure.resourcemanager.netapp.models.QosType;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PoolsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"etag\":\"jrtrhqvwrevk\",\"properties\":{\"poolId\":\"nlnzonzlrpi\",\"size\":1765524457433576556,\"serviceLevel\":\"Premium\",\"provisioningState\":\"vjtszcofize\",\"totalThroughputMibps\":54.295147,\"utilizedThroughputMibps\":83.85684,\"qosType\":\"Auto\",\"coolAccess\":false,\"encryptionType\":\"Double\"},\"location\":\"jeamurv\",\"tags\":{\"anashc\":\"ov\",\"kelvidizozsdb\":\"lpmjerb\"},\"id\":\"cxjmonfdgnwncyp\",\"name\":\"uwwltvuqjctz\",\"type\":\"nkeifz\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetAppFilesManager manager = NetAppFilesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        CapacityPool response = manager.pools()
            .getWithResponse("mjqfrddgamquhio", "rsjuivfcdisyir", "xzhczexrxz", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("jeamurv", response.location());
        Assertions.assertEquals("ov", response.tags().get("anashc"));
        Assertions.assertEquals(1765524457433576556L, response.size());
        Assertions.assertEquals(ServiceLevel.PREMIUM, response.serviceLevel());
        Assertions.assertEquals(QosType.AUTO, response.qosType());
        Assertions.assertEquals(false, response.coolAccess());
        Assertions.assertEquals(EncryptionType.DOUBLE, response.encryptionType());
    }
}
