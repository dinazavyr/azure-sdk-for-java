// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * defaultColumnValue.
 */
@Fluent
public final class MicrosoftGraphDefaultColumnValue implements JsonSerializable<MicrosoftGraphDefaultColumnValue> {
    /*
     * The formula used to compute the default value for this column.
     */
    private String formula;

    /*
     * The direct value to use as the default value for this column.
     */
    private String value;

    /*
     * defaultColumnValue
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphDefaultColumnValue class.
     */
    public MicrosoftGraphDefaultColumnValue() {
    }

    /**
     * Get the formula property: The formula used to compute the default value for this column.
     * 
     * @return the formula value.
     */
    public String formula() {
        return this.formula;
    }

    /**
     * Set the formula property: The formula used to compute the default value for this column.
     * 
     * @param formula the formula value to set.
     * @return the MicrosoftGraphDefaultColumnValue object itself.
     */
    public MicrosoftGraphDefaultColumnValue withFormula(String formula) {
        this.formula = formula;
        return this;
    }

    /**
     * Get the value property: The direct value to use as the default value for this column.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The direct value to use as the default value for this column.
     * 
     * @param value the value value to set.
     * @return the MicrosoftGraphDefaultColumnValue object itself.
     */
    public MicrosoftGraphDefaultColumnValue withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the additionalProperties property: defaultColumnValue.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: defaultColumnValue.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphDefaultColumnValue object itself.
     */
    public MicrosoftGraphDefaultColumnValue withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
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
        jsonWriter.writeStringField("formula", this.formula);
        jsonWriter.writeStringField("value", this.value);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphDefaultColumnValue from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphDefaultColumnValue if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphDefaultColumnValue.
     */
    public static MicrosoftGraphDefaultColumnValue fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphDefaultColumnValue deserializedMicrosoftGraphDefaultColumnValue
                = new MicrosoftGraphDefaultColumnValue();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("formula".equals(fieldName)) {
                    deserializedMicrosoftGraphDefaultColumnValue.formula = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedMicrosoftGraphDefaultColumnValue.value = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphDefaultColumnValue.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphDefaultColumnValue;
        });
    }
}
