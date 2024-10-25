// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mariadb.fluent.models.DatabaseInner;
import com.azure.resourcemanager.mariadb.models.DatabaseListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DatabaseListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabaseListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"charset\":\"exxppofmxaxcfjp\",\"collation\":\"dtocj\"},\"id\":\"xhvpmoue\",\"name\":\"hd\",\"type\":\"xibqeojnx\"},{\"properties\":{\"charset\":\"vddntwn\",\"collation\":\"icbtwnpzao\"},\"id\":\"vuhrhcffcyddgl\",\"name\":\"jthjqkwpyei\",\"type\":\"xmqci\"}]}")
            .toObject(DatabaseListResult.class);
        Assertions.assertEquals("exxppofmxaxcfjp", model.value().get(0).charset());
        Assertions.assertEquals("dtocj", model.value().get(0).collation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabaseListResult model = new DatabaseListResult()
            .withValue(Arrays.asList(new DatabaseInner().withCharset("exxppofmxaxcfjp").withCollation("dtocj"),
                new DatabaseInner().withCharset("vddntwn").withCollation("icbtwnpzao")));
        model = BinaryData.fromObject(model).toObject(DatabaseListResult.class);
        Assertions.assertEquals("exxppofmxaxcfjp", model.value().get(0).charset());
        Assertions.assertEquals("dtocj", model.value().get(0).collation());
    }
}
