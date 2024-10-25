// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.costmanagement.fluent.models.RequestContext;
import com.azure.resourcemanager.costmanagement.models.CostDetailsMetricType;
import com.azure.resourcemanager.costmanagement.models.CostDetailsTimePeriod;
import com.azure.resourcemanager.costmanagement.models.GenerateCostDetailsReportRequestDefinition;
import org.junit.jupiter.api.Assertions;

public final class RequestContextTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RequestContext model = BinaryData.fromString(
            "{\"requestScope\":\"iby\",\"requestBody\":{\"metric\":\"ActualCost\",\"timePeriod\":{\"start\":\"h\",\"end\":\"hfwpracstwit\"},\"billingPeriod\":\"hevxcced\",\"invoiceId\":\"nmdyodnwzxl\"}}")
            .toObject(RequestContext.class);
        Assertions.assertEquals("iby", model.requestScope());
        Assertions.assertEquals(CostDetailsMetricType.ACTUAL_COST, model.requestBody().metric());
        Assertions.assertEquals("h", model.requestBody().timePeriod().start());
        Assertions.assertEquals("hfwpracstwit", model.requestBody().timePeriod().end());
        Assertions.assertEquals("hevxcced", model.requestBody().billingPeriod());
        Assertions.assertEquals("nmdyodnwzxl", model.requestBody().invoiceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RequestContext model = new RequestContext().withRequestScope("iby")
            .withRequestBody(
                new GenerateCostDetailsReportRequestDefinition().withMetric(CostDetailsMetricType.ACTUAL_COST)
                    .withTimePeriod(new CostDetailsTimePeriod().withStart("h").withEnd("hfwpracstwit"))
                    .withBillingPeriod("hevxcced")
                    .withInvoiceId("nmdyodnwzxl"));
        model = BinaryData.fromObject(model).toObject(RequestContext.class);
        Assertions.assertEquals("iby", model.requestScope());
        Assertions.assertEquals(CostDetailsMetricType.ACTUAL_COST, model.requestBody().metric());
        Assertions.assertEquals("h", model.requestBody().timePeriod().start());
        Assertions.assertEquals("hfwpracstwit", model.requestBody().timePeriod().end());
        Assertions.assertEquals("hevxcced", model.requestBody().billingPeriod());
        Assertions.assertEquals("nmdyodnwzxl", model.requestBody().invoiceId());
    }
}
