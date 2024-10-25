// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotoperations.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * DataflowEndpoint Authentication Sasl Type properties.
 */
public final class DataflowEndpointAuthenticationSaslType
    extends ExpandableStringEnum<DataflowEndpointAuthenticationSaslType> {
    /**
     * PLAIN Type.
     */
    public static final DataflowEndpointAuthenticationSaslType PLAIN = fromString("Plain");

    /**
     * SCRAM_SHA_256 Type.
     */
    public static final DataflowEndpointAuthenticationSaslType SCRAM_SHA256 = fromString("ScramSha256");

    /**
     * SCRAM_SHA_512 Type.
     */
    public static final DataflowEndpointAuthenticationSaslType SCRAM_SHA512 = fromString("ScramSha512");

    /**
     * Creates a new instance of DataflowEndpointAuthenticationSaslType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DataflowEndpointAuthenticationSaslType() {
    }

    /**
     * Creates or finds a DataflowEndpointAuthenticationSaslType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DataflowEndpointAuthenticationSaslType.
     */
    public static DataflowEndpointAuthenticationSaslType fromString(String name) {
        return fromString(name, DataflowEndpointAuthenticationSaslType.class);
    }

    /**
     * Gets known DataflowEndpointAuthenticationSaslType values.
     * 
     * @return known DataflowEndpointAuthenticationSaslType values.
     */
    public static Collection<DataflowEndpointAuthenticationSaslType> values() {
        return values(DataflowEndpointAuthenticationSaslType.class);
    }
}
