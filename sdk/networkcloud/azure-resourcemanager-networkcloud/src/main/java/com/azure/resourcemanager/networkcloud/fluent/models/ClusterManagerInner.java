// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.networkcloud.models.ClusterAvailableVersion;
import com.azure.resourcemanager.networkcloud.models.ClusterManagerDetailedStatus;
import com.azure.resourcemanager.networkcloud.models.ClusterManagerProvisioningState;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.ManagedResourceGroupConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** ClusterManager represents a control-plane to manage one or more on-premises clusters. */
@Fluent
public final class ClusterManagerInner extends Resource {
    /*
     * ClusterManagerProperties represents the properties of a cluster manager.
     *
     * The list of the resource properties.
     */
    @JsonProperty(value = "properties", required = true)
    private ClusterManagerProperties innerProperties = new ClusterManagerProperties();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of ClusterManagerInner class. */
    public ClusterManagerInner() {
    }

    /**
     * Get the innerProperties property: ClusterManagerProperties represents the properties of a cluster manager.
     *
     * <p>The list of the resource properties.
     *
     * @return the innerProperties value.
     */
    private ClusterManagerProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterManagerInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterManagerInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the analyticsWorkspaceId property: The resource ID of the Log Analytics workspace that is used for the logs
     * collection.
     *
     * @return the analyticsWorkspaceId value.
     */
    public String analyticsWorkspaceId() {
        return this.innerProperties() == null ? null : this.innerProperties().analyticsWorkspaceId();
    }

    /**
     * Set the analyticsWorkspaceId property: The resource ID of the Log Analytics workspace that is used for the logs
     * collection.
     *
     * @param analyticsWorkspaceId the analyticsWorkspaceId value to set.
     * @return the ClusterManagerInner object itself.
     */
    public ClusterManagerInner withAnalyticsWorkspaceId(String analyticsWorkspaceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterManagerProperties();
        }
        this.innerProperties().withAnalyticsWorkspaceId(analyticsWorkspaceId);
        return this;
    }

    /**
     * Get the availabilityZones property: Field deprecated, this value will no longer influence the cluster manager
     * allocation process and will be removed in a future version. The Azure availability zones within the region that
     * will be used to support the cluster manager resource.
     *
     * @return the availabilityZones value.
     */
    public List<String> availabilityZones() {
        return this.innerProperties() == null ? null : this.innerProperties().availabilityZones();
    }

    /**
     * Set the availabilityZones property: Field deprecated, this value will no longer influence the cluster manager
     * allocation process and will be removed in a future version. The Azure availability zones within the region that
     * will be used to support the cluster manager resource.
     *
     * @param availabilityZones the availabilityZones value to set.
     * @return the ClusterManagerInner object itself.
     */
    public ClusterManagerInner withAvailabilityZones(List<String> availabilityZones) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterManagerProperties();
        }
        this.innerProperties().withAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * Get the clusterVersions property: The list of the cluster versions the manager supports. It is used as input in
     * clusterVersion property of a cluster resource.
     *
     * @return the clusterVersions value.
     */
    public List<ClusterAvailableVersion> clusterVersions() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterVersions();
    }

    /**
     * Get the detailedStatus property: The detailed status that provides additional information about the cluster
     * manager.
     *
     * @return the detailedStatus value.
     */
    public ClusterManagerDetailedStatus detailedStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().detailedStatus();
    }

    /**
     * Get the detailedStatusMessage property: The descriptive message about the current detailed status.
     *
     * @return the detailedStatusMessage value.
     */
    public String detailedStatusMessage() {
        return this.innerProperties() == null ? null : this.innerProperties().detailedStatusMessage();
    }

    /**
     * Get the fabricControllerId property: The resource ID of the fabric controller that has one to one mapping with
     * the cluster manager.
     *
     * @return the fabricControllerId value.
     */
    public String fabricControllerId() {
        return this.innerProperties() == null ? null : this.innerProperties().fabricControllerId();
    }

    /**
     * Set the fabricControllerId property: The resource ID of the fabric controller that has one to one mapping with
     * the cluster manager.
     *
     * @param fabricControllerId the fabricControllerId value to set.
     * @return the ClusterManagerInner object itself.
     */
    public ClusterManagerInner withFabricControllerId(String fabricControllerId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterManagerProperties();
        }
        this.innerProperties().withFabricControllerId(fabricControllerId);
        return this;
    }

    /**
     * Get the managedResourceGroupConfiguration property: ManagedResourceGroupConfiguration represents the
     * configuration of the resource group managed by Azure.
     *
     * <p>The configuration of the managed resource group associated with the resource.
     *
     * @return the managedResourceGroupConfiguration value.
     */
    public ManagedResourceGroupConfiguration managedResourceGroupConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().managedResourceGroupConfiguration();
    }

    /**
     * Set the managedResourceGroupConfiguration property: ManagedResourceGroupConfiguration represents the
     * configuration of the resource group managed by Azure.
     *
     * <p>The configuration of the managed resource group associated with the resource.
     *
     * @param managedResourceGroupConfiguration the managedResourceGroupConfiguration value to set.
     * @return the ClusterManagerInner object itself.
     */
    public ClusterManagerInner
        withManagedResourceGroupConfiguration(ManagedResourceGroupConfiguration managedResourceGroupConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterManagerProperties();
        }
        this.innerProperties().withManagedResourceGroupConfiguration(managedResourceGroupConfiguration);
        return this;
    }

    /**
     * Get the managerExtendedLocation property: ExtendedLocation represents the Azure custom location where the
     * resource will be created.
     *
     * <p>The extended location (custom location) that represents the cluster manager's control plane location. This
     * extended location is used when creating cluster and rack manifest resources.
     *
     * @return the managerExtendedLocation value.
     */
    public ExtendedLocation managerExtendedLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().managerExtendedLocation();
    }

    /**
     * Get the provisioningState property: The provisioning state of the cluster manager.
     *
     * @return the provisioningState value.
     */
    public ClusterManagerProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the vmSize property: Field deprecated, this value will no longer influence the cluster manager allocation
     * process and will be removed in a future version. The size of the Azure virtual machines to use for hosting the
     * cluster manager resource.
     *
     * @return the vmSize value.
     */
    public String vmSize() {
        return this.innerProperties() == null ? null : this.innerProperties().vmSize();
    }

    /**
     * Set the vmSize property: Field deprecated, this value will no longer influence the cluster manager allocation
     * process and will be removed in a future version. The size of the Azure virtual machines to use for hosting the
     * cluster manager resource.
     *
     * @param vmSize the vmSize value to set.
     * @return the ClusterManagerInner object itself.
     */
    public ClusterManagerInner withVmSize(String vmSize) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterManagerProperties();
        }
        this.innerProperties().withVmSize(vmSize);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property innerProperties in model ClusterManagerInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClusterManagerInner.class);
}
