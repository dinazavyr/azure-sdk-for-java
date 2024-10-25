// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datalakeanalytics.models.AadObjectType;
import java.io.IOException;
import java.util.UUID;

/**
 * The compute policy properties.
 */
@Immutable
public final class ComputePolicyProperties implements JsonSerializable<ComputePolicyProperties> {
    /*
     * The AAD object identifier for the entity to create a policy for.
     */
    private UUID objectId;

    /*
     * The type of AAD object the object identifier refers to.
     */
    private AadObjectType objectType;

    /*
     * The maximum degree of parallelism per job this user can use to submit jobs.
     */
    private Integer maxDegreeOfParallelismPerJob;

    /*
     * The minimum priority per job this user can use to submit jobs.
     */
    private Integer minPriorityPerJob;

    /**
     * Creates an instance of ComputePolicyProperties class.
     */
    public ComputePolicyProperties() {
    }

    /**
     * Get the objectId property: The AAD object identifier for the entity to create a policy for.
     * 
     * @return the objectId value.
     */
    public UUID objectId() {
        return this.objectId;
    }

    /**
     * Get the objectType property: The type of AAD object the object identifier refers to.
     * 
     * @return the objectType value.
     */
    public AadObjectType objectType() {
        return this.objectType;
    }

    /**
     * Get the maxDegreeOfParallelismPerJob property: The maximum degree of parallelism per job this user can use to
     * submit jobs.
     * 
     * @return the maxDegreeOfParallelismPerJob value.
     */
    public Integer maxDegreeOfParallelismPerJob() {
        return this.maxDegreeOfParallelismPerJob;
    }

    /**
     * Get the minPriorityPerJob property: The minimum priority per job this user can use to submit jobs.
     * 
     * @return the minPriorityPerJob value.
     */
    public Integer minPriorityPerJob() {
        return this.minPriorityPerJob;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ComputePolicyProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ComputePolicyProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ComputePolicyProperties.
     */
    public static ComputePolicyProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ComputePolicyProperties deserializedComputePolicyProperties = new ComputePolicyProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("objectId".equals(fieldName)) {
                    deserializedComputePolicyProperties.objectId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("objectType".equals(fieldName)) {
                    deserializedComputePolicyProperties.objectType = AadObjectType.fromString(reader.getString());
                } else if ("maxDegreeOfParallelismPerJob".equals(fieldName)) {
                    deserializedComputePolicyProperties.maxDegreeOfParallelismPerJob
                        = reader.getNullable(JsonReader::getInt);
                } else if ("minPriorityPerJob".equals(fieldName)) {
                    deserializedComputePolicyProperties.minPriorityPerJob = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedComputePolicyProperties;
        });
    }
}
