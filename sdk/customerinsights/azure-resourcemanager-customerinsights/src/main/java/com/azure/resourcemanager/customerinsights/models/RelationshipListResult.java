// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.customerinsights.fluent.models.RelationshipResourceFormatInner;
import java.io.IOException;
import java.util.List;

/**
 * The response of list relationship operation.
 */
@Fluent
public final class RelationshipListResult implements JsonSerializable<RelationshipListResult> {
    /*
     * Results of the list operation.
     */
    private List<RelationshipResourceFormatInner> value;

    /*
     * Link to the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of RelationshipListResult class.
     */
    public RelationshipListResult() {
    }

    /**
     * Get the value property: Results of the list operation.
     * 
     * @return the value value.
     */
    public List<RelationshipResourceFormatInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Results of the list operation.
     * 
     * @param value the value value to set.
     * @return the RelationshipListResult object itself.
     */
    public RelationshipListResult withValue(List<RelationshipResourceFormatInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the RelationshipListResult object itself.
     */
    public RelationshipListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RelationshipListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RelationshipListResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RelationshipListResult.
     */
    public static RelationshipListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RelationshipListResult deserializedRelationshipListResult = new RelationshipListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<RelationshipResourceFormatInner> value
                        = reader.readArray(reader1 -> RelationshipResourceFormatInner.fromJson(reader1));
                    deserializedRelationshipListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedRelationshipListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRelationshipListResult;
        });
    }
}
