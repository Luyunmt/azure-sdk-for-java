/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.Operations;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.OperationResource;
import rx.Completable;
import java.util.List;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.CheckNameAvailabilityResponse;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.AvailableRpOperation;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.CheckNameAvailabilityRequest;

class OperationsImpl extends WrapperImpl<OperationsInner> implements Operations {
    private final SynapseManager manager;

    OperationsImpl(SynapseManager manager) {
        super(manager.inner().operations());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    private OperationResourceImpl wrapModel(OperationResourceInner inner) {
        return  new OperationResourceImpl(inner, manager());
    }

    @Override
    public Observable<OperationResource> getAzureAsyncHeaderResultAsync(String resourceGroupName, String workspaceName, String operationId) {
        OperationsInner client = this.inner();
        return client.getAzureAsyncHeaderResultAsync(resourceGroupName, workspaceName, operationId)
        .flatMap(new Func1<OperationResourceInner, Observable<OperationResource>>() {
            @Override
            public Observable<OperationResource> call(OperationResourceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((OperationResource)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable getLocationHeaderResultAsync(String resourceGroupName, String workspaceName, String operationId) {
        OperationsInner client = this.inner();
        return client.getLocationHeaderResultAsync(resourceGroupName, workspaceName, operationId).toCompletable();
    }

    @Override
    public Observable<CheckNameAvailabilityResponse> checkNameAvailabilityAsync(CheckNameAvailabilityRequest request) {
        OperationsInner client = this.inner();
        return client.checkNameAvailabilityAsync(request)
        .map(new Func1<CheckNameAvailabilityResponseInner, CheckNameAvailabilityResponse>() {
            @Override
            public CheckNameAvailabilityResponse call(CheckNameAvailabilityResponseInner inner) {
                return new CheckNameAvailabilityResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AvailableRpOperation> listAsync() {
        OperationsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<List<AvailableRpOperationInner>, Observable<AvailableRpOperationInner>>() {
            @Override
            public Observable<AvailableRpOperationInner> call(List<AvailableRpOperationInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<AvailableRpOperationInner, AvailableRpOperation>() {
            @Override
            public AvailableRpOperation call(AvailableRpOperationInner inner) {
                return new AvailableRpOperationImpl(inner, manager());
            }
        });
    }

}
