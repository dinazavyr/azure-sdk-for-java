// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.customerinsights.fluent.models.AuthorizationPolicyResourceFormatInner;
import java.util.List;

/**
 * An immutable client-side representation of AuthorizationPolicyResourceFormat.
 */
public interface AuthorizationPolicyResourceFormat {
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
     * Gets the policyName property: Name of the policy.
     * 
     * @return the policyName value.
     */
    String policyName();

    /**
     * Gets the permissions property: The permissions associated with the policy.
     * 
     * @return the permissions value.
     */
    List<PermissionTypes> permissions();

    /**
     * Gets the primaryKey property: Primary key associated with the policy.
     * 
     * @return the primaryKey value.
     */
    String primaryKey();

    /**
     * Gets the secondaryKey property: Secondary key associated with the policy.
     * 
     * @return the secondaryKey value.
     */
    String secondaryKey();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.customerinsights.fluent.models.AuthorizationPolicyResourceFormatInner
     * object.
     * 
     * @return the inner object.
     */
    AuthorizationPolicyResourceFormatInner innerModel();

    /**
     * The entirety of the AuthorizationPolicyResourceFormat definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The AuthorizationPolicyResourceFormat definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the AuthorizationPolicyResourceFormat definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the AuthorizationPolicyResourceFormat definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, hubName.
             * 
             * @param resourceGroupName The name of the resource group.
             * @param hubName The name of the hub.
             * @return the next definition stage.
             */
            WithCreate withExistingHub(String resourceGroupName, String hubName);
        }

        /**
         * The stage of the AuthorizationPolicyResourceFormat definition which contains all the minimum required
         * properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithPermissions, DefinitionStages.WithPrimaryKey,
            DefinitionStages.WithSecondaryKey {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            AuthorizationPolicyResourceFormat create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AuthorizationPolicyResourceFormat create(Context context);
        }

        /**
         * The stage of the AuthorizationPolicyResourceFormat definition allowing to specify permissions.
         */
        interface WithPermissions {
            /**
             * Specifies the permissions property: The permissions associated with the policy..
             * 
             * @param permissions The permissions associated with the policy.
             * @return the next definition stage.
             */
            WithCreate withPermissions(List<PermissionTypes> permissions);
        }

        /**
         * The stage of the AuthorizationPolicyResourceFormat definition allowing to specify primaryKey.
         */
        interface WithPrimaryKey {
            /**
             * Specifies the primaryKey property: Primary key associated with the policy..
             * 
             * @param primaryKey Primary key associated with the policy.
             * @return the next definition stage.
             */
            WithCreate withPrimaryKey(String primaryKey);
        }

        /**
         * The stage of the AuthorizationPolicyResourceFormat definition allowing to specify secondaryKey.
         */
        interface WithSecondaryKey {
            /**
             * Specifies the secondaryKey property: Secondary key associated with the policy..
             * 
             * @param secondaryKey Secondary key associated with the policy.
             * @return the next definition stage.
             */
            WithCreate withSecondaryKey(String secondaryKey);
        }
    }

    /**
     * Begins update for the AuthorizationPolicyResourceFormat resource.
     * 
     * @return the stage of resource update.
     */
    AuthorizationPolicyResourceFormat.Update update();

    /**
     * The template for AuthorizationPolicyResourceFormat update.
     */
    interface Update extends UpdateStages.WithPermissions, UpdateStages.WithPrimaryKey, UpdateStages.WithSecondaryKey {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        AuthorizationPolicyResourceFormat apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AuthorizationPolicyResourceFormat apply(Context context);
    }

    /**
     * The AuthorizationPolicyResourceFormat update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the AuthorizationPolicyResourceFormat update allowing to specify permissions.
         */
        interface WithPermissions {
            /**
             * Specifies the permissions property: The permissions associated with the policy..
             * 
             * @param permissions The permissions associated with the policy.
             * @return the next definition stage.
             */
            Update withPermissions(List<PermissionTypes> permissions);
        }

        /**
         * The stage of the AuthorizationPolicyResourceFormat update allowing to specify primaryKey.
         */
        interface WithPrimaryKey {
            /**
             * Specifies the primaryKey property: Primary key associated with the policy..
             * 
             * @param primaryKey Primary key associated with the policy.
             * @return the next definition stage.
             */
            Update withPrimaryKey(String primaryKey);
        }

        /**
         * The stage of the AuthorizationPolicyResourceFormat update allowing to specify secondaryKey.
         */
        interface WithSecondaryKey {
            /**
             * Specifies the secondaryKey property: Secondary key associated with the policy..
             * 
             * @param secondaryKey Secondary key associated with the policy.
             * @return the next definition stage.
             */
            Update withSecondaryKey(String secondaryKey);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    AuthorizationPolicyResourceFormat refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AuthorizationPolicyResourceFormat refresh(Context context);

    /**
     * Regenerates the primary policy key of the specified authorization policy.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the authorization policy along with {@link Response}.
     */
    Response<AuthorizationPolicy> regeneratePrimaryKeyWithResponse(Context context);

    /**
     * Regenerates the primary policy key of the specified authorization policy.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the authorization policy.
     */
    AuthorizationPolicy regeneratePrimaryKey();

    /**
     * Regenerates the secondary policy key of the specified authorization policy.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the authorization policy along with {@link Response}.
     */
    Response<AuthorizationPolicy> regenerateSecondaryKeyWithResponse(Context context);

    /**
     * Regenerates the secondary policy key of the specified authorization policy.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the authorization policy.
     */
    AuthorizationPolicy regenerateSecondaryKey();
}
