// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Granular Details for log generated during copy. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "copyLogDetailsType",
    defaultImpl = GranularCopyLogDetails.class)
@JsonTypeName("GranularCopyLogDetails")
@JsonSubTypes({ @JsonSubTypes.Type(name = "DataBoxCustomerDisk", value = DataBoxDiskGranularCopyLogDetails.class) })
@Immutable
public class GranularCopyLogDetails {
    /** Creates an instance of GranularCopyLogDetails class. */
    public GranularCopyLogDetails() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
