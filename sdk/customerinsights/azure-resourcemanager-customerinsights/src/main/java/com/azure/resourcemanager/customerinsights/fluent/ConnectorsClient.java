// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.customerinsights.fluent.models.ConnectorResourceFormatInner;

/**
 * An instance of this class provides access to all the operations defined in ConnectorsClient.
 */
public interface ConnectorsClient {
    /**
     * Creates a connector or updates an existing connector in the hub.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @param parameters Parameters supplied to the CreateOrUpdate Connector operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the connector resource format.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ConnectorResourceFormatInner>, ConnectorResourceFormatInner> beginCreateOrUpdate(
        String resourceGroupName, String hubName, String connectorName, ConnectorResourceFormatInner parameters);

    /**
     * Creates a connector or updates an existing connector in the hub.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @param parameters Parameters supplied to the CreateOrUpdate Connector operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the connector resource format.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ConnectorResourceFormatInner>, ConnectorResourceFormatInner> beginCreateOrUpdate(
        String resourceGroupName, String hubName, String connectorName, ConnectorResourceFormatInner parameters,
        Context context);

    /**
     * Creates a connector or updates an existing connector in the hub.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @param parameters Parameters supplied to the CreateOrUpdate Connector operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connector resource format.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConnectorResourceFormatInner createOrUpdate(String resourceGroupName, String hubName, String connectorName,
        ConnectorResourceFormatInner parameters);

    /**
     * Creates a connector or updates an existing connector in the hub.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @param parameters Parameters supplied to the CreateOrUpdate Connector operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connector resource format.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConnectorResourceFormatInner createOrUpdate(String resourceGroupName, String hubName, String connectorName,
        ConnectorResourceFormatInner parameters, Context context);

    /**
     * Gets a connector in the hub.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a connector in the hub along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConnectorResourceFormatInner> getWithResponse(String resourceGroupName, String hubName,
        String connectorName, Context context);

    /**
     * Gets a connector in the hub.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a connector in the hub.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConnectorResourceFormatInner get(String resourceGroupName, String hubName, String connectorName);

    /**
     * Deletes a connector in the hub.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String hubName, String connectorName);

    /**
     * Deletes a connector in the hub.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String hubName, String connectorName,
        Context context);

    /**
     * Deletes a connector in the hub.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String hubName, String connectorName);

    /**
     * Deletes a connector in the hub.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String hubName, String connectorName, Context context);

    /**
     * Gets all the connectors in the specified hub.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the connectors in the specified hub as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConnectorResourceFormatInner> listByHub(String resourceGroupName, String hubName);

    /**
     * Gets all the connectors in the specified hub.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the connectors in the specified hub as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConnectorResourceFormatInner> listByHub(String resourceGroupName, String hubName, Context context);
}
