// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Customer disk job details. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobDetailsType")
@JsonTypeName("DataBoxCustomerDisk")
@Fluent
public final class DataBoxCustomerDiskJobDetails extends JobDetails {
    /*
     * Contains the map of disk serial number to the disk details for import jobs.
     */
    @JsonProperty(value = "importDiskDetailsCollection")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, ImportDiskDetails> importDiskDetailsCollection;

    /*
     * Contains the map of disk serial number to the disk details for export jobs.
     */
    @JsonProperty(value = "exportDiskDetailsCollection", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, ExportDiskDetails> exportDiskDetailsCollection;

    /*
     * Copy progress per disk.
     */
    @JsonProperty(value = "copyProgress", access = JsonProperty.Access.WRITE_ONLY)
    private List<DataBoxCustomerDiskCopyProgress> copyProgress;

    /*
     * Delivery package shipping details.
     */
    @JsonProperty(value = "deliverToDcPackageDetails", access = JsonProperty.Access.WRITE_ONLY)
    private PackageCarrierInfo deliverToDcPackageDetails;

    /*
     * Return package shipping details.
     */
    @JsonProperty(value = "returnToCustomerPackageDetails", required = true)
    private PackageCarrierDetails returnToCustomerPackageDetails;

    /*
     * Flag to indicate if disk manifest should be backed-up in the Storage Account.
     */
    @JsonProperty(value = "enableManifestBackup")
    private Boolean enableManifestBackup;

    /** Creates an instance of DataBoxCustomerDiskJobDetails class. */
    public DataBoxCustomerDiskJobDetails() {
    }

    /**
     * Get the importDiskDetailsCollection property: Contains the map of disk serial number to the disk details for
     * import jobs.
     *
     * @return the importDiskDetailsCollection value.
     */
    public Map<String, ImportDiskDetails> importDiskDetailsCollection() {
        return this.importDiskDetailsCollection;
    }

    /**
     * Set the importDiskDetailsCollection property: Contains the map of disk serial number to the disk details for
     * import jobs.
     *
     * @param importDiskDetailsCollection the importDiskDetailsCollection value to set.
     * @return the DataBoxCustomerDiskJobDetails object itself.
     */
    public DataBoxCustomerDiskJobDetails
        withImportDiskDetailsCollection(Map<String, ImportDiskDetails> importDiskDetailsCollection) {
        this.importDiskDetailsCollection = importDiskDetailsCollection;
        return this;
    }

    /**
     * Get the exportDiskDetailsCollection property: Contains the map of disk serial number to the disk details for
     * export jobs.
     *
     * @return the exportDiskDetailsCollection value.
     */
    public Map<String, ExportDiskDetails> exportDiskDetailsCollection() {
        return this.exportDiskDetailsCollection;
    }

    /**
     * Get the copyProgress property: Copy progress per disk.
     *
     * @return the copyProgress value.
     */
    public List<DataBoxCustomerDiskCopyProgress> copyProgress() {
        return this.copyProgress;
    }

    /**
     * Get the deliverToDcPackageDetails property: Delivery package shipping details.
     *
     * @return the deliverToDcPackageDetails value.
     */
    public PackageCarrierInfo deliverToDcPackageDetails() {
        return this.deliverToDcPackageDetails;
    }

    /**
     * Get the returnToCustomerPackageDetails property: Return package shipping details.
     *
     * @return the returnToCustomerPackageDetails value.
     */
    public PackageCarrierDetails returnToCustomerPackageDetails() {
        return this.returnToCustomerPackageDetails;
    }

    /**
     * Set the returnToCustomerPackageDetails property: Return package shipping details.
     *
     * @param returnToCustomerPackageDetails the returnToCustomerPackageDetails value to set.
     * @return the DataBoxCustomerDiskJobDetails object itself.
     */
    public DataBoxCustomerDiskJobDetails
        withReturnToCustomerPackageDetails(PackageCarrierDetails returnToCustomerPackageDetails) {
        this.returnToCustomerPackageDetails = returnToCustomerPackageDetails;
        return this;
    }

    /**
     * Get the enableManifestBackup property: Flag to indicate if disk manifest should be backed-up in the Storage
     * Account.
     *
     * @return the enableManifestBackup value.
     */
    public Boolean enableManifestBackup() {
        return this.enableManifestBackup;
    }

    /**
     * Set the enableManifestBackup property: Flag to indicate if disk manifest should be backed-up in the Storage
     * Account.
     *
     * @param enableManifestBackup the enableManifestBackup value to set.
     * @return the DataBoxCustomerDiskJobDetails object itself.
     */
    public DataBoxCustomerDiskJobDetails withEnableManifestBackup(Boolean enableManifestBackup) {
        this.enableManifestBackup = enableManifestBackup;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataBoxCustomerDiskJobDetails withContactDetails(ContactDetails contactDetails) {
        super.withContactDetails(contactDetails);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataBoxCustomerDiskJobDetails withShippingAddress(ShippingAddress shippingAddress) {
        super.withShippingAddress(shippingAddress);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataBoxCustomerDiskJobDetails withDataImportDetails(List<DataImportDetails> dataImportDetails) {
        super.withDataImportDetails(dataImportDetails);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataBoxCustomerDiskJobDetails withDataExportDetails(List<DataExportDetails> dataExportDetails) {
        super.withDataExportDetails(dataExportDetails);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataBoxCustomerDiskJobDetails withPreferences(Preferences preferences) {
        super.withPreferences(preferences);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataBoxCustomerDiskJobDetails withReverseShippingDetails(ReverseShippingDetails reverseShippingDetails) {
        super.withReverseShippingDetails(reverseShippingDetails);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataBoxCustomerDiskJobDetails withKeyEncryptionKey(KeyEncryptionKey keyEncryptionKey) {
        super.withKeyEncryptionKey(keyEncryptionKey);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataBoxCustomerDiskJobDetails withExpectedDataSizeInTeraBytes(Integer expectedDataSizeInTeraBytes) {
        super.withExpectedDataSizeInTeraBytes(expectedDataSizeInTeraBytes);
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
        if (importDiskDetailsCollection() != null) {
            importDiskDetailsCollection().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
        if (exportDiskDetailsCollection() != null) {
            exportDiskDetailsCollection().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
        if (copyProgress() != null) {
            copyProgress().forEach(e -> e.validate());
        }
        if (deliverToDcPackageDetails() != null) {
            deliverToDcPackageDetails().validate();
        }
        if (returnToCustomerPackageDetails() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property returnToCustomerPackageDetails in model"
                    + " DataBoxCustomerDiskJobDetails"));
        } else {
            returnToCustomerPackageDetails().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DataBoxCustomerDiskJobDetails.class);
}
