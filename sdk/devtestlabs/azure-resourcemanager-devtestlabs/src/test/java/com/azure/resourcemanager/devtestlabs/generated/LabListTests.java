// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.LabInner;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.EnvironmentPermission;
import com.azure.resourcemanager.devtestlabs.models.LabAnnouncementProperties;
import com.azure.resourcemanager.devtestlabs.models.LabList;
import com.azure.resourcemanager.devtestlabs.models.LabSupportProperties;
import com.azure.resourcemanager.devtestlabs.models.PremiumDataDisk;
import com.azure.resourcemanager.devtestlabs.models.StorageType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class LabListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LabList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"defaultStorageAccount\":\"ryrtihfxtijbpzv\",\"defaultPremiumStorageAccount\":\"wzsymglzufcy\",\"artifactsStorageAccount\":\"ohdbihanufh\",\"premiumDataDiskStorageAccount\":\"bj\",\"vaultName\":\"a\",\"labStorageType\":\"StandardSSD\",\"mandatoryArtifactsResourceIdsLinux\":[\"qhabifpikxwcz\",\"yscnpqxu\"],\"mandatoryArtifactsResourceIdsWindows\":[\"y\"],\"createdDate\":\"2021-06-17T16:29:35Z\",\"premiumDataDisks\":\"Disabled\",\"environmentPermission\":\"Reader\",\"announcement\":{\"title\":\"xvd\",\"markdown\":\"jgrtfwvukxga\",\"enabled\":\"Enabled\",\"expirationDate\":\"2021-02-04T04:03:24Z\",\"expired\":false,\"provisioningState\":\"jcny\",\"uniqueIdentifier\":\"hkryhtn\"},\"support\":{\"enabled\":\"Enabled\",\"markdown\":\"lokjyemkk\"},\"vmCreationResourceGroup\":\"ipjoxzjnchgejs\",\"publicIpId\":\"dmailzydehojw\",\"loadBalancerId\":\"huxinpmqnj\",\"networkSecurityGroupId\":\"wixjsprozvcp\",\"extendedProperties\":{\"fdatsc\":\"gjvw\"},\"provisioningState\":\"vpjhulsuuv\",\"uniqueIdentifier\":\"jozkrwfndiod\"},\"location\":\"pslwejdpvw\",\"tags\":{\"j\":\"qpsoacctazak\",\"yffdfdos\":\"ahbc\"},\"id\":\"gexpaojakhmsbz\",\"name\":\"hcrzevd\",\"type\":\"hlxaolthqtr\"},{\"properties\":{\"defaultStorageAccount\":\"bpf\",\"defaultPremiumStorageAccount\":\"s\",\"artifactsStorageAccount\":\"zgvfcjrwz\",\"premiumDataDiskStorageAccount\":\"xjtfelluwfzit\",\"vaultName\":\"peqfpjkjl\",\"labStorageType\":\"Standard\",\"mandatoryArtifactsResourceIdsLinux\":[\"vhpfxxypininmay\",\"uybbkpodep\",\"oginuvamiheognar\",\"zxtheotusivyevcc\"],\"mandatoryArtifactsResourceIdsWindows\":[\"hn\",\"un\"],\"createdDate\":\"2021-08-15T16:10:49Z\",\"premiumDataDisks\":\"Disabled\",\"environmentPermission\":\"Contributor\",\"announcement\":{\"title\":\"gxg\",\"markdown\":\"pemvtzfkufubljof\",\"enabled\":\"Disabled\",\"expirationDate\":\"2021-05-14T22:11:20Z\",\"expired\":true,\"provisioningState\":\"qjhqjbas\",\"uniqueIdentifier\":\"smjqulngsntnbyb\"},\"support\":{\"enabled\":\"Disabled\",\"markdown\":\"rwclxxwrljdo\"},\"vmCreationResourceGroup\":\"kcqvkocrc\",\"publicIpId\":\"kwt\",\"loadBalancerId\":\"xbnjbiksq\",\"networkSecurityGroupId\":\"lssai\",\"extendedProperties\":{\"eebvmgxsab\":\"jwnzlljfmp\"},\"provisioningState\":\"qduujitcjczdz\",\"uniqueIdentifier\":\"ndhkrw\"},\"location\":\"d\",\"tags\":{\"usnhutje\":\"dsbdkvwrwjf\"},\"id\":\"tmrldhugjzzdatq\",\"name\":\"hocdgeab\",\"type\":\"gphuticndvka\"},{\"properties\":{\"defaultStorageAccount\":\"yiftyhxhuro\",\"defaultPremiumStorageAccount\":\"tyxolniwpwc\",\"artifactsStorageAccount\":\"jfkgiawxk\",\"premiumDataDiskStorageAccount\":\"ypl\",\"vaultName\":\"kbasyypn\",\"labStorageType\":\"StandardSSD\",\"mandatoryArtifactsResourceIdsLinux\":[\"cbacphejkotynqg\",\"ulzndlikwyqk\",\"fgibmadgakeq\"],\"mandatoryArtifactsResourceIdsWindows\":[\"yb\"],\"createdDate\":\"2021-03-26T22:16:08Z\",\"premiumDataDisks\":\"Enabled\",\"environmentPermission\":\"Reader\",\"announcement\":{\"title\":\"ciqfou\",\"markdown\":\"mmnkzsmodmgl\",\"enabled\":\"Disabled\",\"expirationDate\":\"2021-10-06T03:29:57Z\",\"expired\":false,\"provisioningState\":\"mutduqktaps\",\"uniqueIdentifier\":\"gcue\"},\"support\":{\"enabled\":\"Enabled\",\"markdown\":\"dosvqwhbmdgbbjf\"},\"vmCreationResourceGroup\":\"gmbmbexppbh\",\"publicIpId\":\"qrolfpf\",\"loadBalancerId\":\"algbquxigjyjg\",\"networkSecurityGroupId\":\"aoyfhrtxilnerkuj\",\"extendedProperties\":{\"juvf\":\"l\",\"jkcpr\":\"awrlyx\",\"nruj\":\"nwbxgjvtbvpyssz\"},\"provisioningState\":\"uhmuouqfprwzwbn\",\"uniqueIdentifier\":\"itnwuizgazxufi\"},\"location\":\"uckyf\",\"tags\":{\"zuhtymwisdkfthwx\":\"fidfvzw\",\"mijcmmxdcufufs\":\"nteiwaopv\",\"fycc\":\"pymzidnsezcxtbzs\"},\"id\":\"newmdwzjeiachbo\",\"name\":\"sflnrosfqp\",\"type\":\"eeh\"}],\"nextLink\":\"vypyqrimzinpv\"}")
            .toObject(LabList.class);
        Assertions.assertEquals("pslwejdpvw", model.value().get(0).location());
        Assertions.assertEquals("qpsoacctazak", model.value().get(0).tags().get("j"));
        Assertions.assertEquals(StorageType.STANDARD_SSD, model.value().get(0).labStorageType());
        Assertions.assertEquals("qhabifpikxwcz", model.value().get(0).mandatoryArtifactsResourceIdsLinux().get(0));
        Assertions.assertEquals("y", model.value().get(0).mandatoryArtifactsResourceIdsWindows().get(0));
        Assertions.assertEquals(PremiumDataDisk.DISABLED, model.value().get(0).premiumDataDisks());
        Assertions.assertEquals(EnvironmentPermission.READER, model.value().get(0).environmentPermission());
        Assertions.assertEquals("xvd", model.value().get(0).announcement().title());
        Assertions.assertEquals("jgrtfwvukxga", model.value().get(0).announcement().markdown());
        Assertions.assertEquals(EnableStatus.ENABLED, model.value().get(0).announcement().enabled());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-04T04:03:24Z"),
            model.value().get(0).announcement().expirationDate());
        Assertions.assertEquals(false, model.value().get(0).announcement().expired());
        Assertions.assertEquals(EnableStatus.ENABLED, model.value().get(0).support().enabled());
        Assertions.assertEquals("lokjyemkk", model.value().get(0).support().markdown());
        Assertions.assertEquals("gjvw", model.value().get(0).extendedProperties().get("fdatsc"));
        Assertions.assertEquals("vypyqrimzinpv", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LabList model = new LabList()
            .withValue(Arrays.asList(
                new LabInner().withLocation("pslwejdpvw")
                    .withTags(mapOf("j", "qpsoacctazak", "yffdfdos", "ahbc"))
                    .withLabStorageType(StorageType.STANDARD_SSD)
                    .withMandatoryArtifactsResourceIdsLinux(Arrays.asList("qhabifpikxwcz", "yscnpqxu"))
                    .withMandatoryArtifactsResourceIdsWindows(Arrays.asList("y"))
                    .withPremiumDataDisks(PremiumDataDisk.DISABLED)
                    .withEnvironmentPermission(EnvironmentPermission.READER)
                    .withAnnouncement(new LabAnnouncementProperties().withTitle("xvd")
                        .withMarkdown("jgrtfwvukxga")
                        .withEnabled(EnableStatus.ENABLED)
                        .withExpirationDate(OffsetDateTime.parse("2021-02-04T04:03:24Z"))
                        .withExpired(false))
                    .withSupport(new LabSupportProperties().withEnabled(EnableStatus.ENABLED).withMarkdown("lokjyemkk"))
                    .withExtendedProperties(mapOf("fdatsc", "gjvw")),
                new LabInner().withLocation("d")
                    .withTags(mapOf("usnhutje", "dsbdkvwrwjf"))
                    .withLabStorageType(StorageType.STANDARD)
                    .withMandatoryArtifactsResourceIdsLinux(
                        Arrays.asList("vhpfxxypininmay", "uybbkpodep", "oginuvamiheognar", "zxtheotusivyevcc"))
                    .withMandatoryArtifactsResourceIdsWindows(Arrays.asList("hn", "un"))
                    .withPremiumDataDisks(PremiumDataDisk.DISABLED)
                    .withEnvironmentPermission(EnvironmentPermission.CONTRIBUTOR)
                    .withAnnouncement(new LabAnnouncementProperties().withTitle("gxg")
                        .withMarkdown("pemvtzfkufubljof")
                        .withEnabled(EnableStatus.DISABLED)
                        .withExpirationDate(OffsetDateTime.parse("2021-05-14T22:11:20Z"))
                        .withExpired(true))
                    .withSupport(
                        new LabSupportProperties().withEnabled(EnableStatus.DISABLED).withMarkdown("rwclxxwrljdo"))
                    .withExtendedProperties(mapOf("eebvmgxsab", "jwnzlljfmp")),
                new LabInner().withLocation("uckyf")
                    .withTags(
                        mapOf("zuhtymwisdkfthwx", "fidfvzw", "mijcmmxdcufufs", "nteiwaopv", "fycc", "pymzidnsezcxtbzs"))
                    .withLabStorageType(StorageType.STANDARD_SSD)
                    .withMandatoryArtifactsResourceIdsLinux(
                        Arrays.asList("cbacphejkotynqg", "ulzndlikwyqk", "fgibmadgakeq"))
                    .withMandatoryArtifactsResourceIdsWindows(Arrays.asList("yb"))
                    .withPremiumDataDisks(PremiumDataDisk.ENABLED)
                    .withEnvironmentPermission(EnvironmentPermission.READER)
                    .withAnnouncement(new LabAnnouncementProperties().withTitle("ciqfou")
                        .withMarkdown("mmnkzsmodmgl")
                        .withEnabled(EnableStatus.DISABLED)
                        .withExpirationDate(OffsetDateTime.parse("2021-10-06T03:29:57Z"))
                        .withExpired(false))
                    .withSupport(
                        new LabSupportProperties().withEnabled(EnableStatus.ENABLED).withMarkdown("dosvqwhbmdgbbjf"))
                    .withExtendedProperties(mapOf("juvf", "l", "jkcpr", "awrlyx", "nruj", "nwbxgjvtbvpyssz"))))
            .withNextLink("vypyqrimzinpv");
        model = BinaryData.fromObject(model).toObject(LabList.class);
        Assertions.assertEquals("pslwejdpvw", model.value().get(0).location());
        Assertions.assertEquals("qpsoacctazak", model.value().get(0).tags().get("j"));
        Assertions.assertEquals(StorageType.STANDARD_SSD, model.value().get(0).labStorageType());
        Assertions.assertEquals("qhabifpikxwcz", model.value().get(0).mandatoryArtifactsResourceIdsLinux().get(0));
        Assertions.assertEquals("y", model.value().get(0).mandatoryArtifactsResourceIdsWindows().get(0));
        Assertions.assertEquals(PremiumDataDisk.DISABLED, model.value().get(0).premiumDataDisks());
        Assertions.assertEquals(EnvironmentPermission.READER, model.value().get(0).environmentPermission());
        Assertions.assertEquals("xvd", model.value().get(0).announcement().title());
        Assertions.assertEquals("jgrtfwvukxga", model.value().get(0).announcement().markdown());
        Assertions.assertEquals(EnableStatus.ENABLED, model.value().get(0).announcement().enabled());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-04T04:03:24Z"),
            model.value().get(0).announcement().expirationDate());
        Assertions.assertEquals(false, model.value().get(0).announcement().expired());
        Assertions.assertEquals(EnableStatus.ENABLED, model.value().get(0).support().enabled());
        Assertions.assertEquals("lokjyemkk", model.value().get(0).support().markdown());
        Assertions.assertEquals("gjvw", model.value().get(0).extendedProperties().get("fdatsc"));
        Assertions.assertEquals("vypyqrimzinpv", model.nextLink());
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
