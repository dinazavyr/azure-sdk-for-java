// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databricks.models.PrivateEndpointConnectionProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The private endpoint connection of a workspace. */
@Fluent
public final class PrivateEndpointConnectionInner extends ProxyResource {
    /*
     * The private endpoint connection properties.
     */
    @JsonProperty(value = "properties", required = true)
    private PrivateEndpointConnectionProperties properties;

    /** Creates an instance of PrivateEndpointConnectionInner class. */
    public PrivateEndpointConnectionInner() {
    }

    /**
     * Get the properties property: The private endpoint connection properties.
     *
     * @return the properties value.
     */
    public PrivateEndpointConnectionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The private endpoint connection properties.
     *
     * @param properties the properties value to set.
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withProperties(PrivateEndpointConnectionProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property properties in model PrivateEndpointConnectionInner"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PrivateEndpointConnectionInner.class);
}
