// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.certificates.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The certificate issuer list result.
 */
@Immutable
public final class CertificateIssuerListResult implements JsonSerializable<CertificateIssuerListResult> {
    /*
     * A response message containing a list of certificate issuers in the key vault along with a link to the next page
     * of certificate issuers.
     */
    private List<CertificateIssuerItem> value;

    /*
     * The URL to get the next set of certificate issuers.
     */
    private String nextLink;

    /**
     * Creates an instance of CertificateIssuerListResult class.
     */
    public CertificateIssuerListResult() {
    }

    /**
     * Get the value property: A response message containing a list of certificate issuers in the key vault along with a
     * link to the next page of certificate issuers.
     * 
     * @return the value value.
     */
    public List<CertificateIssuerItem> getValue() {
        return this.value;
    }

    /**
     * Get the nextLink property: The URL to get the next set of certificate issuers.
     * 
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
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
     * Reads an instance of CertificateIssuerListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CertificateIssuerListResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CertificateIssuerListResult.
     */
    public static CertificateIssuerListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CertificateIssuerListResult deserializedCertificateIssuerListResult = new CertificateIssuerListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<CertificateIssuerItem> value
                        = reader.readArray(reader1 -> CertificateIssuerItem.fromJson(reader1));
                    deserializedCertificateIssuerListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedCertificateIssuerListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCertificateIssuerListResult;
        });
    }
}
