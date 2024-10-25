// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearningservices.fluent.models.WorkspaceConnectionInner;
import com.azure.resourcemanager.machinelearningservices.models.WorkspaceConnectionDto;

/** An instance of this class provides access to all the operations defined in WorkspaceConnectionsClient. */
public interface WorkspaceConnectionsClient {
    /**
     * List all connections under a AML workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paginated list of Workspace connection objects.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkspaceConnectionInner> list(String resourceGroupName, String workspaceName);

    /**
     * List all connections under a AML workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param target Target of the workspace connection.
     * @param category Category of the workspace connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paginated list of Workspace connection objects.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkspaceConnectionInner> list(String resourceGroupName, String workspaceName, String target,
        String category, Context context);

    /**
     * Add a new workspace connection.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param connectionName Friendly name of the workspace connection.
     * @param parameters The object for creating or updating a new workspace connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceConnectionInner create(String resourceGroupName, String workspaceName, String connectionName,
        WorkspaceConnectionDto parameters);

    /**
     * Add a new workspace connection.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param connectionName Friendly name of the workspace connection.
     * @param parameters The object for creating or updating a new workspace connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkspaceConnectionInner> createWithResponse(String resourceGroupName, String workspaceName,
        String connectionName, WorkspaceConnectionDto parameters, Context context);

    /**
     * Get the detail of a workspace connection.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param connectionName Friendly name of the workspace connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detail of a workspace connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceConnectionInner get(String resourceGroupName, String workspaceName, String connectionName);

    /**
     * Get the detail of a workspace connection.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param connectionName Friendly name of the workspace connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detail of a workspace connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkspaceConnectionInner> getWithResponse(String resourceGroupName, String workspaceName,
        String connectionName, Context context);

    /**
     * Delete a workspace connection.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param connectionName Friendly name of the workspace connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, String connectionName);

    /**
     * Delete a workspace connection.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param connectionName Friendly name of the workspace connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String workspaceName, String connectionName,
        Context context);
}
