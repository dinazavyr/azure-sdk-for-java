// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * metadata of a repository.
 */
@Fluent
public final class Repository implements JsonSerializable<Repository> {
    /*
     * Url of repository.
     */
    private String url;

    /*
     * Branch name of repository.
     */
    private String branch;

    /*
     * Display url of repository.
     */
    private String displayUrl;

    /*
     * Url to access repository action logs.
     */
    private String deploymentLogsUrl;

    /*
     * Dictionary of source control content type and path mapping.
     */
    private List<ContentPathMap> pathMapping;

    /**
     * Creates an instance of Repository class.
     */
    public Repository() {
    }

    /**
     * Get the url property: Url of repository.
     * 
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: Url of repository.
     * 
     * @param url the url value to set.
     * @return the Repository object itself.
     */
    public Repository withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the branch property: Branch name of repository.
     * 
     * @return the branch value.
     */
    public String branch() {
        return this.branch;
    }

    /**
     * Set the branch property: Branch name of repository.
     * 
     * @param branch the branch value to set.
     * @return the Repository object itself.
     */
    public Repository withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get the displayUrl property: Display url of repository.
     * 
     * @return the displayUrl value.
     */
    public String displayUrl() {
        return this.displayUrl;
    }

    /**
     * Set the displayUrl property: Display url of repository.
     * 
     * @param displayUrl the displayUrl value to set.
     * @return the Repository object itself.
     */
    public Repository withDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
        return this;
    }

    /**
     * Get the deploymentLogsUrl property: Url to access repository action logs.
     * 
     * @return the deploymentLogsUrl value.
     */
    public String deploymentLogsUrl() {
        return this.deploymentLogsUrl;
    }

    /**
     * Set the deploymentLogsUrl property: Url to access repository action logs.
     * 
     * @param deploymentLogsUrl the deploymentLogsUrl value to set.
     * @return the Repository object itself.
     */
    public Repository withDeploymentLogsUrl(String deploymentLogsUrl) {
        this.deploymentLogsUrl = deploymentLogsUrl;
        return this;
    }

    /**
     * Get the pathMapping property: Dictionary of source control content type and path mapping.
     * 
     * @return the pathMapping value.
     */
    public List<ContentPathMap> pathMapping() {
        return this.pathMapping;
    }

    /**
     * Set the pathMapping property: Dictionary of source control content type and path mapping.
     * 
     * @param pathMapping the pathMapping value to set.
     * @return the Repository object itself.
     */
    public Repository withPathMapping(List<ContentPathMap> pathMapping) {
        this.pathMapping = pathMapping;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pathMapping() != null) {
            pathMapping().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("url", this.url);
        jsonWriter.writeStringField("branch", this.branch);
        jsonWriter.writeStringField("displayUrl", this.displayUrl);
        jsonWriter.writeStringField("deploymentLogsUrl", this.deploymentLogsUrl);
        jsonWriter.writeArrayField("pathMapping", this.pathMapping, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Repository from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Repository if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Repository.
     */
    public static Repository fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Repository deserializedRepository = new Repository();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("url".equals(fieldName)) {
                    deserializedRepository.url = reader.getString();
                } else if ("branch".equals(fieldName)) {
                    deserializedRepository.branch = reader.getString();
                } else if ("displayUrl".equals(fieldName)) {
                    deserializedRepository.displayUrl = reader.getString();
                } else if ("deploymentLogsUrl".equals(fieldName)) {
                    deserializedRepository.deploymentLogsUrl = reader.getString();
                } else if ("pathMapping".equals(fieldName)) {
                    List<ContentPathMap> pathMapping = reader.readArray(reader1 -> ContentPathMap.fromJson(reader1));
                    deserializedRepository.pathMapping = pathMapping;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRepository;
        });
    }
}
