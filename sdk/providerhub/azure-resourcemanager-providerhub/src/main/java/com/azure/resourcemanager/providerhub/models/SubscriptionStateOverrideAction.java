// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SubscriptionStateOverrideAction model. */
@Fluent
public final class SubscriptionStateOverrideAction {
    /*
     * The state property.
     */
    @JsonProperty(value = "state", required = true)
    private SubscriptionTransitioningState state;

    /*
     * The action property.
     */
    @JsonProperty(value = "action", required = true)
    private SubscriptionNotificationOperation action;

    /** Creates an instance of SubscriptionStateOverrideAction class. */
    public SubscriptionStateOverrideAction() {
    }

    /**
     * Get the state property: The state property.
     *
     * @return the state value.
     */
    public SubscriptionTransitioningState state() {
        return this.state;
    }

    /**
     * Set the state property: The state property.
     *
     * @param state the state value to set.
     * @return the SubscriptionStateOverrideAction object itself.
     */
    public SubscriptionStateOverrideAction withState(SubscriptionTransitioningState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the action property: The action property.
     *
     * @return the action value.
     */
    public SubscriptionNotificationOperation action() {
        return this.action;
    }

    /**
     * Set the action property: The action property.
     *
     * @param action the action value to set.
     * @return the SubscriptionStateOverrideAction object itself.
     */
    public SubscriptionStateOverrideAction withAction(SubscriptionNotificationOperation action) {
        this.action = action;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (state() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property state in model SubscriptionStateOverrideAction"));
        }
        if (action() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property action in model SubscriptionStateOverrideAction"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SubscriptionStateOverrideAction.class);
}
