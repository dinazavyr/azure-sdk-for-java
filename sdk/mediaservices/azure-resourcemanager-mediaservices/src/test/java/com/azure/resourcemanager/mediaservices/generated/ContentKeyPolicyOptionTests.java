// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyConfiguration;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyOption;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyRestriction;
import org.junit.jupiter.api.Assertions;

public final class ContentKeyPolicyOptionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContentKeyPolicyOption model = BinaryData.fromString(
            "{\"policyOptionId\":\"f4e2b44a-02c8-4cc0-8e91-15e26828b0e9\",\"name\":\"hsfwxosowzxcug\",\"configuration\":{\"@odata.type\":\"ContentKeyPolicyConfiguration\"},\"restriction\":{\"@odata.type\":\"ContentKeyPolicyRestriction\"}}")
            .toObject(ContentKeyPolicyOption.class);
        Assertions.assertEquals("hsfwxosowzxcug", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContentKeyPolicyOption model = new ContentKeyPolicyOption().withName("hsfwxosowzxcug")
            .withConfiguration(new ContentKeyPolicyConfiguration())
            .withRestriction(new ContentKeyPolicyRestriction());
        model = BinaryData.fromObject(model).toObject(ContentKeyPolicyOption.class);
        Assertions.assertEquals("hsfwxosowzxcug", model.name());
    }
}
