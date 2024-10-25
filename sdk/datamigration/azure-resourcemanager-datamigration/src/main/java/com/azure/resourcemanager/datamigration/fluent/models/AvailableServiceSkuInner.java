// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datamigration.models.AvailableServiceSkuCapacity;
import com.azure.resourcemanager.datamigration.models.AvailableServiceSkuSku;
import java.io.IOException;

/**
 * Describes the available service SKU.
 */
@Fluent
public final class AvailableServiceSkuInner implements JsonSerializable<AvailableServiceSkuInner> {
    /*
     * The resource type, including the provider namespace
     */
    private String resourceType;

    /*
     * SKU name, tier, etc.
     */
    private AvailableServiceSkuSku sku;

    /*
     * A description of the scaling capacities of the SKU
     */
    private AvailableServiceSkuCapacity capacity;

    /**
     * Creates an instance of AvailableServiceSkuInner class.
     */
    public AvailableServiceSkuInner() {
    }

    /**
     * Get the resourceType property: The resource type, including the provider namespace.
     * 
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: The resource type, including the provider namespace.
     * 
     * @param resourceType the resourceType value to set.
     * @return the AvailableServiceSkuInner object itself.
     */
    public AvailableServiceSkuInner withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the sku property: SKU name, tier, etc.
     * 
     * @return the sku value.
     */
    public AvailableServiceSkuSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU name, tier, etc.
     * 
     * @param sku the sku value to set.
     * @return the AvailableServiceSkuInner object itself.
     */
    public AvailableServiceSkuInner withSku(AvailableServiceSkuSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the capacity property: A description of the scaling capacities of the SKU.
     * 
     * @return the capacity value.
     */
    public AvailableServiceSkuCapacity capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: A description of the scaling capacities of the SKU.
     * 
     * @param capacity the capacity value to set.
     * @return the AvailableServiceSkuInner object itself.
     */
    public AvailableServiceSkuInner withCapacity(AvailableServiceSkuCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (capacity() != null) {
            capacity().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("resourceType", this.resourceType);
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeJsonField("capacity", this.capacity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvailableServiceSkuInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvailableServiceSkuInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AvailableServiceSkuInner.
     */
    public static AvailableServiceSkuInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvailableServiceSkuInner deserializedAvailableServiceSkuInner = new AvailableServiceSkuInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceType".equals(fieldName)) {
                    deserializedAvailableServiceSkuInner.resourceType = reader.getString();
                } else if ("sku".equals(fieldName)) {
                    deserializedAvailableServiceSkuInner.sku = AvailableServiceSkuSku.fromJson(reader);
                } else if ("capacity".equals(fieldName)) {
                    deserializedAvailableServiceSkuInner.capacity = AvailableServiceSkuCapacity.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvailableServiceSkuInner;
        });
    }
}
