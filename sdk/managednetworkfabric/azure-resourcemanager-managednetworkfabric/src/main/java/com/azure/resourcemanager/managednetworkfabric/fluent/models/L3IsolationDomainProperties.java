// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.models.AdministrativeState;
import com.azure.resourcemanager.managednetworkfabric.models.AggregateRouteConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.AnnotationResource;
import com.azure.resourcemanager.managednetworkfabric.models.ConfigurationState;
import com.azure.resourcemanager.managednetworkfabric.models.ConnectedSubnetRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import com.azure.resourcemanager.managednetworkfabric.models.RedistributeConnectedSubnets;
import com.azure.resourcemanager.managednetworkfabric.models.RedistributeStaticRoutes;
import com.fasterxml.jackson.annotation.JsonProperty;

/** L3 Isolation Domain Properties defines the properties of the resource. */
@Fluent
public final class L3IsolationDomainProperties extends AnnotationResource {
    /*
     * ARM Resource ID of the Network Fabric.
     */
    @JsonProperty(value = "networkFabricId", required = true)
    private String networkFabricId;

    /*
     * Configuration state of the resource.
     */
    @JsonProperty(value = "configurationState", access = JsonProperty.Access.WRITE_ONLY)
    private ConfigurationState configurationState;

    /*
     * Provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Administrative state of the resource.
     */
    @JsonProperty(value = "administrativeState", access = JsonProperty.Access.WRITE_ONLY)
    private AdministrativeState administrativeState;

    /*
     * Advertise Connected Subnets. Ex: "True" | "False".
     */
    @JsonProperty(value = "redistributeConnectedSubnets")
    private RedistributeConnectedSubnets redistributeConnectedSubnets;

    /*
     * Advertise Static Routes. Ex: "True" | "False".
     */
    @JsonProperty(value = "redistributeStaticRoutes")
    private RedistributeStaticRoutes redistributeStaticRoutes;

    /*
     * Aggregate route configurations.
     */
    @JsonProperty(value = "aggregateRouteConfiguration")
    private AggregateRouteConfiguration aggregateRouteConfiguration;

    /*
     * Connected Subnet RoutePolicy
     */
    @JsonProperty(value = "connectedSubnetRoutePolicy")
    private ConnectedSubnetRoutePolicy connectedSubnetRoutePolicy;

    /** Creates an instance of L3IsolationDomainProperties class. */
    public L3IsolationDomainProperties() {
    }

    /**
     * Get the networkFabricId property: ARM Resource ID of the Network Fabric.
     *
     * @return the networkFabricId value.
     */
    public String networkFabricId() {
        return this.networkFabricId;
    }

    /**
     * Set the networkFabricId property: ARM Resource ID of the Network Fabric.
     *
     * @param networkFabricId the networkFabricId value to set.
     * @return the L3IsolationDomainProperties object itself.
     */
    public L3IsolationDomainProperties withNetworkFabricId(String networkFabricId) {
        this.networkFabricId = networkFabricId;
        return this;
    }

    /**
     * Get the configurationState property: Configuration state of the resource.
     *
     * @return the configurationState value.
     */
    public ConfigurationState configurationState() {
        return this.configurationState;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the administrativeState property: Administrative state of the resource.
     *
     * @return the administrativeState value.
     */
    public AdministrativeState administrativeState() {
        return this.administrativeState;
    }

    /**
     * Get the redistributeConnectedSubnets property: Advertise Connected Subnets. Ex: "True" | "False".
     *
     * @return the redistributeConnectedSubnets value.
     */
    public RedistributeConnectedSubnets redistributeConnectedSubnets() {
        return this.redistributeConnectedSubnets;
    }

    /**
     * Set the redistributeConnectedSubnets property: Advertise Connected Subnets. Ex: "True" | "False".
     *
     * @param redistributeConnectedSubnets the redistributeConnectedSubnets value to set.
     * @return the L3IsolationDomainProperties object itself.
     */
    public L3IsolationDomainProperties
        withRedistributeConnectedSubnets(RedistributeConnectedSubnets redistributeConnectedSubnets) {
        this.redistributeConnectedSubnets = redistributeConnectedSubnets;
        return this;
    }

    /**
     * Get the redistributeStaticRoutes property: Advertise Static Routes. Ex: "True" | "False".
     *
     * @return the redistributeStaticRoutes value.
     */
    public RedistributeStaticRoutes redistributeStaticRoutes() {
        return this.redistributeStaticRoutes;
    }

    /**
     * Set the redistributeStaticRoutes property: Advertise Static Routes. Ex: "True" | "False".
     *
     * @param redistributeStaticRoutes the redistributeStaticRoutes value to set.
     * @return the L3IsolationDomainProperties object itself.
     */
    public L3IsolationDomainProperties withRedistributeStaticRoutes(RedistributeStaticRoutes redistributeStaticRoutes) {
        this.redistributeStaticRoutes = redistributeStaticRoutes;
        return this;
    }

    /**
     * Get the aggregateRouteConfiguration property: Aggregate route configurations.
     *
     * @return the aggregateRouteConfiguration value.
     */
    public AggregateRouteConfiguration aggregateRouteConfiguration() {
        return this.aggregateRouteConfiguration;
    }

    /**
     * Set the aggregateRouteConfiguration property: Aggregate route configurations.
     *
     * @param aggregateRouteConfiguration the aggregateRouteConfiguration value to set.
     * @return the L3IsolationDomainProperties object itself.
     */
    public L3IsolationDomainProperties
        withAggregateRouteConfiguration(AggregateRouteConfiguration aggregateRouteConfiguration) {
        this.aggregateRouteConfiguration = aggregateRouteConfiguration;
        return this;
    }

    /**
     * Get the connectedSubnetRoutePolicy property: Connected Subnet RoutePolicy.
     *
     * @return the connectedSubnetRoutePolicy value.
     */
    public ConnectedSubnetRoutePolicy connectedSubnetRoutePolicy() {
        return this.connectedSubnetRoutePolicy;
    }

    /**
     * Set the connectedSubnetRoutePolicy property: Connected Subnet RoutePolicy.
     *
     * @param connectedSubnetRoutePolicy the connectedSubnetRoutePolicy value to set.
     * @return the L3IsolationDomainProperties object itself.
     */
    public L3IsolationDomainProperties
        withConnectedSubnetRoutePolicy(ConnectedSubnetRoutePolicy connectedSubnetRoutePolicy) {
        this.connectedSubnetRoutePolicy = connectedSubnetRoutePolicy;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public L3IsolationDomainProperties withAnnotation(String annotation) {
        super.withAnnotation(annotation);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (networkFabricId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property networkFabricId in model L3IsolationDomainProperties"));
        }
        if (aggregateRouteConfiguration() != null) {
            aggregateRouteConfiguration().validate();
        }
        if (connectedSubnetRoutePolicy() != null) {
            connectedSubnetRoutePolicy().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(L3IsolationDomainProperties.class);
}
