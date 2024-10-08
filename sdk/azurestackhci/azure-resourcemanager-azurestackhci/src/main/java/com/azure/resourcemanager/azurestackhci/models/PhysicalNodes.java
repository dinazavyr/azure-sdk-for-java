// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The PhysicalNodes of a cluster.
 */
@Fluent
public final class PhysicalNodes implements JsonSerializable<PhysicalNodes> {
    /*
     * NETBIOS name of each physical server on your Azure Stack HCI cluster.
     */
    private String name;

    /*
     * The IPv4 address assigned to each physical server on your Azure Stack HCI cluster.
     */
    private String ipv4Address;

    /**
     * Creates an instance of PhysicalNodes class.
     */
    public PhysicalNodes() {
    }

    /**
     * Get the name property: NETBIOS name of each physical server on your Azure Stack HCI cluster.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: NETBIOS name of each physical server on your Azure Stack HCI cluster.
     * 
     * @param name the name value to set.
     * @return the PhysicalNodes object itself.
     */
    public PhysicalNodes withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the ipv4Address property: The IPv4 address assigned to each physical server on your Azure Stack HCI cluster.
     * 
     * @return the ipv4Address value.
     */
    public String ipv4Address() {
        return this.ipv4Address;
    }

    /**
     * Set the ipv4Address property: The IPv4 address assigned to each physical server on your Azure Stack HCI cluster.
     * 
     * @param ipv4Address the ipv4Address value to set.
     * @return the PhysicalNodes object itself.
     */
    public PhysicalNodes withIpv4Address(String ipv4Address) {
        this.ipv4Address = ipv4Address;
        return this;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("ipv4Address", this.ipv4Address);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PhysicalNodes from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PhysicalNodes if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the PhysicalNodes.
     */
    public static PhysicalNodes fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PhysicalNodes deserializedPhysicalNodes = new PhysicalNodes();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedPhysicalNodes.name = reader.getString();
                } else if ("ipv4Address".equals(fieldName)) {
                    deserializedPhysicalNodes.ipv4Address = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPhysicalNodes;
        });
    }
}
