// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.networkcloud.fluent.models.VirtualMachinePatchProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** VirtualMachinePatchParameters represents the body of the request to patch the virtual machine. */
@Fluent
public final class VirtualMachinePatchParameters {
    /*
     * VirtualMachinePatchProperties represents the properties of the virtual machine that can be patched.
     *
     * The list of the resource properties.
     */
    @JsonProperty(value = "properties")
    private VirtualMachinePatchProperties innerProperties;

    /*
     * The Azure resource tags that will replace the existing ones.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /** Creates an instance of VirtualMachinePatchParameters class. */
    public VirtualMachinePatchParameters() {
    }

    /**
     * Get the innerProperties property: VirtualMachinePatchProperties represents the properties of the virtual machine
     * that can be patched.
     *
     * <p>The list of the resource properties.
     *
     * @return the innerProperties value.
     */
    private VirtualMachinePatchProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: The Azure resource tags that will replace the existing ones.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The Azure resource tags that will replace the existing ones.
     *
     * @param tags the tags value to set.
     * @return the VirtualMachinePatchParameters object itself.
     */
    public VirtualMachinePatchParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the vmImageRepositoryCredentials property: ImageRepositoryCredentials represents the credentials used to
     * login to the image repository.
     *
     * <p>The credentials used to login to the image repository that has access to the specified image.
     *
     * @return the vmImageRepositoryCredentials value.
     */
    public ImageRepositoryCredentials vmImageRepositoryCredentials() {
        return this.innerProperties() == null ? null : this.innerProperties().vmImageRepositoryCredentials();
    }

    /**
     * Set the vmImageRepositoryCredentials property: ImageRepositoryCredentials represents the credentials used to
     * login to the image repository.
     *
     * <p>The credentials used to login to the image repository that has access to the specified image.
     *
     * @param vmImageRepositoryCredentials the vmImageRepositoryCredentials value to set.
     * @return the VirtualMachinePatchParameters object itself.
     */
    public VirtualMachinePatchParameters
        withVmImageRepositoryCredentials(ImageRepositoryCredentials vmImageRepositoryCredentials) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePatchProperties();
        }
        this.innerProperties().withVmImageRepositoryCredentials(vmImageRepositoryCredentials);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
