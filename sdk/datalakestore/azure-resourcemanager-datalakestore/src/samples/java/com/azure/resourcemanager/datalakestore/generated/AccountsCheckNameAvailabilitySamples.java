// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.generated;

import com.azure.resourcemanager.datalakestore.models.CheckNameAvailabilityParameters;

/**
 * Samples for Accounts CheckNameAvailability.
 */
public final class AccountsCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file:
     * specification/datalake-store/resource-manager/Microsoft.DataLakeStore/stable/2016-11-01/examples/
     * Accounts_CheckNameAvailability.json
     */
    /**
     * Sample code: Checks whether the specified account name is available or taken.
     * 
     * @param manager Entry point to DataLakeStoreManager.
     */
    public static void checksWhetherTheSpecifiedAccountNameIsAvailableOrTaken(
        com.azure.resourcemanager.datalakestore.DataLakeStoreManager manager) {
        manager.accounts()
            .checkNameAvailabilityWithResponse("EastUS2", new CheckNameAvailabilityParameters().withName("contosoadla"),
                com.azure.core.util.Context.NONE);
    }
}
