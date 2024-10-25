// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The prefix learned type.
 */
public final class LearnedType extends ExpandableStringEnum<LearnedType> {
    /**
     * Static value None for LearnedType.
     */
    public static final LearnedType NONE = fromString("None");

    /**
     * Static value ViaServiceProvider for LearnedType.
     */
    public static final LearnedType VIA_SERVICE_PROVIDER = fromString("ViaServiceProvider");

    /**
     * Static value ViaSession for LearnedType.
     */
    public static final LearnedType VIA_SESSION = fromString("ViaSession");

    /**
     * Creates a new instance of LearnedType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LearnedType() {
    }

    /**
     * Creates or finds a LearnedType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LearnedType.
     */
    public static LearnedType fromString(String name) {
        return fromString(name, LearnedType.class);
    }

    /**
     * Gets known LearnedType values.
     * 
     * @return known LearnedType values.
     */
    public static Collection<LearnedType> values() {
        return values(LearnedType.class);
    }
}
