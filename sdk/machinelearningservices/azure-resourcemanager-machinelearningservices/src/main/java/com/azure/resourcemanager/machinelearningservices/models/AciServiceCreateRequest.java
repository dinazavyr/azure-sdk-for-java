// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** The AciServiceCreateRequest model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "computeType")
@JsonTypeName("ACI")
@Fluent
public final class AciServiceCreateRequest extends CreateServiceRequest {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(AciServiceCreateRequest.class);

    /*
     * The container resource requirements.
     */
    @JsonProperty(value = "containerResourceRequirements")
    private ContainerResourceRequirements containerResourceRequirements;

    /*
     * Whether or not authentication is enabled on the service.
     */
    @JsonProperty(value = "authEnabled")
    private Boolean authEnabled;

    /*
     * Whether or not SSL is enabled.
     */
    @JsonProperty(value = "sslEnabled")
    private Boolean sslEnabled;

    /*
     * Whether or not Application Insights is enabled.
     */
    @JsonProperty(value = "appInsightsEnabled")
    private Boolean appInsightsEnabled;

    /*
     * Details of the data collection options specified.
     */
    @JsonProperty(value = "dataCollection")
    private AciServiceCreateRequestDataCollection dataCollection;

    /*
     * The public SSL certificate in PEM format to use if SSL is enabled.
     */
    @JsonProperty(value = "sslCertificate")
    private String sslCertificate;

    /*
     * The public SSL key in PEM format for the certificate.
     */
    @JsonProperty(value = "sslKey")
    private String sslKey;

    /*
     * The CName for the service.
     */
    @JsonProperty(value = "cname")
    private String cname;

    /*
     * The Dns label for the service.
     */
    @JsonProperty(value = "dnsNameLabel")
    private String dnsNameLabel;

    /*
     * The virtual network configuration.
     */
    @JsonProperty(value = "vnetConfiguration")
    private AciServiceCreateRequestVnetConfiguration vnetConfiguration;

    /*
     * The encryption properties.
     */
    @JsonProperty(value = "encryptionProperties")
    private AciServiceCreateRequestEncryptionProperties encryptionProperties;

    /**
     * Get the containerResourceRequirements property: The container resource requirements.
     *
     * @return the containerResourceRequirements value.
     */
    public ContainerResourceRequirements containerResourceRequirements() {
        return this.containerResourceRequirements;
    }

    /**
     * Set the containerResourceRequirements property: The container resource requirements.
     *
     * @param containerResourceRequirements the containerResourceRequirements value to set.
     * @return the AciServiceCreateRequest object itself.
     */
    public AciServiceCreateRequest
        withContainerResourceRequirements(ContainerResourceRequirements containerResourceRequirements) {
        this.containerResourceRequirements = containerResourceRequirements;
        return this;
    }

    /**
     * Get the authEnabled property: Whether or not authentication is enabled on the service.
     *
     * @return the authEnabled value.
     */
    public Boolean authEnabled() {
        return this.authEnabled;
    }

    /**
     * Set the authEnabled property: Whether or not authentication is enabled on the service.
     *
     * @param authEnabled the authEnabled value to set.
     * @return the AciServiceCreateRequest object itself.
     */
    public AciServiceCreateRequest withAuthEnabled(Boolean authEnabled) {
        this.authEnabled = authEnabled;
        return this;
    }

    /**
     * Get the sslEnabled property: Whether or not SSL is enabled.
     *
     * @return the sslEnabled value.
     */
    public Boolean sslEnabled() {
        return this.sslEnabled;
    }

    /**
     * Set the sslEnabled property: Whether or not SSL is enabled.
     *
     * @param sslEnabled the sslEnabled value to set.
     * @return the AciServiceCreateRequest object itself.
     */
    public AciServiceCreateRequest withSslEnabled(Boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
        return this;
    }

    /**
     * Get the appInsightsEnabled property: Whether or not Application Insights is enabled.
     *
     * @return the appInsightsEnabled value.
     */
    public Boolean appInsightsEnabled() {
        return this.appInsightsEnabled;
    }

    /**
     * Set the appInsightsEnabled property: Whether or not Application Insights is enabled.
     *
     * @param appInsightsEnabled the appInsightsEnabled value to set.
     * @return the AciServiceCreateRequest object itself.
     */
    public AciServiceCreateRequest withAppInsightsEnabled(Boolean appInsightsEnabled) {
        this.appInsightsEnabled = appInsightsEnabled;
        return this;
    }

    /**
     * Get the dataCollection property: Details of the data collection options specified.
     *
     * @return the dataCollection value.
     */
    public AciServiceCreateRequestDataCollection dataCollection() {
        return this.dataCollection;
    }

