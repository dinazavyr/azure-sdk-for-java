// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.resourcemanager.loganalytics.fluent.models.IntelligencePackInner;
import com.azure.resourcemanager.loganalytics.models.IntelligencePack;

public final class IntelligencePackImpl implements IntelligencePack {
    private IntelligencePackInner innerObject;

    private final com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager;

    IntelligencePackImpl(IntelligencePackInner innerObject,
        com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public Boolean enabled() {
        return this.innerModel().enabled();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public IntelligencePackInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager() {
        return this.serviceManager;
    }
}
