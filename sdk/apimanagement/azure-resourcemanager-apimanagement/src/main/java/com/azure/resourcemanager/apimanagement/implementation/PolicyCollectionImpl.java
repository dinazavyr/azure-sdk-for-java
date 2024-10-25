// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.resourcemanager.apimanagement.fluent.models.PolicyCollectionInner;
import com.azure.resourcemanager.apimanagement.fluent.models.PolicyContractInner;
import com.azure.resourcemanager.apimanagement.models.PolicyCollection;
import com.azure.resourcemanager.apimanagement.models.PolicyContract;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class PolicyCollectionImpl implements PolicyCollection {
    private PolicyCollectionInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    PolicyCollectionImpl(PolicyCollectionInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<PolicyContract> value() {
        List<PolicyContractInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new PolicyContractImpl(inner1, this.manager()))
                .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Long count() {
        return this.innerModel().count();
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public PolicyCollectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
