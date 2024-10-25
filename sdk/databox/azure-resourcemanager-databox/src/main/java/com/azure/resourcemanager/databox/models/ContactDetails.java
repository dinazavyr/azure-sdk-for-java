// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Contact Details. */
@Fluent
public final class ContactDetails {
    /*
     * Contact name of the person.
     */
    @JsonProperty(value = "contactName", required = true)
    private String contactName;

    /*
     * Phone number of the contact person.
     */
    @JsonProperty(value = "phone", required = true)
    private String phone;

    /*
     * Phone extension number of the contact person.
     */
    @JsonProperty(value = "phoneExtension")
    private String phoneExtension;

    /*
     * Mobile number of the contact person.
     */
    @JsonProperty(value = "mobile")
    private String mobile;

    /*
     * List of Email-ids to be notified about job progress.
     */
    @JsonProperty(value = "emailList", required = true)
    private List<String> emailList;

    /*
     * Notification preference for a job stage.
     */
    @JsonProperty(value = "notificationPreference")
    private List<NotificationPreference> notificationPreference;

    /** Creates an instance of ContactDetails class. */
    public ContactDetails() {
    }

    /**
     * Get the contactName property: Contact name of the person.
     *
     * @return the contactName value.
     */
    public String contactName() {
        return this.contactName;
    }

    /**
     * Set the contactName property: Contact name of the person.
     *
     * @param contactName the contactName value to set.
     * @return the ContactDetails object itself.
     */
    public ContactDetails withContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }

    /**
     * Get the phone property: Phone number of the contact person.
     *
     * @return the phone value.
     */
    public String phone() {
        return this.phone;
    }

    /**
     * Set the phone property: Phone number of the contact person.
     *
     * @param phone the phone value to set.
     * @return the ContactDetails object itself.
     */
    public ContactDetails withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get the phoneExtension property: Phone extension number of the contact person.
     *
     * @return the phoneExtension value.
     */
    public String phoneExtension() {
        return this.phoneExtension;
    }

    /**
     * Set the phoneExtension property: Phone extension number of the contact person.
     *
     * @param phoneExtension the phoneExtension value to set.
     * @return the ContactDetails object itself.
     */
    public ContactDetails withPhoneExtension(String phoneExtension) {
        this.phoneExtension = phoneExtension;
        return this;
    }

    /**
     * Get the mobile property: Mobile number of the contact person.
     *
     * @return the mobile value.
     */
    public String mobile() {
        return this.mobile;
    }

    /**
     * Set the mobile property: Mobile number of the contact person.
     *
     * @param mobile the mobile value to set.
     * @return the ContactDetails object itself.
     */
    public ContactDetails withMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    /**
     * Get the emailList property: List of Email-ids to be notified about job progress.
     *
     * @return the emailList value.
     */
    public List<String> emailList() {
        return this.emailList;
    }

    /**
     * Set the emailList property: List of Email-ids to be notified about job progress.
     *
     * @param emailList the emailList value to set.
     * @return the ContactDetails object itself.
     */
    public ContactDetails withEmailList(List<String> emailList) {
        this.emailList = emailList;
        return this;
    }

    /**
     * Get the notificationPreference property: Notification preference for a job stage.
     *
     * @return the notificationPreference value.
     */
    public List<NotificationPreference> notificationPreference() {
        return this.notificationPreference;
    }

    /**
     * Set the notificationPreference property: Notification preference for a job stage.
     *
     * @param notificationPreference the notificationPreference value to set.
     * @return the ContactDetails object itself.
     */
    public ContactDetails withNotificationPreference(List<NotificationPreference> notificationPreference) {
        this.notificationPreference = notificationPreference;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (contactName() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property contactName in model ContactDetails"));
        }
        if (phone() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property phone in model ContactDetails"));
        }
        if (emailList() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property emailList in model ContactDetails"));
        }
        if (notificationPreference() != null) {
            notificationPreference().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContactDetails.class);
}
