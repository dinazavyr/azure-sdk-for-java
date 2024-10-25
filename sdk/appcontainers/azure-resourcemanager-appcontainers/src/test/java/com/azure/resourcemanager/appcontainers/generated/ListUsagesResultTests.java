// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.UsageInner;
import com.azure.resourcemanager.appcontainers.models.ListUsagesResult;
import com.azure.resourcemanager.appcontainers.models.UsageName;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ListUsagesResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ListUsagesResult model = BinaryData.fromString(
            "{\"value\":[{\"currentValue\":41.2557,\"limit\":14.812088,\"name\":{\"value\":\"rsiwdyjqur\",\"localizedValue\":\"crraueekcsu\"}},{\"currentValue\":1.5593171,\"limit\":12.774044,\"name\":{\"value\":\"ddacbcbgydlqidy\",\"localizedValue\":\"hmptyrilkfbn\"}},{\"currentValue\":55.588596,\"limit\":89.35382,\"name\":{\"value\":\"vzt\",\"localizedValue\":\"nfnqtxjtomals\"}},{\"currentValue\":43.106903,\"limit\":78.589905,\"name\":{\"value\":\"ddepldwqjns\",\"localizedValue\":\"ygleexa\"}}],\"nextLink\":\"mywhsb\"}")
            .toObject(ListUsagesResult.class);
        Assertions.assertEquals(41.2557f, model.value().get(0).currentValue());
        Assertions.assertEquals(14.812088f, model.value().get(0).limit());
        Assertions.assertEquals("rsiwdyjqur", model.value().get(0).name().value());
        Assertions.assertEquals("crraueekcsu", model.value().get(0).name().localizedValue());
        Assertions.assertEquals("mywhsb", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ListUsagesResult model = new ListUsagesResult()
            .withValue(Arrays.asList(
                new UsageInner().withCurrentValue(41.2557f)
                    .withLimit(14.812088f)
                    .withName(new UsageName().withValue("rsiwdyjqur").withLocalizedValue("crraueekcsu")),
                new UsageInner().withCurrentValue(1.5593171f)
                    .withLimit(12.774044f)
                    .withName(new UsageName().withValue("ddacbcbgydlqidy").withLocalizedValue("hmptyrilkfbn")),
                new UsageInner().withCurrentValue(55.588596f)
                    .withLimit(89.35382f)
                    .withName(new UsageName().withValue("vzt").withLocalizedValue("nfnqtxjtomals")),
                new UsageInner().withCurrentValue(43.106903f)
                    .withLimit(78.589905f)
                    .withName(new UsageName().withValue("ddepldwqjns").withLocalizedValue("ygleexa"))))
            .withNextLink("mywhsb");
        model = BinaryData.fromObject(model).toObject(ListUsagesResult.class);
        Assertions.assertEquals(41.2557f, model.value().get(0).currentValue());
        Assertions.assertEquals(14.812088f, model.value().get(0).limit());
        Assertions.assertEquals("rsiwdyjqur", model.value().get(0).name().value());
        Assertions.assertEquals("crraueekcsu", model.value().get(0).name().localizedValue());
        Assertions.assertEquals("mywhsb", model.nextLink());
    }
}
