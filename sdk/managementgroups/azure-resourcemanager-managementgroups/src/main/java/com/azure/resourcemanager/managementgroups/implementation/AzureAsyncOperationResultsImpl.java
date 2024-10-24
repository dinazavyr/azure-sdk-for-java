// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.implementation;

import com.azure.resourcemanager.managementgroups.fluent.models.AzureAsyncOperationResultsInner;
import com.azure.resourcemanager.managementgroups.models.AzureAsyncOperationResults;

public final class AzureAsyncOperationResultsImpl implements AzureAsyncOperationResults {
    private AzureAsyncOperationResultsInner innerObject;

    private final com.azure.resourcemanager.managementgroups.ManagementGroupsManager serviceManager;

    AzureAsyncOperationResultsImpl(AzureAsyncOperationResultsInner innerObject,
        com.azure.resourcemanager.managementgroups.ManagementGroupsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String status() {
        return this.innerModel().status();
    }

    public String tenantId() {
        return this.innerModel().tenantId();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public AzureAsyncOperationResultsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager() {
        return this.serviceManager;
    }
}
