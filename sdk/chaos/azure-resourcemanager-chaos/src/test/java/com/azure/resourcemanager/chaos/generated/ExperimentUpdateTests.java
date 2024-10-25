// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.models.ExperimentUpdate;
import com.azure.resourcemanager.chaos.models.ResourceIdentity;
import com.azure.resourcemanager.chaos.models.ResourceIdentityType;
import com.azure.resourcemanager.chaos.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ExperimentUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExperimentUpdate model = BinaryData.fromString(
            "{\"identity\":{\"type\":\"None\",\"userAssignedIdentities\":{\"veual\":{\"principalId\":\"2ab296ac-e81e-4690-b2e9-e8ca33e2c7f3\",\"clientId\":\"e2c93b86-0c6b-4a76-b205-8abd8405e73c\"},\"mkh\":{\"principalId\":\"a488b418-a1eb-433c-a43f-5fae44a0b576\",\"clientId\":\"6b698d05-0238-4471-9218-dbbad59580b9\"},\"bbcswsrtjri\":{\"principalId\":\"8116ceee-1e63-4d79-ad88-a3b1cf189c9d\",\"clientId\":\"7893fbc9-a3b8-4f3d-9909-b5051e6de38e\"},\"bpbewtghfgb\":{\"principalId\":\"d1b6d058-d12a-45b2-b1f0-0a6e04a0d8ff\",\"clientId\":\"2cb9b1c9-46cf-4f32-b1c0-888374c5f9e6\"}},\"principalId\":\"gw\",\"tenantId\":\"vlvqhjkbegi\"},\"tags\":{\"aloayqcgwrtzju\":\"mxiebw\",\"txon\":\"gwyzm\",\"rknftguvriuhprwm\":\"mtsavjcbpwxqp\",\"bexrmcq\":\"yvxqtayriwwroy\"}}")
            .toObject(ExperimentUpdate.class);
        Assertions.assertEquals(ResourceIdentityType.NONE, model.identity().type());
        Assertions.assertEquals("mxiebw", model.tags().get("aloayqcgwrtzju"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExperimentUpdate model = new ExperimentUpdate().withIdentity(new ResourceIdentity()
            .withType(ResourceIdentityType.NONE)
            .withUserAssignedIdentities(mapOf("veual", new UserAssignedIdentity(), "mkh", new UserAssignedIdentity(),
                "bbcswsrtjri", new UserAssignedIdentity(), "bpbewtghfgb", new UserAssignedIdentity())))
            .withTags(mapOf("aloayqcgwrtzju", "mxiebw", "txon", "gwyzm", "rknftguvriuhprwm", "mtsavjcbpwxqp", "bexrmcq",
                "yvxqtayriwwroy"));
        model = BinaryData.fromObject(model).toObject(ExperimentUpdate.class);
        Assertions.assertEquals(ResourceIdentityType.NONE, model.identity().type());
        Assertions.assertEquals("mxiebw", model.tags().get("aloayqcgwrtzju"));
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
