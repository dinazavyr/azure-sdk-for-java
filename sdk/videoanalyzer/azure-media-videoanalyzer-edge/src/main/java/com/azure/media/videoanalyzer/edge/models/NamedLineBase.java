// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Base class for named lines.
 */
@Immutable
public class NamedLineBase implements JsonSerializable<NamedLineBase> {
    /*
     * The Type discriminator for the derived types.
     */
    private String type = "NamedLineBase";

    /*
     * Line name. Must be unique within the node.
     */
    private final String name;

    /**
     * Creates an instance of NamedLineBase class.
     * 
     * @param name the name value to set.
     */
    public NamedLineBase(String name) {
        this.name = name;
    }

    /**
     * Get the type property: The Type discriminator for the derived types.
     * 
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Get the name property: Line name. Must be unique within the node.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("@type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NamedLineBase from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NamedLineBase if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the NamedLineBase.
     */
    public static NamedLineBase fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("@type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("#Microsoft.VideoAnalyzer.NamedLineString".equals(discriminatorValue)) {
                    return NamedLineString.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static NamedLineBase fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean nameFound = false;
            String name = null;
            String type = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    name = reader.getString();
                    nameFound = true;
                } else if ("@type".equals(fieldName)) {
                    type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            if (nameFound) {
                NamedLineBase deserializedNamedLineBase = new NamedLineBase(name);
                deserializedNamedLineBase.type = type;

                return deserializedNamedLineBase;
            }
            throw new IllegalStateException("Missing required property: name");
        });
    }
}
