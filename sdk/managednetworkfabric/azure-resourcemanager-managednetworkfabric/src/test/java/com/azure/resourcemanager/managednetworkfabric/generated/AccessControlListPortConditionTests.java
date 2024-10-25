// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.AccessControlListPortCondition;
import com.azure.resourcemanager.managednetworkfabric.models.Layer4Protocol;
import com.azure.resourcemanager.managednetworkfabric.models.PortType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AccessControlListPortConditionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccessControlListPortCondition model = BinaryData.fromString(
            "{\"flags\":[\"wefqsfapaqtferr\",\"wexjkmfxapjwogq\",\"nobpudcdabtqwpw\",\"awbzasqb\"],\"portType\":\"SourcePort\",\"layer4Protocol\":\"TCP\",\"ports\":[\"yexaoguy\",\"i\",\"ids\",\"ault\"],\"portGroupNames\":[\"jumfqwazlnq\"]}")
            .toObject(AccessControlListPortCondition.class);
        Assertions.assertEquals(PortType.SOURCE_PORT, model.portType());
        Assertions.assertEquals(Layer4Protocol.TCP, model.layer4Protocol());
        Assertions.assertEquals("yexaoguy", model.ports().get(0));
        Assertions.assertEquals("jumfqwazlnq", model.portGroupNames().get(0));
        Assertions.assertEquals("wefqsfapaqtferr", model.flags().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccessControlListPortCondition model = new AccessControlListPortCondition().withPortType(PortType.SOURCE_PORT)
            .withLayer4Protocol(Layer4Protocol.TCP)
            .withPorts(Arrays.asList("yexaoguy", "i", "ids", "ault"))
            .withPortGroupNames(Arrays.asList("jumfqwazlnq"))
            .withFlags(Arrays.asList("wefqsfapaqtferr", "wexjkmfxapjwogq", "nobpudcdabtqwpw", "awbzasqb"));
        model = BinaryData.fromObject(model).toObject(AccessControlListPortCondition.class);
        Assertions.assertEquals(PortType.SOURCE_PORT, model.portType());
        Assertions.assertEquals(Layer4Protocol.TCP, model.layer4Protocol());
        Assertions.assertEquals("yexaoguy", model.ports().get(0));
        Assertions.assertEquals("jumfqwazlnq", model.portGroupNames().get(0));
        Assertions.assertEquals("wefqsfapaqtferr", model.flags().get(0));
    }
}
