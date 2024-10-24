// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.storageimportexport.fluent.LocationsClient;
import com.azure.resourcemanager.storageimportexport.fluent.models.LocationInner;
import com.azure.resourcemanager.storageimportexport.models.ErrorResponseErrorException;
import com.azure.resourcemanager.storageimportexport.models.LocationsResponse;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in LocationsClient.
 */
public final class LocationsClientImpl implements LocationsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final LocationsService service;

    /**
     * The service client containing this operation class.
     */
    private final StorageImportExportImpl client;

    /**
     * Initializes an instance of LocationsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    LocationsClientImpl(StorageImportExportImpl client) {
        this.service
            = RestProxy.create(LocationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for StorageImportExportLocations to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StorageImportExportL")
    public interface LocationsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/providers/Microsoft.ImportExport/locations")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorResponseErrorException.class)
        Mono<Response<LocationsResponse>> list(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept-Language") String acceptLanguage,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/providers/Microsoft.ImportExport/locations/{locationName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorResponseErrorException.class)
        Mono<Response<LocationInner>> get(@HostParam("$host") String endpoint,
            @PathParam("locationName") String locationName, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept-Language") String acceptLanguage, @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Returns a list of locations to which you can ship the disks associated with an import or export job. A location
     * is a Microsoft data center region.
     * 
     * @throws ErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return locations response along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<LocationInner>> listSinglePageAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getAcceptLanguage(), accept, context))
            .<PagedResponse<LocationInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Returns a list of locations to which you can ship the disks associated with an import or export job. A location
     * is a Microsoft data center region.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return locations response along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<LocationInner>> listSinglePageAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getAcceptLanguage(), accept,
                context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), null, null));
    }

    /**
     * Returns a list of locations to which you can ship the disks associated with an import or export job. A location
     * is a Microsoft data center region.
     * 
     * @throws ErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return locations response as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<LocationInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync());
    }

    /**
     * Returns a list of locations to which you can ship the disks associated with an import or export job. A location
     * is a Microsoft data center region.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return locations response as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<LocationInner> listAsync(Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(context));
    }

    /**
     * Returns a list of locations to which you can ship the disks associated with an import or export job. A location
     * is a Microsoft data center region.
     * 
     * @throws ErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return locations response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LocationInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Returns a list of locations to which you can ship the disks associated with an import or export job. A location
     * is a Microsoft data center region.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return locations response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LocationInner> list(Context context) {
        return new PagedIterable<>(listAsync(context));
    }

    /**
     * Returns the details about a location to which you can ship the disks associated with an import or export job. A
     * location is an Azure region.
     * 
     * @param locationName The name of the location. For example, West US or westus.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provides information about an Azure data center location along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<LocationInner>> getWithResponseAsync(String locationName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), locationName, this.client.getApiVersion(),
                this.client.getAcceptLanguage(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Returns the details about a location to which you can ship the disks associated with an import or export job. A
     * location is an Azure region.
     * 
     * @param locationName The name of the location. For example, West US or westus.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provides information about an Azure data center location along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<LocationInner>> getWithResponseAsync(String locationName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), locationName, this.client.getApiVersion(),
            this.client.getAcceptLanguage(), accept, context);
    }

    /**
     * Returns the details about a location to which you can ship the disks associated with an import or export job. A
     * location is an Azure region.
     * 
     * @param locationName The name of the location. For example, West US or westus.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provides information about an Azure data center location on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<LocationInner> getAsync(String locationName) {
        return getWithResponseAsync(locationName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Returns the details about a location to which you can ship the disks associated with an import or export job. A
     * location is an Azure region.
     * 
     * @param locationName The name of the location. For example, West US or westus.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provides information about an Azure data center location along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LocationInner> getWithResponse(String locationName, Context context) {
        return getWithResponseAsync(locationName, context).block();
    }

    /**
     * Returns the details about a location to which you can ship the disks associated with an import or export job. A
     * location is an Azure region.
     * 
     * @param locationName The name of the location. For example, West US or westus.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provides information about an Azure data center location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LocationInner get(String locationName) {
        return getWithResponse(locationName, Context.NONE).getValue();
    }
}
