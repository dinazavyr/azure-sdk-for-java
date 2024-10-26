// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The definition of an export. */
@Fluent
public final class ExportDefinition {
    /*
     * The type of the export. Note that 'Usage' is equivalent to 'ActualCost' and is applicable to exports that do not
     * yet provide data for charges or amortization for service reservations.
     */
    @JsonProperty(value = "type", required = true)
    private ExportType type;

    /*
     * The time frame for pulling data for the export. If custom, then a specific time period must be provided.
     */
    @JsonProperty(value = "timeframe", required = true)
    private TimeframeType timeframe;

    /*
     * Has time period for pulling data for the export.
     */
    @JsonProperty(value = "timePeriod")
    private ExportTimePeriod timePeriod;

    /*
     * The definition for data in the export.
     */
    @JsonProperty(value = "dataSet")
    private ExportDataset dataSet;

    /** Creates an instance of ExportDefinition class. */
    public ExportDefinition() {
    }

    /**
     * Get the type property: The type of the export. Note that 'Usage' is equivalent to 'ActualCost' and is applicable
     * to exports that do not yet provide data for charges or amortization for service reservations.
     *
     * @return the type value.
     */
    public ExportType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the export. Note that 'Usage' is equivalent to 'ActualCost' and is applicable
     * to exports that do not yet provide data for charges or amortization for service reservations.
     *
     * @param type the type value to set.
     * @return the ExportDefinition object itself.
     */
    public ExportDefinition withType(ExportType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the timeframe property: The time frame for pulling data for the export. If custom, then a specific time
     * period must be provided.
     *
     * @return the timeframe value.
     */
    public TimeframeType timeframe() {
        return this.timeframe;
    }

    /**
     * Set the timeframe property: The time frame for pulling data for the export. If custom, then a specific time
     * period must be provided.
     *
     * @param timeframe the timeframe value to set.
     * @return the ExportDefinition object itself.
     */
    public ExportDefinition withTimeframe(TimeframeType timeframe) {
        this.timeframe = timeframe;
        return this;
    }

    /**
     * Get the timePeriod property: Has time period for pulling data for the export.
     *
     * @return the timePeriod value.
     */
    public ExportTimePeriod timePeriod() {
        return this.timePeriod;
    }

    /**
     * Set the timePeriod property: Has time period for pulling data for the export.
     *
     * @param timePeriod the timePeriod value to set.
     * @return the ExportDefinition object itself.
     */
    public ExportDefinition withTimePeriod(ExportTimePeriod timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * Get the dataSet property: The definition for data in the export.
     *
     * @return the dataSet value.
     */
    public ExportDataset dataSet() {
        return this.dataSet;
    }

    /**
     * Set the dataSet property: The definition for data in the export.
     *
     * @param dataSet the dataSet value to set.
     * @return the ExportDefinition object itself.
     */
    public ExportDefinition withDataSet(ExportDataset dataSet) {
        this.dataSet = dataSet;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property type in model ExportDefinition"));
        }
        if (timeframe() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property timeframe in model ExportDefinition"));
        }
        if (timePeriod() != null) {
            timePeriod().validate();
        }
        if (dataSet() != null) {
            dataSet().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExportDefinition.class);
}
