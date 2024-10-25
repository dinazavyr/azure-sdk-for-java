// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.storageimportexport.StorageImportExportManager;
import com.azure.resourcemanager.storageimportexport.models.Operation;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class OperationsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"name\":\"pdjpjumasxazjp\",\"display\":{\"provider\":\"e\",\"resource\":\"alhbx\",\"operation\":\"e\",\"description\":\"zzvdudgwds\"}}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        StorageImportExportManager manager = StorageImportExportManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Operation> response = manager.operations().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("pdjpjumasxazjp", response.iterator().next().name());
        Assertions.assertEquals("e", response.iterator().next().provider());
        Assertions.assertEquals("alhbx", response.iterator().next().resource());
        Assertions.assertEquals("e", response.iterator().next().operation());
        Assertions.assertEquals("zzvdudgwds", response.iterator().next().description());
    }
}
