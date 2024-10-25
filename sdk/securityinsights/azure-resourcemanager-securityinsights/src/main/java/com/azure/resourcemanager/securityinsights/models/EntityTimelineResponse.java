// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.resourcemanager.securityinsights.fluent.models.EntityTimelineResponseInner;
import java.util.List;

/**
 * An immutable client-side representation of EntityTimelineResponse.
 */
public interface EntityTimelineResponse {
    /**
     * Gets the metadata property: The metadata from the timeline operation results.
     * 
     * @return the metadata value.
     */
    TimelineResultsMetadata metadata();

    /**
     * Gets the value property: The timeline result values.
     * 
     * @return the value value.
     */
    List<EntityTimelineItem> value();

    /**
     * Gets the inner com.azure.resourcemanager.securityinsights.fluent.models.EntityTimelineResponseInner object.
     * 
     * @return the inner object.
     */
    EntityTimelineResponseInner innerModel();
}
