// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managementgroups.models.CreateManagementGroupDetails;
import com.azure.resourcemanager.managementgroups.models.CreateParentGroupInfo;
import org.junit.jupiter.api.Assertions;

public final class CreateManagementGroupDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreateManagementGroupDetails model = BinaryData.fromString(
            "{\"version\":293333183,\"updatedTime\":\"2021-02-17T00:45:22Z\",\"updatedBy\":\"mkljavb\",\"parent\":{\"id\":\"tqajzyulpkudjkrl\",\"name\":\"bzhfepgzgqexz\",\"displayName\":\"c\"}}")
            .toObject(CreateManagementGroupDetails.class);
        Assertions.assertEquals("tqajzyulpkudjkrl", model.parent().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreateManagementGroupDetails model
            = new CreateManagementGroupDetails().withParent(new CreateParentGroupInfo().withId("tqajzyulpkudjkrl"));
        model = BinaryData.fromObject(model).toObject(CreateManagementGroupDetails.class);
        Assertions.assertEquals("tqajzyulpkudjkrl", model.parent().id());
    }
}
