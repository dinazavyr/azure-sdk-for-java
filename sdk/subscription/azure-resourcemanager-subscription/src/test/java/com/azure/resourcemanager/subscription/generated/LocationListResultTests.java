// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.subscription.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.subscription.fluent.models.LocationInner;
import com.azure.resourcemanager.subscription.models.LocationListResult;
import java.util.Arrays;

public final class LocationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LocationListResult model = BinaryData.fromString(
            "{\"value\":[{\"id\":\"quvgjxpybczme\",\"subscriptionId\":\"tzopbsphrupidgsy\",\"name\":\"ejhphoyc\",\"displayName\":\"xaobhdxbmtqioqjz\",\"latitude\":\"tbmufpo\",\"longitude\":\"oizh\"},{\"id\":\"rxybqsoq\",\"subscriptionId\":\"gkdmb\",\"name\":\"zlobcufpd\",\"displayName\":\"rbt\",\"latitude\":\"qjnqglhqgnufoooj\",\"longitude\":\"ifsqesaagdfmg\"},{\"id\":\"lhjxr\",\"subscriptionId\":\"kwm\",\"name\":\"ktsizntocipaou\",\"displayName\":\"psqucmpoyf\",\"latitude\":\"fogknygjofjdde\",\"longitude\":\"rd\"}]}")
            .toObject(LocationListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LocationListResult model = new LocationListResult()
            .withValue(Arrays.asList(new LocationInner(), new LocationInner(), new LocationInner()));
        model = BinaryData.fromObject(model).toObject(LocationListResult.class);
    }
}
