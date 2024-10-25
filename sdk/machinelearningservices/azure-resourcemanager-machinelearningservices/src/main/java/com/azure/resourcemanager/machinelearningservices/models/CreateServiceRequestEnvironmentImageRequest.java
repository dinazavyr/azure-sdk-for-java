// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

/** The Environment, models and assets needed for inferencing. */
@Immutable
public final class CreateServiceRequestEnvironmentImageRequest extends EnvironmentImageRequest {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(CreateServiceRequestEnvironmentImageRequest.class);

    /** {@inheritDoc} */
    @Override
    public CreateServiceRequestEnvironmentImageRequest withDriverProgram(String driverProgram) {
        super.withDriverProgram(driverProgram);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CreateServiceRequestEnvironmentImageRequest withAssets(List<ImageAsset> assets) {
        super.withAssets(assets);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CreateServiceRequestEnvironmentImageRequest withModelIds(List<String> modelIds) {
        super.withModelIds(modelIds);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CreateServiceRequestEnvironmentImageRequest withModels(List<Model> models) {
        super.withModels(models);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CreateServiceRequestEnvironmentImageRequest withEnvironment(EnvironmentImageRequestEnvironment environment) {
        super.withEnvironment(environment);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CreateServiceRequestEnvironmentImageRequest
        withEnvironmentReference(EnvironmentImageRequestEnvironmentReference environmentReference) {
        super.withEnvironmentReference(environmentReference);
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
