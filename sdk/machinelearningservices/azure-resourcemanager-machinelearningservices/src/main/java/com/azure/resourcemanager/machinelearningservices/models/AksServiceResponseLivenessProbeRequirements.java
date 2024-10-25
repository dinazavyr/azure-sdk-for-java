// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The liveness probe requirements. */
@Immutable
public final class AksServiceResponseLivenessProbeRequirements extends LivenessProbeRequirements {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(AksServiceResponseLivenessProbeRequirements.class);

    /** {@inheritDoc} */
    @Override
    public AksServiceResponseLivenessProbeRequirements withFailureThreshold(Integer failureThreshold) {
        super.withFailureThreshold(failureThreshold);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceResponseLivenessProbeRequirements withSuccessThreshold(Integer successThreshold) {
        super.withSuccessThreshold(successThreshold);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceResponseLivenessProbeRequirements withTimeoutSeconds(Integer timeoutSeconds) {
        super.withTimeoutSeconds(timeoutSeconds);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceResponseLivenessProbeRequirements withPeriodSeconds(Integer periodSeconds) {
        super.withPeriodSeconds(periodSeconds);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceResponseLivenessProbeRequirements withInitialDelaySeconds(Integer initialDelaySeconds) {
        super.withInitialDelaySeconds(initialDelaySeconds);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
