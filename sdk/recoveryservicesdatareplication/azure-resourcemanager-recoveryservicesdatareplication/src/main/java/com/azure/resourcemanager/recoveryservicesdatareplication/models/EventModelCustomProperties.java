// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Event model custom properties. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = EventModelCustomProperties.class)
@JsonTypeName("EventModelCustomProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "HyperVToAzStackHCI", value = HyperVToAzStackHciEventModelCustomProperties.class) })
@Immutable
public class EventModelCustomProperties {
    /** Creates an instance of EventModelCustomProperties class. */
    public EventModelCustomProperties() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
