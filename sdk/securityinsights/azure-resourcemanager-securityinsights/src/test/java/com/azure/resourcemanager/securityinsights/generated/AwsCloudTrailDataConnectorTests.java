// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.models.AwsCloudTrailDataConnector;
import com.azure.resourcemanager.securityinsights.models.AwsCloudTrailDataConnectorDataTypes;
import com.azure.resourcemanager.securityinsights.models.AwsCloudTrailDataConnectorDataTypesLogs;
import com.azure.resourcemanager.securityinsights.models.DataTypeState;
import org.junit.jupiter.api.Assertions;

public final class AwsCloudTrailDataConnectorTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AwsCloudTrailDataConnector model = BinaryData.fromString(
            "{\"kind\":\"AmazonWebServicesCloudTrail\",\"properties\":{\"awsRoleArn\":\"lkv\",\"dataTypes\":{\"logs\":{\"state\":\"Disabled\"}}},\"etag\":\"kyjtkakvl\",\"id\":\"shjvpzaptuoskaoi\",\"name\":\"jixwfgc\",\"type\":\"i\"}")
            .toObject(AwsCloudTrailDataConnector.class);
        Assertions.assertEquals("kyjtkakvl", model.etag());
        Assertions.assertEquals("lkv", model.awsRoleArn());
        Assertions.assertEquals(DataTypeState.DISABLED, model.dataTypes().logs().state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AwsCloudTrailDataConnector model = new AwsCloudTrailDataConnector().withEtag("kyjtkakvl")
            .withAwsRoleArn("lkv")
            .withDataTypes(new AwsCloudTrailDataConnectorDataTypes()
                .withLogs(new AwsCloudTrailDataConnectorDataTypesLogs().withState(DataTypeState.DISABLED)));
        model = BinaryData.fromObject(model).toObject(AwsCloudTrailDataConnector.class);
        Assertions.assertEquals("kyjtkakvl", model.etag());
        Assertions.assertEquals("lkv", model.awsRoleArn());
        Assertions.assertEquals(DataTypeState.DISABLED, model.dataTypes().logs().state());
    }
}
