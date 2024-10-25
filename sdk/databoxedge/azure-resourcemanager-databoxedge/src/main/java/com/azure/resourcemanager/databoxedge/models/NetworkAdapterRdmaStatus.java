// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Value indicating whether this adapter is RDMA capable.
 */
public final class NetworkAdapterRdmaStatus extends ExpandableStringEnum<NetworkAdapterRdmaStatus> {
    /**
     * Static value Incapable for NetworkAdapterRdmaStatus.
     */
    public static final NetworkAdapterRdmaStatus INCAPABLE = fromString("Incapable");

    /**
     * Static value Capable for NetworkAdapterRdmaStatus.
     */
    public static final NetworkAdapterRdmaStatus CAPABLE = fromString("Capable");

    /**
     * Creates a new instance of NetworkAdapterRdmaStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NetworkAdapterRdmaStatus() {
    }

    /**
     * Creates or finds a NetworkAdapterRdmaStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding NetworkAdapterRdmaStatus.
     */
    public static NetworkAdapterRdmaStatus fromString(String name) {
        return fromString(name, NetworkAdapterRdmaStatus.class);
    }

    /**
     * Gets known NetworkAdapterRdmaStatus values.
     * 
     * @return known NetworkAdapterRdmaStatus values.
     */
    public static Collection<NetworkAdapterRdmaStatus> values() {
        return values(NetworkAdapterRdmaStatus.class);
    }
}
