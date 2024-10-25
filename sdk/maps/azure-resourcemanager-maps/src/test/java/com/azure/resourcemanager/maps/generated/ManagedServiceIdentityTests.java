// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.maps.models.ManagedServiceIdentity;
import com.azure.resourcemanager.maps.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.maps.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ManagedServiceIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedServiceIdentity model = BinaryData.fromString(
            "{\"principalId\":\"2aef289f-c921-40e4-b578-0013ca801fbd\",\"tenantId\":\"44ebfffd-814e-4bd1-9dc1-92f694f6c915\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"mofcq\":{\"principalId\":\"73904b5a-57bb-424d-993f-d2f0b22c7100\",\"clientId\":\"1db3cfb4-9917-4436-96aa-5e74f26de891\"},\"yurkdtmlxhekuksj\":{\"principalId\":\"254f61d2-3289-4cd4-be6c-e59e59337b88\",\"clientId\":\"ab60788f-9ffc-4382-aa52-58d325a08171\"},\"kc\":{\"principalId\":\"0d226a2e-284e-4183-882e-ba972266012b\",\"clientId\":\"e98ebf53-8bf8-413d-92d1-395d04df3d65\"}}}")
            .toObject(ManagedServiceIdentity.class);
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedServiceIdentity model = new ManagedServiceIdentity().withType(ManagedServiceIdentityType.USER_ASSIGNED)
            .withUserAssignedIdentities(mapOf("mofcq", new UserAssignedIdentity(), "yurkdtmlxhekuksj",
                new UserAssignedIdentity(), "kc", new UserAssignedIdentity()));
        model = BinaryData.fromObject(model).toObject(ManagedServiceIdentity.class);
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.type());
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
