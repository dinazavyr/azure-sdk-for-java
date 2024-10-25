// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.orbital.models.ContactsPropertiesContactProfile;
import org.junit.jupiter.api.Assertions;

public final class ContactsPropertiesContactProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContactsPropertiesContactProfile model
            = BinaryData.fromString("{\"id\":\"kwh\"}").toObject(ContactsPropertiesContactProfile.class);
        Assertions.assertEquals("kwh", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContactsPropertiesContactProfile model = new ContactsPropertiesContactProfile().withId("kwh");
        model = BinaryData.fromObject(model).toObject(ContactsPropertiesContactProfile.class);
        Assertions.assertEquals("kwh", model.id());
    }
}
