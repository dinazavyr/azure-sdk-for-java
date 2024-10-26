// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * All identity configuration for Customer-managed key settings defining which identity should be used to auth to Key
 * Vault.
 */
@Fluent
public final class ClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity
    implements JsonSerializable<ClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity> {
    /*
     * User assigned identity to use for accessing key encryption key Url. Ex: /subscriptions/<sub
     * uuid>/resourceGroups/<resource group>/providers/Microsoft.ManagedIdentity/userAssignedIdentities/myId.
     */
    private String userAssignedIdentityResourceId;

    /*
     * Only userAssignedIdentity is supported in this API version; other types may be supported in the future
     */
    private CmkIdentityType identityType;

    /**
     * Creates an instance of ClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity class.
     */
    public ClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity() {
    }

    /**
     * Get the userAssignedIdentityResourceId property: User assigned identity to use for accessing key encryption key
     * Url. Ex: /subscriptions/&lt;sub uuid&gt;/resourceGroups/&lt;resource
     * group&gt;/providers/Microsoft.ManagedIdentity/userAssignedIdentities/myId.
     * 
     * @return the userAssignedIdentityResourceId value.
     */
    public String userAssignedIdentityResourceId() {
        return this.userAssignedIdentityResourceId;
    }

    /**
     * Set the userAssignedIdentityResourceId property: User assigned identity to use for accessing key encryption key
     * Url. Ex: /subscriptions/&lt;sub uuid&gt;/resourceGroups/&lt;resource
     * group&gt;/providers/Microsoft.ManagedIdentity/userAssignedIdentities/myId.
     * 
     * @param userAssignedIdentityResourceId the userAssignedIdentityResourceId value to set.
     * @return the ClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity object itself.
     */
    public ClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity
        withUserAssignedIdentityResourceId(String userAssignedIdentityResourceId) {
        this.userAssignedIdentityResourceId = userAssignedIdentityResourceId;
        return this;
    }

    /**
     * Get the identityType property: Only userAssignedIdentity is supported in this API version; other types may be
     * supported in the future.
     * 
     * @return the identityType value.
     */
    public CmkIdentityType identityType() {
        return this.identityType;
    }

    /**
     * Set the identityType property: Only userAssignedIdentity is supported in this API version; other types may be
     * supported in the future.
     * 
     * @param identityType the identityType value to set.
     * @return the ClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity object itself.
     */
    public ClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity
        withIdentityType(CmkIdentityType identityType) {
        this.identityType = identityType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("userAssignedIdentityResourceId", this.userAssignedIdentityResourceId);
        jsonWriter.writeStringField("identityType", this.identityType == null ? null : this.identityType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity if the JsonReader was
     * pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the
     * ClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity.
     */
    public static ClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity deserializedClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity
                = new ClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("userAssignedIdentityResourceId".equals(fieldName)) {
                    deserializedClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity.userAssignedIdentityResourceId
                        = reader.getString();
                } else if ("identityType".equals(fieldName)) {
                    deserializedClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity.identityType
                        = CmkIdentityType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterPropertiesEncryptionCustomerManagedKeyEncryptionKeyIdentity;
        });
    }
}
