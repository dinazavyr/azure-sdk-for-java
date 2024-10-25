// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.servicelinker.ServiceLinkerManager;
import com.azure.resourcemanager.servicelinker.models.DryrunResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ConnectorsListDryrunMockTests {
    @Test
    public void testListDryrun() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"parameters\":{\"actionName\":\"DryrunParameters\"},\"prerequisiteResults\":[{\"type\":\"DryrunPrerequisiteResult\"},{\"type\":\"DryrunPrerequisiteResult\"},{\"type\":\"DryrunPrerequisiteResult\"},{\"type\":\"DryrunPrerequisiteResult\"}],\"operationPreviews\":[{\"name\":\"zsbbzoggigrxwb\",\"operationType\":\"configConnection\",\"description\":\"xxjnspydptk\",\"action\":\"nkoukn\",\"scope\":\"dwtiukbldngkp\"},{\"name\":\"ipazyxoegukgjnpi\",\"operationType\":\"configConnection\",\"description\":\"gevqznty\",\"action\":\"rbpizc\",\"scope\":\"qjsdpydnfyhxdeo\"},{\"name\":\"zi\",\"operationType\":\"configAuth\",\"description\":\"sjttgzfbish\",\"action\":\"khaj\",\"scope\":\"yeamdphagalpb\"}],\"provisioningState\":\"wgipwhono\"},\"id\":\"gshwankixz\",\"name\":\"injep\",\"type\":\"ttmrywnuzoqf\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ServiceLinkerManager manager = ServiceLinkerManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<DryrunResource> response
            = manager.connectors().listDryrun("faxkffeii", "hl", "m", com.azure.core.util.Context.NONE);

    }
}
