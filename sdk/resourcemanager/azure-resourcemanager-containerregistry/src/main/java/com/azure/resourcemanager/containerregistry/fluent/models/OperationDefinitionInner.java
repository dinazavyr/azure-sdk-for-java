// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.containerregistry.models.OperationDisplayDefinition;
import com.azure.resourcemanager.containerregistry.models.OperationServiceSpecificationDefinition;
import java.io.IOException;

/**
 * The definition of a container registry operation.
 */
@Fluent
public final class OperationDefinitionInner implements JsonSerializable<OperationDefinitionInner> {
    /*
     * The origin information of the container registry operation.
     */
    private String origin;

    /*
     * Operation name: {provider}/{resource}/{operation}.
     */
    private String name;

    /*
     * The display information for the container registry operation.
     */
    private OperationDisplayDefinition display;

    /*
     * The properties information for the container registry operation.
     */
    private OperationPropertiesDefinition innerProperties;

    /*
     * This property indicates if the operation is an action or a data action
     * ref:
     * https://docs.microsoft.com/en-us/azure/role-based-access-control/role-definitions#management-and-data-operations
     */
    private Boolean isDataAction;

    /**
     * Creates an instance of OperationDefinitionInner class.
     */
    public OperationDefinitionInner() {
    }

    /**
     * Get the origin property: The origin information of the container registry operation.
     * 
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: The origin information of the container registry operation.
     * 
     * @param origin the origin value to set.
     * @return the OperationDefinitionInner object itself.
     */
    public OperationDefinitionInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the name property: Operation name: {provider}/{resource}/{operation}.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Operation name: {provider}/{resource}/{operation}.
     * 
     * @param name the name value to set.
     * @return the OperationDefinitionInner object itself.
     */
    public OperationDefinitionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display property: The display information for the container registry operation.
     * 
     * @return the display value.
     */
    public OperationDisplayDefinition display() {
        return this.display;
    }

    /**
     * Set the display property: The display information for the container registry operation.
     * 
     * @param display the display value to set.
     * @return the OperationDefinitionInner object itself.
     */
    public OperationDefinitionInner withDisplay(OperationDisplayDefinition display) {
        this.display = display;
        return this;
    }

    /**
     * Get the innerProperties property: The properties information for the container registry operation.
     * 
     * @return the innerProperties value.
     */
    private OperationPropertiesDefinition innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the isDataAction property: This property indicates if the operation is an action or a data action
     * ref:
     * https://docs.microsoft.com/en-us/azure/role-based-access-control/role-definitions#management-and-data-operations.
     * 
     * @return the isDataAction value.
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set the isDataAction property: This property indicates if the operation is an action or a data action
     * ref:
     * https://docs.microsoft.com/en-us/azure/role-based-access-control/role-definitions#management-and-data-operations.
     * 
     * @param isDataAction the isDataAction value to set.
     * @return the OperationDefinitionInner object itself.
     */
    public OperationDefinitionInner withIsDataAction(Boolean isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }

    /**
     * Get the serviceSpecification property: The definition of Azure Monitoring service.
     * 
     * @return the serviceSpecification value.
     */
    public OperationServiceSpecificationDefinition serviceSpecification() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceSpecification();
    }

    /**
     * Set the serviceSpecification property: The definition of Azure Monitoring service.
     * 
     * @param serviceSpecification the serviceSpecification value to set.
     * @return the OperationDefinitionInner object itself.
     */
    public OperationDefinitionInner
        withServiceSpecification(OperationServiceSpecificationDefinition serviceSpecification) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OperationPropertiesDefinition();
        }
        this.innerProperties().withServiceSpecification(serviceSpecification);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("origin", this.origin);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeJsonField("display", this.display);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeBooleanField("isDataAction", this.isDataAction);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OperationDefinitionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperationDefinitionInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperationDefinitionInner.
     */
    public static OperationDefinitionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperationDefinitionInner deserializedOperationDefinitionInner = new OperationDefinitionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("origin".equals(fieldName)) {
                    deserializedOperationDefinitionInner.origin = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedOperationDefinitionInner.name = reader.getString();
                } else if ("display".equals(fieldName)) {
                    deserializedOperationDefinitionInner.display = OperationDisplayDefinition.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedOperationDefinitionInner.innerProperties
                        = OperationPropertiesDefinition.fromJson(reader);
                } else if ("isDataAction".equals(fieldName)) {
                    deserializedOperationDefinitionInner.isDataAction = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationDefinitionInner;
        });
    }
}
