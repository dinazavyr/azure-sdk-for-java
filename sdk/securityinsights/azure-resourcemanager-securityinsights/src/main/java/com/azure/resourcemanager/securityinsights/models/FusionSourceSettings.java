// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Represents a supported source signal configuration in Fusion detection.
 */
@Fluent
public final class FusionSourceSettings implements JsonSerializable<FusionSourceSettings> {
    /*
     * Determines whether this source signal is enabled or disabled in Fusion detection.
     */
    private boolean enabled;

    /*
     * Name of the Fusion source signal. Refer to Fusion alert rule template for supported values.
     */
    private String sourceName;

    /*
     * Configuration for all source subtypes under this source signal consumed in fusion detection.
     */
    private List<FusionSourceSubTypeSetting> sourceSubTypes;

    /**
     * Creates an instance of FusionSourceSettings class.
     */
    public FusionSourceSettings() {
    }

    /**
     * Get the enabled property: Determines whether this source signal is enabled or disabled in Fusion detection.
     * 
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Determines whether this source signal is enabled or disabled in Fusion detection.
     * 
     * @param enabled the enabled value to set.
     * @return the FusionSourceSettings object itself.
     */
    public FusionSourceSettings withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the sourceName property: Name of the Fusion source signal. Refer to Fusion alert rule template for supported
     * values.
     * 
     * @return the sourceName value.
     */
    public String sourceName() {
        return this.sourceName;
    }

    /**
     * Set the sourceName property: Name of the Fusion source signal. Refer to Fusion alert rule template for supported
     * values.
     * 
     * @param sourceName the sourceName value to set.
     * @return the FusionSourceSettings object itself.
     */
    public FusionSourceSettings withSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
     * Get the sourceSubTypes property: Configuration for all source subtypes under this source signal consumed in
     * fusion detection.
     * 
     * @return the sourceSubTypes value.
     */
    public List<FusionSourceSubTypeSetting> sourceSubTypes() {
        return this.sourceSubTypes;
    }

    /**
     * Set the sourceSubTypes property: Configuration for all source subtypes under this source signal consumed in
     * fusion detection.
     * 
     * @param sourceSubTypes the sourceSubTypes value to set.
     * @return the FusionSourceSettings object itself.
     */
    public FusionSourceSettings withSourceSubTypes(List<FusionSourceSubTypeSetting> sourceSubTypes) {
        this.sourceSubTypes = sourceSubTypes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceName() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property sourceName in model FusionSourceSettings"));
        }
        if (sourceSubTypes() != null) {
            sourceSubTypes().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FusionSourceSettings.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeStringField("sourceName", this.sourceName);
        jsonWriter.writeArrayField("sourceSubTypes", this.sourceSubTypes,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FusionSourceSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FusionSourceSettings if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FusionSourceSettings.
     */
    public static FusionSourceSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FusionSourceSettings deserializedFusionSourceSettings = new FusionSourceSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedFusionSourceSettings.enabled = reader.getBoolean();
                } else if ("sourceName".equals(fieldName)) {
                    deserializedFusionSourceSettings.sourceName = reader.getString();
                } else if ("sourceSubTypes".equals(fieldName)) {
                    List<FusionSourceSubTypeSetting> sourceSubTypes
                        = reader.readArray(reader1 -> FusionSourceSubTypeSetting.fromJson(reader1));
                    deserializedFusionSourceSettings.sourceSubTypes = sourceSubTypes;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFusionSourceSettings;
        });
    }
}
