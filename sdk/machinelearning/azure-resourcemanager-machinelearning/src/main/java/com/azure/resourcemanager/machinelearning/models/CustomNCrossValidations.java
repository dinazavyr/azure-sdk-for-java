// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * N-Cross validations are specified by user.
 */
@Fluent
public final class CustomNCrossValidations extends NCrossValidations {
    /*
     * [Required] Mode for determining N-Cross validations.
     */
    private NCrossValidationsMode mode = NCrossValidationsMode.CUSTOM;

    /*
     * [Required] N-Cross validations value.
     */
    private int value;

    /**
     * Creates an instance of CustomNCrossValidations class.
     */
    public CustomNCrossValidations() {
    }

    /**
     * Get the mode property: [Required] Mode for determining N-Cross validations.
     * 
     * @return the mode value.
     */
    @Override
    public NCrossValidationsMode mode() {
        return this.mode;
    }

    /**
     * Get the value property: [Required] N-Cross validations value.
     * 
     * @return the value value.
     */
    public int value() {
        return this.value;
    }

    /**
     * Set the value property: [Required] N-Cross validations value.
     * 
     * @param value the value value to set.
     * @return the CustomNCrossValidations object itself.
     */
    public CustomNCrossValidations withValue(int value) {
        this.value = value;
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("value", this.value);
        jsonWriter.writeStringField("mode", this.mode == null ? null : this.mode.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomNCrossValidations from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomNCrossValidations if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CustomNCrossValidations.
     */
    public static CustomNCrossValidations fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CustomNCrossValidations deserializedCustomNCrossValidations = new CustomNCrossValidations();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    deserializedCustomNCrossValidations.value = reader.getInt();
                } else if ("mode".equals(fieldName)) {
                    deserializedCustomNCrossValidations.mode = NCrossValidationsMode.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCustomNCrossValidations;
        });
    }
}
