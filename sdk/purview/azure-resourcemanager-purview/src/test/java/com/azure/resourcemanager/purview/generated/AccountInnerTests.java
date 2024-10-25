// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.purview.fluent.models.AccountInner;
import com.azure.resourcemanager.purview.models.CloudConnectors;
import com.azure.resourcemanager.purview.models.Identity;
import com.azure.resourcemanager.purview.models.PublicNetworkAccess;
import com.azure.resourcemanager.purview.models.Type;
import com.azure.resourcemanager.purview.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AccountInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccountInner model = BinaryData.fromString(
            "{\"properties\":{\"cloudConnectors\":{\"awsExternalId\":\"jeiachboosfl\"},\"createdAt\":\"2021-10-01T08:17:31Z\",\"createdBy\":\"fqpte\",\"createdByObjectId\":\"zzvypyqrimzinp\",\"endpoints\":{\"catalog\":\"jdkirsoodqx\",\"guardian\":\"rmnohj\",\"scan\":\"kwh\"},\"friendlyName\":\"oifiyipjxsqwpgr\",\"managedResourceGroupName\":\"znorcj\",\"managedResources\":{\"eventHubNamespace\":\"nb\",\"resourceGroup\":\"qabnmoc\",\"storageAccount\":\"ysh\"},\"privateEndpointConnections\":[{\"properties\":{\"privateEndpoint\":{\"id\":\"ljjgpbtoqcjmkl\"},\"privateLinkServiceConnectionState\":{\"actionsRequired\":\"bqidtqaj\",\"description\":\"ulpkudjkrl\",\"status\":\"Approved\"},\"provisioningState\":\"hfepgzgqex\"},\"id\":\"locx\",\"name\":\"c\",\"type\":\"aierhhb\"}],\"provisioningState\":\"Creating\",\"publicNetworkAccess\":\"Enabled\"},\"sku\":{\"capacity\":187934940,\"name\":\"Standard\"},\"identity\":{\"principalId\":\"odxobnbdxkqpxok\",\"tenantId\":\"ionpimexg\",\"type\":\"None\",\"userAssignedIdentities\":{\"zaqsqsycbkbfk\":{\"clientId\":\"odgmaajrmvdjwz\",\"principalId\":\"ovmclwhijcoejct\"}}},\"location\":\"kdkexxp\",\"tags\":{\"jpgd\":\"mxaxc\"},\"id\":\"toc\",\"name\":\"j\",\"type\":\"hvpmoue\"}")
            .toObject(AccountInner.class);
        Assertions.assertEquals("kdkexxp", model.location());
        Assertions.assertEquals("mxaxc", model.tags().get("jpgd"));
        Assertions.assertEquals(Type.NONE, model.identity().type());
        Assertions.assertEquals("znorcj", model.managedResourceGroupName());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccountInner model = new AccountInner().withLocation("kdkexxp")
            .withTags(mapOf("jpgd", "mxaxc"))
            .withIdentity(new Identity().withType(Type.NONE)
                .withUserAssignedIdentities(mapOf("zaqsqsycbkbfk", new UserAssignedIdentity())))
            .withCloudConnectors(new CloudConnectors())
            .withManagedResourceGroupName("znorcj")
            .withPublicNetworkAccess(PublicNetworkAccess.ENABLED);
        model = BinaryData.fromObject(model).toObject(AccountInner.class);
        Assertions.assertEquals("kdkexxp", model.location());
        Assertions.assertEquals("mxaxc", model.tags().get("jpgd"));
        Assertions.assertEquals(Type.NONE, model.identity().type());
        Assertions.assertEquals("znorcj", model.managedResourceGroupName());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
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
