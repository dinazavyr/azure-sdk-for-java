// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * An Activity Log Alert rule condition that is met when all its member conditions are met.
 * Each condition can be of one of the following types:
 * __Important__: Each type has its unique subset of properties. Properties from different types CANNOT exist in one
 * condition.
 * * __Leaf Condition -__ must contain 'field' and either 'equals' or 'containsAny'.
 * _Please note, 'anyOf' should __not__ be set in a Leaf Condition._
 * * __AnyOf Condition -__ must contain __only__ 'anyOf' (which is an array of Leaf Conditions).
 * _Please note, 'field', 'equals' and 'containsAny' should __not__ be set in an AnyOf Condition._.
 */
@Fluent
public final class AlertRuleAnyOfOrLeafCondition extends AlertRuleLeafCondition {
    /*
     * An Activity Log Alert rule condition that is met when at least one of its member leaf conditions are met.
     */
    private List<AlertRuleLeafCondition> anyOf;

    /**
     * Creates an instance of AlertRuleAnyOfOrLeafCondition class.
     */
    public AlertRuleAnyOfOrLeafCondition() {
    }

    /**
     * Get the anyOf property: An Activity Log Alert rule condition that is met when at least one of its member leaf
     * conditions are met.
     * 
     * @return the anyOf value.
     */
    public List<AlertRuleLeafCondition> anyOf() {
        return this.anyOf;
    }

    /**
     * Set the anyOf property: An Activity Log Alert rule condition that is met when at least one of its member leaf
     * conditions are met.
     * 
     * @param anyOf the anyOf value to set.
     * @return the AlertRuleAnyOfOrLeafCondition object itself.
     */
    public AlertRuleAnyOfOrLeafCondition withAnyOf(List<AlertRuleLeafCondition> anyOf) {
        this.anyOf = anyOf;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlertRuleAnyOfOrLeafCondition withField(String field) {
        super.withField(field);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlertRuleAnyOfOrLeafCondition withEquals(String equals) {
        super.withEquals(equals);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlertRuleAnyOfOrLeafCondition withContainsAny(List<String> containsAny) {
        super.withContainsAny(containsAny);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (anyOf() != null) {
            anyOf().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("field", field());
        jsonWriter.writeStringField("equals", equals());
        jsonWriter.writeArrayField("containsAny", containsAny(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("anyOf", this.anyOf, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AlertRuleAnyOfOrLeafCondition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AlertRuleAnyOfOrLeafCondition if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AlertRuleAnyOfOrLeafCondition.
     */
    public static AlertRuleAnyOfOrLeafCondition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AlertRuleAnyOfOrLeafCondition deserializedAlertRuleAnyOfOrLeafCondition
                = new AlertRuleAnyOfOrLeafCondition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("field".equals(fieldName)) {
                    deserializedAlertRuleAnyOfOrLeafCondition.withField(reader.getString());
                } else if ("equals".equals(fieldName)) {
                    deserializedAlertRuleAnyOfOrLeafCondition.withEquals(reader.getString());
                } else if ("containsAny".equals(fieldName)) {
                    List<String> containsAny = reader.readArray(reader1 -> reader1.getString());
                    deserializedAlertRuleAnyOfOrLeafCondition.withContainsAny(containsAny);
                } else if ("anyOf".equals(fieldName)) {
                    List<AlertRuleLeafCondition> anyOf
                        = reader.readArray(reader1 -> AlertRuleLeafCondition.fromJson(reader1));
                    deserializedAlertRuleAnyOfOrLeafCondition.anyOf = anyOf;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAlertRuleAnyOfOrLeafCondition;
        });
    }
}
