// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.graphservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.graphservices.models.TagUpdate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TagUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TagUpdate model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"ypininm\":\"jkjlxofpdvhpfx\",\"po\":\"yhuybbkpod\",\"ognarxzxtheotus\":\"ginuvamih\"}}")
                .toObject(TagUpdate.class);
        Assertions.assertEquals("jkjlxofpdvhpfx", model.tags().get("ypininm"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TagUpdate model =
            new TagUpdate()
                .withTags(mapOf("ypininm", "jkjlxofpdvhpfx", "po", "yhuybbkpod", "ognarxzxtheotus", "ginuvamih"));
        model = BinaryData.fromObject(model).toObject(TagUpdate.class);
        Assertions.assertEquals("jkjlxofpdvhpfx", model.tags().get("ypininm"));
    }

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