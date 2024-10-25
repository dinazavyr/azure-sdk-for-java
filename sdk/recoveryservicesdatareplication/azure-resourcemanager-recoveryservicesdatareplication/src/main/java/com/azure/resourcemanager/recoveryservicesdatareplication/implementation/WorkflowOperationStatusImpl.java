// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.WorkflowOperationStatusClient;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.OperationStatusInner;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.OperationStatus;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.WorkflowOperationStatus;

public final class WorkflowOperationStatusImpl implements WorkflowOperationStatus {
    private static final ClientLogger LOGGER = new ClientLogger(WorkflowOperationStatusImpl.class);

    private final WorkflowOperationStatusClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager serviceManager;

    public WorkflowOperationStatusImpl(WorkflowOperationStatusClient innerClient,
        com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<OperationStatus> getWithResponse(String resourceGroupName, String vaultName, String jobName,
        String operationId, Context context) {
        Response<OperationStatusInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, vaultName, jobName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new OperationStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public OperationStatus get(String resourceGroupName, String vaultName, String jobName, String operationId) {
        OperationStatusInner inner = this.serviceClient().get(resourceGroupName, vaultName, jobName, operationId);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private WorkflowOperationStatusClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager manager() {
        return this.serviceManager;
    }
}
