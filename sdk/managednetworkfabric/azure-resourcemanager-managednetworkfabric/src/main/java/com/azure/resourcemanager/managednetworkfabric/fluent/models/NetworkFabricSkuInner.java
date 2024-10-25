// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.models.FabricSkuType;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Network Fabric SKU resource definition. */
@Fluent
public final class NetworkFabricSkuInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties", required = true)
    private NetworkFabricSkuProperties innerProperties = new NetworkFabricSkuProperties();

    /** Creates an instance of NetworkFabricSkuInner class. */
    public NetworkFabricSkuInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private NetworkFabricSkuProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: Type of Network Fabric SKU.
     *
     * @return the type value.
     */
    public FabricSkuType typePropertiesType() {
        return this.innerProperties() == null ? null : this.innerProperties().type();
    }

    /**
     * Get the maxComputeRacks property: Maximum number of compute racks available for this Network Fabric SKU. The
     * value of max count racks is 4 for 4 rack SKU and 8 for 8 rack SKU.
     *
     * @return the maxComputeRacks value.
     */
    public Integer maxComputeRacks() {
        return this.innerProperties() == null ? null : this.innerProperties().maxComputeRacks();
    }

    /**
     * Set the maxComputeRacks property: Maximum number of compute racks available for this Network Fabric SKU. The
     * value of max count racks is 4 for 4 rack SKU and 8 for 8 rack SKU.
     *
     * @param maxComputeRacks the maxComputeRacks value to set.
     * @return the NetworkFabricSkuInner object itself.
     */
    public NetworkFabricSkuInner withMaxComputeRacks(Integer maxComputeRacks) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkFabricSkuProperties();
        }
        this.innerProperties().withMaxComputeRacks(maxComputeRacks);
        return this;
    }

    /**
     * Get the maximumServerCount property: Maximum number of servers available for this Network Fabric SKU.
     *
     * @return the maximumServerCount value.
     */
    public Integer maximumServerCount() {
        return this.innerProperties() == null ? null : this.innerProperties().maximumServerCount();
    }

    /**
     * Set the maximumServerCount property: Maximum number of servers available for this Network Fabric SKU.
     *
     * @param maximumServerCount the maximumServerCount value to set.
     * @return the NetworkFabricSkuInner object itself.
     */
    public NetworkFabricSkuInner withMaximumServerCount(Integer maximumServerCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkFabricSkuProperties();
        }
        this.innerProperties().withMaximumServerCount(maximumServerCount);
        return this;
    }

    /**
     * Get the supportedVersions property: List of supported Network Fabric SKU versions.
     *
     * @return the supportedVersions value.
     */
    public List<String> supportedVersions() {
        return this.innerProperties() == null ? null : this.innerProperties().supportedVersions();
    }

    /**
     * Get the details property: URL providing detailed configuration of the fabric SKU.
     *
     * @return the details value.
     */
    public String details() {
        return this.innerProperties() == null ? null : this.innerProperties().details();
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerProperties in model NetworkFabricSkuInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetworkFabricSkuInner.class);
}
