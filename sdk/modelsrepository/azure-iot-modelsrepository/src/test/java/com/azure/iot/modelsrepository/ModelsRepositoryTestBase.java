// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.iot.modelsrepository;

import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestMode;
import com.azure.core.test.TestProxyTestBase;

class ModelsRepositoryTestBase extends TestProxyTestBase {

    protected ModelsRepositoryClientBuilder getModelsRepositoryClientbuilder(HttpClient httpClient,
        ModelsRepositoryServiceVersion serviceVersion, String repositoryEndpoint) {
        ModelsRepositoryClientBuilder builder = new ModelsRepositoryClientBuilder();
        builder.serviceVersion(serviceVersion);

        if (getTestMode() == TestMode.PLAYBACK) {
            builder.httpClient(interceptorManager.getPlaybackClient());
            // Use fake credentials for playback mode.
            // Connect to a special host when running tests in playback mode.
            builder.repositoryEndpoint(repositoryEndpoint);
            return builder;
        }

        // If it is record mode, we add record mode policies to the builder.
        if (getTestMode() == TestMode.RECORD) {
            builder.addPolicy(interceptorManager.getRecordPolicy());
        }

        builder.repositoryEndpoint(repositoryEndpoint);
        builder.httpClient(httpClient);
        builder.httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS));

        return builder;
    }

    protected ModelsRepositoryClient getClient(HttpClient httpClient, ModelsRepositoryServiceVersion serviceVersion,
        String repositoryEndpoint) {
        return getModelsRepositoryClientbuilder(httpClient, serviceVersion, repositoryEndpoint).buildClient();
    }

    protected ModelsRepositoryAsyncClient getAsyncClient(HttpClient httpClient,
        ModelsRepositoryServiceVersion serviceVersion, String repositoryEndpoint) {
        return getModelsRepositoryClientbuilder(httpClient, serviceVersion, repositoryEndpoint).buildAsyncClient();
    }
}
