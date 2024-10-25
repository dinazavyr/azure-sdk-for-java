// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.keys.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.security.keyvault.keys.models.KeyCurveName;
import com.azure.security.keyvault.keys.models.KeyType;
import java.io.IOException;

/**
 * Properties of the key pair backing a certificate.
 */
@Fluent
public final class KeyProperties implements JsonSerializable<KeyProperties> {
    /*
     * Indicates if the private key can be exported. Release policy must be provided when creating the first version of
     * an exportable key.
     */
    private Boolean exportable;

    /*
     * JsonWebKey Key Type (kty), as defined in https://tools.ietf.org/html/draft-ietf-jose-json-web-algorithms-40.
     */
    private KeyType kty;

    /*
     * The key size in bits. For example: 2048, 3072, or 4096 for RSA.
     */
    private Integer keySize;

    /*
     * Indicates if the same key pair will be used on certificate renewal.
     */
    private Boolean reuseKey;

    /*
     * Elliptic curve name.
     */
    private KeyCurveName crv;

    /**
     * Creates an instance of KeyProperties class.
     */
    public KeyProperties() {
    }

    /**
     * Get the exportable property: Indicates if the private key can be exported. Release policy must be provided when
     * creating the first version of an exportable key.
     * 
     * @return the exportable value.
     */
    public Boolean isExportable() {
        return this.exportable;
    }

    /**
     * Set the exportable property: Indicates if the private key can be exported. Release policy must be provided when
     * creating the first version of an exportable key.
     * 
     * @param exportable the exportable value to set.
     * @return the KeyProperties object itself.
     */
    public KeyProperties setExportable(Boolean exportable) {
        this.exportable = exportable;
        return this;
    }

    /**
     * Get the kty property: JsonWebKey Key Type (kty), as defined in
     * https://tools.ietf.org/html/draft-ietf-jose-json-web-algorithms-40.
     * 
     * @return the kty value.
     */
    public KeyType getKty() {
        return this.kty;
    }

    /**
     * Set the kty property: JsonWebKey Key Type (kty), as defined in
     * https://tools.ietf.org/html/draft-ietf-jose-json-web-algorithms-40.
     * 
     * @param kty the kty value to set.
     * @return the KeyProperties object itself.
     */
    public KeyProperties setKty(KeyType kty) {
        this.kty = kty;
        return this;
    }

    /**
     * Get the keySize property: The key size in bits. For example: 2048, 3072, or 4096 for RSA.
     * 
     * @return the keySize value.
     */
    public Integer getKeySize() {
        return this.keySize;
    }

    /**
     * Set the keySize property: The key size in bits. For example: 2048, 3072, or 4096 for RSA.
     * 
     * @param keySize the keySize value to set.
     * @return the KeyProperties object itself.
     */
    public KeyProperties setKeySize(Integer keySize) {
        this.keySize = keySize;
        return this;
    }

    /**
     * Get the reuseKey property: Indicates if the same key pair will be used on certificate renewal.
     * 
     * @return the reuseKey value.
     */
    public Boolean isReuseKey() {
        return this.reuseKey;
    }

    /**
     * Set the reuseKey property: Indicates if the same key pair will be used on certificate renewal.
     * 
     * @param reuseKey the reuseKey value to set.
     * @return the KeyProperties object itself.
     */
    public KeyProperties setReuseKey(Boolean reuseKey) {
        this.reuseKey = reuseKey;
        return this;
    }

    /**
     * Get the crv property: Elliptic curve name.
     * 
     * @return the crv value.
     */
    public KeyCurveName getCrv() {
        return this.crv;
    }

    /**
     * Set the crv property: Elliptic curve name.
     * 
     * @param crv the crv value to set.
     * @return the KeyProperties object itself.
     */
    public KeyProperties setCrv(KeyCurveName crv) {
        this.crv = crv;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("exportable", this.exportable);
        jsonWriter.writeStringField("kty", this.kty == null ? null : this.kty.toString());
        jsonWriter.writeNumberField("key_size", this.keySize);
        jsonWriter.writeBooleanField("reuse_key", this.reuseKey);
        jsonWriter.writeStringField("crv", this.crv == null ? null : this.crv.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KeyProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeyProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the KeyProperties.
     */
    public static KeyProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KeyProperties deserializedKeyProperties = new KeyProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("exportable".equals(fieldName)) {
                    deserializedKeyProperties.exportable = reader.getNullable(JsonReader::getBoolean);
                } else if ("kty".equals(fieldName)) {
                    deserializedKeyProperties.kty = KeyType.fromString(reader.getString());
                } else if ("key_size".equals(fieldName)) {
                    deserializedKeyProperties.keySize = reader.getNullable(JsonReader::getInt);
                } else if ("reuse_key".equals(fieldName)) {
                    deserializedKeyProperties.reuseKey = reader.getNullable(JsonReader::getBoolean);
                } else if ("crv".equals(fieldName)) {
                    deserializedKeyProperties.crv = KeyCurveName.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKeyProperties;
        });
    }
}
