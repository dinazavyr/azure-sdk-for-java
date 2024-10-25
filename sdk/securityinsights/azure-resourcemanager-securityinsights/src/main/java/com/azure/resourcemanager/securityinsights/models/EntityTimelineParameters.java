// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * The parameters required to execute s timeline operation on the given entity.
 */
@Fluent
public final class EntityTimelineParameters implements JsonSerializable<EntityTimelineParameters> {
    /*
     * Array of timeline Item kinds.
     */
    private List<EntityTimelineKind> kinds;

    /*
     * The start timeline date, so the results returned are after this date.
     */
    private OffsetDateTime startTime;

    /*
     * The end timeline date, so the results returned are before this date.
     */
    private OffsetDateTime endTime;

    /*
     * The number of bucket for timeline queries aggregation.
     */
    private Integer numberOfBucket;

    /**
     * Creates an instance of EntityTimelineParameters class.
     */
    public EntityTimelineParameters() {
    }

    /**
     * Get the kinds property: Array of timeline Item kinds.
     * 
     * @return the kinds value.
     */
    public List<EntityTimelineKind> kinds() {
        return this.kinds;
    }

    /**
     * Set the kinds property: Array of timeline Item kinds.
     * 
     * @param kinds the kinds value to set.
     * @return the EntityTimelineParameters object itself.
     */
    public EntityTimelineParameters withKinds(List<EntityTimelineKind> kinds) {
        this.kinds = kinds;
        return this;
    }

    /**
     * Get the startTime property: The start timeline date, so the results returned are after this date.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start timeline date, so the results returned are after this date.
     * 
     * @param startTime the startTime value to set.
     * @return the EntityTimelineParameters object itself.
     */
    public EntityTimelineParameters withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The end timeline date, so the results returned are before this date.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end timeline date, so the results returned are before this date.
     * 
     * @param endTime the endTime value to set.
     * @return the EntityTimelineParameters object itself.
     */
    public EntityTimelineParameters withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the numberOfBucket property: The number of bucket for timeline queries aggregation.
     * 
     * @return the numberOfBucket value.
     */
    public Integer numberOfBucket() {
        return this.numberOfBucket;
    }

    /**
     * Set the numberOfBucket property: The number of bucket for timeline queries aggregation.
     * 
     * @param numberOfBucket the numberOfBucket value to set.
     * @return the EntityTimelineParameters object itself.
     */
    public EntityTimelineParameters withNumberOfBucket(Integer numberOfBucket) {
        this.numberOfBucket = numberOfBucket;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (startTime() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property startTime in model EntityTimelineParameters"));
        }
        if (endTime() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property endTime in model EntityTimelineParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EntityTimelineParameters.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("startTime",
            this.startTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.startTime));
        jsonWriter.writeStringField("endTime",
            this.endTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.endTime));
        jsonWriter.writeArrayField("kinds", this.kinds,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeNumberField("numberOfBucket", this.numberOfBucket);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EntityTimelineParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EntityTimelineParameters if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the EntityTimelineParameters.
     */
    public static EntityTimelineParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EntityTimelineParameters deserializedEntityTimelineParameters = new EntityTimelineParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("startTime".equals(fieldName)) {
                    deserializedEntityTimelineParameters.startTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("endTime".equals(fieldName)) {
                    deserializedEntityTimelineParameters.endTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("kinds".equals(fieldName)) {
                    List<EntityTimelineKind> kinds
                        = reader.readArray(reader1 -> EntityTimelineKind.fromString(reader1.getString()));
                    deserializedEntityTimelineParameters.kinds = kinds;
                } else if ("numberOfBucket".equals(fieldName)) {
                    deserializedEntityTimelineParameters.numberOfBucket = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEntityTimelineParameters;
        });
    }
}
