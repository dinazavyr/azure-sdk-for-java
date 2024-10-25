// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** AzStackHCI fabric model custom properties. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("AzStackHCI")
@Fluent
public final class AzStackHciFabricModelCustomProperties extends FabricModelCustomProperties {
    /*
     * Gets or sets the ARM Id of the AzStackHCI site.
     */
    @JsonProperty(value = "azStackHciSiteId", required = true)
    private String azStackHciSiteId;

    /*
     * Gets or sets the Appliance name.
     */
    @JsonProperty(value = "applianceName", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> applianceName;

    /*
     * AzStackHCI cluster properties.
     */
    @JsonProperty(value = "cluster", required = true)
    private AzStackHciClusterProperties cluster;

    /*
     * Gets or sets the fabric resource Id.
     */
    @JsonProperty(value = "fabricResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String fabricResourceId;

    /*
     * Gets or sets the fabric container Id.
     */
    @JsonProperty(value = "fabricContainerId", access = JsonProperty.Access.WRITE_ONLY)
    private String fabricContainerId;

    /*
     * Gets or sets the Migration solution ARM Id.
     */
    @JsonProperty(value = "migrationSolutionId", required = true)
    private String migrationSolutionId;

    /*
     * Gets or sets the migration hub Uri.
     */
    @JsonProperty(value = "migrationHubUri", access = JsonProperty.Access.WRITE_ONLY)
    private String migrationHubUri;

    /** Creates an instance of AzStackHciFabricModelCustomProperties class. */
    public AzStackHciFabricModelCustomProperties() {
    }

    /**
     * Get the azStackHciSiteId property: Gets or sets the ARM Id of the AzStackHCI site.
     *
     * @return the azStackHciSiteId value.
     */
    public String azStackHciSiteId() {
        return this.azStackHciSiteId;
    }

    /**
     * Set the azStackHciSiteId property: Gets or sets the ARM Id of the AzStackHCI site.
     *
     * @param azStackHciSiteId the azStackHciSiteId value to set.
     * @return the AzStackHciFabricModelCustomProperties object itself.
     */
    public AzStackHciFabricModelCustomProperties withAzStackHciSiteId(String azStackHciSiteId) {
        this.azStackHciSiteId = azStackHciSiteId;
        return this;
    }

    /**
     * Get the applianceName property: Gets or sets the Appliance name.
     *
     * @return the applianceName value.
     */
    public List<String> applianceName() {
        return this.applianceName;
    }

    /**
     * Get the cluster property: AzStackHCI cluster properties.
     *
     * @return the cluster value.
     */
    public AzStackHciClusterProperties cluster() {
        return this.cluster;
    }

    /**
     * Set the cluster property: AzStackHCI cluster properties.
     *
     * @param cluster the cluster value to set.
     * @return the AzStackHciFabricModelCustomProperties object itself.
     */
    public AzStackHciFabricModelCustomProperties withCluster(AzStackHciClusterProperties cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * Get the fabricResourceId property: Gets or sets the fabric resource Id.
     *
     * @return the fabricResourceId value.
     */
    public String fabricResourceId() {
        return this.fabricResourceId;
    }

    /**
     * Get the fabricContainerId property: Gets or sets the fabric container Id.
     *
     * @return the fabricContainerId value.
     */
    public String fabricContainerId() {
        return this.fabricContainerId;
    }

    /**
     * Get the migrationSolutionId property: Gets or sets the Migration solution ARM Id.
     *
     * @return the migrationSolutionId value.
     */
    public String migrationSolutionId() {
        return this.migrationSolutionId;
    }

    /**
     * Set the migrationSolutionId property: Gets or sets the Migration solution ARM Id.
     *
     * @param migrationSolutionId the migrationSolutionId value to set.
     * @return the AzStackHciFabricModelCustomProperties object itself.
     */
    public AzStackHciFabricModelCustomProperties withMigrationSolutionId(String migrationSolutionId) {
        this.migrationSolutionId = migrationSolutionId;
        return this;
    }

    /**
     * Get the migrationHubUri property: Gets or sets the migration hub Uri.
     *
     * @return the migrationHubUri value.
     */
    public String migrationHubUri() {
        return this.migrationHubUri;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (azStackHciSiteId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property azStackHciSiteId in model AzStackHciFabricModelCustomProperties"));
        }
        if (cluster() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property cluster in model AzStackHciFabricModelCustomProperties"));
        } else {
            cluster().validate();
        }
        if (migrationSolutionId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property migrationSolutionId in model" + " AzStackHciFabricModelCustomProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzStackHciFabricModelCustomProperties.class);
}
