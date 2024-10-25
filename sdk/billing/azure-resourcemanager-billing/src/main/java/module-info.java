// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.billing {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.billing;
    exports com.azure.resourcemanager.billing.fluent;
    exports com.azure.resourcemanager.billing.fluent.models;
    exports com.azure.resourcemanager.billing.models;

    opens com.azure.resourcemanager.billing.fluent.models to com.azure.core;
    opens com.azure.resourcemanager.billing.models to com.azure.core;
}
