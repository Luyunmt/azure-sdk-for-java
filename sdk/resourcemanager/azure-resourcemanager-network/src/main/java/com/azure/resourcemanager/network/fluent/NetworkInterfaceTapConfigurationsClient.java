// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.NetworkInterfaceTapConfigurationInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in NetworkInterfaceTapConfigurationsClient.
 */
public interface NetworkInterfaceTapConfigurationsClient {
    /**
     * Deletes the specified tap configuration from the NetworkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String networkInterfaceName, String tapConfigurationName);

    /**
     * Deletes the specified tap configuration from the NetworkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String networkInterfaceName, String tapConfigurationName);

    /**
     * Deletes the specified tap configuration from the NetworkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String networkInterfaceName, String tapConfigurationName);

    /**
     * Deletes the specified tap configuration from the NetworkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String networkInterfaceName, String tapConfigurationName, Context context);

    /**
     * Deletes the specified tap configuration from the NetworkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String networkInterfaceName, String tapConfigurationName);

    /**
     * Deletes the specified tap configuration from the NetworkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkInterfaceName, String tapConfigurationName);

    /**
     * Deletes the specified tap configuration from the NetworkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkInterfaceName, String tapConfigurationName, Context context);

    /**
     * Get the specified tap configuration on a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified tap configuration on a network interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<NetworkInterfaceTapConfigurationInner>> getWithResponseAsync(
        String resourceGroupName, String networkInterfaceName, String tapConfigurationName);

    /**
     * Get the specified tap configuration on a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified tap configuration on a network interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NetworkInterfaceTapConfigurationInner> getAsync(
        String resourceGroupName, String networkInterfaceName, String tapConfigurationName);

    /**
     * Get the specified tap configuration on a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified tap configuration on a network interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkInterfaceTapConfigurationInner get(
        String resourceGroupName, String networkInterfaceName, String tapConfigurationName);

    /**
     * Get the specified tap configuration on a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified tap configuration on a network interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkInterfaceTapConfigurationInner> getWithResponse(
        String resourceGroupName, String networkInterfaceName, String tapConfigurationName, Context context);

    /**
     * Creates or updates a Tap configuration in the specified NetworkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @param tapConfigurationParameters Parameters supplied to the create or update tap configuration operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tap configuration in a Network Interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String networkInterfaceName,
        String tapConfigurationName,
        NetworkInterfaceTapConfigurationInner tapConfigurationParameters);

    /**
     * Creates or updates a Tap configuration in the specified NetworkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @param tapConfigurationParameters Parameters supplied to the create or update tap configuration operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tap configuration in a Network Interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<NetworkInterfaceTapConfigurationInner>, NetworkInterfaceTapConfigurationInner>
        beginCreateOrUpdateAsync(
            String resourceGroupName,
            String networkInterfaceName,
            String tapConfigurationName,
            NetworkInterfaceTapConfigurationInner tapConfigurationParameters);

    /**
     * Creates or updates a Tap configuration in the specified NetworkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @param tapConfigurationParameters Parameters supplied to the create or update tap configuration operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tap configuration in a Network Interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<NetworkInterfaceTapConfigurationInner>, NetworkInterfaceTapConfigurationInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String networkInterfaceName,
            String tapConfigurationName,
            NetworkInterfaceTapConfigurationInner tapConfigurationParameters);

    /**
     * Creates or updates a Tap configuration in the specified NetworkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @param tapConfigurationParameters Parameters supplied to the create or update tap configuration operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tap configuration in a Network Interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<NetworkInterfaceTapConfigurationInner>, NetworkInterfaceTapConfigurationInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String networkInterfaceName,
            String tapConfigurationName,
            NetworkInterfaceTapConfigurationInner tapConfigurationParameters,
            Context context);

    /**
     * Creates or updates a Tap configuration in the specified NetworkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @param tapConfigurationParameters Parameters supplied to the create or update tap configuration operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tap configuration in a Network Interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NetworkInterfaceTapConfigurationInner> createOrUpdateAsync(
        String resourceGroupName,
        String networkInterfaceName,
        String tapConfigurationName,
        NetworkInterfaceTapConfigurationInner tapConfigurationParameters);

    /**
     * Creates or updates a Tap configuration in the specified NetworkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @param tapConfigurationParameters Parameters supplied to the create or update tap configuration operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tap configuration in a Network Interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkInterfaceTapConfigurationInner createOrUpdate(
        String resourceGroupName,
        String networkInterfaceName,
        String tapConfigurationName,
        NetworkInterfaceTapConfigurationInner tapConfigurationParameters);

    /**
     * Creates or updates a Tap configuration in the specified NetworkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @param tapConfigurationParameters Parameters supplied to the create or update tap configuration operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tap configuration in a Network Interface.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkInterfaceTapConfigurationInner createOrUpdate(
        String resourceGroupName,
        String networkInterfaceName,
        String tapConfigurationName,
        NetworkInterfaceTapConfigurationInner tapConfigurationParameters,
        Context context);

    /**
     * Get all Tap configurations in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Tap configurations in a network interface.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<NetworkInterfaceTapConfigurationInner> listAsync(String resourceGroupName, String networkInterfaceName);

    /**
     * Get all Tap configurations in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Tap configurations in a network interface.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkInterfaceTapConfigurationInner> list(String resourceGroupName, String networkInterfaceName);

    /**
     * Get all Tap configurations in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Tap configurations in a network interface.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkInterfaceTapConfigurationInner> list(
        String resourceGroupName, String networkInterfaceName, Context context);
}
