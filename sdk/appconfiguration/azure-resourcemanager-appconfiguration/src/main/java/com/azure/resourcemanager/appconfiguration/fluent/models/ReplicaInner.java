// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appconfiguration.models.ReplicaProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The replica resource. */
@Fluent
public final class ReplicaInner extends ProxyResource {
    /*
     * The location of the replica.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Resource system metadata.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * All replica properties.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private ReplicaProperties innerProperties;

    /** Creates an instance of ReplicaInner class. */
    public ReplicaInner() {
    }

    /**
     * Get the location property: The location of the replica.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the replica.
     *
     * @param location the location value to set.
     * @return the ReplicaInner object itself.
     */
    public ReplicaInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the systemData property: Resource system metadata.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the innerProperties property: All replica properties.
     *
     * @return the innerProperties value.
     */
    private ReplicaProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the endpoint property: The URI of the replica where the replica API will be available.
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().endpoint();
    }

    /**
     * Get the provisioningState property: The provisioning state of the replica.
     *
     * @return the provisioningState value.
     */
    public ReplicaProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}