// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Unit systems info for the data provider. */
@Fluent
public final class UnitSystemsInfo {
    /*
     * UnitSystem key sent as part of ProviderInput.
     */
    @JsonProperty(value = "key", required = true)
    private String key;

    /*
     * List of unit systems supported by this data provider.
     */
    @JsonProperty(value = "values", required = true)
    private List<String> values;

    /**
     * Get the key property: UnitSystem key sent as part of ProviderInput.
     *
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: UnitSystem key sent as part of ProviderInput.
     *
     * @param key the key value to set.
     * @return the UnitSystemsInfo object itself.
     */
    public UnitSystemsInfo withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the values property: List of unit systems supported by this data provider.
     *
     * @return the values value.
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Set the values property: List of unit systems supported by this data provider.
     *
     * @param values the values value to set.
     * @return the UnitSystemsInfo object itself.
     */
    public UnitSystemsInfo withValues(List<String> values) {
        this.values = values;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (key() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property key in model UnitSystemsInfo"));
        }
        if (values() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property values in model UnitSystemsInfo"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UnitSystemsInfo.class);
}
