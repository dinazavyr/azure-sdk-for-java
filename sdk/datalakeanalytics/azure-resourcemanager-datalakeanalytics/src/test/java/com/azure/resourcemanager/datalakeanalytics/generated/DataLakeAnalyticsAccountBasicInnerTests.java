// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.DataLakeAnalyticsAccountBasicInner;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DataLakeAnalyticsAccountBasicInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataLakeAnalyticsAccountBasicInner model = BinaryData.fromString(
            "{\"properties\":{\"accountId\":\"6ce7db1e-b9c8-4126-8bab-83b99199c40e\",\"provisioningState\":\"Patching\",\"state\":\"Active\",\"creationTime\":\"2021-04-18T20:42:54Z\",\"lastModifiedTime\":\"2021-01-26T06:35:32Z\",\"endpoint\":\"xqhabi\"},\"location\":\"pikxwczbyscnpqxu\",\"tags\":{\"n\":\"y\"},\"id\":\"wby\",\"name\":\"rkxvdum\",\"type\":\"grtfwvu\"}")
            .toObject(DataLakeAnalyticsAccountBasicInner.class);
        Assertions.assertEquals("pikxwczbyscnpqxu", model.location());
        Assertions.assertEquals("y", model.tags().get("n"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataLakeAnalyticsAccountBasicInner model
            = new DataLakeAnalyticsAccountBasicInner().withLocation("pikxwczbyscnpqxu").withTags(mapOf("n", "y"));
        model = BinaryData.fromObject(model).toObject(DataLakeAnalyticsAccountBasicInner.class);
        Assertions.assertEquals("pikxwczbyscnpqxu", model.location());
        Assertions.assertEquals("y", model.tags().get("n"));
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
