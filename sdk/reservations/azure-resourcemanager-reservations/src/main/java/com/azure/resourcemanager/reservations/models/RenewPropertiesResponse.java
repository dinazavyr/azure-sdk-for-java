// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The renew properties for a reservation. */
@Fluent
public final class RenewPropertiesResponse {
    /*
     * The request for reservation purchase
     */
    @JsonProperty(value = "purchaseProperties")
    private PurchaseRequest purchaseProperties;

    /*
     * Amount that Microsoft uses for record. Used during refund for calculating refund limit. Tax is not included.
     * This is locked price 30 days before expiry.
     */
    @JsonProperty(value = "pricingCurrencyTotal")
    private RenewPropertiesResponsePricingCurrencyTotal pricingCurrencyTotal;

    /*
     * Currency and amount that customer will be charged in customer's local currency for renewal purchase. Tax is not
     * included.
     */
    @JsonProperty(value = "billingCurrencyTotal")
    private RenewPropertiesResponseBillingCurrencyTotal billingCurrencyTotal;

    /** Creates an instance of RenewPropertiesResponse class. */
    public RenewPropertiesResponse() {
    }

    /**
     * Get the purchaseProperties property: The request for reservation purchase.
     *
     * @return the purchaseProperties value.
     */
    public PurchaseRequest purchaseProperties() {
        return this.purchaseProperties;
    }

    /**
     * Set the purchaseProperties property: The request for reservation purchase.
     *
     * @param purchaseProperties the purchaseProperties value to set.
     * @return the RenewPropertiesResponse object itself.
     */
    public RenewPropertiesResponse withPurchaseProperties(PurchaseRequest purchaseProperties) {
        this.purchaseProperties = purchaseProperties;
        return this;
    }

    /**
     * Get the pricingCurrencyTotal property: Amount that Microsoft uses for record. Used during refund for calculating
     * refund limit. Tax is not included. This is locked price 30 days before expiry.
     *
     * @return the pricingCurrencyTotal value.
     */
    public RenewPropertiesResponsePricingCurrencyTotal pricingCurrencyTotal() {
        return this.pricingCurrencyTotal;
    }

    /**
     * Set the pricingCurrencyTotal property: Amount that Microsoft uses for record. Used during refund for calculating
     * refund limit. Tax is not included. This is locked price 30 days before expiry.
     *
     * @param pricingCurrencyTotal the pricingCurrencyTotal value to set.
     * @return the RenewPropertiesResponse object itself.
     */
    public RenewPropertiesResponse
        withPricingCurrencyTotal(RenewPropertiesResponsePricingCurrencyTotal pricingCurrencyTotal) {
        this.pricingCurrencyTotal = pricingCurrencyTotal;
        return this;
    }

    /**
     * Get the billingCurrencyTotal property: Currency and amount that customer will be charged in customer's local
     * currency for renewal purchase. Tax is not included.
     *
     * @return the billingCurrencyTotal value.
     */
    public RenewPropertiesResponseBillingCurrencyTotal billingCurrencyTotal() {
        return this.billingCurrencyTotal;
    }

    /**
     * Set the billingCurrencyTotal property: Currency and amount that customer will be charged in customer's local
     * currency for renewal purchase. Tax is not included.
     *
     * @param billingCurrencyTotal the billingCurrencyTotal value to set.
     * @return the RenewPropertiesResponse object itself.
     */
    public RenewPropertiesResponse
        withBillingCurrencyTotal(RenewPropertiesResponseBillingCurrencyTotal billingCurrencyTotal) {
        this.billingCurrencyTotal = billingCurrencyTotal;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (purchaseProperties() != null) {
            purchaseProperties().validate();
        }
        if (pricingCurrencyTotal() != null) {
            pricingCurrencyTotal().validate();
        }
        if (billingCurrencyTotal() != null) {
            billingCurrencyTotal().validate();
        }
    }
}
