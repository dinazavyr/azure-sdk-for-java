// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.AccessControlListPatchProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The Access Control Lists patch resource definition. */
@Fluent
public final class AccessControlListPatch extends TagsUpdate {
    /*
     * Access Control Lists patch properties.
     */
    @JsonProperty(value = "properties")
    private AccessControlListPatchProperties innerProperties;

    /** Creates an instance of AccessControlListPatch class. */
    public AccessControlListPatch() {
    }

    /**
     * Get the innerProperties property: Access Control Lists patch properties.
     *
     * @return the innerProperties value.
     */
    private AccessControlListPatchProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public AccessControlListPatch withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the annotation property: Switch configuration description.
     *
     * @return the annotation value.
     */
    public String annotation() {
        return this.innerProperties() == null ? null : this.innerProperties().annotation();
    }

    /**
     * Set the annotation property: Switch configuration description.
     *
     * @param annotation the annotation value to set.
     * @return the AccessControlListPatch object itself.
     */
    public AccessControlListPatch withAnnotation(String annotation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessControlListPatchProperties();
        }
        this.innerProperties().withAnnotation(annotation);
        return this;
    }

    /**
     * Get the configurationType property: Input method to configure Access Control List.
     *
     * @return the configurationType value.
     */
    public ConfigurationType configurationType() {
        return this.innerProperties() == null ? null : this.innerProperties().configurationType();
    }

    /**
     * Set the configurationType property: Input method to configure Access Control List.
     *
     * @param configurationType the configurationType value to set.
     * @return the AccessControlListPatch object itself.
     */
    public AccessControlListPatch withConfigurationType(ConfigurationType configurationType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessControlListPatchProperties();
        }
        this.innerProperties().withConfigurationType(configurationType);
        return this;
    }

    /**
     * Get the aclsUrl property: Access Control List file URL.
     *
     * @return the aclsUrl value.
     */
    public String aclsUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().aclsUrl();
    }

    /**
     * Set the aclsUrl property: Access Control List file URL.
     *
     * @param aclsUrl the aclsUrl value to set.
     * @return the AccessControlListPatch object itself.
     */
    public AccessControlListPatch withAclsUrl(String aclsUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessControlListPatchProperties();
        }
        this.innerProperties().withAclsUrl(aclsUrl);
        return this;
    }

    /**
     * Get the matchConfigurations property: List of match configurations.
     *
     * @return the matchConfigurations value.
     */
    public List<AccessControlListMatchConfiguration> matchConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().matchConfigurations();
    }

    /**
     * Set the matchConfigurations property: List of match configurations.
     *
     * @param matchConfigurations the matchConfigurations value to set.
     * @return the AccessControlListPatch object itself.
     */
    public AccessControlListPatch
        withMatchConfigurations(List<AccessControlListMatchConfiguration> matchConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessControlListPatchProperties();
        }
        this.innerProperties().withMatchConfigurations(matchConfigurations);
        return this;
    }

    /**
     * Get the dynamicMatchConfigurations property: List of dynamic match configurations.
     *
     * @return the dynamicMatchConfigurations value.
     */
    public List<CommonDynamicMatchConfiguration> dynamicMatchConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().dynamicMatchConfigurations();
    }

    /**
     * Set the dynamicMatchConfigurations property: List of dynamic match configurations.
     *
     * @param dynamicMatchConfigurations the dynamicMatchConfigurations value to set.
     * @return the AccessControlListPatch object itself.
     */
    public AccessControlListPatch
        withDynamicMatchConfigurations(List<CommonDynamicMatchConfiguration> dynamicMatchConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessControlListPatchProperties();
        }
        this.innerProperties().withDynamicMatchConfigurations(dynamicMatchConfigurations);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
