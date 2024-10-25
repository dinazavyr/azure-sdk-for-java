// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.automation.models.AzureQueryProperties;
import com.azure.resourcemanager.automation.models.LinuxProperties;
import com.azure.resourcemanager.automation.models.LinuxUpdateClasses;
import com.azure.resourcemanager.automation.models.NonAzureQueryProperties;
import com.azure.resourcemanager.automation.models.OperatingSystemType;
import com.azure.resourcemanager.automation.models.TagOperators;
import com.azure.resourcemanager.automation.models.TagSettingsProperties;
import com.azure.resourcemanager.automation.models.TargetProperties;
import com.azure.resourcemanager.automation.models.UpdateConfiguration;
import com.azure.resourcemanager.automation.models.WindowsProperties;
import com.azure.resourcemanager.automation.models.WindowsUpdateClasses;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class UpdateConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateConfiguration model = BinaryData.fromString(
            "{\"operatingSystem\":\"Windows\",\"windows\":{\"includedUpdateClassifications\":\"Tools\",\"excludedKbNumbers\":[\"ayiansharujtji\"],\"includedKbNumbers\":[\"zyjq\",\"tvwkpqhjpenu\"],\"rebootSetting\":\"bqeqqekewvnqvcd\"},\"linux\":{\"includedPackageClassifications\":\"Unclassified\",\"excludedPackageNameMasks\":[\"mfdjwn\",\"axpunjqikczvv\",\"tacgxmfc\"],\"includedPackageNameMasks\":[\"rxhtvso\"],\"rebootSetting\":\"lwntsjgqrs\"},\"duration\":\"PT157H7M30S\",\"azureVirtualMachines\":[\"uuybnchrsz\",\"zoyuelyetndnbf\",\"yggagflnlgmt\",\"wahzjmucftbyr\"],\"nonAzureComputerNames\":[\"ohkpigqfu\",\"u\",\"kzmkwklsnoxaxmqe\"],\"targets\":{\"azureQueries\":[{\"scope\":[\"nhg\",\"ydyynfsvkh\",\"bvqt\"],\"locations\":[\"rfdl\",\"ukhpyrneizjcp\",\"ogkhnmgbr\",\"uxddbhfh\"],\"tagSettings\":{\"tags\":{\"nsduugwbsre\":[\"jzoywjxhp\",\"ulontacnpqwteht\",\"evrh\",\"ljyoogwx\"],\"ev\":[\"fqkfuarenl\",\"hhtklnvnafvvkyfe\"]},\"filterOperator\":\"All\"}}],\"nonAzureQueries\":[{\"functionAlias\":\"qxypokkhminq\",\"workspaceId\":\"mczngn\"},{\"functionAlias\":\"xxewu\",\"workspaceId\":\"nvudbchaqdtvqecr\"},{\"functionAlias\":\"tmxxdtddmflhuy\",\"workspaceId\":\"zv\"}]}}")
            .toObject(UpdateConfiguration.class);
        Assertions.assertEquals(OperatingSystemType.WINDOWS, model.operatingSystem());
        Assertions.assertEquals(WindowsUpdateClasses.TOOLS, model.windows().includedUpdateClassifications());
        Assertions.assertEquals("ayiansharujtji", model.windows().excludedKbNumbers().get(0));
        Assertions.assertEquals("zyjq", model.windows().includedKbNumbers().get(0));
        Assertions.assertEquals("bqeqqekewvnqvcd", model.windows().rebootSetting());
        Assertions.assertEquals(LinuxUpdateClasses.UNCLASSIFIED, model.linux().includedPackageClassifications());
        Assertions.assertEquals("mfdjwn", model.linux().excludedPackageNameMasks().get(0));
        Assertions.assertEquals("rxhtvso", model.linux().includedPackageNameMasks().get(0));
        Assertions.assertEquals("lwntsjgqrs", model.linux().rebootSetting());
        Assertions.assertEquals(Duration.parse("PT157H7M30S"), model.duration());
        Assertions.assertEquals("uuybnchrsz", model.azureVirtualMachines().get(0));
        Assertions.assertEquals("ohkpigqfu", model.nonAzureComputerNames().get(0));
        Assertions.assertEquals("nhg", model.targets().azureQueries().get(0).scope().get(0));
        Assertions.assertEquals("rfdl", model.targets().azureQueries().get(0).locations().get(0));
        Assertions.assertEquals("jzoywjxhp",
            model.targets().azureQueries().get(0).tagSettings().tags().get("nsduugwbsre").get(0));
        Assertions.assertEquals(TagOperators.ALL, model.targets().azureQueries().get(0).tagSettings().filterOperator());
        Assertions.assertEquals("qxypokkhminq", model.targets().nonAzureQueries().get(0).functionAlias());
        Assertions.assertEquals("mczngn", model.targets().nonAzureQueries().get(0).workspaceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateConfiguration model = new UpdateConfiguration().withOperatingSystem(OperatingSystemType.WINDOWS)
            .withWindows(new WindowsProperties().withIncludedUpdateClassifications(WindowsUpdateClasses.TOOLS)
                .withExcludedKbNumbers(Arrays.asList("ayiansharujtji"))
                .withIncludedKbNumbers(Arrays.asList("zyjq", "tvwkpqhjpenu"))
                .withRebootSetting("bqeqqekewvnqvcd"))
            .withLinux(new LinuxProperties().withIncludedPackageClassifications(LinuxUpdateClasses.UNCLASSIFIED)
                .withExcludedPackageNameMasks(Arrays.asList("mfdjwn", "axpunjqikczvv", "tacgxmfc"))
                .withIncludedPackageNameMasks(Arrays.asList("rxhtvso"))
                .withRebootSetting("lwntsjgqrs"))
            .withDuration(Duration.parse("PT157H7M30S"))
            .withAzureVirtualMachines(Arrays.asList("uuybnchrsz", "zoyuelyetndnbf", "yggagflnlgmt", "wahzjmucftbyr"))
            .withNonAzureComputerNames(Arrays.asList("ohkpigqfu", "u", "kzmkwklsnoxaxmqe"))
            .withTargets(new TargetProperties()
                .withAzureQueries(
                    Arrays.asList(new AzureQueryProperties().withScope(Arrays.asList("nhg", "ydyynfsvkh", "bvqt"))
                        .withLocations(Arrays.asList("rfdl", "ukhpyrneizjcp", "ogkhnmgbr", "uxddbhfh"))
                        .withTagSettings(new TagSettingsProperties()
                            .withTags(
                                mapOf("nsduugwbsre", Arrays.asList("jzoywjxhp", "ulontacnpqwteht", "evrh", "ljyoogwx"),
                                    "ev", Arrays.asList("fqkfuarenl", "hhtklnvnafvvkyfe")))
                            .withFilterOperator(TagOperators.ALL))))
                .withNonAzureQueries(Arrays.asList(
                    new NonAzureQueryProperties().withFunctionAlias("qxypokkhminq").withWorkspaceId("mczngn"),
                    new NonAzureQueryProperties().withFunctionAlias("xxewu").withWorkspaceId("nvudbchaqdtvqecr"),
                    new NonAzureQueryProperties().withFunctionAlias("tmxxdtddmflhuy").withWorkspaceId("zv"))));
        model = BinaryData.fromObject(model).toObject(UpdateConfiguration.class);
        Assertions.assertEquals(OperatingSystemType.WINDOWS, model.operatingSystem());
        Assertions.assertEquals(WindowsUpdateClasses.TOOLS, model.windows().includedUpdateClassifications());
        Assertions.assertEquals("ayiansharujtji", model.windows().excludedKbNumbers().get(0));
        Assertions.assertEquals("zyjq", model.windows().includedKbNumbers().get(0));
        Assertions.assertEquals("bqeqqekewvnqvcd", model.windows().rebootSetting());
        Assertions.assertEquals(LinuxUpdateClasses.UNCLASSIFIED, model.linux().includedPackageClassifications());
        Assertions.assertEquals("mfdjwn", model.linux().excludedPackageNameMasks().get(0));
        Assertions.assertEquals("rxhtvso", model.linux().includedPackageNameMasks().get(0));
        Assertions.assertEquals("lwntsjgqrs", model.linux().rebootSetting());
        Assertions.assertEquals(Duration.parse("PT157H7M30S"), model.duration());
        Assertions.assertEquals("uuybnchrsz", model.azureVirtualMachines().get(0));
        Assertions.assertEquals("ohkpigqfu", model.nonAzureComputerNames().get(0));
        Assertions.assertEquals("nhg", model.targets().azureQueries().get(0).scope().get(0));
        Assertions.assertEquals("rfdl", model.targets().azureQueries().get(0).locations().get(0));
        Assertions.assertEquals("jzoywjxhp",
            model.targets().azureQueries().get(0).tagSettings().tags().get("nsduugwbsre").get(0));
        Assertions.assertEquals(TagOperators.ALL, model.targets().azureQueries().get(0).tagSettings().filterOperator());
        Assertions.assertEquals("qxypokkhminq", model.targets().nonAzureQueries().get(0).functionAlias());
        Assertions.assertEquals("mczngn", model.targets().nonAzureQueries().get(0).workspaceId());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
