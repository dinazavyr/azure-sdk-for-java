// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Grant status.
 */
public final class GrantStatus extends ExpandableStringEnum<GrantStatus> {
    /**
     * Static value Active for GrantStatus.
     */
    public static final GrantStatus ACTIVE = fromString("Active");

    /**
     * Static value Inactive for GrantStatus.
     */
    public static final GrantStatus INACTIVE = fromString("Inactive");

    /**
     * Creates a new instance of GrantStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public GrantStatus() {
    }

    /**
     * Creates or finds a GrantStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding GrantStatus.
     */
    public static GrantStatus fromString(String name) {
        return fromString(name, GrantStatus.class);
    }

    /**
     * Gets known GrantStatus values.
     * 
     * @return known GrantStatus values.
     */
    public static Collection<GrantStatus> values() {
        return values(GrantStatus.class);
    }
}
