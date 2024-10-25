// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** VMware DRA model custom properties. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("VMware")
@Fluent
public final class VMwareDraModelCustomProperties extends DraModelCustomProperties {
    /*
     * Gets or sets the BIOS Id of the DRA machine.
     */
    @JsonProperty(value = "biosId", required = true)
    private String biosId;

    /*
     * Identity model.
     */
    @JsonProperty(value = "marsAuthenticationIdentity", required = true)
    private IdentityModel marsAuthenticationIdentity;

    /** Creates an instance of VMwareDraModelCustomProperties class. */
    public VMwareDraModelCustomProperties() {
    }

    /**
     * Get the biosId property: Gets or sets the BIOS Id of the DRA machine.
     *
     * @return the biosId value.
     */
    public String biosId() {
        return this.biosId;
    }

    /**
     * Set the biosId property: Gets or sets the BIOS Id of the DRA machine.
     *
     * @param biosId the biosId value to set.
     * @return the VMwareDraModelCustomProperties object itself.
     */
    public VMwareDraModelCustomProperties withBiosId(String biosId) {
        this.biosId = biosId;
        return this;
    }

    /**
     * Get the marsAuthenticationIdentity property: Identity model.
     *
     * @return the marsAuthenticationIdentity value.
     */
    public IdentityModel marsAuthenticationIdentity() {
        return this.marsAuthenticationIdentity;
    }

    /**
     * Set the marsAuthenticationIdentity property: Identity model.
     *
     * @param marsAuthenticationIdentity the marsAuthenticationIdentity value to set.
     * @return the VMwareDraModelCustomProperties object itself.
     */
    public VMwareDraModelCustomProperties withMarsAuthenticationIdentity(IdentityModel marsAuthenticationIdentity) {
        this.marsAuthenticationIdentity = marsAuthenticationIdentity;
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
        if (biosId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property biosId in model VMwareDraModelCustomProperties"));
        }
        if (marsAuthenticationIdentity() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property marsAuthenticationIdentity in model" + " VMwareDraModelCustomProperties"));
        } else {
            marsAuthenticationIdentity().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VMwareDraModelCustomProperties.class);
}
