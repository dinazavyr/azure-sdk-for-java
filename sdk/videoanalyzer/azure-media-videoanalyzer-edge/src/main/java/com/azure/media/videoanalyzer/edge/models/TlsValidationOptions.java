// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Options for controlling the validation of TLS endpoints.
 */
@Fluent
public final class TlsValidationOptions implements JsonSerializable<TlsValidationOptions> {
    /*
     * When set to 'true' causes the certificate subject name validation to be skipped. Default is 'false'.
     */
    private String ignoreHostname;

    /*
     * When set to 'true' causes the certificate chain trust validation to be skipped. Default is 'false'.
     */
    private String ignoreSignature;

    /**
     * Creates an instance of TlsValidationOptions class.
     */
    public TlsValidationOptions() {
    }

    /**
     * Get the ignoreHostname property: When set to 'true' causes the certificate subject name validation to be skipped.
     * Default is 'false'.
     * 
     * @return the ignoreHostname value.
     */
    public String getIgnoreHostname() {
        return this.ignoreHostname;
    }

    /**
     * Set the ignoreHostname property: When set to 'true' causes the certificate subject name validation to be skipped.
     * Default is 'false'.
     * 
     * @param ignoreHostname the ignoreHostname value to set.
     * @return the TlsValidationOptions object itself.
     */
    public TlsValidationOptions setIgnoreHostname(String ignoreHostname) {
        this.ignoreHostname = ignoreHostname;
        return this;
    }

    /**
     * Get the ignoreSignature property: When set to 'true' causes the certificate chain trust validation to be skipped.
     * Default is 'false'.
     * 
     * @return the ignoreSignature value.
     */
    public String getIgnoreSignature() {
        return this.ignoreSignature;
    }

    /**
     * Set the ignoreSignature property: When set to 'true' causes the certificate chain trust validation to be skipped.
     * Default is 'false'.
     * 
     * @param ignoreSignature the ignoreSignature value to set.
     * @return the TlsValidationOptions object itself.
     */
    public TlsValidationOptions setIgnoreSignature(String ignoreSignature) {
        this.ignoreSignature = ignoreSignature;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("ignoreHostname", this.ignoreHostname);
        jsonWriter.writeStringField("ignoreSignature", this.ignoreSignature);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TlsValidationOptions from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TlsValidationOptions if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TlsValidationOptions.
     */
    public static TlsValidationOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TlsValidationOptions deserializedTlsValidationOptions = new TlsValidationOptions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ignoreHostname".equals(fieldName)) {
                    deserializedTlsValidationOptions.ignoreHostname = reader.getString();
                } else if ("ignoreSignature".equals(fieldName)) {
                    deserializedTlsValidationOptions.ignoreSignature = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTlsValidationOptions;
        });
    }
}
