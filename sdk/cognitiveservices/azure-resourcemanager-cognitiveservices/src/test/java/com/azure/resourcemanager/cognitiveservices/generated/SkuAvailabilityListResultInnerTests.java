// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.fluent.models.SkuAvailabilityListResultInner;
import com.azure.resourcemanager.cognitiveservices.models.SkuAvailability;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SkuAvailabilityListResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SkuAvailabilityListResultInner model = BinaryData.fromString(
            "{\"value\":[{\"kind\":\"x\",\"type\":\"zxbzpfzabglc\",\"skuName\":\"xwtctyqiklbbovpl\",\"skuAvailable\":false,\"reason\":\"vgyuguos\",\"message\":\"kfssxqukkf\"},{\"kind\":\"gmgsxnkjzkde\",\"type\":\"pvlopwiyighxpkd\",\"skuName\":\"baiuebbaumny\",\"skuAvailable\":false,\"reason\":\"deoj\",\"message\":\"bckhsmtxpsi\"}]}")
            .toObject(SkuAvailabilityListResultInner.class);
        Assertions.assertEquals("x", model.value().get(0).kind());
        Assertions.assertEquals("zxbzpfzabglc", model.value().get(0).type());
        Assertions.assertEquals("xwtctyqiklbbovpl", model.value().get(0).skuName());
        Assertions.assertEquals(false, model.value().get(0).skuAvailable());
        Assertions.assertEquals("vgyuguos", model.value().get(0).reason());
        Assertions.assertEquals("kfssxqukkf", model.value().get(0).message());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SkuAvailabilityListResultInner model = new SkuAvailabilityListResultInner().withValue(Arrays.asList(
            new SkuAvailability().withKind("x")
                .withType("zxbzpfzabglc")
                .withSkuName("xwtctyqiklbbovpl")
                .withSkuAvailable(false)
                .withReason("vgyuguos")
                .withMessage("kfssxqukkf"),
            new SkuAvailability().withKind("gmgsxnkjzkde")
                .withType("pvlopwiyighxpkd")
                .withSkuName("baiuebbaumny")
                .withSkuAvailable(false)
                .withReason("deoj")
                .withMessage("bckhsmtxpsi")));
        model = BinaryData.fromObject(model).toObject(SkuAvailabilityListResultInner.class);
        Assertions.assertEquals("x", model.value().get(0).kind());
        Assertions.assertEquals("zxbzpfzabglc", model.value().get(0).type());
        Assertions.assertEquals("xwtctyqiklbbovpl", model.value().get(0).skuName());
        Assertions.assertEquals(false, model.value().get(0).skuAvailable());
        Assertions.assertEquals("vgyuguos", model.value().get(0).reason());
        Assertions.assertEquals("kfssxqukkf", model.value().get(0).message());
    }
}
