// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.desktopvirtualization.fluent.ScalingPlanPooledSchedulesClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ScalingPlanPooledScheduleInner;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingPlanPooledSchedule;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingPlanPooledSchedules;

public final class ScalingPlanPooledSchedulesImpl implements ScalingPlanPooledSchedules {
    private static final ClientLogger LOGGER = new ClientLogger(ScalingPlanPooledSchedulesImpl.class);

    private final ScalingPlanPooledSchedulesClient innerClient;

    private final com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager;

    public ScalingPlanPooledSchedulesImpl(ScalingPlanPooledSchedulesClient innerClient,
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ScalingPlanPooledSchedule> getWithResponse(String resourceGroupName, String scalingPlanName,
        String scalingPlanScheduleName, Context context) {
        Response<ScalingPlanPooledScheduleInner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, scalingPlanName, scalingPlanScheduleName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ScalingPlanPooledScheduleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ScalingPlanPooledSchedule get(String resourceGroupName, String scalingPlanName,
        String scalingPlanScheduleName) {
        ScalingPlanPooledScheduleInner inner
            = this.serviceClient().get(resourceGroupName, scalingPlanName, scalingPlanScheduleName);
        if (inner != null) {
            return new ScalingPlanPooledScheduleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String scalingPlanName,
        String scalingPlanScheduleName, Context context) {
        return this.serviceClient()
            .deleteWithResponse(resourceGroupName, scalingPlanName, scalingPlanScheduleName, context);
    }

    public void delete(String resourceGroupName, String scalingPlanName, String scalingPlanScheduleName) {
        this.serviceClient().delete(resourceGroupName, scalingPlanName, scalingPlanScheduleName);
    }

    public PagedIterable<ScalingPlanPooledSchedule> list(String resourceGroupName, String scalingPlanName) {
        PagedIterable<ScalingPlanPooledScheduleInner> inner
            = this.serviceClient().list(resourceGroupName, scalingPlanName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ScalingPlanPooledScheduleImpl(inner1, this.manager()));
    }

    public PagedIterable<ScalingPlanPooledSchedule> list(String resourceGroupName, String scalingPlanName,
        Integer pageSize, Boolean isDescending, Integer initialSkip, Context context) {
        PagedIterable<ScalingPlanPooledScheduleInner> inner = this.serviceClient()
            .list(resourceGroupName, scalingPlanName, pageSize, isDescending, initialSkip, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ScalingPlanPooledScheduleImpl(inner1, this.manager()));
    }

    public ScalingPlanPooledSchedule getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String scalingPlanName = ResourceManagerUtils.getValueFromIdByName(id, "scalingPlans");
        if (scalingPlanName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'scalingPlans'.", id)));
        }
        String scalingPlanScheduleName = ResourceManagerUtils.getValueFromIdByName(id, "pooledSchedules");
        if (scalingPlanScheduleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'pooledSchedules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, scalingPlanName, scalingPlanScheduleName, Context.NONE)
            .getValue();
    }

    public Response<ScalingPlanPooledSchedule> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String scalingPlanName = ResourceManagerUtils.getValueFromIdByName(id, "scalingPlans");
        if (scalingPlanName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'scalingPlans'.", id)));
        }
        String scalingPlanScheduleName = ResourceManagerUtils.getValueFromIdByName(id, "pooledSchedules");
        if (scalingPlanScheduleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'pooledSchedules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, scalingPlanName, scalingPlanScheduleName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String scalingPlanName = ResourceManagerUtils.getValueFromIdByName(id, "scalingPlans");
        if (scalingPlanName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'scalingPlans'.", id)));
        }
        String scalingPlanScheduleName = ResourceManagerUtils.getValueFromIdByName(id, "pooledSchedules");
        if (scalingPlanScheduleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'pooledSchedules'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, scalingPlanName, scalingPlanScheduleName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String scalingPlanName = ResourceManagerUtils.getValueFromIdByName(id, "scalingPlans");
        if (scalingPlanName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'scalingPlans'.", id)));
        }
        String scalingPlanScheduleName = ResourceManagerUtils.getValueFromIdByName(id, "pooledSchedules");
        if (scalingPlanScheduleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'pooledSchedules'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, scalingPlanName, scalingPlanScheduleName, context);
    }

    private ScalingPlanPooledSchedulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager() {
        return this.serviceManager;
    }

    public ScalingPlanPooledScheduleImpl define(String name) {
        return new ScalingPlanPooledScheduleImpl(name, this.manager());
    }
}
