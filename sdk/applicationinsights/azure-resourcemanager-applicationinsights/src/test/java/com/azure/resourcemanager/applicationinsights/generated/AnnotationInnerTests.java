// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.applicationinsights.fluent.models.AnnotationInner;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class AnnotationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AnnotationInner model = BinaryData.fromString(
            "{\"AnnotationName\":\"eg\",\"Category\":\"wmfdatscmdvpjhul\",\"EventTime\":\"2021-11-19T18:36:28Z\",\"Id\":\"mkjozkrwf\",\"Properties\":\"iodjp\",\"RelatedAnnotation\":\"w\"}")
            .toObject(AnnotationInner.class);
        Assertions.assertEquals("eg", model.annotationName());
        Assertions.assertEquals("wmfdatscmdvpjhul", model.category());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-19T18:36:28Z"), model.eventTime());
        Assertions.assertEquals("mkjozkrwf", model.id());
        Assertions.assertEquals("iodjp", model.properties());
        Assertions.assertEquals("w", model.relatedAnnotation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AnnotationInner model = new AnnotationInner().withAnnotationName("eg")
            .withCategory("wmfdatscmdvpjhul")
            .withEventTime(OffsetDateTime.parse("2021-11-19T18:36:28Z"))
            .withId("mkjozkrwf")
            .withProperties("iodjp")
            .withRelatedAnnotation("w");
        model = BinaryData.fromObject(model).toObject(AnnotationInner.class);
        Assertions.assertEquals("eg", model.annotationName());
        Assertions.assertEquals("wmfdatscmdvpjhul", model.category());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-19T18:36:28Z"), model.eventTime());
        Assertions.assertEquals("mkjozkrwf", model.id());
        Assertions.assertEquals("iodjp", model.properties());
        Assertions.assertEquals("w", model.relatedAnnotation());
    }
}
