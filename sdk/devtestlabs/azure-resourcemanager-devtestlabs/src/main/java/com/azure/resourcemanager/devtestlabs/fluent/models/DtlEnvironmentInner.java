// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devtestlabs.models.EnvironmentDeploymentProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** An environment, which is essentially an ARM template deployment. */
@Fluent
public final class DtlEnvironmentInner extends Resource {
    /*
     * The properties of the resource.
     */
    @JsonProperty(value = "properties", required = true)
    private EnvironmentProperties innerProperties = new EnvironmentProperties();

    /** Creates an instance of DtlEnvironmentInner class. */
    public DtlEnvironmentInner() {
    }

    /**
     * Get the innerProperties property: The properties of the resource.
     *
     * @return the innerProperties value.
     */
    private EnvironmentProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public DtlEnvironmentInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DtlEnvironmentInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the deploymentProperties property: The deployment properties of the environment.
     *
     * @return the deploymentProperties value.
     */
    public EnvironmentDeploymentProperties deploymentProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().deploymentProperties();
    }

    /**
     * Set the deploymentProperties property: The deployment properties of the environment.
     *
     * @param deploymentProperties the deploymentProperties value to set.
     * @return the DtlEnvironmentInner object itself.
     */
    public DtlEnvironmentInner withDeploymentProperties(EnvironmentDeploymentProperties deploymentProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EnvironmentProperties();
        }
        this.innerProperties().withDeploymentProperties(deploymentProperties);
        return this;
    }

    /**
     * Get the armTemplateDisplayName property: The display name of the Azure Resource Manager template that produced
     * the environment.
     *
     * @return the armTemplateDisplayName value.
     */
    public String armTemplateDisplayName() {
        return this.innerProperties() == null ? null : this.innerProperties().armTemplateDisplayName();
    }

    /**
     * Set the armTemplateDisplayName property: The display name of the Azure Resource Manager template that produced
     * the environment.
     *
     * @param armTemplateDisplayName the armTemplateDisplayName value to set.
     * @return the DtlEnvironmentInner object itself.
     */
    public DtlEnvironmentInner withArmTemplateDisplayName(String armTemplateDisplayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EnvironmentProperties();
        }
        this.innerProperties().withArmTemplateDisplayName(armTemplateDisplayName);
        return this;
    }

    /**
     * Get the resourceGroupId property: The identifier of the resource group containing the environment's resources.
     *
     * @return the resourceGroupId value.
     */
    public String resourceGroupId() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGroupId();
    }

    /**
     * Get the createdByUser property: The creator of the environment.
     *
     * @return the createdByUser value.
     */
    public String createdByUser() {
        return this.innerProperties() == null ? null : this.innerProperties().createdByUser();
    }

    /**
     * Get the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    public String uniqueIdentifier() {
        return this.innerProperties() == null ? null : this.innerProperties().uniqueIdentifier();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property innerProperties in model DtlEnvironmentInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DtlEnvironmentInner.class);
}
