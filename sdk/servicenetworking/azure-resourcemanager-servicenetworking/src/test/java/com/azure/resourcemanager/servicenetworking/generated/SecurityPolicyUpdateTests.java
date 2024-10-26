// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicenetworking.models.SecurityPolicyUpdate;
import com.azure.resourcemanager.servicenetworking.models.SecurityPolicyUpdateProperties;
import com.azure.resourcemanager.servicenetworking.models.WafPolicyUpdate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SecurityPolicyUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecurityPolicyUpdate model = BinaryData.fromString(
            "{\"tags\":{\"e\":\"sxazjpq\",\"zvdudgwdslfhotwm\":\"ualhbxxhejj\",\"pgacftadehxnlty\":\"ynpwlbj\",\"usue\":\"sop\"},\"properties\":{\"wafPolicy\":{\"id\":\"dejbavo\"}}}")
            .toObject(SecurityPolicyUpdate.class);
        Assertions.assertEquals("sxazjpq", model.tags().get("e"));
        Assertions.assertEquals("dejbavo", model.properties().wafPolicy().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecurityPolicyUpdate model = new SecurityPolicyUpdate()
            .withTags(
                mapOf("e", "sxazjpq", "zvdudgwdslfhotwm", "ualhbxxhejj", "pgacftadehxnlty", "ynpwlbj", "usue", "sop"))
            .withProperties(
                new SecurityPolicyUpdateProperties().withWafPolicy(new WafPolicyUpdate().withId("dejbavo")));
        model = BinaryData.fromObject(model).toObject(SecurityPolicyUpdate.class);
        Assertions.assertEquals("sxazjpq", model.tags().get("e"));
        Assertions.assertEquals("dejbavo", model.properties().wafPolicy().id());
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
