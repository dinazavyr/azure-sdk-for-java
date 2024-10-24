// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.fluent.models.TransformProperties;
import com.azure.resourcemanager.mediaservices.models.OnErrorType;
import com.azure.resourcemanager.mediaservices.models.Preset;
import com.azure.resourcemanager.mediaservices.models.Priority;
import com.azure.resourcemanager.mediaservices.models.TransformOutput;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TransformPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TransformProperties model = BinaryData.fromString(
            "{\"created\":\"2021-11-14T02:33:08Z\",\"description\":\"nmxiebwwaloayqc\",\"lastModified\":\"2021-09-09T06:40:06Z\",\"outputs\":[{\"onError\":\"StopProcessingJob\",\"relativePriority\":\"Normal\",\"preset\":{\"@odata.type\":\"Preset\"}},{\"onError\":\"ContinueJob\",\"relativePriority\":\"Normal\",\"preset\":{\"@odata.type\":\"Preset\"}},{\"onError\":\"ContinueJob\",\"relativePriority\":\"High\",\"preset\":{\"@odata.type\":\"Preset\"}},{\"onError\":\"ContinueJob\",\"relativePriority\":\"Normal\",\"preset\":{\"@odata.type\":\"Preset\"}}]}")
            .toObject(TransformProperties.class);
        Assertions.assertEquals("nmxiebwwaloayqc", model.description());
        Assertions.assertEquals(OnErrorType.STOP_PROCESSING_JOB, model.outputs().get(0).onError());
        Assertions.assertEquals(Priority.NORMAL, model.outputs().get(0).relativePriority());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TransformProperties model = new TransformProperties().withDescription("nmxiebwwaloayqc")
            .withOutputs(Arrays.asList(
                new TransformOutput().withOnError(OnErrorType.STOP_PROCESSING_JOB)
                    .withRelativePriority(Priority.NORMAL)
                    .withPreset(new Preset()),
                new TransformOutput().withOnError(OnErrorType.CONTINUE_JOB)
                    .withRelativePriority(Priority.NORMAL)
                    .withPreset(new Preset()),
                new TransformOutput().withOnError(OnErrorType.CONTINUE_JOB)
                    .withRelativePriority(Priority.HIGH)
                    .withPreset(new Preset()),
                new TransformOutput().withOnError(OnErrorType.CONTINUE_JOB)
                    .withRelativePriority(Priority.NORMAL)
                    .withPreset(new Preset())));
        model = BinaryData.fromObject(model).toObject(TransformProperties.class);
        Assertions.assertEquals("nmxiebwwaloayqc", model.description());
        Assertions.assertEquals(OnErrorType.STOP_PROCESSING_JOB, model.outputs().get(0).onError());
        Assertions.assertEquals(Priority.NORMAL, model.outputs().get(0).relativePriority());
    }
}
