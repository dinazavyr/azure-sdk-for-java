// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.securityinsights.models.EntityTimelineItem;
import com.azure.resourcemanager.securityinsights.models.TimelineResultsMetadata;
import java.io.IOException;
import java.util.List;

/**
 * The entity timeline result operation response.
 */
@Fluent
public final class EntityTimelineResponseInner implements JsonSerializable<EntityTimelineResponseInner> {
    /*
     * The metadata from the timeline operation results.
     */
    private TimelineResultsMetadata metadata;

    /*
     * The timeline result values.
     */
    private List<EntityTimelineItem> value;

    /**
     * Creates an instance of EntityTimelineResponseInner class.
     */
    public EntityTimelineResponseInner() {
    }

    /**
     * Get the metadata property: The metadata from the timeline operation results.
     * 
     * @return the metadata value.
     */
    public TimelineResultsMetadata metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata from the timeline operation results.
     * 
     * @param metadata the metadata value to set.
     * @return the EntityTimelineResponseInner object itself.
     */
    public EntityTimelineResponseInner withMetadata(TimelineResultsMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the value property: The timeline result values.
     * 
     * @return the value value.
     */
    public List<EntityTimelineItem> value() {
        return this.value;
    }

    /**
     * Set the value property: The timeline result values.
     * 
     * @param value the value value to set.
     * @return the EntityTimelineResponseInner object itself.
     */
    public EntityTimelineResponseInner withValue(List<EntityTimelineItem> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metadata() != null) {
            metadata().validate();
        }
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
        jsonWriter.writeJsonField("metaData", this.metadata);
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EntityTimelineResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EntityTimelineResponseInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EntityTimelineResponseInner.
     */
    public static EntityTimelineResponseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EntityTimelineResponseInner deserializedEntityTimelineResponseInner = new EntityTimelineResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("metaData".equals(fieldName)) {
                    deserializedEntityTimelineResponseInner.metadata = TimelineResultsMetadata.fromJson(reader);
                } else if ("value".equals(fieldName)) {
                    List<EntityTimelineItem> value = reader.readArray(reader1 -> EntityTimelineItem.fromJson(reader1));
                    deserializedEntityTimelineResponseInner.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEntityTimelineResponseInner;
        });
    }
}
