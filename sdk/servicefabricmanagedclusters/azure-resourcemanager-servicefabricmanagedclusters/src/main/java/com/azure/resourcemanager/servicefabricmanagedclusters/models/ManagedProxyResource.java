// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The resource model definition for proxy-only resource.
 */
@Fluent
public class ManagedProxyResource extends ProxyResource {
    /*
     * Azure resource tags.
     */
    private Map<String, String> tags;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ManagedProxyResource class.
     */
    public ManagedProxyResource() {
    }

    /**
     * Get the tags property: Azure resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Azure resource tags.
     * 
     * @param tags the tags value to set.
     * @return the ManagedProxyResource object itself.
     */
    public ManagedProxyResource withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Set the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @param systemData the systemData value to set.
     * @return the ManagedProxyResource object itself.
     */
    ManagedProxyResource withSystemData(SystemData systemData) {
        this.systemData = systemData;
        return this;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedProxyResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedProxyResource if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ManagedProxyResource.
     */
    public static ManagedProxyResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedProxyResource deserializedManagedProxyResource = new ManagedProxyResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedManagedProxyResource.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedManagedProxyResource.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedManagedProxyResource.type = reader.getString();
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedManagedProxyResource.tags = tags;
                } else if ("systemData".equals(fieldName)) {
                    deserializedManagedProxyResource.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedProxyResource;
        });
    }
}
