// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.extendedlocation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.extendedlocation.fluent.models.CustomLocationOperationInner;
import com.azure.resourcemanager.extendedlocation.models.CustomLocationOperationsList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CustomLocationOperationsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomLocationOperationsList model = BinaryData.fromString(
            "{\"nextLink\":\"mhquvgjxp\",\"value\":[{\"display\":{\"description\":\"m\",\"operation\":\"mtz\",\"provider\":\"bsphrupidgsybbe\",\"resource\":\"ph\"},\"isDataAction\":true,\"name\":\"sx\",\"origin\":\"bhdxbm\"},{\"display\":{\"description\":\"oqjzehtbmufpowno\",\"operation\":\"hwlrx\",\"provider\":\"qsoqijgkd\",\"resource\":\"pazlobcufpdz\"},\"isDataAction\":false,\"name\":\"cqqjnqglhqgn\",\"origin\":\"ooojywifsqe\"}]}")
            .toObject(CustomLocationOperationsList.class);
        Assertions.assertEquals("mhquvgjxp", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomLocationOperationsList model = new CustomLocationOperationsList().withNextLink("mhquvgjxp")
            .withValue(Arrays.asList(new CustomLocationOperationInner(), new CustomLocationOperationInner()));
        model = BinaryData.fromObject(model).toObject(CustomLocationOperationsList.class);
        Assertions.assertEquals("mhquvgjxp", model.nextLink());
    }
}