    /**
     * Set the dataCollection property: Details of the data collection options specified.
     *
     * @param dataCollection the dataCollection value to set.
     * @return the AciServiceCreateRequest object itself.
     */
    public AciServiceCreateRequest withDataCollection(AciServiceCreateRequestDataCollection dataCollection) {
        this.dataCollection = dataCollection;
        return this;
    }

    /**
     * Get the sslCertificate property: The public SSL certificate in PEM format to use if SSL is enabled.
     *
     * @return the sslCertificate value.
     */
    public String sslCertificate() {
        return this.sslCertificate;
    }

    /**
     * Set the sslCertificate property: The public SSL certificate in PEM format to use if SSL is enabled.
     *
     * @param sslCertificate the sslCertificate value to set.
     * @return the AciServiceCreateRequest object itself.
     */
    public AciServiceCreateRequest withSslCertificate(String sslCertificate) {
        this.sslCertificate = sslCertificate;
        return this;
    }

    /**
     * Get the sslKey property: The public SSL key in PEM format for the certificate.
     *
     * @return the sslKey value.
     */
    public String sslKey() {
        return this.sslKey;
    }

    /**
     * Set the sslKey property: The public SSL key in PEM format for the certificate.
     *
     * @param sslKey the sslKey value to set.
     * @return the AciServiceCreateRequest object itself.
     */
    public AciServiceCreateRequest withSslKey(String sslKey) {
        this.sslKey = sslKey;
        return this;
    }

    /**
     * Get the cname property: The CName for the service.
     *
     * @return the cname value.
     */
    public String cname() {
        return this.cname;
    }

    /**
     * Set the cname property: The CName for the service.
     *
     * @param cname the cname value to set.
     * @return the AciServiceCreateRequest object itself.
     */
    public AciServiceCreateRequest withCname(String cname) {
        this.cname = cname;
        return this;
    }

    /**
     * Get the dnsNameLabel property: The Dns label for the service.
     *
     * @return the dnsNameLabel value.
     */
    public String dnsNameLabel() {
        return this.dnsNameLabel;
    }

    /**
     * Set the dnsNameLabel property: The Dns label for the service.
     *
     * @param dnsNameLabel the dnsNameLabel value to set.
     * @return the AciServiceCreateRequest object itself.
     */
    public AciServiceCreateRequest withDnsNameLabel(String dnsNameLabel) {
        this.dnsNameLabel = dnsNameLabel;
        return this;
    }

    /**
     * Get the vnetConfiguration property: The virtual network configuration.
     *
     * @return the vnetConfiguration value.
     */
    public AciServiceCreateRequestVnetConfiguration vnetConfiguration() {
        return this.vnetConfiguration;
    }

    /**
     * Set the vnetConfiguration property: The virtual network configuration.
     *
     * @param vnetConfiguration the vnetConfiguration value to set.
     * @return the AciServiceCreateRequest object itself.
     */
    public AciServiceCreateRequest withVnetConfiguration(AciServiceCreateRequestVnetConfiguration vnetConfiguration) {
        this.vnetConfiguration = vnetConfiguration;
        return this;
    }

    /**
     * Get the encryptionProperties property: The encryption properties.
     *
     * @return the encryptionProperties value.
     */
    public AciServiceCreateRequestEncryptionProperties encryptionProperties() {
        return this.encryptionProperties;
    }

    /**
     * Set the encryptionProperties property: The encryption properties.
     *
     * @param encryptionProperties the encryptionProperties value to set.
     * @return the AciServiceCreateRequest object itself.
     */
    public AciServiceCreateRequest
        withEncryptionProperties(AciServiceCreateRequestEncryptionProperties encryptionProperties) {
        this.encryptionProperties = encryptionProperties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AciServiceCreateRequest withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AciServiceCreateRequest withKvTags(Map<String, String> kvTags) {
        super.withKvTags(kvTags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AciServiceCreateRequest withProperties(Map<String, String> properties) {
        super.withProperties(properties);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AciServiceCreateRequest withKeys(CreateServiceRequestKeys keys) {
        super.withKeys(keys);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AciServiceCreateRequest
        withEnvironmentImageRequest(CreateServiceRequestEnvironmentImageRequest environmentImageRequest) {
        super.withEnvironmentImageRequest(environmentImageRequest);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AciServiceCreateRequest withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (containerResourceRequirements() != null) {
            containerResourceRequirements().validate();
        }
        if (dataCollection() != null) {
            dataCollection().validate();
        }
        if (vnetConfiguration() != null) {
            vnetConfiguration().validate();
        }
        if (encryptionProperties() != null) {
            encryptionProperties().validate();
        }
    }
}
