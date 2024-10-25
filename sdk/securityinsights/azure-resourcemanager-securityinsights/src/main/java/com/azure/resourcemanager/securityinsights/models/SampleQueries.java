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

/**
 * The sample queries for the connector.
 */
@Fluent
public class SampleQueries implements JsonSerializable<SampleQueries> {
    /*
     * The sample query description
     */
    private String description;

    /*
     * the sample query
     */
    private String query;

    /**
     * Creates an instance of SampleQueries class.
     */
    public SampleQueries() {
    }

    /**
     * Get the description property: The sample query description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The sample query description.
     * 
     * @param description the description value to set.
     * @return the SampleQueries object itself.
     */
    public SampleQueries withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the query property: the sample query.
     * 
     * @return the query value.
     */
    public String query() {
        return this.query;
    }

    /**
     * Set the query property: the sample query.
     * 
     * @param query the query value to set.
     * @return the SampleQueries object itself.
     */
    public SampleQueries withQuery(String query) {
        this.query = query;
        return this;
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
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("query", this.query);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SampleQueries from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SampleQueries if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SampleQueries.
     */
    public static SampleQueries fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SampleQueries deserializedSampleQueries = new SampleQueries();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedSampleQueries.description = reader.getString();
                } else if ("query".equals(fieldName)) {
                    deserializedSampleQueries.query = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSampleQueries;
        });
    }
}
