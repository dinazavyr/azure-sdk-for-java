// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties of resource pool.
 */
@Immutable
public final class ResourcePoolProperties implements JsonSerializable<ResourcePoolProperties> {
    /*
     * Hierarchical resource pool name
     */
    private String fullName;

    /**
     * Creates an instance of ResourcePoolProperties class.
     */
    public ResourcePoolProperties() {
    }

    /**
     * Get the fullName property: Hierarchical resource pool name.
     * 
     * @return the fullName value.
     */
    public String fullName() {
        return this.fullName;
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
     * Reads an instance of ResourcePoolProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourcePoolProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourcePoolProperties.
     */
    public static ResourcePoolProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourcePoolProperties deserializedResourcePoolProperties = new ResourcePoolProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("fullName".equals(fieldName)) {
                    deserializedResourcePoolProperties.fullName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourcePoolProperties;
        });
    }
}
