// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specifies the align mode between Virtual Machine Scale Set compute and storage Fault Domain count.
 */
public final class ZonalPlatformFaultDomainAlignMode extends ExpandableStringEnum<ZonalPlatformFaultDomainAlignMode> {
    /**
     * Static value Aligned for ZonalPlatformFaultDomainAlignMode.
     */
    public static final ZonalPlatformFaultDomainAlignMode ALIGNED = fromString("Aligned");

    /**
     * Static value Unaligned for ZonalPlatformFaultDomainAlignMode.
     */
    public static final ZonalPlatformFaultDomainAlignMode UNALIGNED = fromString("Unaligned");

    /**
     * Creates a new instance of ZonalPlatformFaultDomainAlignMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ZonalPlatformFaultDomainAlignMode() {
    }

    /**
     * Creates or finds a ZonalPlatformFaultDomainAlignMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ZonalPlatformFaultDomainAlignMode.
     */
    public static ZonalPlatformFaultDomainAlignMode fromString(String name) {
        return fromString(name, ZonalPlatformFaultDomainAlignMode.class);
    }

    /**
     * Gets known ZonalPlatformFaultDomainAlignMode values.
     * 
     * @return known ZonalPlatformFaultDomainAlignMode values.
     */
    public static Collection<ZonalPlatformFaultDomainAlignMode> values() {
        return values(ZonalPlatformFaultDomainAlignMode.class);
    }
}
