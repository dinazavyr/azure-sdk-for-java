// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The start and end date for pulling data for the query. */
@Fluent
public final class QueryTimePeriod {
    /*
     * The start date to pull data from.
     */
    @JsonProperty(value = "from", required = true)
    private OffsetDateTime from;

    /*
     * The end date to pull data to.
     */
    @JsonProperty(value = "to", required = true)
    private OffsetDateTime to;

    /** Creates an instance of QueryTimePeriod class. */
    public QueryTimePeriod() {
    }

    /**
     * Get the from property: The start date to pull data from.
     *
     * @return the from value.
     */
    public OffsetDateTime from() {
        return this.from;
    }

    /**
     * Set the from property: The start date to pull data from.
     *
     * @param from the from value to set.
     * @return the QueryTimePeriod object itself.
     */
    public QueryTimePeriod withFrom(OffsetDateTime from) {
        this.from = from;
        return this;
    }

    /**
     * Get the to property: The end date to pull data to.
     *
     * @return the to value.
     */
    public OffsetDateTime to() {
        return this.to;
    }

    /**
     * Set the to property: The end date to pull data to.
     *
     * @param to the to value to set.
     * @return the QueryTimePeriod object itself.
     */
    public QueryTimePeriod withTo(OffsetDateTime to) {
        this.to = to;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (from() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property from in model QueryTimePeriod"));
        }
        if (to() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property to in model QueryTimePeriod"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(QueryTimePeriod.class);
}
