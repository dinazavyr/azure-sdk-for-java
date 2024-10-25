// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

/**
 * The type of completion operation.
 */
public enum CompletionOperationTypes {
    /**
     * Enum value DoNothing.
     */
    DO_NOTHING("DoNothing"),

    /**
     * Enum value DeleteFile.
     */
    DELETE_FILE("DeleteFile"),

    /**
     * Enum value MoveFile.
     */
    MOVE_FILE("MoveFile");

    /**
     * The actual serialized value for a CompletionOperationTypes instance.
     */
    private final String value;

    CompletionOperationTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CompletionOperationTypes instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed CompletionOperationTypes object, or null if unable to parse.
     */
    public static CompletionOperationTypes fromString(String value) {
        if (value == null) {
            return null;
        }
        CompletionOperationTypes[] items = CompletionOperationTypes.values();
        for (CompletionOperationTypes item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
