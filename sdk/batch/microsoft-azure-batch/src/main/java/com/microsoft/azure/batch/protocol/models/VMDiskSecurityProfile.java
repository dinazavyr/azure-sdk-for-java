/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the security profile settings for the managed disk. **Note**: It
 * can only be set for Confidential VMs and required when using Confidential
 * VMs.
 */
public class VMDiskSecurityProfile {
    /**
     * Specifies the EncryptionType of the managed disk. It is set to
     * VMGuestStateOnly for encryption of just the VMGuestState blob, and
     * NonPersistedTPM for not persisting firmware state in the VMGuestState
     * blob. **Note**: It can be set for only Confidential VMs and is required
     * when using Confidential VMs.
     * Possible values include: 'NonPersistedTPM', 'VMGuestStateOnly'.
     */
    @JsonProperty(value = "securityEncryptionType")
    private SecurityEncryptionTypes securityEncryptionType;

    /**
     * Get possible values include: 'NonPersistedTPM', 'VMGuestStateOnly'.
     *
     * @return the securityEncryptionType value
     */
    public SecurityEncryptionTypes securityEncryptionType() {
        return this.securityEncryptionType;
    }

    /**
     * Set possible values include: 'NonPersistedTPM', 'VMGuestStateOnly'.
     *
     * @param securityEncryptionType the securityEncryptionType value to set
     * @return the VMDiskSecurityProfile object itself.
     */
    public VMDiskSecurityProfile withSecurityEncryptionType(SecurityEncryptionTypes securityEncryptionType) {
        this.securityEncryptionType = securityEncryptionType;
        return this;
    }

}
