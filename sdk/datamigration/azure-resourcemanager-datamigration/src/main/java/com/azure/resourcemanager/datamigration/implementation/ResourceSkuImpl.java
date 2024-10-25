// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.implementation;

import com.azure.resourcemanager.datamigration.fluent.models.ResourceSkuInner;
import com.azure.resourcemanager.datamigration.models.ResourceSku;
import com.azure.resourcemanager.datamigration.models.ResourceSkuCapabilities;
import com.azure.resourcemanager.datamigration.models.ResourceSkuCapacity;
import com.azure.resourcemanager.datamigration.models.ResourceSkuCosts;
import com.azure.resourcemanager.datamigration.models.ResourceSkuRestrictions;
import java.util.Collections;
import java.util.List;

public final class ResourceSkuImpl implements ResourceSku {
    private ResourceSkuInner innerObject;

    private final com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager;

    ResourceSkuImpl(ResourceSkuInner innerObject,
        com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String resourceType() {
        return this.innerModel().resourceType();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String tier() {
        return this.innerModel().tier();
    }

    public String size() {
        return this.innerModel().size();
    }

    public String family() {
        return this.innerModel().family();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public ResourceSkuCapacity capacity() {
        return this.innerModel().capacity();
    }

    public List<String> locations() {
        List<String> inner = this.innerModel().locations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> apiVersions() {
        List<String> inner = this.innerModel().apiVersions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ResourceSkuCosts> costs() {
        List<ResourceSkuCosts> inner = this.innerModel().costs();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ResourceSkuCapabilities> capabilities() {
        List<ResourceSkuCapabilities> inner = this.innerModel().capabilities();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ResourceSkuRestrictions> restrictions() {
        List<ResourceSkuRestrictions> inner = this.innerModel().restrictions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ResourceSkuInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datamigration.DataMigrationManager manager() {
        return this.serviceManager;
    }
}
