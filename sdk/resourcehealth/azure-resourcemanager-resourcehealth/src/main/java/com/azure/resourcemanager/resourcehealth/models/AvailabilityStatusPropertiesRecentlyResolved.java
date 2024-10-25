// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * An annotation describing a change in the availabilityState to Available from Unavailable with a reasonType of type
 * Unplanned.
 */
@Fluent
public final class AvailabilityStatusPropertiesRecentlyResolved {
    /*
     * Timestamp for when the availabilityState changed to Unavailable
     */
    @JsonProperty(value = "unavailableOccuredTime")
    private OffsetDateTime unavailableOccuredTime;

    /*
     * Timestamp when the availabilityState changes to Available.
     */
    @JsonProperty(value = "resolvedTime")
    private OffsetDateTime resolvedTime;

    /*
     * Brief description of cause of the resource becoming unavailable.
     */
    @JsonProperty(value = "unavailableSummary")
    private String unavailableSummary;

    /** Creates an instance of AvailabilityStatusPropertiesRecentlyResolved class. */
    public AvailabilityStatusPropertiesRecentlyResolved() {
    }

    /**
     * Get the unavailableOccuredTime property: Timestamp for when the availabilityState changed to Unavailable.
     *
     * @return the unavailableOccuredTime value.
     */
    public OffsetDateTime unavailableOccuredTime() {
        return this.unavailableOccuredTime;
    }

    /**
     * Set the unavailableOccuredTime property: Timestamp for when the availabilityState changed to Unavailable.
     *
     * @param unavailableOccuredTime the unavailableOccuredTime value to set.
     * @return the AvailabilityStatusPropertiesRecentlyResolved object itself.
     */
    public AvailabilityStatusPropertiesRecentlyResolved
        withUnavailableOccuredTime(OffsetDateTime unavailableOccuredTime) {
        this.unavailableOccuredTime = unavailableOccuredTime;
        return this;
    }

    /**
     * Get the resolvedTime property: Timestamp when the availabilityState changes to Available.
     *
     * @return the resolvedTime value.
     */
    public OffsetDateTime resolvedTime() {
        return this.resolvedTime;
    }

    /**
     * Set the resolvedTime property: Timestamp when the availabilityState changes to Available.
     *
     * @param resolvedTime the resolvedTime value to set.
     * @return the AvailabilityStatusPropertiesRecentlyResolved object itself.
     */
    public AvailabilityStatusPropertiesRecentlyResolved withResolvedTime(OffsetDateTime resolvedTime) {
        this.resolvedTime = resolvedTime;
        return this;
    }

    /**
     * Get the unavailableSummary property: Brief description of cause of the resource becoming unavailable.
     *
     * @return the unavailableSummary value.
     */
    public String unavailableSummary() {
        return this.unavailableSummary;
    }

    /**
     * Set the unavailableSummary property: Brief description of cause of the resource becoming unavailable.
     *
     * @param unavailableSummary the unavailableSummary value to set.
     * @return the AvailabilityStatusPropertiesRecentlyResolved object itself.
     */
    public AvailabilityStatusPropertiesRecentlyResolved withUnavailableSummary(String unavailableSummary) {
        this.unavailableSummary = unavailableSummary;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
