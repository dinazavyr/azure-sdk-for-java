// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for LongTermRetentionBackups ListByResourceGroupDatabase.
 */
public final class LongTermRetentionBackupsListByResourceGroupDatabaseSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/
     * ResourceGroupBasedLongTermRetentionBackupListByDatabase.json
     */
    /**
     * Sample code: Get all long term retention backups under the database.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        getAllLongTermRetentionBackupsUnderTheDatabase(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getLongTermRetentionBackups()
            .listByResourceGroupDatabase("testResourceGroup", "japaneast", "testserver", "testDatabase", null, null,
                com.azure.core.util.Context.NONE);
    }
}
