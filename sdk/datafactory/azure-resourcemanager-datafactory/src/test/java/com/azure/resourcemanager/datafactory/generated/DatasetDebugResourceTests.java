// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.Dataset;
import com.azure.resourcemanager.datafactory.models.DatasetDebugResource;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DatasetDebugResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatasetDebugResource model = BinaryData.fromString(
            "{\"properties\":{\"type\":\"Dataset\",\"description\":\"wey\",\"structure\":\"datadhlisngwflqqmpi\",\"schema\":\"datauwnpqxpxiwfcng\",\"linkedServiceName\":{\"referenceName\":\"saasiixtmkzj\",\"parameters\":{\"gratzvzbglbyvict\":\"dataiirhgfgrwsd\",\"rgxffmshkw\":\"datatbrxkjz\",\"qaclnapxbiy\":\"databkgozxwopdbydpi\"}},\"parameters\":{\"lq\":{\"type\":\"Int\",\"defaultValue\":\"dataknfsmfcttuxuuyil\"},\"hmrnjhvsuj\":{\"type\":\"SecureString\",\"defaultValue\":\"datauvr\"}},\"annotations\":[\"datazytqjtwhauunfpr\",\"datajletlxsmrpddo\",\"dataifamowazi\",\"datanknlqwzdvpi\"],\"folder\":{\"name\":\"qszdtmaajquhuxyl\"},\"\":{\"ygjbmzyospspsh\":\"datam\",\"sp\":\"datakfkyjp\"}},\"name\":\"ssdfpp\"}")
            .toObject(DatasetDebugResource.class);
        Assertions.assertEquals("ssdfpp", model.name());
        Assertions.assertEquals("wey", model.properties().description());
        Assertions.assertEquals("saasiixtmkzj", model.properties().linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.properties().parameters().get("lq").type());
        Assertions.assertEquals("qszdtmaajquhuxyl", model.properties().folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatasetDebugResource model
            = new DatasetDebugResource().withName("ssdfpp")
                .withProperties(new Dataset().withDescription("wey")
                    .withStructure("datadhlisngwflqqmpi")
                    .withSchema("datauwnpqxpxiwfcng")
                    .withLinkedServiceName(new LinkedServiceReference().withReferenceName("saasiixtmkzj")
                        .withParameters(mapOf("gratzvzbglbyvict", "dataiirhgfgrwsd", "rgxffmshkw", "datatbrxkjz",
                            "qaclnapxbiy", "databkgozxwopdbydpi")))
                    .withParameters(mapOf("lq",
                        new ParameterSpecification().withType(ParameterType.INT)
                            .withDefaultValue("dataknfsmfcttuxuuyil"),
                        "hmrnjhvsuj",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING).withDefaultValue("datauvr")))
                    .withAnnotations(
                        Arrays.asList("datazytqjtwhauunfpr", "datajletlxsmrpddo", "dataifamowazi", "datanknlqwzdvpi"))
                    .withFolder(new DatasetFolder().withName("qszdtmaajquhuxyl"))
                    .withAdditionalProperties(mapOf("type", "Dataset")));
        model = BinaryData.fromObject(model).toObject(DatasetDebugResource.class);
        Assertions.assertEquals("ssdfpp", model.name());
        Assertions.assertEquals("wey", model.properties().description());
        Assertions.assertEquals("saasiixtmkzj", model.properties().linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.properties().parameters().get("lq").type());
        Assertions.assertEquals("qszdtmaajquhuxyl", model.properties().folder().name());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
