// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

/**
 * Samples for Variable Delete.
 */
public final class VariableDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/examples/deleteVariable
     * .json
     */
    /**
     * Sample code: Delete a variable.
     * 
     * @param manager Entry point to AutomationManager.
     */
    public static void deleteAVariable(com.azure.resourcemanager.automation.AutomationManager manager) {
        manager.variables()
            .deleteWithResponse("rg", "sampleAccount9", "sampleVariable", com.azure.core.util.Context.NONE);
    }
}
