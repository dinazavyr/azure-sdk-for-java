// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.SecurityMLAnalyticsSettingsClient;
import com.azure.resourcemanager.securityinsights.fluent.models.SecurityMLAnalyticsSettingInner;
import com.azure.resourcemanager.securityinsights.models.SecurityMLAnalyticsSetting;
import com.azure.resourcemanager.securityinsights.models.SecurityMLAnalyticsSettings;

public final class SecurityMLAnalyticsSettingsImpl implements SecurityMLAnalyticsSettings {
    private static final ClientLogger LOGGER = new ClientLogger(SecurityMLAnalyticsSettingsImpl.class);

    private final SecurityMLAnalyticsSettingsClient innerClient;

    private final com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager;

    public SecurityMLAnalyticsSettingsImpl(SecurityMLAnalyticsSettingsClient innerClient,
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SecurityMLAnalyticsSetting> list(String resourceGroupName, String workspaceName) {
        PagedIterable<SecurityMLAnalyticsSettingInner> inner
            = this.serviceClient().list(resourceGroupName, workspaceName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new SecurityMLAnalyticsSettingImpl(inner1, this.manager()));
    }

    public PagedIterable<SecurityMLAnalyticsSetting> list(String resourceGroupName, String workspaceName,
        Context context) {
        PagedIterable<SecurityMLAnalyticsSettingInner> inner
            = this.serviceClient().list(resourceGroupName, workspaceName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new SecurityMLAnalyticsSettingImpl(inner1, this.manager()));
    }

    public Response<SecurityMLAnalyticsSetting> getWithResponse(String resourceGroupName, String workspaceName,
        String settingsResourceName, Context context) {
        Response<SecurityMLAnalyticsSettingInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, workspaceName, settingsResourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SecurityMLAnalyticsSettingImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SecurityMLAnalyticsSetting get(String resourceGroupName, String workspaceName, String settingsResourceName) {
        SecurityMLAnalyticsSettingInner inner
            = this.serviceClient().get(resourceGroupName, workspaceName, settingsResourceName);
        if (inner != null) {
            return new SecurityMLAnalyticsSettingImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SecurityMLAnalyticsSetting> createOrUpdateWithResponse(String resourceGroupName,
        String workspaceName, String settingsResourceName, SecurityMLAnalyticsSettingInner securityMLAnalyticsSetting,
        Context context) {
        Response<SecurityMLAnalyticsSettingInner> inner = this.serviceClient()
            .createOrUpdateWithResponse(resourceGroupName, workspaceName, settingsResourceName,
                securityMLAnalyticsSetting, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SecurityMLAnalyticsSettingImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SecurityMLAnalyticsSetting createOrUpdate(String resourceGroupName, String workspaceName,
        String settingsResourceName, SecurityMLAnalyticsSettingInner securityMLAnalyticsSetting) {
        SecurityMLAnalyticsSettingInner inner = this.serviceClient()
            .createOrUpdate(resourceGroupName, workspaceName, settingsResourceName, securityMLAnalyticsSetting);
        if (inner != null) {
            return new SecurityMLAnalyticsSettingImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String workspaceName,
        String settingsResourceName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, workspaceName, settingsResourceName, context);
    }

    public void delete(String resourceGroupName, String workspaceName, String settingsResourceName) {
        this.serviceClient().delete(resourceGroupName, workspaceName, settingsResourceName);
    }

    private SecurityMLAnalyticsSettingsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager() {
        return this.serviceManager;
    }
}
