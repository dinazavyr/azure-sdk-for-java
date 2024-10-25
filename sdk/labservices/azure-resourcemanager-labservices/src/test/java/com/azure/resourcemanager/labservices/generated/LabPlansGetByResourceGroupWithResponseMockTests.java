// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.labservices.LabServicesManager;
import com.azure.resourcemanager.labservices.models.ConnectionType;
import com.azure.resourcemanager.labservices.models.EnableState;
import com.azure.resourcemanager.labservices.models.LabPlan;
import com.azure.resourcemanager.labservices.models.ResourceIdentityType;
import com.azure.resourcemanager.labservices.models.ShutdownOnIdleMode;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class LabPlansGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Deleting\",\"defaultConnectionProfile\":{\"webSshAccess\":\"None\",\"webRdpAccess\":\"Private\",\"clientSshAccess\":\"Private\",\"clientRdpAccess\":\"Private\"},\"defaultAutoShutdownProfile\":{\"shutdownOnDisconnect\":\"Disabled\",\"shutdownWhenNotConnected\":\"Disabled\",\"shutdownOnIdle\":\"None\",\"disconnectDelay\":\"PT2H29M17S\",\"noConnectDelay\":\"PT84H29M29S\",\"idleDelay\":\"PT150H13M59S\"},\"defaultNetworkProfile\":{\"subnetId\":\"owepbqpcrfkb\"},\"allowedRegions\":[\"snjvcdwxlpqekftn\",\"htjsying\",\"fq\",\"tmtdhtmdvypgik\"],\"sharedGalleryId\":\"szywkbirryu\",\"supportInfo\":{\"url\":\"hkjoqr\",\"email\":\"qaatjinrv\",\"phone\":\"upmfiibfg\",\"instructions\":\"ioolvrwxkvtkkgll\"},\"linkedLmsInstance\":\"jygvjayvbl\"},\"identity\":{\"principalId\":\"k\",\"tenantId\":\"hbxvvyhgsopbyrqu\",\"type\":\"SystemAssigned\"},\"location\":\"xuvw\",\"tags\":{\"tvgbmhrixkwmy\":\"nhlmctlpdng\",\"hbpnaixexccbd\":\"jejveg\"},\"id\":\"eaxhcexdrrvqahqk\",\"name\":\"htpwij\",\"type\":\"hyjsvfycx\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        LabServicesManager manager = LabServicesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        LabPlan response = manager.labPlans()
            .getByResourceGroupWithResponse("qvpsvuoymg", "celve", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("xuvw", response.location());
        Assertions.assertEquals("nhlmctlpdng", response.tags().get("tvgbmhrixkwmy"));
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, response.identity().type());
        Assertions.assertEquals(ConnectionType.NONE, response.defaultConnectionProfile().webSshAccess());
        Assertions.assertEquals(ConnectionType.PRIVATE, response.defaultConnectionProfile().webRdpAccess());
        Assertions.assertEquals(ConnectionType.PRIVATE, response.defaultConnectionProfile().clientSshAccess());
        Assertions.assertEquals(ConnectionType.PRIVATE, response.defaultConnectionProfile().clientRdpAccess());
        Assertions.assertEquals(EnableState.DISABLED, response.defaultAutoShutdownProfile().shutdownOnDisconnect());
        Assertions.assertEquals(EnableState.DISABLED, response.defaultAutoShutdownProfile().shutdownWhenNotConnected());
        Assertions.assertEquals(ShutdownOnIdleMode.NONE, response.defaultAutoShutdownProfile().shutdownOnIdle());
        Assertions.assertEquals(Duration.parse("PT2H29M17S"), response.defaultAutoShutdownProfile().disconnectDelay());
        Assertions.assertEquals(Duration.parse("PT84H29M29S"), response.defaultAutoShutdownProfile().noConnectDelay());
        Assertions.assertEquals(Duration.parse("PT150H13M59S"), response.defaultAutoShutdownProfile().idleDelay());
        Assertions.assertEquals("owepbqpcrfkb", response.defaultNetworkProfile().subnetId());
        Assertions.assertEquals("snjvcdwxlpqekftn", response.allowedRegions().get(0));
        Assertions.assertEquals("szywkbirryu", response.sharedGalleryId());
        Assertions.assertEquals("hkjoqr", response.supportInfo().url());
        Assertions.assertEquals("qaatjinrv", response.supportInfo().email());
        Assertions.assertEquals("upmfiibfg", response.supportInfo().phone());
        Assertions.assertEquals("ioolvrwxkvtkkgll", response.supportInfo().instructions());
        Assertions.assertEquals("jygvjayvbl", response.linkedLmsInstance());
    }
}
