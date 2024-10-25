// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestack.fluent.models.ExtendedProductInner;
import com.azure.resourcemanager.azurestack.fluent.models.ProductInner;
import com.azure.resourcemanager.azurestack.fluent.models.ProductListInner;
import com.azure.resourcemanager.azurestack.fluent.models.ProductLogInner;
import com.azure.resourcemanager.azurestack.models.DeviceConfiguration;
import com.azure.resourcemanager.azurestack.models.MarketplaceProductLogUpdate;

/**
 * An instance of this class provides access to all the operations defined in ProductsClient.
 */
public interface ProductsClient {
    /**
     * Returns a list of products.
     * 
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of products as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProductInner> list(String resourceGroup, String registrationName);

    /**
     * Returns a list of products.
     * 
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of products as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProductInner> list(String resourceGroup, String registrationName, Context context);

    /**
     * Returns the specified product.
     * 
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param productName Name of the product.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return product information along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProductInner> getWithResponse(String resourceGroup, String registrationName, String productName,
        Context context);

    /**
     * Returns the specified product.
     * 
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param productName Name of the product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return product information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProductInner get(String resourceGroup, String registrationName, String productName);

    /**
     * Returns the extended properties of a product.
     * 
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param productName Name of the product.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extended description about the product required for installing it into Azure Stack along with
     * {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExtendedProductInner> listDetailsWithResponse(String resourceGroup, String registrationName,
        String productName, Context context);

    /**
     * Returns the extended properties of a product.
     * 
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param productName Name of the product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extended description about the product required for installing it into Azure Stack.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExtendedProductInner listDetails(String resourceGroup, String registrationName, String productName);

    /**
     * Returns a list of products.
     * 
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param productName Name of the product.
     * @param deviceConfiguration Device configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of products along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProductListInner> listProductsWithResponse(String resourceGroup, String registrationName,
        String productName, DeviceConfiguration deviceConfiguration, Context context);

    /**
     * Returns a list of products.
     * 
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param productName Name of the product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of products.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProductListInner listProducts(String resourceGroup, String registrationName, String productName);

    /**
     * Returns a list of products.
     * 
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param productName Name of the product.
     * @param deviceConfiguration Device configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of products along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProductListInner> getProductsWithResponse(String resourceGroup, String registrationName,
        String productName, DeviceConfiguration deviceConfiguration, Context context);

    /**
     * Returns a list of products.
     * 
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param productName Name of the product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pageable list of products.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProductListInner getProducts(String resourceGroup, String registrationName, String productName);

    /**
     * Returns the specified product.
     * 
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param productName Name of the product.
     * @param deviceConfiguration Device configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return product information along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProductInner> getProductWithResponse(String resourceGroup, String registrationName, String productName,
        DeviceConfiguration deviceConfiguration, Context context);

    /**
     * Returns the specified product.
     * 
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param productName Name of the product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return product information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProductInner getProduct(String resourceGroup, String registrationName, String productName);

    /**
     * Returns the specified product.
     * 
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param productName Name of the product.
     * @param marketplaceProductLogUpdate Update details for product log.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return product action log along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProductLogInner> uploadLogWithResponse(String resourceGroup, String registrationName, String productName,
        MarketplaceProductLogUpdate marketplaceProductLogUpdate, Context context);

    /**
     * Returns the specified product.
     * 
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param productName Name of the product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return product action log.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProductLogInner uploadLog(String resourceGroup, String registrationName, String productName);
}
