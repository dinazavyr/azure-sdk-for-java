// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.models.InstructionSteps;
import com.azure.resourcemanager.securityinsights.models.InstructionStepsInstructionsItem;
import com.azure.resourcemanager.securityinsights.models.SettingType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class InstructionStepsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InstructionSteps model = BinaryData.fromString(
            "{\"title\":\"smcolmugpy\",\"description\":\"osdkluwzxey\",\"instructions\":[{\"parameters\":\"datayevjhubnobguq\",\"type\":\"InfoMessage\"},{\"parameters\":\"datasqkpdmioyjpnm\",\"type\":\"InstructionStepsGroup\"}]}")
            .toObject(InstructionSteps.class);
        Assertions.assertEquals("smcolmugpy", model.title());
        Assertions.assertEquals("osdkluwzxey", model.description());
        Assertions.assertEquals(SettingType.INFO_MESSAGE, model.instructions().get(0).type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InstructionSteps model = new InstructionSteps().withTitle("smcolmugpy")
            .withDescription("osdkluwzxey")
            .withInstructions(Arrays.asList(
                new InstructionStepsInstructionsItem().withParameters("datayevjhubnobguq")
                    .withType(SettingType.INFO_MESSAGE),
                new InstructionStepsInstructionsItem().withParameters("datasqkpdmioyjpnm")
                    .withType(SettingType.INSTRUCTION_STEPS_GROUP)));
        model = BinaryData.fromObject(model).toObject(InstructionSteps.class);
        Assertions.assertEquals("smcolmugpy", model.title());
        Assertions.assertEquals("osdkluwzxey", model.description());
        Assertions.assertEquals(SettingType.INFO_MESSAGE, model.instructions().get(0).type());
    }
}
