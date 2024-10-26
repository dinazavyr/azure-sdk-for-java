// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.automation.models.DscNodeExtensionHandlerAssociationProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Definition of a DscNode.
 */
@Fluent
public final class DscNodeInner extends ProxyResource {
    /*
     * The properties of a DscNode.
     */
    private DscNodeProperties innerProperties;

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
     * Creates an instance of DscNodeInner class.
     */
    public DscNodeInner() {
    }

    /**
     * Get the innerProperties property: The properties of a DscNode.
     * 
     * @return the innerProperties value.
     */
    private DscNodeProperties innerProperties() {
        return this.innerProperties;
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
     * Get the lastSeen property: Gets or sets the last seen time of the node.
     * 
     * @return the lastSeen value.
     */
    public OffsetDateTime lastSeen() {
        return this.innerProperties() == null ? null : this.innerProperties().lastSeen();
    }

    /**
     * Set the lastSeen property: Gets or sets the last seen time of the node.
     * 
     * @param lastSeen the lastSeen value to set.
     * @return the DscNodeInner object itself.
     */
    public DscNodeInner withLastSeen(OffsetDateTime lastSeen) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DscNodeProperties();
        }
        this.innerProperties().withLastSeen(lastSeen);
        return this;
    }

    /**
     * Get the registrationTime property: Gets or sets the registration time of the node.
     * 
     * @return the registrationTime value.
     */
    public OffsetDateTime registrationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().registrationTime();
    }

    /**
     * Set the registrationTime property: Gets or sets the registration time of the node.
     * 
     * @param registrationTime the registrationTime value to set.
     * @return the DscNodeInner object itself.
     */
    public DscNodeInner withRegistrationTime(OffsetDateTime registrationTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DscNodeProperties();
        }
        this.innerProperties().withRegistrationTime(registrationTime);
        return this;
    }

    /**
     * Get the ip property: Gets or sets the ip of the node.
     * 
     * @return the ip value.
     */
    public String ip() {
        return this.innerProperties() == null ? null : this.innerProperties().ip();
    }

    /**
     * Set the ip property: Gets or sets the ip of the node.
     * 
     * @param ip the ip value to set.
     * @return the DscNodeInner object itself.
     */
    public DscNodeInner withIp(String ip) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DscNodeProperties();
        }
        this.innerProperties().withIp(ip);
        return this;
    }

    /**
     * Get the accountId property: Gets or sets the account id of the node.
     * 
     * @return the accountId value.
     */
    public String accountId() {
        return this.innerProperties() == null ? null : this.innerProperties().accountId();
    }

    /**
     * Set the accountId property: Gets or sets the account id of the node.
     * 
     * @param accountId the accountId value to set.
     * @return the DscNodeInner object itself.
     */
    public DscNodeInner withAccountId(String accountId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DscNodeProperties();
        }
        this.innerProperties().withAccountId(accountId);
        return this;
    }

    /**
     * Get the status property: Gets or sets the status of the node.
     * 
     * @return the status value.
     */
    public String status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: Gets or sets the status of the node.
     * 
     * @param status the status value to set.
     * @return the DscNodeInner object itself.
     */
    public DscNodeInner withStatus(String status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DscNodeProperties();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the nodeId property: Gets or sets the node id.
     * 
     * @return the nodeId value.
     */
    public String nodeId() {
        return this.innerProperties() == null ? null : this.innerProperties().nodeId();
    }

    /**
     * Set the nodeId property: Gets or sets the node id.
     * 
     * @param nodeId the nodeId value to set.
     * @return the DscNodeInner object itself.
     */
    public DscNodeInner withNodeId(String nodeId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DscNodeProperties();
        }
        this.innerProperties().withNodeId(nodeId);
        return this;
    }

    /**
     * Get the etag property: Gets or sets the etag of the resource.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.innerProperties() == null ? null : this.innerProperties().etag();
    }

    /**
     * Set the etag property: Gets or sets the etag of the resource.
     * 
     * @param etag the etag value to set.
     * @return the DscNodeInner object itself.
     */
    public DscNodeInner withEtag(String etag) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DscNodeProperties();
        }
        this.innerProperties().withEtag(etag);
        return this;
    }

    /**
     * Get the totalCount property: Gets the total number of records matching filter criteria.
     * 
     * @return the totalCount value.
     */
    public Integer totalCount() {
        return this.innerProperties() == null ? null : this.innerProperties().totalCount();
    }

    /**
     * Set the totalCount property: Gets the total number of records matching filter criteria.
     * 
     * @param totalCount the totalCount value to set.
     * @return the DscNodeInner object itself.
     */
    public DscNodeInner withTotalCount(Integer totalCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DscNodeProperties();
        }
        this.innerProperties().withTotalCount(totalCount);
        return this;
    }

    /**
     * Get the extensionHandler property: Gets or sets the list of extensionHandler properties for a Node.
     * 
     * @return the extensionHandler value.
     */
    public List<DscNodeExtensionHandlerAssociationProperty> extensionHandler() {
        return this.innerProperties() == null ? null : this.innerProperties().extensionHandler();
    }

    /**
     * Set the extensionHandler property: Gets or sets the list of extensionHandler properties for a Node.
     * 
     * @param extensionHandler the extensionHandler value to set.
     * @return the DscNodeInner object itself.
     */
    public DscNodeInner withExtensionHandler(List<DscNodeExtensionHandlerAssociationProperty> extensionHandler) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DscNodeProperties();
        }
        this.innerProperties().withExtensionHandler(extensionHandler);
        return this;
    }

    /**
     * Get the name property: Gets or sets the name of the dsc node configuration.
     * 
     * @return the name value.
     */
    public String namePropertiesName() {
        return this.innerProperties() == null ? null : this.innerProperties().name();
    }

    /**
     * Set the name property: Gets or sets the name of the dsc node configuration.
     * 
     * @param name the name value to set.
     * @return the DscNodeInner object itself.
     */
    public DscNodeInner withNamePropertiesName(String name) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DscNodeProperties();
        }
        this.innerProperties().withName(name);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
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
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DscNodeInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DscNodeInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DscNodeInner.
     */
    public static DscNodeInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DscNodeInner deserializedDscNodeInner = new DscNodeInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedDscNodeInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedDscNodeInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDscNodeInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedDscNodeInner.innerProperties = DscNodeProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDscNodeInner;
        });
    }
}
