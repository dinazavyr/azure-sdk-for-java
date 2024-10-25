// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/**
 * All identity configuration for Customer-managed key settings defining which identity should be used to auth to Key
 * Vault.
 */
@Fluent
public final class CustomerManagedKeyEncryptionKeyIdentity {
    /*
     * Values can be systemAssignedIdentity or userAssignedIdentity
     */
    @JsonProperty(value = "identityType")
    private IdentityType identityType;

    /*
     * user assigned identity to use for accessing key encryption key Url. Ex:
     * /subscriptions/fa5fc227-a624-475e-b696-cdd604c735bc/resourceGroups/<resource
     * group>/providers/Microsoft.ManagedIdentity/userAssignedIdentities/myId. Mutually exclusive with identityType
     * systemAssignedIdentity and delegatedResourceIdentity.
     */
    @JsonProperty(value = "userAssignedIdentityResourceId")
    private String userAssignedIdentityResourceId;

    /*
     * delegated identity to use for accessing key encryption key Url. Ex:
     * /subscriptions/fa5fc227-a624-475e-b696-cdd604c735bc/resourceGroups/<resource
     * group>/providers/Microsoft.ManagedIdentity/userAssignedIdentities/myId. Mutually exclusive with identityType
     * systemAssignedIdentity and userAssignedIdentity - internal use only.
     */
    @JsonProperty(value = "delegatedIdentityClientId")
    private UUID delegatedIdentityClientId;

    /** Creates an instance of CustomerManagedKeyEncryptionKeyIdentity class. */
    public CustomerManagedKeyEncryptionKeyIdentity() {
    }

    /**
     * Get the identityType property: Values can be systemAssignedIdentity or userAssignedIdentity.
     *
     * @return the identityType value.
     */
    public IdentityType identityType() {
        return this.identityType;
    }

    /**
     * Set the identityType property: Values can be systemAssignedIdentity or userAssignedIdentity.
     *
     * @param identityType the identityType value to set.
     * @return the CustomerManagedKeyEncryptionKeyIdentity object itself.
     */
    public CustomerManagedKeyEncryptionKeyIdentity withIdentityType(IdentityType identityType) {
        this.identityType = identityType;
        return this;
    }

    /**
     * Get the userAssignedIdentityResourceId property: user assigned identity to use for accessing key encryption key
     * Url. Ex: /subscriptions/fa5fc227-a624-475e-b696-cdd604c735bc/resourceGroups/&lt;resource
     * group&gt;/providers/Microsoft.ManagedIdentity/userAssignedIdentities/myId. Mutually exclusive with identityType
     * systemAssignedIdentity and delegatedResourceIdentity.
     *
     * @return the userAssignedIdentityResourceId value.
     */
    public String userAssignedIdentityResourceId() {
        return this.userAssignedIdentityResourceId;
    }

    /**
     * Set the userAssignedIdentityResourceId property: user assigned identity to use for accessing key encryption key
     * Url. Ex: /subscriptions/fa5fc227-a624-475e-b696-cdd604c735bc/resourceGroups/&lt;resource
     * group&gt;/providers/Microsoft.ManagedIdentity/userAssignedIdentities/myId. Mutually exclusive with identityType
     * systemAssignedIdentity and delegatedResourceIdentity.
     *
     * @param userAssignedIdentityResourceId the userAssignedIdentityResourceId value to set.
     * @return the CustomerManagedKeyEncryptionKeyIdentity object itself.
     */
    public CustomerManagedKeyEncryptionKeyIdentity
        withUserAssignedIdentityResourceId(String userAssignedIdentityResourceId) {
        this.userAssignedIdentityResourceId = userAssignedIdentityResourceId;
        return this;
    }

    /**
     * Get the delegatedIdentityClientId property: delegated identity to use for accessing key encryption key Url. Ex:
     * /subscriptions/fa5fc227-a624-475e-b696-cdd604c735bc/resourceGroups/&lt;resource
     * group&gt;/providers/Microsoft.ManagedIdentity/userAssignedIdentities/myId. Mutually exclusive with identityType
     * systemAssignedIdentity and userAssignedIdentity - internal use only.
     *
     * @return the delegatedIdentityClientId value.
     */
    public UUID delegatedIdentityClientId() {
        return this.delegatedIdentityClientId;
    }

    /**
     * Set the delegatedIdentityClientId property: delegated identity to use for accessing key encryption key Url. Ex:
     * /subscriptions/fa5fc227-a624-475e-b696-cdd604c735bc/resourceGroups/&lt;resource
     * group&gt;/providers/Microsoft.ManagedIdentity/userAssignedIdentities/myId. Mutually exclusive with identityType
     * systemAssignedIdentity and userAssignedIdentity - internal use only.
     *
     * @param delegatedIdentityClientId the delegatedIdentityClientId value to set.
     * @return the CustomerManagedKeyEncryptionKeyIdentity object itself.
     */
    public CustomerManagedKeyEncryptionKeyIdentity withDelegatedIdentityClientId(UUID delegatedIdentityClientId) {
        this.delegatedIdentityClientId = delegatedIdentityClientId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
