// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

/**
 * Samples for SecurityMLAnalyticsSettings List.
 */
public final class SecurityMLAnalyticsSettingsListSamples {
    /*
     * x-ms-original-file:
     * specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-09-01-preview/examples/
     * securityMLAnalyticsSettings/GetAllSecurityMLAnalyticsSettings.json
     */
    /**
     * Sample code: Get all Security ML Analytics Settings.
     * 
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void
        getAllSecurityMLAnalyticsSettings(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager.securityMLAnalyticsSettings().list("myRg", "myWorkspace", com.azure.core.util.Context.NONE);
    }
}
