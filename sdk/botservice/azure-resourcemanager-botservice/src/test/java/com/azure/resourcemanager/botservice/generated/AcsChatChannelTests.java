// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.botservice.models.AcsChatChannel;
import org.junit.jupiter.api.Assertions;

public final class AcsChatChannelTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AcsChatChannel model = BinaryData.fromString(
            "{\"channelName\":\"AcsChatChannel\",\"etag\":\"nfqqnvwp\",\"provisioningState\":\"taruoujmkcj\",\"location\":\"qytjrybnwjewgd\"}")
            .toObject(AcsChatChannel.class);
        Assertions.assertEquals("nfqqnvwp", model.etag());
        Assertions.assertEquals("qytjrybnwjewgd", model.location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AcsChatChannel model = new AcsChatChannel().withEtag("nfqqnvwp").withLocation("qytjrybnwjewgd");
        model = BinaryData.fromObject(model).toObject(AcsChatChannel.class);
        Assertions.assertEquals("nfqqnvwp", model.etag());
        Assertions.assertEquals("qytjrybnwjewgd", model.location());
    }
}
