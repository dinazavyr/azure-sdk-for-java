// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.reservations.models.CatalogsResult;
import org.junit.jupiter.api.Assertions;

public final class CatalogsResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CatalogsResult model = BinaryData.fromString(
            "{\"value\":[{\"resourceType\":\"ufo\",\"name\":\"jywif\",\"billingPlans\":{\"gdf\":[\"Upfront\",\"Monthly\"],\"j\":[\"Upfront\",\"Monthly\",\"Upfront\",\"Upfront\"]},\"terms\":[\"P3Y\",\"P1Y\",\"P5Y\",\"P1Y\"],\"locations\":[\"ktsizntocipaou\",\"jpsq\",\"cmpoyfdkfogkny\",\"jofjd\"],\"skuProperties\":[],\"msrp\":{},\"restrictions\":[],\"tier\":\"wnw\",\"size\":\"itjz\",\"capabilities\":[]},{\"resourceType\":\"sarhmofc\",\"name\":\"smy\",\"billingPlans\":{\"he\":[\"Monthly\",\"Monthly\",\"Upfront\",\"Monthly\"],\"txukcdmp\":[\"Upfront\",\"Monthly\",\"Upfront\"],\"anzwuxzdxta\":[\"Upfront\",\"Monthly\",\"Upfront\",\"Monthly\"]},\"terms\":[\"P5Y\",\"P1Y\",\"P3Y\",\"P1Y\"],\"locations\":[\"mrqobmtukknr\",\"rtihfxtijbpz\"],\"skuProperties\":[],\"msrp\":{},\"restrictions\":[],\"tier\":\"zufcyzkohdbi\",\"size\":\"nufhf\",\"capabilities\":[]}],\"nextLink\":\"s\",\"totalItems\":4240171364940315752}")
            .toObject(CatalogsResult.class);
        Assertions.assertEquals(4240171364940315752L, model.totalItems());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CatalogsResult model = new CatalogsResult().withTotalItems(4240171364940315752L);
        model = BinaryData.fromObject(model).toObject(CatalogsResult.class);
        Assertions.assertEquals(4240171364940315752L, model.totalItems());
    }
}
