// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Key Vault input properties for encryption. */
@Fluent
public final class ManagedDiskEncryptionKeyVaultProperties {
    /*
     * The URI of KeyVault.
     */
    @JsonProperty(value = "keyVaultUri", required = true)
    private String keyVaultUri;

    /*
     * The name of KeyVault key.
     */
    @JsonProperty(value = "keyName", required = true)
    private String keyName;

    /*
     * The version of KeyVault key.
     */
    @JsonProperty(value = "keyVersion", required = true)
    private String keyVersion;

    /** Creates an instance of ManagedDiskEncryptionKeyVaultProperties class. */
    public ManagedDiskEncryptionKeyVaultProperties() {
    }

    /**
     * Get the keyVaultUri property: The URI of KeyVault.
     *
     * @return the keyVaultUri value.
     */
    public String keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * Set the keyVaultUri property: The URI of KeyVault.
     *
     * @param keyVaultUri the keyVaultUri value to set.
     * @return the ManagedDiskEncryptionKeyVaultProperties object itself.
     */
    public ManagedDiskEncryptionKeyVaultProperties withKeyVaultUri(String keyVaultUri) {
        this.keyVaultUri = keyVaultUri;
        return this;
    }

    /**
     * Get the keyName property: The name of KeyVault key.
     *
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: The name of KeyVault key.
     *
     * @param keyName the keyName value to set.
     * @return the ManagedDiskEncryptionKeyVaultProperties object itself.
     */
    public ManagedDiskEncryptionKeyVaultProperties withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the keyVersion property: The version of KeyVault key.
     *
     * @return the keyVersion value.
     */
    public String keyVersion() {
        return this.keyVersion;
    }

    /**
     * Set the keyVersion property: The version of KeyVault key.
     *
     * @param keyVersion the keyVersion value to set.
     * @return the ManagedDiskEncryptionKeyVaultProperties object itself.
     */
    public ManagedDiskEncryptionKeyVaultProperties withKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVaultUri() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property keyVaultUri in model ManagedDiskEncryptionKeyVaultProperties"));
        }
        if (keyName() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property keyName in model ManagedDiskEncryptionKeyVaultProperties"));
        }
        if (keyVersion() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property keyVersion in model ManagedDiskEncryptionKeyVaultProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedDiskEncryptionKeyVaultProperties.class);
}
