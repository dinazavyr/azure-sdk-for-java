// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.botservice.fluent.BotConnectionsClient;
import com.azure.resourcemanager.botservice.fluent.models.ConnectionSettingInner;
import com.azure.resourcemanager.botservice.fluent.models.ServiceProviderResponseListInner;
import com.azure.resourcemanager.botservice.models.BotConnections;
import com.azure.resourcemanager.botservice.models.ConnectionSetting;
import com.azure.resourcemanager.botservice.models.ServiceProviderResponseList;

public final class BotConnectionsImpl implements BotConnections {
    private static final ClientLogger LOGGER = new ClientLogger(BotConnectionsImpl.class);

    private final BotConnectionsClient innerClient;

    private final com.azure.resourcemanager.botservice.BotServiceManager serviceManager;

    public BotConnectionsImpl(BotConnectionsClient innerClient,
        com.azure.resourcemanager.botservice.BotServiceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ServiceProviderResponseList> listServiceProvidersWithResponse(Context context) {
        Response<ServiceProviderResponseListInner> inner
            = this.serviceClient().listServiceProvidersWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ServiceProviderResponseListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ServiceProviderResponseList listServiceProviders() {
        ServiceProviderResponseListInner inner = this.serviceClient().listServiceProviders();
        if (inner != null) {
            return new ServiceProviderResponseListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ConnectionSetting> listWithSecretsWithResponse(String resourceGroupName, String resourceName,
        String connectionName, Context context) {
        Response<ConnectionSettingInner> inner = this.serviceClient()
            .listWithSecretsWithResponse(resourceGroupName, resourceName, connectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ConnectionSettingImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ConnectionSetting listWithSecrets(String resourceGroupName, String resourceName, String connectionName) {
        ConnectionSettingInner inner
            = this.serviceClient().listWithSecrets(resourceGroupName, resourceName, connectionName);
        if (inner != null) {
            return new ConnectionSettingImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ConnectionSetting> getWithResponse(String resourceGroupName, String resourceName,
        String connectionName, Context context) {
        Response<ConnectionSettingInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, resourceName, connectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ConnectionSettingImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ConnectionSetting get(String resourceGroupName, String resourceName, String connectionName) {
        ConnectionSettingInner inner = this.serviceClient().get(resourceGroupName, resourceName, connectionName);
        if (inner != null) {
            return new ConnectionSettingImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String resourceName, String connectionName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, resourceName, connectionName, context);
    }

    public void delete(String resourceGroupName, String resourceName, String connectionName) {
        this.serviceClient().delete(resourceGroupName, resourceName, connectionName);
    }

    public PagedIterable<ConnectionSetting> listByBotService(String resourceGroupName, String resourceName) {
        PagedIterable<ConnectionSettingInner> inner
            = this.serviceClient().listByBotService(resourceGroupName, resourceName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ConnectionSettingImpl(inner1, this.manager()));
    }

    public PagedIterable<ConnectionSetting> listByBotService(String resourceGroupName, String resourceName,
        Context context) {
        PagedIterable<ConnectionSettingInner> inner
            = this.serviceClient().listByBotService(resourceGroupName, resourceName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ConnectionSettingImpl(inner1, this.manager()));
    }

    public ConnectionSetting getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = ResourceManagerUtils.getValueFromIdByName(id, "botServices");
        if (resourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'botServices'.", id)));
        }
        String connectionName = ResourceManagerUtils.getValueFromIdByName(id, "connections");
        if (connectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'connections'.", id)));
        }
        return this.getWithResponse(resourceGroupName, resourceName, connectionName, Context.NONE).getValue();
    }

    public Response<ConnectionSetting> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = ResourceManagerUtils.getValueFromIdByName(id, "botServices");
        if (resourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'botServices'.", id)));
        }
        String connectionName = ResourceManagerUtils.getValueFromIdByName(id, "connections");
        if (connectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'connections'.", id)));
        }
        return this.getWithResponse(resourceGroupName, resourceName, connectionName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = ResourceManagerUtils.getValueFromIdByName(id, "botServices");
        if (resourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'botServices'.", id)));
        }
        String connectionName = ResourceManagerUtils.getValueFromIdByName(id, "connections");
        if (connectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'connections'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, resourceName, connectionName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = ResourceManagerUtils.getValueFromIdByName(id, "botServices");
        if (resourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'botServices'.", id)));
        }
        String connectionName = ResourceManagerUtils.getValueFromIdByName(id, "connections");
        if (connectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'connections'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, resourceName, connectionName, context);
    }

    private BotConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.botservice.BotServiceManager manager() {
        return this.serviceManager;
    }

    public ConnectionSettingImpl define(String name) {
        return new ConnectionSettingImpl(name, this.manager());
    }
}
