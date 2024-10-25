// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestack.fluent.models.RegistrationInner;
import java.util.Map;

/**
 * An immutable client-side representation of Registration.
 */
public interface Registration {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the etag property: The entity tag used for optimistic concurrency when modifying the resource.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the objectId property: The object identifier associated with the Azure Stack connecting to Azure.
     * 
     * @return the objectId value.
     */
    String objectId();

    /**
     * Gets the cloudId property: The identifier of the registered Azure Stack.
     * 
     * @return the cloudId value.
     */
    String cloudId();

    /**
     * Gets the billingModel property: Specifies the billing mode for the Azure Stack registration.
     * 
     * @return the billingModel value.
     */
    String billingModel();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.fluent.models.RegistrationInner object.
     * 
     * @return the inner object.
     */
    RegistrationInner innerModel();

    /**
     * The entirety of the Registration definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithRegistrationToken, DefinitionStages.WithCreate {
    }

    /**
     * The Registration definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Registration definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the Registration definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the location property: Location of the resource..
             * 
             * @param location Location of the resource.
             * @return the next definition stage.
             */
            WithResourceGroup withLocation(Location location);
        }

        /**
         * The stage of the Registration definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroup.
             * 
             * @param resourceGroup Name of the resource group.
             * @return the next definition stage.
             */
            WithRegistrationToken withExistingResourceGroup(String resourceGroup);
        }

        /**
         * The stage of the Registration definition allowing to specify registrationToken.
         */
        interface WithRegistrationToken {
            /**
             * Specifies the registrationToken property: The token identifying registered Azure Stack.
             * 
             * @param registrationToken The token identifying registered Azure Stack.
             * @return the next definition stage.
             */
            WithCreate withRegistrationToken(String registrationToken);
        }

        /**
         * The stage of the Registration definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Registration create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Registration create(Context context);
        }
    }

    /**
     * Begins update for the Registration resource.
     * 
     * @return the stage of resource update.
     */
    Registration.Update update();

    /**
     * The template for Registration update.
     */
    interface Update extends UpdateStages.WithRegistrationToken {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        Registration apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Registration apply(Context context);
    }

    /**
     * The Registration update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the Registration update allowing to specify registrationToken.
         */
        interface WithRegistrationToken {
            /**
             * Specifies the registrationToken property: The token identifying registered Azure Stack.
             * 
             * @param registrationToken The token identifying registered Azure Stack.
             * @return the next definition stage.
             */
            Update withRegistrationToken(String registrationToken);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    Registration refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Registration refresh(Context context);

    /**
     * Returns Azure Stack Activation Key.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resource containing the Azure Stack activation key along with {@link Response}.
     */
    Response<ActivationKeyResult> getActivationKeyWithResponse(Context context);

    /**
     * Returns Azure Stack Activation Key.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resource containing the Azure Stack activation key.
     */
    ActivationKeyResult getActivationKey();

    /**
     * Enables remote management for device under the Azure Stack registration.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> enableRemoteManagementWithResponse(Context context);

    /**
     * Enables remote management for device under the Azure Stack registration.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void enableRemoteManagement();
}
