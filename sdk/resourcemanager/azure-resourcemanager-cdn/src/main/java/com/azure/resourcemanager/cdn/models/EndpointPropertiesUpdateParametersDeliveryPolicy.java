// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A policy that specifies the delivery rules to be used for an endpoint.
 */
@Fluent
public final class EndpointPropertiesUpdateParametersDeliveryPolicy
    implements JsonSerializable<EndpointPropertiesUpdateParametersDeliveryPolicy> {
    /*
     * User-friendly description of the policy.
     */
    private String description;

    /*
     * A list of the delivery rules.
     */
    private List<DeliveryRule> rules;

    /**
     * Creates an instance of EndpointPropertiesUpdateParametersDeliveryPolicy class.
     */
    public EndpointPropertiesUpdateParametersDeliveryPolicy() {
    }

    /**
     * Get the description property: User-friendly description of the policy.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: User-friendly description of the policy.
     * 
     * @param description the description value to set.
     * @return the EndpointPropertiesUpdateParametersDeliveryPolicy object itself.
     */
    public EndpointPropertiesUpdateParametersDeliveryPolicy withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the rules property: A list of the delivery rules.
     * 
     * @return the rules value.
     */
    public List<DeliveryRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: A list of the delivery rules.
     * 
     * @param rules the rules value to set.
     * @return the EndpointPropertiesUpdateParametersDeliveryPolicy object itself.
     */
    public EndpointPropertiesUpdateParametersDeliveryPolicy withRules(List<DeliveryRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rules() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property rules in model EndpointPropertiesUpdateParametersDeliveryPolicy"));
        } else {
            rules().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EndpointPropertiesUpdateParametersDeliveryPolicy.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("rules", this.rules, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("description", this.description);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EndpointPropertiesUpdateParametersDeliveryPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EndpointPropertiesUpdateParametersDeliveryPolicy if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the EndpointPropertiesUpdateParametersDeliveryPolicy.
     */
    public static EndpointPropertiesUpdateParametersDeliveryPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EndpointPropertiesUpdateParametersDeliveryPolicy deserializedEndpointPropertiesUpdateParametersDeliveryPolicy
                = new EndpointPropertiesUpdateParametersDeliveryPolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("rules".equals(fieldName)) {
                    List<DeliveryRule> rules = reader.readArray(reader1 -> DeliveryRule.fromJson(reader1));
                    deserializedEndpointPropertiesUpdateParametersDeliveryPolicy.rules = rules;
                } else if ("description".equals(fieldName)) {
                    deserializedEndpointPropertiesUpdateParametersDeliveryPolicy.description = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEndpointPropertiesUpdateParametersDeliveryPolicy;
        });
    }
}
