// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** AzStackHCI cluster properties. */
@Fluent
public final class AzStackHciClusterProperties {
    /*
     * Gets or sets the AzStackHCICluster FQDN name.
     */
    @JsonProperty(value = "clusterName", required = true)
    private String clusterName;

    /*
     * Gets or sets the AzStackHCICluster resource name.
     */
    @JsonProperty(value = "resourceName", required = true)
    private String resourceName;

    /*
     * Gets or sets the Storage account name.
     */
    @JsonProperty(value = "storageAccountName", required = true)
    private String storageAccountName;

    /*
     * Gets or sets the list of AzStackHCICluster Storage Container.
     */
    @JsonProperty(value = "storageContainers", required = true)
    private List<StorageContainerProperties> storageContainers;

    /** Creates an instance of AzStackHciClusterProperties class. */
    public AzStackHciClusterProperties() {
    }

    /**
     * Get the clusterName property: Gets or sets the AzStackHCICluster FQDN name.
     *
     * @return the clusterName value.
     */
    public String clusterName() {
        return this.clusterName;
    }

    /**
     * Set the clusterName property: Gets or sets the AzStackHCICluster FQDN name.
     *
     * @param clusterName the clusterName value to set.
     * @return the AzStackHciClusterProperties object itself.
     */
    public AzStackHciClusterProperties withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * Get the resourceName property: Gets or sets the AzStackHCICluster resource name.
     *
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set the resourceName property: Gets or sets the AzStackHCICluster resource name.
     *
     * @param resourceName the resourceName value to set.
     * @return the AzStackHciClusterProperties object itself.
     */
    public AzStackHciClusterProperties withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * Get the storageAccountName property: Gets or sets the Storage account name.
     *
     * @return the storageAccountName value.
     */
    public String storageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Set the storageAccountName property: Gets or sets the Storage account name.
     *
     * @param storageAccountName the storageAccountName value to set.
     * @return the AzStackHciClusterProperties object itself.
     */
    public AzStackHciClusterProperties withStorageAccountName(String storageAccountName) {
        this.storageAccountName = storageAccountName;
        return this;
    }

    /**
     * Get the storageContainers property: Gets or sets the list of AzStackHCICluster Storage Container.
     *
     * @return the storageContainers value.
     */
    public List<StorageContainerProperties> storageContainers() {
        return this.storageContainers;
    }

    /**
     * Set the storageContainers property: Gets or sets the list of AzStackHCICluster Storage Container.
     *
     * @param storageContainers the storageContainers value to set.
     * @return the AzStackHciClusterProperties object itself.
     */
    public AzStackHciClusterProperties withStorageContainers(List<StorageContainerProperties> storageContainers) {
        this.storageContainers = storageContainers;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (clusterName() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property clusterName in model AzStackHciClusterProperties"));
        }
        if (resourceName() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property resourceName in model AzStackHciClusterProperties"));
        }
        if (storageAccountName() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property storageAccountName in model AzStackHciClusterProperties"));
        }
        if (storageContainers() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property storageContainers in model AzStackHciClusterProperties"));
        } else {
            storageContainers().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzStackHciClusterProperties.class);
}
