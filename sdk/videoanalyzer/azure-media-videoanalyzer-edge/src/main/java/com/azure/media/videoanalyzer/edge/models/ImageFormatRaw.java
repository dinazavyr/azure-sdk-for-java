// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Raw image formatting.
 */
@Immutable
public final class ImageFormatRaw extends ImageFormatProperties {
    /*
     * Type discriminator for the derived types.
     */
    private String type = "#Microsoft.VideoAnalyzer.ImageFormatRaw";

    /*
     * Pixel format to be applied to the raw image.
     */
    private final ImageFormatRawPixelFormat pixelFormat;

    /**
     * Creates an instance of ImageFormatRaw class.
     * 
     * @param pixelFormat the pixelFormat value to set.
     */
    public ImageFormatRaw(ImageFormatRawPixelFormat pixelFormat) {
        this.pixelFormat = pixelFormat;
    }

    /**
     * Get the type property: Type discriminator for the derived types.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the pixelFormat property: Pixel format to be applied to the raw image.
     * 
     * @return the pixelFormat value.
     */
    public ImageFormatRawPixelFormat getPixelFormat() {
        return this.pixelFormat;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("pixelFormat", this.pixelFormat == null ? null : this.pixelFormat.toString());
        jsonWriter.writeStringField("@type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ImageFormatRaw from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ImageFormatRaw if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ImageFormatRaw.
     */
    public static ImageFormatRaw fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean pixelFormatFound = false;
            ImageFormatRawPixelFormat pixelFormat = null;
            String type = "#Microsoft.VideoAnalyzer.ImageFormatRaw";
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("pixelFormat".equals(fieldName)) {
                    pixelFormat = ImageFormatRawPixelFormat.fromString(reader.getString());
                    pixelFormatFound = true;
                } else if ("@type".equals(fieldName)) {
                    type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            if (pixelFormatFound) {
                ImageFormatRaw deserializedImageFormatRaw = new ImageFormatRaw(pixelFormat);
                deserializedImageFormatRaw.type = type;

                return deserializedImageFormatRaw;
            }
            throw new IllegalStateException("Missing required property: pixelFormat");
        });
    }
}
