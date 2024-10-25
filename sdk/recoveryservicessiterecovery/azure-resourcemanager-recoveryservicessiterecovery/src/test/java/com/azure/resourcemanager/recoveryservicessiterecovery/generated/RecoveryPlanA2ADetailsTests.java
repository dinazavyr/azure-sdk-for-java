// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ExtendedLocation;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ExtendedLocationType;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanA2ADetails;
import org.junit.jupiter.api.Assertions;

public final class RecoveryPlanA2ADetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoveryPlanA2ADetails model = BinaryData.fromString(
            "{\"instanceType\":\"A2A\",\"primaryZone\":\"tnsugisno\",\"recoveryZone\":\"nwnghojov\",\"primaryExtendedLocation\":{\"name\":\"y\",\"type\":\"EdgeZone\"},\"recoveryExtendedLocation\":{\"name\":\"cjixxf\",\"type\":\"EdgeZone\"}}")
            .toObject(RecoveryPlanA2ADetails.class);
        Assertions.assertEquals("tnsugisno", model.primaryZone());
        Assertions.assertEquals("nwnghojov", model.recoveryZone());
        Assertions.assertEquals("y", model.primaryExtendedLocation().name());
        Assertions.assertEquals(ExtendedLocationType.EDGE_ZONE, model.primaryExtendedLocation().type());
        Assertions.assertEquals("cjixxf", model.recoveryExtendedLocation().name());
        Assertions.assertEquals(ExtendedLocationType.EDGE_ZONE, model.recoveryExtendedLocation().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoveryPlanA2ADetails model = new RecoveryPlanA2ADetails().withPrimaryZone("tnsugisno")
            .withRecoveryZone("nwnghojov")
            .withPrimaryExtendedLocation(new ExtendedLocation().withName("y").withType(ExtendedLocationType.EDGE_ZONE))
            .withRecoveryExtendedLocation(
                new ExtendedLocation().withName("cjixxf").withType(ExtendedLocationType.EDGE_ZONE));
        model = BinaryData.fromObject(model).toObject(RecoveryPlanA2ADetails.class);
        Assertions.assertEquals("tnsugisno", model.primaryZone());
        Assertions.assertEquals("nwnghojov", model.recoveryZone());
        Assertions.assertEquals("y", model.primaryExtendedLocation().name());
        Assertions.assertEquals(ExtendedLocationType.EDGE_ZONE, model.primaryExtendedLocation().type());
        Assertions.assertEquals("cjixxf", model.recoveryExtendedLocation().name());
        Assertions.assertEquals(ExtendedLocationType.EDGE_ZONE, model.recoveryExtendedLocation().type());
    }
}
