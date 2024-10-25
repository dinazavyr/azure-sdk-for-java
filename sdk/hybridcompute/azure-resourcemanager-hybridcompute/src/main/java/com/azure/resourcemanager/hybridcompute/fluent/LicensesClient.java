// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.hybridcompute.fluent.models.LicenseInner;
import com.azure.resourcemanager.hybridcompute.models.LicenseUpdate;

/**
 * An instance of this class provides access to all the operations defined in LicensesClient.
 */
public interface LicensesClient {
    /**
     * The operation to validate a license.
     * 
     * @param parameters Parameters supplied to the license validation operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a license in a hybrid machine.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<LicenseInner>, LicenseInner> beginValidateLicense(LicenseInner parameters);

    /**
     * The operation to validate a license.
     * 
     * @param parameters Parameters supplied to the license validation operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a license in a hybrid machine.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<LicenseInner>, LicenseInner> beginValidateLicense(LicenseInner parameters, Context context);

    /**
     * The operation to validate a license.
     * 
     * @param parameters Parameters supplied to the license validation operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a license in a hybrid machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LicenseInner validateLicense(LicenseInner parameters);

    /**
     * The operation to validate a license.
     * 
     * @param parameters Parameters supplied to the license validation operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a license in a hybrid machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LicenseInner validateLicense(LicenseInner parameters, Context context);

    /**
     * The operation to create or update a license.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param licenseName The name of the license.
     * @param parameters Parameters supplied to the Create license operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a license in a hybrid machine.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<LicenseInner>, LicenseInner> beginCreateOrUpdate(String resourceGroupName, String licenseName,
        LicenseInner parameters);

    /**
     * The operation to create or update a license.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param licenseName The name of the license.
     * @param parameters Parameters supplied to the Create license operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a license in a hybrid machine.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<LicenseInner>, LicenseInner> beginCreateOrUpdate(String resourceGroupName, String licenseName,
        LicenseInner parameters, Context context);

    /**
     * The operation to create or update a license.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param licenseName The name of the license.
     * @param parameters Parameters supplied to the Create license operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a license in a hybrid machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LicenseInner createOrUpdate(String resourceGroupName, String licenseName, LicenseInner parameters);

    /**
     * The operation to create or update a license.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param licenseName The name of the license.
     * @param parameters Parameters supplied to the Create license operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a license in a hybrid machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LicenseInner createOrUpdate(String resourceGroupName, String licenseName, LicenseInner parameters, Context context);

    /**
     * The operation to update a license.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param licenseName The name of the license.
     * @param parameters Parameters supplied to the Update license operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a license in a hybrid machine.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<LicenseInner>, LicenseInner> beginUpdate(String resourceGroupName, String licenseName,
        LicenseUpdate parameters);

    /**
     * The operation to update a license.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param licenseName The name of the license.
     * @param parameters Parameters supplied to the Update license operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a license in a hybrid machine.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<LicenseInner>, LicenseInner> beginUpdate(String resourceGroupName, String licenseName,
        LicenseUpdate parameters, Context context);

    /**
     * The operation to update a license.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param licenseName The name of the license.
     * @param parameters Parameters supplied to the Update license operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a license in a hybrid machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LicenseInner update(String resourceGroupName, String licenseName, LicenseUpdate parameters);

    /**
     * The operation to update a license.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param licenseName The name of the license.
     * @param parameters Parameters supplied to the Update license operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a license in a hybrid machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LicenseInner update(String resourceGroupName, String licenseName, LicenseUpdate parameters, Context context);

    /**
     * Retrieves information about the view of a license.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param licenseName The name of the license.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a license in a hybrid machine along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LicenseInner> getByResourceGroupWithResponse(String resourceGroupName, String licenseName,
        Context context);

    /**
     * Retrieves information about the view of a license.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param licenseName The name of the license.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a license in a hybrid machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LicenseInner getByResourceGroup(String resourceGroupName, String licenseName);

    /**
     * The operation to delete a license.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param licenseName The name of the license.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String licenseName);

    /**
     * The operation to delete a license.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param licenseName The name of the license.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String licenseName, Context context);

    /**
     * The operation to delete a license.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param licenseName The name of the license.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String licenseName);

    /**
     * The operation to delete a license.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param licenseName The name of the license.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String licenseName, Context context);

    /**
     * The operation to get all licenses of a non-Azure machine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List license operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LicenseInner> listByResourceGroup(String resourceGroupName);

    /**
     * The operation to get all licenses of a non-Azure machine.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List license operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LicenseInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * The operation to get all licenses of a non-Azure machine.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List license operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LicenseInner> list();

    /**
     * The operation to get all licenses of a non-Azure machine.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List license operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LicenseInner> list(Context context);
}
