// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.WorkflowModelProperties;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.WorkflowModelSystemData;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Workflow model. */
@Fluent
public final class WorkflowModelInner extends ProxyResource {
    /*
     * Workflow model properties.
     */
    @JsonProperty(value = "properties", required = true)
    private WorkflowModelProperties properties;

    /*
     * The systemData property.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private WorkflowModelSystemData systemData;

    /** Creates an instance of WorkflowModelInner class. */
    public WorkflowModelInner() {
    }

    /**
     * Get the properties property: Workflow model properties.
     *
     * @return the properties value.
     */
    public WorkflowModelProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Workflow model properties.
     *
     * @param properties the properties value to set.
     * @return the WorkflowModelInner object itself.
     */
    public WorkflowModelInner withProperties(WorkflowModelProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: The systemData property.
     *
     * @return the systemData value.
     */
    public WorkflowModelSystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property properties in model WorkflowModelInner"));
        } else {
            properties().validate();
        }
        if (systemData() != null) {
            systemData().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WorkflowModelInner.class);
}
