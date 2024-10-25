// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Fabric model custom properties. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = FabricModelCustomProperties.class)
@JsonTypeName("FabricModelCustomProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzStackHCI", value = AzStackHciFabricModelCustomProperties.class),
    @JsonSubTypes.Type(name = "HyperVMigrate", value = HyperVMigrateFabricModelCustomProperties.class),
    @JsonSubTypes.Type(name = "VMwareMigrate", value = VMwareMigrateFabricModelCustomProperties.class) })
@Immutable
public class FabricModelCustomProperties {
    /** Creates an instance of FabricModelCustomProperties class. */
    public FabricModelCustomProperties() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
