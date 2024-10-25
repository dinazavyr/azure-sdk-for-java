// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.MigrateSqlServerSqlMISyncTaskOutputError;

public final class MigrateSqlServerSqlMISyncTaskOutputErrorTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MigrateSqlServerSqlMISyncTaskOutputError model = BinaryData.fromString(
            "{\"resultType\":\"ErrorOutput\",\"error\":{\"message\":\"xirpghriy\",\"actionableMessage\":\"q\",\"filePath\":\"hlqhykprlpy\",\"lineNumber\":\"uciqdsme\",\"hResult\":1077355180,\"stackTrace\":\"dfuxtya\"},\"id\":\"ibmi\"}")
            .toObject(MigrateSqlServerSqlMISyncTaskOutputError.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MigrateSqlServerSqlMISyncTaskOutputError model = new MigrateSqlServerSqlMISyncTaskOutputError();
        model = BinaryData.fromObject(model).toObject(MigrateSqlServerSqlMISyncTaskOutputError.class);
    }
}
