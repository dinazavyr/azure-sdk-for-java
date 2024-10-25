// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

/**
 * Samples for RelationshipLinks Get.
 */
public final class RelationshipLinksGetSamples {
    /*
     * x-ms-original-file:
     * specification/customer-insights/resource-manager/Microsoft.CustomerInsights/stable/2017-04-26/examples/
     * RelationshipLinksGet.json
     */
    /**
     * Sample code: RelationshipLinks_Get.
     * 
     * @param manager Entry point to CustomerInsightsManager.
     */
    public static void
        relationshipLinksGet(com.azure.resourcemanager.customerinsights.CustomerInsightsManager manager) {
        manager.relationshipLinks()
            .getWithResponse("TestHubRG", "sdkTestHub", "Somelink", com.azure.core.util.Context.NONE);
    }
}
