// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Metadata information used by account encryption.
 */
@Fluent
public final class KeyVaultMetaInfo implements JsonSerializable<KeyVaultMetaInfo> {
    /*
     * The resource identifier for the user managed Key Vault being used to encrypt.
     */
    private String keyVaultResourceId;

    /*
     * The name of the user managed encryption key.
     */
    private String encryptionKeyName;

    /*
     * The version of the user managed encryption key.
     */
    private String encryptionKeyVersion;

    /**
     * Creates an instance of KeyVaultMetaInfo class.
     */
    public KeyVaultMetaInfo() {
    }

    /**
     * Get the keyVaultResourceId property: The resource identifier for the user managed Key Vault being used to
     * encrypt.
     * 
     * @return the keyVaultResourceId value.
     */
    public String keyVaultResourceId() {
        return this.keyVaultResourceId;
    }

    /**
     * Set the keyVaultResourceId property: The resource identifier for the user managed Key Vault being used to
     * encrypt.
     * 
     * @param keyVaultResourceId the keyVaultResourceId value to set.
     * @return the KeyVaultMetaInfo object itself.
     */
    public KeyVaultMetaInfo withKeyVaultResourceId(String keyVaultResourceId) {
        this.keyVaultResourceId = keyVaultResourceId;
        return this;
    }

    /**
     * Get the encryptionKeyName property: The name of the user managed encryption key.
     * 
     * @return the encryptionKeyName value.
     */
    public String encryptionKeyName() {
        return this.encryptionKeyName;
    }

    /**
     * Set the encryptionKeyName property: The name of the user managed encryption key.
     * 
     * @param encryptionKeyName the encryptionKeyName value to set.
     * @return the KeyVaultMetaInfo object itself.
     */
    public KeyVaultMetaInfo withEncryptionKeyName(String encryptionKeyName) {
        this.encryptionKeyName = encryptionKeyName;
        return this;
    }

    /**
     * Get the encryptionKeyVersion property: The version of the user managed encryption key.
     * 
     * @return the encryptionKeyVersion value.
     */
    public String encryptionKeyVersion() {
        return this.encryptionKeyVersion;
    }

    /**
     * Set the encryptionKeyVersion property: The version of the user managed encryption key.
     * 
     * @param encryptionKeyVersion the encryptionKeyVersion value to set.
     * @return the KeyVaultMetaInfo object itself.
     */
    public KeyVaultMetaInfo withEncryptionKeyVersion(String encryptionKeyVersion) {
        this.encryptionKeyVersion = encryptionKeyVersion;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVaultResourceId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property keyVaultResourceId in model KeyVaultMetaInfo"));
        }
        if (encryptionKeyName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property encryptionKeyName in model KeyVaultMetaInfo"));
        }
        if (encryptionKeyVersion() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property encryptionKeyVersion in model KeyVaultMetaInfo"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(KeyVaultMetaInfo.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("keyVaultResourceId", this.keyVaultResourceId);
        jsonWriter.writeStringField("encryptionKeyName", this.encryptionKeyName);
        jsonWriter.writeStringField("encryptionKeyVersion", this.encryptionKeyVersion);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KeyVaultMetaInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeyVaultMetaInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the KeyVaultMetaInfo.
     */
    public static KeyVaultMetaInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KeyVaultMetaInfo deserializedKeyVaultMetaInfo = new KeyVaultMetaInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("keyVaultResourceId".equals(fieldName)) {
                    deserializedKeyVaultMetaInfo.keyVaultResourceId = reader.getString();
                } else if ("encryptionKeyName".equals(fieldName)) {
                    deserializedKeyVaultMetaInfo.encryptionKeyName = reader.getString();
                } else if ("encryptionKeyVersion".equals(fieldName)) {
                    deserializedKeyVaultMetaInfo.encryptionKeyVersion = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKeyVaultMetaInfo;
        });
    }
}
