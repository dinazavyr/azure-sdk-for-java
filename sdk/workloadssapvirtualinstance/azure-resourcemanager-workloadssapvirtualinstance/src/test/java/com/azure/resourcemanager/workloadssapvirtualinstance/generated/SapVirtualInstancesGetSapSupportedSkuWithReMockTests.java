// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.workloadssapvirtualinstance.WorkloadsSapVirtualInstanceManager;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapDatabaseType;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapDeploymentType;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapEnvironmentType;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapHighAvailabilityType;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapProductType;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapSupportedResourceSkusResult;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapSupportedSkusRequest;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SapVirtualInstancesGetSapSupportedSkuWithReMockTests {
    @Test
    public void testGetSapSupportedSkuWithResponse() throws Exception {
        String responseStr
            = "{\"supportedSkus\":[{\"vmSku\":\"pyouaibrebqaays\",\"isAppServerCertified\":false,\"isDatabaseCertified\":false},{\"vmSku\":\"nqttezl\",\"isAppServerCertified\":false,\"isDatabaseCertified\":false},{\"vmSku\":\"kpj\",\"isAppServerCertified\":false,\"isDatabaseCertified\":false},{\"vmSku\":\"d\",\"isAppServerCertified\":false,\"isDatabaseCertified\":false}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        WorkloadsSapVirtualInstanceManager manager = WorkloadsSapVirtualInstanceManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        SapSupportedResourceSkusResult response = manager.sapVirtualInstances()
            .getSapSupportedSkuWithResponse("taugzxnfaa",
                new SapSupportedSkusRequest().withAppLocation("pxdtnkdmkq")
                    .withEnvironment(SapEnvironmentType.PROD)
                    .withSapProduct(SapProductType.ECC)
                    .withDeploymentType(SapDeploymentType.SINGLE_SERVER)
                    .withDatabaseType(SapDatabaseType.HANA)
                    .withHighAvailabilityType(SapHighAvailabilityType.AVAILABILITY_SET),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("pyouaibrebqaays", response.supportedSkus().get(0).vmSku());
        Assertions.assertEquals(false, response.supportedSkus().get(0).isAppServerCertified());
        Assertions.assertEquals(false, response.supportedSkus().get(0).isDatabaseCertified());
    }
}
