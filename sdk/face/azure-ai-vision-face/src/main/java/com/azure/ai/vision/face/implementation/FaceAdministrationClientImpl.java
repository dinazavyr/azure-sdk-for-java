// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.vision.face.implementation;

import com.azure.ai.vision.face.FaceServiceVersion;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/**
 * Initializes a new instance of the FaceAdministrationClient type.
 */
public final class FaceAdministrationClientImpl {
    /**
     * Supported Cognitive Services endpoints (protocol and hostname, for example:
     * https://{resource-name}.cognitiveservices.azure.com).
     */
    private final String endpoint;

    /**
     * Gets Supported Cognitive Services endpoints (protocol and hostname, for example:
     * https://{resource-name}.cognitiveservices.azure.com).
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Service version.
     */
    private final FaceServiceVersion serviceVersion;

    /**
     * Gets Service version.
     * 
     * @return the serviceVersion value.
     */
    public FaceServiceVersion getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * The LargeFaceListsImpl object to access its operations.
     */
    private final LargeFaceListsImpl largeFaceLists;

    /**
     * Gets the LargeFaceListsImpl object to access its operations.
     * 
     * @return the LargeFaceListsImpl object.
     */
    public LargeFaceListsImpl getLargeFaceLists() {
        return this.largeFaceLists;
    }

    /**
     * The LargePersonGroupsImpl object to access its operations.
     */
    private final LargePersonGroupsImpl largePersonGroups;

    /**
     * Gets the LargePersonGroupsImpl object to access its operations.
     * 
     * @return the LargePersonGroupsImpl object.
     */
    public LargePersonGroupsImpl getLargePersonGroups() {
        return this.largePersonGroups;
    }

    /**
     * Initializes an instance of FaceAdministrationClient client.
     * 
     * @param endpoint Supported Cognitive Services endpoints (protocol and hostname, for example:
     * https://{resource-name}.cognitiveservices.azure.com).
     * @param serviceVersion Service version.
     */
    public FaceAdministrationClientImpl(String endpoint, FaceServiceVersion serviceVersion) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of FaceAdministrationClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Supported Cognitive Services endpoints (protocol and hostname, for example:
     * https://{resource-name}.cognitiveservices.azure.com).
     * @param serviceVersion Service version.
     */
    public FaceAdministrationClientImpl(HttpPipeline httpPipeline, String endpoint, FaceServiceVersion serviceVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of FaceAdministrationClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint Supported Cognitive Services endpoints (protocol and hostname, for example:
     * https://{resource-name}.cognitiveservices.azure.com).
     * @param serviceVersion Service version.
     */
    public FaceAdministrationClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint,
        FaceServiceVersion serviceVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.serviceVersion = serviceVersion;
        this.largeFaceLists = new LargeFaceListsImpl(this);
        this.largePersonGroups = new LargePersonGroupsImpl(this);
    }
}
