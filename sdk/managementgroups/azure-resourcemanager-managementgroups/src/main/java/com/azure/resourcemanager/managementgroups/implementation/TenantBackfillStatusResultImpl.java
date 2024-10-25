// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.implementation;

import com.azure.resourcemanager.managementgroups.fluent.models.TenantBackfillStatusResultInner;
import com.azure.resourcemanager.managementgroups.models.Status;
import com.azure.resourcemanager.managementgroups.models.TenantBackfillStatusResult;

public final class TenantBackfillStatusResultImpl implements TenantBackfillStatusResult {
    private TenantBackfillStatusResultInner innerObject;

    private final com.azure.resourcemanager.managementgroups.ManagementGroupsManager serviceManager;

    TenantBackfillStatusResultImpl(TenantBackfillStatusResultInner innerObject,
        com.azure.resourcemanager.managementgroups.ManagementGroupsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String tenantId() {
        return this.innerModel().tenantId();
    }

    public Status status() {
        return this.innerModel().status();
    }

    public TenantBackfillStatusResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager() {
        return this.serviceManager;
    }
}
