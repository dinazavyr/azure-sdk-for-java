// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Experiments. */
public interface Experiments {
    /**
     * Gets a list of Experiments within the specified Workspace.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Experiments within the specified Workspace.
     */
    PagedIterable<Experiment> listByWorkspace(String resourceGroupName, String workspaceName);

    /**
     * Gets a list of Experiments within the specified Workspace.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param maxResults The maximum number of items to return in the response. A maximum of 1000 files can be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Experiments within the specified Workspace.
     */
    PagedIterable<Experiment> listByWorkspace(String resourceGroupName, String workspaceName, Integer maxResults,
        Context context);

    /**
     * Creates an Experiment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return experiment information.
     */
    Experiment create(String resourceGroupName, String workspaceName, String experimentName);

    /**
     * Creates an Experiment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return experiment information.
     */
    Experiment create(String resourceGroupName, String workspaceName, String experimentName, Context context);

    /**
     * Deletes an Experiment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, String experimentName);

    /**
     * Deletes an Experiment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, String experimentName, Context context);

    /**
     * Gets information about an Experiment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an Experiment.
     */
    Experiment get(String resourceGroupName, String workspaceName, String experimentName);

    /**
     * Gets information about an Experiment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an Experiment.
     */
    Response<Experiment> getWithResponse(String resourceGroupName, String workspaceName, String experimentName,
        Context context);
}
