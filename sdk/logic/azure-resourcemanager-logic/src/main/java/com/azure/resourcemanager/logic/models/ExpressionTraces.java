// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The expression traces.
 */
@Fluent
public final class ExpressionTraces implements JsonSerializable<ExpressionTraces> {
    /*
     * The inputs property.
     */
    private List<ExpressionRoot> inputs;

    /**
     * Creates an instance of ExpressionTraces class.
     */
    public ExpressionTraces() {
    }

    /**
     * Get the inputs property: The inputs property.
     * 
     * @return the inputs value.
     */
    public List<ExpressionRoot> inputs() {
        return this.inputs;
    }

    /**
     * Set the inputs property: The inputs property.
     * 
     * @param inputs the inputs value to set.
     * @return the ExpressionTraces object itself.
     */
    public ExpressionTraces withInputs(List<ExpressionRoot> inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (inputs() != null) {
            inputs().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("inputs", this.inputs, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExpressionTraces from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExpressionTraces if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExpressionTraces.
     */
    public static ExpressionTraces fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExpressionTraces deserializedExpressionTraces = new ExpressionTraces();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("inputs".equals(fieldName)) {
                    List<ExpressionRoot> inputs = reader.readArray(reader1 -> ExpressionRoot.fromJson(reader1));
                    deserializedExpressionTraces.inputs = inputs;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExpressionTraces;
        });
    }
}
