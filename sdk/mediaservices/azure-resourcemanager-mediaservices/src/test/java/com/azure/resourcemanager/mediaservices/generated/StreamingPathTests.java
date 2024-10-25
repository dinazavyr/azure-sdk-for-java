// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.EncryptionScheme;
import com.azure.resourcemanager.mediaservices.models.StreamingPath;
import com.azure.resourcemanager.mediaservices.models.StreamingPolicyStreamingProtocol;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class StreamingPathTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StreamingPath model = BinaryData.fromString(
            "{\"streamingProtocol\":\"SmoothStreaming\",\"encryptionScheme\":\"CommonEncryptionCenc\",\"paths\":[\"dlxyjrxs\",\"gafcnihgwqapnedg\",\"bcvkcvqvpkeq\",\"cvdrhvoodsot\"]}")
            .toObject(StreamingPath.class);
        Assertions.assertEquals(StreamingPolicyStreamingProtocol.SMOOTH_STREAMING, model.streamingProtocol());
        Assertions.assertEquals(EncryptionScheme.COMMON_ENCRYPTION_CENC, model.encryptionScheme());
        Assertions.assertEquals("dlxyjrxs", model.paths().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StreamingPath model
            = new StreamingPath().withStreamingProtocol(StreamingPolicyStreamingProtocol.SMOOTH_STREAMING)
                .withEncryptionScheme(EncryptionScheme.COMMON_ENCRYPTION_CENC)
                .withPaths(Arrays.asList("dlxyjrxs", "gafcnihgwqapnedg", "bcvkcvqvpkeq", "cvdrhvoodsot"));
        model = BinaryData.fromObject(model).toObject(StreamingPath.class);
        Assertions.assertEquals(StreamingPolicyStreamingProtocol.SMOOTH_STREAMING, model.streamingProtocol());
        Assertions.assertEquals(EncryptionScheme.COMMON_ENCRYPTION_CENC, model.encryptionScheme());
        Assertions.assertEquals("dlxyjrxs", model.paths().get(0));
    }
}
