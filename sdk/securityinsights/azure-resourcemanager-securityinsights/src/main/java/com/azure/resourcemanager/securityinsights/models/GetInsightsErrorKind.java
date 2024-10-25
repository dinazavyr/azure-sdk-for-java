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

/**
 * GetInsights Query Errors.
 */
@Fluent
public final class GetInsightsErrorKind implements JsonSerializable<GetInsightsErrorKind> {
    /*
     * the query kind
     */
    private GetInsightsError kind;

    /*
     * the query id
     */
    private String queryId;

    /*
     * the error message
     */
    private String errorMessage;

    /**
     * Creates an instance of GetInsightsErrorKind class.
     */
    public GetInsightsErrorKind() {
    }

    /**
     * Get the kind property: the query kind.
     * 
     * @return the kind value.
     */
    public GetInsightsError kind() {
        return this.kind;
    }

    /**
     * Set the kind property: the query kind.
     * 
     * @param kind the kind value to set.
     * @return the GetInsightsErrorKind object itself.
     */
    public GetInsightsErrorKind withKind(GetInsightsError kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the queryId property: the query id.
     * 
     * @return the queryId value.
     */
    public String queryId() {
        return this.queryId;
    }

    /**
     * Set the queryId property: the query id.
     * 
     * @param queryId the queryId value to set.
     * @return the GetInsightsErrorKind object itself.
     */
    public GetInsightsErrorKind withQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * Get the errorMessage property: the error message.
     * 
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: the error message.
     * 
     * @param errorMessage the errorMessage value to set.
     * @return the GetInsightsErrorKind object itself.
     */
    public GetInsightsErrorKind withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (kind() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property kind in model GetInsightsErrorKind"));
        }
        if (errorMessage() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property errorMessage in model GetInsightsErrorKind"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GetInsightsErrorKind.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        jsonWriter.writeStringField("errorMessage", this.errorMessage);
        jsonWriter.writeStringField("queryId", this.queryId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GetInsightsErrorKind from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GetInsightsErrorKind if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GetInsightsErrorKind.
     */
    public static GetInsightsErrorKind fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GetInsightsErrorKind deserializedGetInsightsErrorKind = new GetInsightsErrorKind();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("kind".equals(fieldName)) {
                    deserializedGetInsightsErrorKind.kind = GetInsightsError.fromString(reader.getString());
                } else if ("errorMessage".equals(fieldName)) {
                    deserializedGetInsightsErrorKind.errorMessage = reader.getString();
                } else if ("queryId".equals(fieldName)) {
                    deserializedGetInsightsErrorKind.queryId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGetInsightsErrorKind;
        });
    }
}
