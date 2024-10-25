// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * The integration account session properties.
 */
@Fluent
public final class IntegrationAccountSessionProperties
    implements JsonSerializable<IntegrationAccountSessionProperties> {
    /*
     * The created time.
     */
    private OffsetDateTime createdTime;

    /*
     * The changed time.
     */
    private OffsetDateTime changedTime;

    /*
     * The session content.
     */
    private Object content;

    /**
     * Creates an instance of IntegrationAccountSessionProperties class.
     */
    public IntegrationAccountSessionProperties() {
    }

    /**
     * Get the createdTime property: The created time.
     * 
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the changedTime property: The changed time.
     * 
     * @return the changedTime value.
     */
    public OffsetDateTime changedTime() {
        return this.changedTime;
    }

    /**
     * Get the content property: The session content.
     * 
     * @return the content value.
     */
    public Object content() {
        return this.content;
    }

    /**
     * Set the content property: The session content.
     * 
     * @param content the content value to set.
     * @return the IntegrationAccountSessionProperties object itself.
     */
    public IntegrationAccountSessionProperties withContent(Object content) {
        this.content = content;
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
        jsonWriter.writeUntypedField("content", this.content);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IntegrationAccountSessionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IntegrationAccountSessionProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the IntegrationAccountSessionProperties.
     */
    public static IntegrationAccountSessionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IntegrationAccountSessionProperties deserializedIntegrationAccountSessionProperties
                = new IntegrationAccountSessionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("createdTime".equals(fieldName)) {
                    deserializedIntegrationAccountSessionProperties.createdTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("changedTime".equals(fieldName)) {
                    deserializedIntegrationAccountSessionProperties.changedTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("content".equals(fieldName)) {
                    deserializedIntegrationAccountSessionProperties.content = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIntegrationAccountSessionProperties;
        });
    }
}
