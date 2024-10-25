// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managedapplications.models.ApplicationClientDetails;
import com.azure.resourcemanager.managedapplications.models.JitAuthorizationPolicies;
import com.azure.resourcemanager.managedapplications.models.JitRequestState;
import com.azure.resourcemanager.managedapplications.models.JitSchedulingPolicy;
import com.azure.resourcemanager.managedapplications.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about JIT request properties. */
@Fluent
public final class JitRequestProperties {
    /*
     * The parent application id.
     */
    @JsonProperty(value = "applicationResourceId", required = true)
    private String applicationResourceId;

    /*
     * The publisher tenant id.
     */
    @JsonProperty(value = "publisherTenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String publisherTenantId;

    /*
     * The JIT authorization policies.
     */
    @JsonProperty(value = "jitAuthorizationPolicies", required = true)
    private List<JitAuthorizationPolicies> jitAuthorizationPolicies;

    /*
     * The JIT request properties.
     */
    @JsonProperty(value = "jitSchedulingPolicy", required = true)
    private JitSchedulingPolicy jitSchedulingPolicy;

    /*
     * The JIT request provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The JIT request state.
     */
    @JsonProperty(value = "jitRequestState", access = JsonProperty.Access.WRITE_ONLY)
    private JitRequestState jitRequestState;

    /*
     * The client entity that created the JIT request.
     */
    @JsonProperty(value = "createdBy", access = JsonProperty.Access.WRITE_ONLY)
    private ApplicationClientDetails createdBy;

    /*
     * The client entity that last updated the JIT request.
     */
    @JsonProperty(value = "updatedBy", access = JsonProperty.Access.WRITE_ONLY)
    private ApplicationClientDetails updatedBy;

    /** Creates an instance of JitRequestProperties class. */
    public JitRequestProperties() {
    }

    /**
     * Get the applicationResourceId property: The parent application id.
     *
     * @return the applicationResourceId value.
     */
    public String applicationResourceId() {
        return this.applicationResourceId;
    }

    /**
     * Set the applicationResourceId property: The parent application id.
     *
     * @param applicationResourceId the applicationResourceId value to set.
     * @return the JitRequestProperties object itself.
     */
    public JitRequestProperties withApplicationResourceId(String applicationResourceId) {
        this.applicationResourceId = applicationResourceId;
        return this;
    }

    /**
     * Get the publisherTenantId property: The publisher tenant id.
     *
     * @return the publisherTenantId value.
     */
    public String publisherTenantId() {
        return this.publisherTenantId;
    }

    /**
     * Get the jitAuthorizationPolicies property: The JIT authorization policies.
     *
     * @return the jitAuthorizationPolicies value.
     */
    public List<JitAuthorizationPolicies> jitAuthorizationPolicies() {
        return this.jitAuthorizationPolicies;
    }

    /**
     * Set the jitAuthorizationPolicies property: The JIT authorization policies.
     *
     * @param jitAuthorizationPolicies the jitAuthorizationPolicies value to set.
     * @return the JitRequestProperties object itself.
     */
    public JitRequestProperties withJitAuthorizationPolicies(List<JitAuthorizationPolicies> jitAuthorizationPolicies) {
        this.jitAuthorizationPolicies = jitAuthorizationPolicies;
        return this;
    }

    /**
     * Get the jitSchedulingPolicy property: The JIT request properties.
     *
     * @return the jitSchedulingPolicy value.
     */
    public JitSchedulingPolicy jitSchedulingPolicy() {
        return this.jitSchedulingPolicy;
    }

    /**
     * Set the jitSchedulingPolicy property: The JIT request properties.
     *
     * @param jitSchedulingPolicy the jitSchedulingPolicy value to set.
     * @return the JitRequestProperties object itself.
     */
    public JitRequestProperties withJitSchedulingPolicy(JitSchedulingPolicy jitSchedulingPolicy) {
        this.jitSchedulingPolicy = jitSchedulingPolicy;
        return this;
    }

    /**
     * Get the provisioningState property: The JIT request provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the jitRequestState property: The JIT request state.
     *
     * @return the jitRequestState value.
     */
    public JitRequestState jitRequestState() {
        return this.jitRequestState;
    }

    /**
     * Get the createdBy property: The client entity that created the JIT request.
     *
     * @return the createdBy value.
     */
    public ApplicationClientDetails createdBy() {
        return this.createdBy;
    }

    /**
     * Get the updatedBy property: The client entity that last updated the JIT request.
     *
     * @return the updatedBy value.
     */
    public ApplicationClientDetails updatedBy() {
        return this.updatedBy;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (applicationResourceId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property applicationResourceId in model JitRequestProperties"));
        }
        if (jitAuthorizationPolicies() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property jitAuthorizationPolicies in model JitRequestProperties"));
        } else {
            jitAuthorizationPolicies().forEach(e -> e.validate());
        }
        if (jitSchedulingPolicy() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property jitSchedulingPolicy in model JitRequestProperties"));
        } else {
            jitSchedulingPolicy().validate();
        }
        if (createdBy() != null) {
            createdBy().validate();
        }
        if (updatedBy() != null) {
            updatedBy().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(JitRequestProperties.class);
}
