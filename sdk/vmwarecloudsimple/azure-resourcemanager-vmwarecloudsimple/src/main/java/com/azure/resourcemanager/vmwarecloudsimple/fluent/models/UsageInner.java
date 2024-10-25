// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.vmwarecloudsimple.models.UsageCount;
import com.azure.resourcemanager.vmwarecloudsimple.models.UsageName;
import java.io.IOException;

/**
 * Usage model.
 */
@Fluent
public final class UsageInner implements JsonSerializable<UsageInner> {
    /*
     * The current usage value
     */
    private int currentValue;

    /*
     * limit of a given sku in a region for a subscription. The maximum permitted value for the usage quota. If there is
     * no limit, this value will be -1
     */
    private int limit;

    /*
     * Usage name value and localized name
     */
    private UsageName name;

    /*
     * The usages' unit
     */
    private UsageCount unit;

    /**
     * Creates an instance of UsageInner class.
     */
    public UsageInner() {
    }

    /**
     * Get the currentValue property: The current usage value.
     * 
     * @return the currentValue value.
     */
    public int currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue property: The current usage value.
     * 
     * @param currentValue the currentValue value to set.
     * @return the UsageInner object itself.
     */
    public UsageInner withCurrentValue(int currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the limit property: limit of a given sku in a region for a subscription. The maximum permitted value for the
     * usage quota. If there is no limit, this value will be -1.
     * 
     * @return the limit value.
     */
    public int limit() {
        return this.limit;
    }

    /**
     * Set the limit property: limit of a given sku in a region for a subscription. The maximum permitted value for the
     * usage quota. If there is no limit, this value will be -1.
     * 
     * @param limit the limit value to set.
     * @return the UsageInner object itself.
     */
    public UsageInner withLimit(int limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the name property: Usage name value and localized name.
     * 
     * @return the name value.
     */
    public UsageName name() {
        return this.name;
    }

    /**
     * Set the name property: Usage name value and localized name.
     * 
     * @param name the name value to set.
     * @return the UsageInner object itself.
     */
    public UsageInner withName(UsageName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the unit property: The usages' unit.
     * 
     * @return the unit value.
     */
    public UsageCount unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The usages' unit.
     * 
     * @param unit the unit value to set.
     * @return the UsageInner object itself.
     */
    public UsageInner withUnit(UsageCount unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() != null) {
            name().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("currentValue", this.currentValue);
        jsonWriter.writeIntField("limit", this.limit);
        jsonWriter.writeJsonField("name", this.name);
        jsonWriter.writeStringField("unit", this.unit == null ? null : this.unit.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UsageInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UsageInner if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the UsageInner.
     */
    public static UsageInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UsageInner deserializedUsageInner = new UsageInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("currentValue".equals(fieldName)) {
                    deserializedUsageInner.currentValue = reader.getInt();
                } else if ("limit".equals(fieldName)) {
                    deserializedUsageInner.limit = reader.getInt();
                } else if ("name".equals(fieldName)) {
                    deserializedUsageInner.name = UsageName.fromJson(reader);
                } else if ("unit".equals(fieldName)) {
                    deserializedUsageInner.unit = UsageCount.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUsageInner;
        });
    }
}
