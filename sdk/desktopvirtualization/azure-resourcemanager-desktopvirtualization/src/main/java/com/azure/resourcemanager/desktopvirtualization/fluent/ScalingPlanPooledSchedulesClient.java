// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ScalingPlanPooledScheduleInner;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingPlanPooledSchedulePatch;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ScalingPlanPooledSchedulesClient.
 */
public interface ScalingPlanPooledSchedulesClient {
    /**
     * Get a ScalingPlanPooledSchedule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param scalingPlanScheduleName The name of the ScalingPlanSchedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ScalingPlanPooledSchedule along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ScalingPlanPooledScheduleInner>> getWithResponseAsync(String resourceGroupName,
        String scalingPlanName, String scalingPlanScheduleName);

    /**
     * Get a ScalingPlanPooledSchedule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param scalingPlanScheduleName The name of the ScalingPlanSchedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ScalingPlanPooledSchedule on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ScalingPlanPooledScheduleInner> getAsync(String resourceGroupName, String scalingPlanName,
        String scalingPlanScheduleName);

    /**
     * Get a ScalingPlanPooledSchedule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param scalingPlanScheduleName The name of the ScalingPlanSchedule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ScalingPlanPooledSchedule along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ScalingPlanPooledScheduleInner> getWithResponse(String resourceGroupName, String scalingPlanName,
        String scalingPlanScheduleName, Context context);

    /**
     * Get a ScalingPlanPooledSchedule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param scalingPlanScheduleName The name of the ScalingPlanSchedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ScalingPlanPooledSchedule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScalingPlanPooledScheduleInner get(String resourceGroupName, String scalingPlanName,
        String scalingPlanScheduleName);

    /**
     * Create or update a ScalingPlanPooledSchedule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param scalingPlanScheduleName The name of the ScalingPlanSchedule.
     * @param scalingPlanSchedule Object containing ScalingPlanPooledSchedule definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a ScalingPlanPooledSchedule definition along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ScalingPlanPooledScheduleInner>> createWithResponseAsync(String resourceGroupName,
        String scalingPlanName, String scalingPlanScheduleName, ScalingPlanPooledScheduleInner scalingPlanSchedule);

    /**
     * Create or update a ScalingPlanPooledSchedule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param scalingPlanScheduleName The name of the ScalingPlanSchedule.
     * @param scalingPlanSchedule Object containing ScalingPlanPooledSchedule definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a ScalingPlanPooledSchedule definition on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ScalingPlanPooledScheduleInner> createAsync(String resourceGroupName, String scalingPlanName,
        String scalingPlanScheduleName, ScalingPlanPooledScheduleInner scalingPlanSchedule);

    /**
     * Create or update a ScalingPlanPooledSchedule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param scalingPlanScheduleName The name of the ScalingPlanSchedule.
     * @param scalingPlanSchedule Object containing ScalingPlanPooledSchedule definitions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a ScalingPlanPooledSchedule definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ScalingPlanPooledScheduleInner> createWithResponse(String resourceGroupName, String scalingPlanName,
        String scalingPlanScheduleName, ScalingPlanPooledScheduleInner scalingPlanSchedule, Context context);

    /**
     * Create or update a ScalingPlanPooledSchedule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param scalingPlanScheduleName The name of the ScalingPlanSchedule.
     * @param scalingPlanSchedule Object containing ScalingPlanPooledSchedule definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a ScalingPlanPooledSchedule definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScalingPlanPooledScheduleInner create(String resourceGroupName, String scalingPlanName,
        String scalingPlanScheduleName, ScalingPlanPooledScheduleInner scalingPlanSchedule);

    /**
     * Remove a ScalingPlanPooledSchedule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param scalingPlanScheduleName The name of the ScalingPlanSchedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String scalingPlanName,
        String scalingPlanScheduleName);

    /**
     * Remove a ScalingPlanPooledSchedule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param scalingPlanScheduleName The name of the ScalingPlanSchedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String scalingPlanName, String scalingPlanScheduleName);

    /**
     * Remove a ScalingPlanPooledSchedule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param scalingPlanScheduleName The name of the ScalingPlanSchedule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String scalingPlanName, String scalingPlanScheduleName,
        Context context);

    /**
     * Remove a ScalingPlanPooledSchedule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param scalingPlanScheduleName The name of the ScalingPlanSchedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String scalingPlanName, String scalingPlanScheduleName);

    /**
     * Update a ScalingPlanPooledSchedule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param scalingPlanScheduleName The name of the ScalingPlanSchedule.
     * @param scalingPlanSchedule Object containing ScalingPlanPooledSchedule definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a ScalingPlanPooledSchedule definition along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ScalingPlanPooledScheduleInner>> updateWithResponseAsync(String resourceGroupName,
        String scalingPlanName, String scalingPlanScheduleName, ScalingPlanPooledSchedulePatch scalingPlanSchedule);

    /**
     * Update a ScalingPlanPooledSchedule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param scalingPlanScheduleName The name of the ScalingPlanSchedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a ScalingPlanPooledSchedule definition on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ScalingPlanPooledScheduleInner> updateAsync(String resourceGroupName, String scalingPlanName,
        String scalingPlanScheduleName);

    /**
     * Update a ScalingPlanPooledSchedule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param scalingPlanScheduleName The name of the ScalingPlanSchedule.
     * @param scalingPlanSchedule Object containing ScalingPlanPooledSchedule definitions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a ScalingPlanPooledSchedule definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ScalingPlanPooledScheduleInner> updateWithResponse(String resourceGroupName, String scalingPlanName,
        String scalingPlanScheduleName, ScalingPlanPooledSchedulePatch scalingPlanSchedule, Context context);

    /**
     * Update a ScalingPlanPooledSchedule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param scalingPlanScheduleName The name of the ScalingPlanSchedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a ScalingPlanPooledSchedule definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScalingPlanPooledScheduleInner update(String resourceGroupName, String scalingPlanName,
        String scalingPlanScheduleName);

    /**
     * List ScalingPlanPooledSchedules.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param pageSize Number of items per page.
     * @param isDescending Indicates whether the collection is descending.
     * @param initialSkip Initial number of items to skip.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return scalingPlanPooledScheduleList as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ScalingPlanPooledScheduleInner> listAsync(String resourceGroupName, String scalingPlanName,
        Integer pageSize, Boolean isDescending, Integer initialSkip);

    /**
     * List ScalingPlanPooledSchedules.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return scalingPlanPooledScheduleList as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ScalingPlanPooledScheduleInner> listAsync(String resourceGroupName, String scalingPlanName);

    /**
     * List ScalingPlanPooledSchedules.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return scalingPlanPooledScheduleList as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScalingPlanPooledScheduleInner> list(String resourceGroupName, String scalingPlanName);

    /**
     * List ScalingPlanPooledSchedules.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param pageSize Number of items per page.
     * @param isDescending Indicates whether the collection is descending.
     * @param initialSkip Initial number of items to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return scalingPlanPooledScheduleList as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScalingPlanPooledScheduleInner> list(String resourceGroupName, String scalingPlanName,
        Integer pageSize, Boolean isDescending, Integer initialSkip, Context context);
}
