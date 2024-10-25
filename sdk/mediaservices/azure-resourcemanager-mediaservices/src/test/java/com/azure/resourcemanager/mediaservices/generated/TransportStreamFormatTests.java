// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.OutputFile;
import com.azure.resourcemanager.mediaservices.models.TransportStreamFormat;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TransportStreamFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TransportStreamFormat model = BinaryData.fromString(
            "{\"@odata.type\":\"#Microsoft.Media.TransportStreamFormat\",\"outputFiles\":[{\"labels\":[\"clrcivtsox\",\"rkenx\"]},{\"labels\":[\"yyefrpmpdnqqs\"]}],\"filenamePattern\":\"awaoqvmmbnpqfrt\"}")
            .toObject(TransportStreamFormat.class);
        Assertions.assertEquals("awaoqvmmbnpqfrt", model.filenamePattern());
        Assertions.assertEquals("clrcivtsox", model.outputFiles().get(0).labels().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TransportStreamFormat model = new TransportStreamFormat().withFilenamePattern("awaoqvmmbnpqfrt")
            .withOutputFiles(Arrays.asList(new OutputFile().withLabels(Arrays.asList("clrcivtsox", "rkenx")),
                new OutputFile().withLabels(Arrays.asList("yyefrpmpdnqqs"))));
        model = BinaryData.fromObject(model).toObject(TransportStreamFormat.class);
        Assertions.assertEquals("awaoqvmmbnpqfrt", model.filenamePattern());
        Assertions.assertEquals("clrcivtsox", model.outputFiles().get(0).labels().get(0));
    }
}
