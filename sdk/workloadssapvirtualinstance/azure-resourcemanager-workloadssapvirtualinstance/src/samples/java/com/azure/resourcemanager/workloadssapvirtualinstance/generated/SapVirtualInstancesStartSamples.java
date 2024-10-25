// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.generated;

import com.azure.resourcemanager.workloadssapvirtualinstance.models.StartRequest;

/**
 * Samples for SapVirtualInstances Start.
 */
public final class SapVirtualInstancesStartSamples {
    /*
     * x-ms-original-file: 2024-09-01/SapVirtualInstances_Start.json
     */
    /**
     * Sample code: SAPVirtualInstances_Start.
     * 
     * @param manager Entry point to WorkloadsSapVirtualInstanceManager.
     */
    public static void sAPVirtualInstancesStart(
        com.azure.resourcemanager.workloadssapvirtualinstance.WorkloadsSapVirtualInstanceManager manager) {
        manager.sapVirtualInstances()
            .start("test-rg", "X00", new StartRequest().withStartVm(true), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2024-09-01/SapVirtualInstances_StartWithInfraOperations.json
     */
    /**
     * Sample code: SAPVirtualInstances_Start_WithInfraOperations.
     * 
     * @param manager Entry point to WorkloadsSapVirtualInstanceManager.
     */
    public static void sAPVirtualInstancesStartWithInfraOperations(
        com.azure.resourcemanager.workloadssapvirtualinstance.WorkloadsSapVirtualInstanceManager manager) {
        manager.sapVirtualInstances()
            .start("test-rg", "X00", new StartRequest().withStartVm(true), com.azure.core.util.Context.NONE);
    }
}
