// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.implementation;

import com.azure.resourcemanager.costmanagement.fluent.models.ExportInner;
import com.azure.resourcemanager.costmanagement.fluent.models.ExportListResultInner;
import com.azure.resourcemanager.costmanagement.models.Export;
import com.azure.resourcemanager.costmanagement.models.ExportListResult;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ExportListResultImpl implements ExportListResult {
    private ExportListResultInner innerObject;

    private final com.azure.resourcemanager.costmanagement.CostManagementManager serviceManager;

    ExportListResultImpl(ExportListResultInner innerObject,
        com.azure.resourcemanager.costmanagement.CostManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<Export> value() {
        List<ExportInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(
                inner.stream().map(inner1 -> new ExportImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public ExportListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.costmanagement.CostManagementManager manager() {
        return this.serviceManager;
    }
}
