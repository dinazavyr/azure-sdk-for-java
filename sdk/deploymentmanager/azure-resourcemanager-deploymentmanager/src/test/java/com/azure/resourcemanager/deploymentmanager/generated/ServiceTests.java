// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deploymentmanager.models.DeploymentMode;
import com.azure.resourcemanager.deploymentmanager.models.Service;
import com.azure.resourcemanager.deploymentmanager.models.ServiceUnit;
import com.azure.resourcemanager.deploymentmanager.models.ServiceUnitArtifacts;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ServiceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Service model = BinaryData.fromString(
            "{\"name\":\"aoqvuh\",\"serviceUnits\":[{\"name\":\"fcyddg\",\"steps\":[],\"targetResourceGroup\":\"t\",\"deploymentMode\":\"Complete\",\"artifacts\":{\"templateUri\":\"wpyeicxmqciwqvh\",\"parametersUri\":\"ixuigdtopbobj\",\"templateArtifactSourceRelativePath\":\"hm\",\"parametersArtifactSourceRelativePath\":\"u\"}},{\"name\":\"a\",\"steps\":[],\"targetResourceGroup\":\"z\",\"deploymentMode\":\"Complete\",\"artifacts\":{\"templateUri\":\"t\",\"parametersUri\":\"vdfgiotk\",\"templateArtifactSourceRelativePath\":\"utqxlngx\",\"parametersArtifactSourceRelativePath\":\"fgugnxkrxdqmid\"}},{\"name\":\"hzrvqd\",\"steps\":[],\"targetResourceGroup\":\"hjybigehoqfbo\",\"deploymentMode\":\"Incremental\",\"artifacts\":{\"templateUri\":\"nyktzlcuiy\",\"parametersUri\":\"qyw\",\"templateArtifactSourceRelativePath\":\"drvyn\",\"parametersArtifactSourceRelativePath\":\"gpphrcgyn\"}}],\"targetLocation\":\"ocpecfvmmco\",\"targetSubscriptionId\":\"fsxlzevgbmqjqa\"}")
            .toObject(Service.class);
        Assertions.assertEquals("ocpecfvmmco", model.targetLocation());
        Assertions.assertEquals("fsxlzevgbmqjqa", model.targetSubscriptionId());
        Assertions.assertEquals("aoqvuh", model.name());
        Assertions.assertEquals("t", model.serviceUnits().get(0).targetResourceGroup());
        Assertions.assertEquals(DeploymentMode.COMPLETE, model.serviceUnits().get(0).deploymentMode());
        Assertions.assertEquals("wpyeicxmqciwqvh", model.serviceUnits().get(0).artifacts().templateUri());
        Assertions.assertEquals("ixuigdtopbobj", model.serviceUnits().get(0).artifacts().parametersUri());
        Assertions.assertEquals("hm", model.serviceUnits().get(0).artifacts().templateArtifactSourceRelativePath());
        Assertions.assertEquals("u", model.serviceUnits().get(0).artifacts().parametersArtifactSourceRelativePath());
        Assertions.assertEquals("fcyddg", model.serviceUnits().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Service model = new Service().withTargetLocation("ocpecfvmmco")
            .withTargetSubscriptionId("fsxlzevgbmqjqa")
            .withName("aoqvuh")
            .withServiceUnits(Arrays.asList(
                new ServiceUnit().withTargetResourceGroup("t")
                    .withDeploymentMode(DeploymentMode.COMPLETE)
                    .withArtifacts(new ServiceUnitArtifacts().withTemplateUri("wpyeicxmqciwqvh")
                        .withParametersUri("ixuigdtopbobj")
                        .withTemplateArtifactSourceRelativePath("hm")
                        .withParametersArtifactSourceRelativePath("u"))
                    .withName("fcyddg")
                    .withSteps(Arrays.asList()),
                new ServiceUnit().withTargetResourceGroup("z")
                    .withDeploymentMode(DeploymentMode.COMPLETE)
                    .withArtifacts(new ServiceUnitArtifacts().withTemplateUri("t")
                        .withParametersUri("vdfgiotk")
                        .withTemplateArtifactSourceRelativePath("utqxlngx")
                        .withParametersArtifactSourceRelativePath("fgugnxkrxdqmid"))
                    .withName("a")
                    .withSteps(Arrays.asList()),
                new ServiceUnit().withTargetResourceGroup("hjybigehoqfbo")
                    .withDeploymentMode(DeploymentMode.INCREMENTAL)
                    .withArtifacts(new ServiceUnitArtifacts().withTemplateUri("nyktzlcuiy")
                        .withParametersUri("qyw")
                        .withTemplateArtifactSourceRelativePath("drvyn")
                        .withParametersArtifactSourceRelativePath("gpphrcgyn"))
                    .withName("hzrvqd")
                    .withSteps(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(Service.class);
        Assertions.assertEquals("ocpecfvmmco", model.targetLocation());
        Assertions.assertEquals("fsxlzevgbmqjqa", model.targetSubscriptionId());
        Assertions.assertEquals("aoqvuh", model.name());
        Assertions.assertEquals("t", model.serviceUnits().get(0).targetResourceGroup());
        Assertions.assertEquals(DeploymentMode.COMPLETE, model.serviceUnits().get(0).deploymentMode());
        Assertions.assertEquals("wpyeicxmqciwqvh", model.serviceUnits().get(0).artifacts().templateUri());
        Assertions.assertEquals("ixuigdtopbobj", model.serviceUnits().get(0).artifacts().parametersUri());
        Assertions.assertEquals("hm", model.serviceUnits().get(0).artifacts().templateArtifactSourceRelativePath());
        Assertions.assertEquals("u", model.serviceUnits().get(0).artifacts().parametersArtifactSourceRelativePath());
        Assertions.assertEquals("fcyddg", model.serviceUnits().get(0).name());
    }
}
