// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Request body to get the datacenter address. */
@Fluent
public final class DatacenterAddressRequest {
    /*
     * Storage location. For locations check:
     * https://management.azure.com/subscriptions/SUBSCRIPTIONID/locations?api-version=2018-01-01
     */
    @JsonProperty(value = "storageLocation", required = true)
    private String storageLocation;

    /*
     * Sku Name for which the data center address requested.
     */
    @JsonProperty(value = "skuName", required = true)
    private SkuName skuName;

    /** Creates an instance of DatacenterAddressRequest class. */
    public DatacenterAddressRequest() {
    }

    /**
     * Get the storageLocation property: Storage location. For locations check:
     * https://management.azure.com/subscriptions/SUBSCRIPTIONID/locations?api-version=2018-01-01.
     *
     * @return the storageLocation value.
     */
    public String storageLocation() {
        return this.storageLocation;
    }

    /**
     * Set the storageLocation property: Storage location. For locations check:
     * https://management.azure.com/subscriptions/SUBSCRIPTIONID/locations?api-version=2018-01-01.
     *
     * @param storageLocation the storageLocation value to set.
     * @return the DatacenterAddressRequest object itself.
     */
    public DatacenterAddressRequest withStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }

    /**
     * Get the skuName property: Sku Name for which the data center address requested.
     *
     * @return the skuName value.
     */
    public SkuName skuName() {
        return this.skuName;
    }

    /**
     * Set the skuName property: Sku Name for which the data center address requested.
     *
     * @param skuName the skuName value to set.
     * @return the DatacenterAddressRequest object itself.
     */
    public DatacenterAddressRequest withSkuName(SkuName skuName) {
        this.skuName = skuName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageLocation() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property storageLocation in model DatacenterAddressRequest"));
        }
        if (skuName() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property skuName in model DatacenterAddressRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DatacenterAddressRequest.class);
}
