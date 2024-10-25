// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The request body to provide the delivery package details of job. */
@Fluent
public final class MarkDevicesShippedRequest {
    /*
     * Delivery package details
     */
    @JsonProperty(value = "deliverToDcPackageDetails", required = true)
    private PackageCarrierInfo deliverToDcPackageDetails;

    /** Creates an instance of MarkDevicesShippedRequest class. */
    public MarkDevicesShippedRequest() {
    }

    /**
     * Get the deliverToDcPackageDetails property: Delivery package details.
     *
     * @return the deliverToDcPackageDetails value.
     */
    public PackageCarrierInfo deliverToDcPackageDetails() {
        return this.deliverToDcPackageDetails;
    }

    /**
     * Set the deliverToDcPackageDetails property: Delivery package details.
     *
     * @param deliverToDcPackageDetails the deliverToDcPackageDetails value to set.
     * @return the MarkDevicesShippedRequest object itself.
     */
    public MarkDevicesShippedRequest withDeliverToDcPackageDetails(PackageCarrierInfo deliverToDcPackageDetails) {
        this.deliverToDcPackageDetails = deliverToDcPackageDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deliverToDcPackageDetails() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property deliverToDcPackageDetails in model MarkDevicesShippedRequest"));
        } else {
            deliverToDcPackageDetails().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MarkDevicesShippedRequest.class);
}
