// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.orbital.models.SpacecraftLink;
import com.azure.resourcemanager.orbital.models.SpacecraftsPropertiesProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Customer creates a spacecraft resource to schedule a contact. */
@Fluent
public final class SpacecraftInner extends Resource {
    /*
     * Spacecraft Properties
     */
    @JsonProperty(value = "properties", required = true)
    private SpacecraftsProperties innerProperties = new SpacecraftsProperties();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of SpacecraftInner class. */
    public SpacecraftInner() {
    }

    /**
     * Get the innerProperties property: Spacecraft Properties.
     *
     * @return the innerProperties value.
     */
    private SpacecraftsProperties innerProperties() {
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
    public SpacecraftInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SpacecraftInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The current state of the resource's creation, deletion, or modification.
     *
     * @return the provisioningState value.
     */
    public SpacecraftsPropertiesProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: The current state of the resource's creation, deletion, or modification.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the SpacecraftInner object itself.
     */
    public SpacecraftInner withProvisioningState(SpacecraftsPropertiesProvisioningState provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SpacecraftsProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Get the noradId property: NORAD ID of the spacecraft.
     *
     * @return the noradId value.
     */
    public String noradId() {
        return this.innerProperties() == null ? null : this.innerProperties().noradId();
    }

    /**
     * Set the noradId property: NORAD ID of the spacecraft.
     *
     * @param noradId the noradId value to set.
     * @return the SpacecraftInner object itself.
     */
    public SpacecraftInner withNoradId(String noradId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SpacecraftsProperties();
        }
        this.innerProperties().withNoradId(noradId);
        return this;
    }

    /**
     * Get the titleLine property: Title line of the two-line element set (TLE).
     *
     * @return the titleLine value.
     */
    public String titleLine() {
        return this.innerProperties() == null ? null : this.innerProperties().titleLine();
    }

    /**
     * Set the titleLine property: Title line of the two-line element set (TLE).
     *
     * @param titleLine the titleLine value to set.
     * @return the SpacecraftInner object itself.
     */
    public SpacecraftInner withTitleLine(String titleLine) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SpacecraftsProperties();
        }
        this.innerProperties().withTitleLine(titleLine);
        return this;
    }

    /**
     * Get the tleLine1 property: Line 1 of the two-line element set (TLE).
     *
     * @return the tleLine1 value.
     */
    public String tleLine1() {
        return this.innerProperties() == null ? null : this.innerProperties().tleLine1();
    }

    /**
     * Set the tleLine1 property: Line 1 of the two-line element set (TLE).
     *
     * @param tleLine1 the tleLine1 value to set.
     * @return the SpacecraftInner object itself.
     */
    public SpacecraftInner withTleLine1(String tleLine1) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SpacecraftsProperties();
        }
        this.innerProperties().withTleLine1(tleLine1);
        return this;
    }

    /**
     * Get the tleLine2 property: Line 2 of the two-line element set (TLE).
     *
     * @return the tleLine2 value.
     */
    public String tleLine2() {
        return this.innerProperties() == null ? null : this.innerProperties().tleLine2();
    }

    /**
     * Set the tleLine2 property: Line 2 of the two-line element set (TLE).
     *
     * @param tleLine2 the tleLine2 value to set.
     * @return the SpacecraftInner object itself.
     */
    public SpacecraftInner withTleLine2(String tleLine2) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SpacecraftsProperties();
        }
        this.innerProperties().withTleLine2(tleLine2);
        return this;
    }

    /**
     * Get the links property: Immutable list of Spacecraft links.
     *
     * @return the links value.
     */
    public List<SpacecraftLink> links() {
        return this.innerProperties() == null ? null : this.innerProperties().links();
    }

    /**
     * Set the links property: Immutable list of Spacecraft links.
     *
     * @param links the links value to set.
     * @return the SpacecraftInner object itself.
     */
    public SpacecraftInner withLinks(List<SpacecraftLink> links) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SpacecraftsProperties();
        }
        this.innerProperties().withLinks(links);
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
                new IllegalArgumentException("Missing required property innerProperties in model SpacecraftInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SpacecraftInner.class);
}
