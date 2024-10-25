// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotoperations.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Azure Data Lake endpoint Authentication properties. NOTE Enum - Only one method is supported for one entry.
 */
@Fluent
public final class DataflowEndpointDataLakeStorageAuthentication
    implements JsonSerializable<DataflowEndpointDataLakeStorageAuthentication> {
    /*
     * Mode of Authentication.
     */
    private DataLakeStorageAuthMethod method;

    /*
     * SAS token authentication.
     */
    private DataflowEndpointAuthenticationAccessToken accessTokenSettings;

    /*
     * System-assigned managed identity authentication.
     */
    private DataflowEndpointAuthenticationSystemAssignedManagedIdentity systemAssignedManagedIdentitySettings;

    /*
     * User-assigned managed identity authentication.
     */
    private DataflowEndpointAuthenticationUserAssignedManagedIdentity userAssignedManagedIdentitySettings;

    /**
     * Creates an instance of DataflowEndpointDataLakeStorageAuthentication class.
     */
    public DataflowEndpointDataLakeStorageAuthentication() {
    }

    /**
     * Get the method property: Mode of Authentication.
     * 
     * @return the method value.
     */
    public DataLakeStorageAuthMethod method() {
        return this.method;
    }

    /**
     * Set the method property: Mode of Authentication.
     * 
     * @param method the method value to set.
     * @return the DataflowEndpointDataLakeStorageAuthentication object itself.
     */
    public DataflowEndpointDataLakeStorageAuthentication withMethod(DataLakeStorageAuthMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Get the accessTokenSettings property: SAS token authentication.
     * 
     * @return the accessTokenSettings value.
     */
    public DataflowEndpointAuthenticationAccessToken accessTokenSettings() {
        return this.accessTokenSettings;
    }

    /**
     * Set the accessTokenSettings property: SAS token authentication.
     * 
     * @param accessTokenSettings the accessTokenSettings value to set.
     * @return the DataflowEndpointDataLakeStorageAuthentication object itself.
     */
    public DataflowEndpointDataLakeStorageAuthentication
        withAccessTokenSettings(DataflowEndpointAuthenticationAccessToken accessTokenSettings) {
        this.accessTokenSettings = accessTokenSettings;
        return this;
    }

    /**
     * Get the systemAssignedManagedIdentitySettings property: System-assigned managed identity authentication.
     * 
     * @return the systemAssignedManagedIdentitySettings value.
     */
    public DataflowEndpointAuthenticationSystemAssignedManagedIdentity systemAssignedManagedIdentitySettings() {
        return this.systemAssignedManagedIdentitySettings;
    }

    /**
     * Set the systemAssignedManagedIdentitySettings property: System-assigned managed identity authentication.
     * 
     * @param systemAssignedManagedIdentitySettings the systemAssignedManagedIdentitySettings value to set.
     * @return the DataflowEndpointDataLakeStorageAuthentication object itself.
     */
    public DataflowEndpointDataLakeStorageAuthentication withSystemAssignedManagedIdentitySettings(
        DataflowEndpointAuthenticationSystemAssignedManagedIdentity systemAssignedManagedIdentitySettings) {
        this.systemAssignedManagedIdentitySettings = systemAssignedManagedIdentitySettings;
        return this;
    }

    /**
     * Get the userAssignedManagedIdentitySettings property: User-assigned managed identity authentication.
     * 
     * @return the userAssignedManagedIdentitySettings value.
     */
    public DataflowEndpointAuthenticationUserAssignedManagedIdentity userAssignedManagedIdentitySettings() {
        return this.userAssignedManagedIdentitySettings;
    }

    /**
     * Set the userAssignedManagedIdentitySettings property: User-assigned managed identity authentication.
     * 
     * @param userAssignedManagedIdentitySettings the userAssignedManagedIdentitySettings value to set.
     * @return the DataflowEndpointDataLakeStorageAuthentication object itself.
     */
    public DataflowEndpointDataLakeStorageAuthentication withUserAssignedManagedIdentitySettings(
        DataflowEndpointAuthenticationUserAssignedManagedIdentity userAssignedManagedIdentitySettings) {
        this.userAssignedManagedIdentitySettings = userAssignedManagedIdentitySettings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (method() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property method in model DataflowEndpointDataLakeStorageAuthentication"));
        }
        if (accessTokenSettings() != null) {
            accessTokenSettings().validate();
        }
        if (systemAssignedManagedIdentitySettings() != null) {
            systemAssignedManagedIdentitySettings().validate();
        }
        if (userAssignedManagedIdentitySettings() != null) {
            userAssignedManagedIdentitySettings().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DataflowEndpointDataLakeStorageAuthentication.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("method", this.method == null ? null : this.method.toString());
        jsonWriter.writeJsonField("accessTokenSettings", this.accessTokenSettings);
        jsonWriter.writeJsonField("systemAssignedManagedIdentitySettings", this.systemAssignedManagedIdentitySettings);
        jsonWriter.writeJsonField("userAssignedManagedIdentitySettings", this.userAssignedManagedIdentitySettings);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataflowEndpointDataLakeStorageAuthentication from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataflowEndpointDataLakeStorageAuthentication if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DataflowEndpointDataLakeStorageAuthentication.
     */
    public static DataflowEndpointDataLakeStorageAuthentication fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataflowEndpointDataLakeStorageAuthentication deserializedDataflowEndpointDataLakeStorageAuthentication
                = new DataflowEndpointDataLakeStorageAuthentication();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("method".equals(fieldName)) {
                    deserializedDataflowEndpointDataLakeStorageAuthentication.method
                        = DataLakeStorageAuthMethod.fromString(reader.getString());
                } else if ("accessTokenSettings".equals(fieldName)) {
                    deserializedDataflowEndpointDataLakeStorageAuthentication.accessTokenSettings
                        = DataflowEndpointAuthenticationAccessToken.fromJson(reader);
                } else if ("systemAssignedManagedIdentitySettings".equals(fieldName)) {
                    deserializedDataflowEndpointDataLakeStorageAuthentication.systemAssignedManagedIdentitySettings
                        = DataflowEndpointAuthenticationSystemAssignedManagedIdentity.fromJson(reader);
                } else if ("userAssignedManagedIdentitySettings".equals(fieldName)) {
                    deserializedDataflowEndpointDataLakeStorageAuthentication.userAssignedManagedIdentitySettings
                        = DataflowEndpointAuthenticationUserAssignedManagedIdentity.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataflowEndpointDataLakeStorageAuthentication;
        });
    }
}
