// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.costmanagement.fluent.models.QueryProperties;
import com.azure.resourcemanager.costmanagement.models.QueryColumn;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class QueryPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QueryProperties model = BinaryData.fromString(
            "{\"nextLink\":\"tdaaygdvwvg\",\"columns\":[{\"name\":\"g\",\"type\":\"rtfudxepxg\"},{\"name\":\"agvrvmnpkuk\",\"type\":\"i\"},{\"name\":\"blxgwimf\",\"type\":\"hfjx\"},{\"name\":\"szkkfoqre\",\"type\":\"kzikfjawneaivxwc\"}],\"rows\":[[\"datac\",\"datar\",\"datalsfeaenwabfatkld\"],[\"databjhwuaan\",\"datazjosp\",\"datayoulp\",\"datarvxaglrvimjwosy\"],[\"dataitc\"]]}")
            .toObject(QueryProperties.class);
        Assertions.assertEquals("tdaaygdvwvg", model.nextLink());
        Assertions.assertEquals("g", model.columns().get(0).name());
        Assertions.assertEquals("rtfudxepxg", model.columns().get(0).type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QueryProperties model = new QueryProperties().withNextLink("tdaaygdvwvg")
            .withColumns(Arrays.asList(new QueryColumn().withName("g").withType("rtfudxepxg"),
                new QueryColumn().withName("agvrvmnpkuk").withType("i"),
                new QueryColumn().withName("blxgwimf").withType("hfjx"),
                new QueryColumn().withName("szkkfoqre").withType("kzikfjawneaivxwc")))
            .withRows(Arrays.asList(Arrays.asList("datac", "datar", "datalsfeaenwabfatkld"),
                Arrays.asList("databjhwuaan", "datazjosp", "datayoulp", "datarvxaglrvimjwosy"),
                Arrays.asList("dataitc")));
        model = BinaryData.fromObject(model).toObject(QueryProperties.class);
        Assertions.assertEquals("tdaaygdvwvg", model.nextLink());
        Assertions.assertEquals("g", model.columns().get(0).name());
        Assertions.assertEquals("rtfudxepxg", model.columns().get(0).type());
    }
}
