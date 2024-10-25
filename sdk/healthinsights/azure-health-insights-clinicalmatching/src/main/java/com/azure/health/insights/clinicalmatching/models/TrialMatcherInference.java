// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.clinicalmatching.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * An inference made by the Trial Matcher model regarding a patient.
 */
@Immutable
public final class TrialMatcherInference implements JsonSerializable<TrialMatcherInference> {

    /*
     * The type of the Trial Matcher inference.
     */
    @Generated
    private final TrialMatcherInferenceType type;

    /*
     * The value of the inference, as relevant for the given inference type.
     */
    @Generated
    private final String value;

    /*
     * The description corresponding to the inference value.
     */
    @Generated
    private String description;

    /*
     * Confidence score for this inference.
     */
    @Generated
    private Double confidenceScore;

    /*
     * The evidence corresponding to the inference value.
     */
    @Generated
    private List<TrialMatcherInferenceEvidence> evidence;

    /*
     * The identifier of the clinical trial.
     */
    @Generated
    private String id;

    /*
     * Possible sources of a clinical trial.
     */
    @Generated
    private ClinicalTrialSource source;

    /*
     * Trial data which is of interest to the potential participant.
     */
    @Generated
    private ClinicalTrialMetadata metadata;

    /**
     * Creates an instance of TrialMatcherInference class.
     *
     * @param type the type value to set.
     * @param value the value value to set.
     */
    @Generated
    private TrialMatcherInference(TrialMatcherInferenceType type, String value) {
        this.type = type;
        this.value = value;
    }

    /**
     * Get the type property: The type of the Trial Matcher inference.
     *
     * @return the type value.
     */
    @Generated
    public TrialMatcherInferenceType getType() {
        return this.type;
    }

    /**
     * Get the value property: The value of the inference, as relevant for the given inference type.
     *
     * @return the value value.
     */
    @Generated
    public String getValue() {
        return this.value;
    }

    /**
     * Get the description property: The description corresponding to the inference value.
     *
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Get the confidenceScore property: Confidence score for this inference.
     *
     * @return the confidenceScore value.
     */
    @Generated
    public Double getConfidenceScore() {
        return this.confidenceScore;
    }

    /**
     * Get the evidence property: The evidence corresponding to the inference value.
     *
     * @return the evidence value.
     */
    @Generated
    public List<TrialMatcherInferenceEvidence> getEvidence() {
        return this.evidence;
    }

    /**
     * Get the id property: The identifier of the clinical trial.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the source property: Possible sources of a clinical trial.
     *
     * @return the source value.
     */
    @Generated
    public ClinicalTrialSource getSource() {
        return this.source;
    }

    /**
     * Get the metadata property: Trial data which is of interest to the potential participant.
     *
     * @return the metadata value.
     */
    @Generated
    public ClinicalTrialMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("value", this.value);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeNumberField("confidenceScore", this.confidenceScore);
        jsonWriter.writeArrayField("evidence", this.evidence, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("source", this.source == null ? null : this.source.toString());
        jsonWriter.writeJsonField("metadata", this.metadata);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TrialMatcherInference from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of TrialMatcherInference if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TrialMatcherInference.
     */
    @Generated
    public static TrialMatcherInference fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TrialMatcherInferenceType type = null;
            String value = null;
            String description = null;
            Double confidenceScore = null;
            List<TrialMatcherInferenceEvidence> evidence = null;
            String id = null;
            ClinicalTrialSource source = null;
            ClinicalTrialMetadata metadata = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("type".equals(fieldName)) {
                    type = TrialMatcherInferenceType.fromString(reader.getString());
                } else if ("value".equals(fieldName)) {
                    value = reader.getString();
                } else if ("description".equals(fieldName)) {
                    description = reader.getString();
                } else if ("confidenceScore".equals(fieldName)) {
                    confidenceScore = reader.getNullable(JsonReader::getDouble);
                } else if ("evidence".equals(fieldName)) {
                    evidence = reader.readArray(reader1 -> TrialMatcherInferenceEvidence.fromJson(reader1));
                } else if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("source".equals(fieldName)) {
                    source = ClinicalTrialSource.fromString(reader.getString());
                } else if ("metadata".equals(fieldName)) {
                    metadata = ClinicalTrialMetadata.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            TrialMatcherInference deserializedTrialMatcherInference = new TrialMatcherInference(type, value);
            deserializedTrialMatcherInference.description = description;
            deserializedTrialMatcherInference.confidenceScore = confidenceScore;
            deserializedTrialMatcherInference.evidence = evidence;
            deserializedTrialMatcherInference.id = id;
            deserializedTrialMatcherInference.source = source;
            deserializedTrialMatcherInference.metadata = metadata;
            return deserializedTrialMatcherInference;
        });
    }
}
