// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.generated;

import com.azure.analytics.purview.datamap.models.AtlasAttributeDef;
import com.azure.analytics.purview.datamap.models.AtlasBusinessMetadataDef;
import com.azure.analytics.purview.datamap.models.AtlasClassificationDef;
import com.azure.analytics.purview.datamap.models.AtlasEntityDef;
import com.azure.analytics.purview.datamap.models.AtlasEnumDef;
import com.azure.analytics.purview.datamap.models.AtlasRelationshipDef;
import com.azure.analytics.purview.datamap.models.AtlasStructDef;
import com.azure.analytics.purview.datamap.models.AtlasTypesDef;
import com.azure.analytics.purview.datamap.models.CardinalityValue;
import com.azure.analytics.purview.datamap.models.TypeCategory;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public final class TypeBulkCreateBusinessMetadataDefsTests extends DataMapClientTestBase {
    @Test
    @Disabled
    public void testTypeBulkCreateBusinessMetadataDefsTests() {
        // method invocation
        AtlasTypesDef response = typeDefinitionClient.batchCreate(new AtlasTypesDef()
            .setBusinessMetadataDefs(Arrays.asList(new AtlasBusinessMetadataDef().setDescription("")
                .setName("myBizMetadata1")
                .setAttributeDefs(Arrays.asList(new AtlasAttributeDef().setCardinality(CardinalityValue.SINGLE)
                    .setIsIndexable(true)
                    .setIsOptional(true)
                    .setIsUnique(false)
                    .setName("bizAttr1")
                    .setOptions(mapOf("maxStrLength", "50", "applicableEntityTypes", "[\"Path\"]"))
                    .setTypeName("string")))))
            .setClassificationDefs(Arrays.asList())
            .setEntityDefs(Arrays.asList())
            .setEnumDefs(Arrays.asList())
            .setRelationshipDefs(Arrays.asList())
            .setStructDefs(Arrays.asList()));

        // response assertion
        Assertions.assertNotNull(response);
        // verify property "businessMetadataDefs"
        List<AtlasBusinessMetadataDef> responseBusinessMetadataDefs = response.getBusinessMetadataDefs();
        AtlasBusinessMetadataDef responseBusinessMetadataDefsFirstItem = responseBusinessMetadataDefs.iterator().next();
        Assertions.assertNotNull(responseBusinessMetadataDefsFirstItem);
        Assertions.assertEquals(TypeCategory.fromString("BUSINESS_METADATA"),
            responseBusinessMetadataDefsFirstItem.getCategory());
        Assertions.assertEquals(1646994112241L, responseBusinessMetadataDefsFirstItem.getCreateTime());
        Assertions.assertEquals("ServiceAdmin", responseBusinessMetadataDefsFirstItem.getCreatedBy());
        Assertions.assertEquals("This is my businessMetadata1", responseBusinessMetadataDefsFirstItem.getDescription());
        Assertions.assertEquals("f26dc6d1-be9c-a0ce-a274-b6388ff6e2eb",
            responseBusinessMetadataDefsFirstItem.getGuid());
        Assertions.assertEquals("myBizMetadata1", responseBusinessMetadataDefsFirstItem.getName());
        Assertions.assertEquals("1.0", responseBusinessMetadataDefsFirstItem.getTypeVersion());
        Assertions.assertEquals(1646994112241L, responseBusinessMetadataDefsFirstItem.getUpdateTime());
        Assertions.assertEquals("ServiceAdmin", responseBusinessMetadataDefsFirstItem.getUpdatedBy());
        Assertions.assertEquals(1L, responseBusinessMetadataDefsFirstItem.getVersion());
        Assertions.assertEquals("1", responseBusinessMetadataDefsFirstItem.getLastModifiedTS());
        List<AtlasAttributeDef> responseBusinessMetadataDefsFirstItemAttributeDefs
            = responseBusinessMetadataDefsFirstItem.getAttributeDefs();
        AtlasAttributeDef responseBusinessMetadataDefsFirstItemAttributeDefsFirstItem
            = responseBusinessMetadataDefsFirstItemAttributeDefs.iterator().next();
        Assertions.assertNotNull(responseBusinessMetadataDefsFirstItemAttributeDefsFirstItem);
        Assertions.assertEquals(CardinalityValue.SINGLE,
            responseBusinessMetadataDefsFirstItemAttributeDefsFirstItem.getCardinality());
        Assertions.assertEquals(false,
            responseBusinessMetadataDefsFirstItemAttributeDefsFirstItem.isIncludeInNotification());
        Assertions.assertEquals(true, responseBusinessMetadataDefsFirstItemAttributeDefsFirstItem.isIndexable());
        Assertions.assertEquals(true, responseBusinessMetadataDefsFirstItemAttributeDefsFirstItem.isOptional());
        Assertions.assertEquals(false, responseBusinessMetadataDefsFirstItemAttributeDefsFirstItem.isUnique());
        Assertions.assertEquals("bizAttr1", responseBusinessMetadataDefsFirstItemAttributeDefsFirstItem.getName());
        Assertions.assertNotNull(responseBusinessMetadataDefsFirstItemAttributeDefsFirstItem.getOptions());
        Assertions.assertEquals("string", responseBusinessMetadataDefsFirstItemAttributeDefsFirstItem.getTypeName());
        Assertions.assertEquals(1, responseBusinessMetadataDefsFirstItemAttributeDefsFirstItem.getValuesMaxCount());
        Assertions.assertEquals(0, responseBusinessMetadataDefsFirstItemAttributeDefsFirstItem.getValuesMinCount());
        // verify property "classificationDefs"
        List<AtlasClassificationDef> responseClassificationDefs = response.getClassificationDefs();
        Assertions.assertEquals(0, responseClassificationDefs.size());
        // verify property "entityDefs"
        List<AtlasEntityDef> responseEntityDefs = response.getEntityDefs();
        Assertions.assertEquals(0, responseEntityDefs.size());
        // verify property "enumDefs"
        List<AtlasEnumDef> responseEnumDefs = response.getEnumDefs();
        Assertions.assertEquals(0, responseEnumDefs.size());
        // verify property "relationshipDefs"
        List<AtlasRelationshipDef> responseRelationshipDefs = response.getRelationshipDefs();
        Assertions.assertEquals(0, responseRelationshipDefs.size());
        // verify property "structDefs"
        List<AtlasStructDef> responseStructDefs = response.getStructDefs();
        Assertions.assertEquals(0, responseStructDefs.size());
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
