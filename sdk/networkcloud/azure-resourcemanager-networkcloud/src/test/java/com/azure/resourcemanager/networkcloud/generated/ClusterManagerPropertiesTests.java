// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.ClusterManagerProperties;
import com.azure.resourcemanager.networkcloud.models.ManagedResourceGroupConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ClusterManagerPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterManagerProperties model = BinaryData.fromString(
            "{\"analyticsWorkspaceId\":\"vplwzbhv\",\"availabilityZones\":[\"gu\"],\"clusterVersions\":[{\"supportExpiryDate\":\"kfssxqukkf\",\"targetClusterVersion\":\"gmgsxnkjzkde\"},{\"supportExpiryDate\":\"pvlopwiyighxpkd\",\"targetClusterVersion\":\"baiuebbaumny\"},{\"supportExpiryDate\":\"ped\",\"targetClusterVersion\":\"jn\"}],\"detailedStatus\":\"Available\",\"detailedStatusMessage\":\"hsmtxpsiebtfhvp\",\"fabricControllerId\":\"sapskr\",\"managedResourceGroupConfiguration\":{\"location\":\"hjjdhtldwkyzxuut\",\"name\":\"cwscwsvlx\"},\"managerExtendedLocation\":{\"name\":\"ogtwrupqsxvnmi\",\"type\":\"ykvceoveil\"},\"provisioningState\":\"Failed\",\"vmSize\":\"tyfjfcnjbkcnxdhb\"}")
            .toObject(ClusterManagerProperties.class);
        Assertions.assertEquals("vplwzbhv", model.analyticsWorkspaceId());
        Assertions.assertEquals("gu", model.availabilityZones().get(0));
        Assertions.assertEquals("sapskr", model.fabricControllerId());
        Assertions.assertEquals("hjjdhtldwkyzxuut", model.managedResourceGroupConfiguration().location());
        Assertions.assertEquals("cwscwsvlx", model.managedResourceGroupConfiguration().name());
        Assertions.assertEquals("tyfjfcnjbkcnxdhb", model.vmSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterManagerProperties model = new ClusterManagerProperties().withAnalyticsWorkspaceId("vplwzbhv")
            .withAvailabilityZones(Arrays.asList("gu"))
            .withFabricControllerId("sapskr")
            .withManagedResourceGroupConfiguration(
                new ManagedResourceGroupConfiguration().withLocation("hjjdhtldwkyzxuut").withName("cwscwsvlx"))
            .withVmSize("tyfjfcnjbkcnxdhb");
        model = BinaryData.fromObject(model).toObject(ClusterManagerProperties.class);
        Assertions.assertEquals("vplwzbhv", model.analyticsWorkspaceId());
        Assertions.assertEquals("gu", model.availabilityZones().get(0));
        Assertions.assertEquals("sapskr", model.fabricControllerId());
        Assertions.assertEquals("hjjdhtldwkyzxuut", model.managedResourceGroupConfiguration().location());
        Assertions.assertEquals("cwscwsvlx", model.managedResourceGroupConfiguration().name());
        Assertions.assertEquals("tyfjfcnjbkcnxdhb", model.vmSize());
    }
}
