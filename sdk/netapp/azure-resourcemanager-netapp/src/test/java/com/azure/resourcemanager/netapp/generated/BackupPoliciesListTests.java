// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.BackupPolicyInner;
import com.azure.resourcemanager.netapp.models.BackupPoliciesList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BackupPoliciesListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupPoliciesList model = BinaryData.fromString(
            "{\"value\":[{\"etag\":\"pelol\",\"properties\":{\"backupPolicyId\":\"vk\",\"provisioningState\":\"pqvujzraehtwdwrf\",\"dailyBackupsToKeep\":575939452,\"weeklyBackupsToKeep\":1131007065,\"monthlyBackupsToKeep\":1010479001,\"volumesAssigned\":403427600,\"enabled\":true,\"volumeBackups\":[{\"volumeName\":\"fwpracstwi\",\"volumeResourceId\":\"khevxccedc\",\"backupsCount\":502101574,\"policyEnabled\":true},{\"volumeName\":\"dnwzxltjcvnhltiu\",\"volumeResourceId\":\"xnavvwxq\",\"backupsCount\":165046754,\"policyEnabled\":false},{\"volumeName\":\"y\",\"volumeResourceId\":\"xwlmdjr\",\"backupsCount\":425671915,\"policyEnabled\":true},{\"volumeName\":\"fvpdbo\",\"volumeResourceId\":\"cizsjqlhkrribdei\",\"backupsCount\":1262026177,\"policyEnabled\":false}]},\"location\":\"ghvxndzwmkrefa\",\"tags\":{\"b\":\"orwkqnyh\",\"jivfxzsjabib\":\"j\",\"jxbkzbzkdvn\":\"ystawfsdjpvkvp\",\"zhjjklffhmouwq\":\"jabudurgkakmo\"},\"id\":\"gzrf\",\"name\":\"eeyebi\",\"type\":\"ikayuhqlbjbsybb\"},{\"etag\":\"r\",\"properties\":{\"backupPolicyId\":\"ldgmfpgvmpip\",\"provisioningState\":\"ltha\",\"dailyBackupsToKeep\":178976731,\"weeklyBackupsToKeep\":1464941672,\"monthlyBackupsToKeep\":35596652,\"volumesAssigned\":1198185628,\"enabled\":false,\"volumeBackups\":[{\"volumeName\":\"ezpdrhneu\",\"volumeResourceId\":\"wqkdwytisibi\",\"backupsCount\":1043585640,\"policyEnabled\":true},{\"volumeName\":\"pzimejzanlfzxi\",\"volumeResourceId\":\"rmbzo\",\"backupsCount\":1274938421,\"policyEnabled\":true}]},\"location\":\"jq\",\"tags\":{\"szrnwo\":\"gzpfrla\"},\"id\":\"indfpwpjyl\",\"name\":\"bt\",\"type\":\"h\"},{\"etag\":\"sj\",\"properties\":{\"backupPolicyId\":\"hszfjvfb\",\"provisioningState\":\"feljagrqm\",\"dailyBackupsToKeep\":1938335351,\"weeklyBackupsToKeep\":1366830771,\"monthlyBackupsToKeep\":612777631,\"volumesAssigned\":1300337109,\"enabled\":false,\"volumeBackups\":[{\"volumeName\":\"ghfkvtvsexs\",\"volumeResourceId\":\"ueluqhhahhxvrhmz\",\"backupsCount\":209200388,\"policyEnabled\":false}]},\"location\":\"wspughftqsxhqx\",\"tags\":{\"fzdm\":\"ukndxdigrjgu\",\"otzi\":\"yqtfihwh\",\"phoszqz\":\"gamv\"},\"id\":\"dphqamv\",\"name\":\"kfwynw\",\"type\":\"vtbvkayh\"},{\"etag\":\"nvyq\",\"properties\":{\"backupPolicyId\":\"tkzwpcnpwzc\",\"provisioningState\":\"esgvvsccyaj\",\"dailyBackupsToKeep\":1367034748,\"weeklyBackupsToKeep\":923273166,\"monthlyBackupsToKeep\":589135345,\"volumesAssigned\":1459165437,\"enabled\":true,\"volumeBackups\":[{\"volumeName\":\"fxusemdwzr\",\"volumeResourceId\":\"hapfcqdpsqx\",\"backupsCount\":124988622,\"policyEnabled\":false}]},\"location\":\"oymgccelvezr\",\"tags\":{\"kyhkobopg\":\"lmfeokerq\",\"wccsnjvcdwxlpqek\":\"edkowepbqpcrfk\",\"htjsying\":\"tn\"},\"id\":\"fq\",\"name\":\"tmtdhtmdvypgik\",\"type\":\"gszywk\"}]}")
            .toObject(BackupPoliciesList.class);
        Assertions.assertEquals("ghvxndzwmkrefa", model.value().get(0).location());
        Assertions.assertEquals("orwkqnyh", model.value().get(0).tags().get("b"));
        Assertions.assertEquals(575939452, model.value().get(0).dailyBackupsToKeep());
        Assertions.assertEquals(1131007065, model.value().get(0).weeklyBackupsToKeep());
        Assertions.assertEquals(1010479001, model.value().get(0).monthlyBackupsToKeep());
        Assertions.assertEquals(true, model.value().get(0).enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupPoliciesList model = new BackupPoliciesList().withValue(Arrays.asList(
            new BackupPolicyInner().withLocation("ghvxndzwmkrefa")
                .withTags(mapOf("b", "orwkqnyh", "jivfxzsjabib", "j", "jxbkzbzkdvn", "ystawfsdjpvkvp", "zhjjklffhmouwq",
                    "jabudurgkakmo"))
                .withDailyBackupsToKeep(575939452)
                .withWeeklyBackupsToKeep(1131007065)
                .withMonthlyBackupsToKeep(1010479001)
                .withEnabled(true),
            new BackupPolicyInner().withLocation("jq")
                .withTags(mapOf("szrnwo", "gzpfrla"))
                .withDailyBackupsToKeep(178976731)
                .withWeeklyBackupsToKeep(1464941672)
                .withMonthlyBackupsToKeep(35596652)
                .withEnabled(false),
            new BackupPolicyInner().withLocation("wspughftqsxhqx")
                .withTags(mapOf("fzdm", "ukndxdigrjgu", "otzi", "yqtfihwh", "phoszqz", "gamv"))
                .withDailyBackupsToKeep(1938335351)
                .withWeeklyBackupsToKeep(1366830771)
                .withMonthlyBackupsToKeep(612777631)
                .withEnabled(false),
            new BackupPolicyInner().withLocation("oymgccelvezr")
                .withTags(mapOf("kyhkobopg", "lmfeokerq", "wccsnjvcdwxlpqek", "edkowepbqpcrfk", "htjsying", "tn"))
                .withDailyBackupsToKeep(1367034748)
                .withWeeklyBackupsToKeep(923273166)
                .withMonthlyBackupsToKeep(589135345)
                .withEnabled(true)));
        model = BinaryData.fromObject(model).toObject(BackupPoliciesList.class);
        Assertions.assertEquals("ghvxndzwmkrefa", model.value().get(0).location());
        Assertions.assertEquals("orwkqnyh", model.value().get(0).tags().get("b"));
        Assertions.assertEquals(575939452, model.value().get(0).dailyBackupsToKeep());
        Assertions.assertEquals(1131007065, model.value().get(0).weeklyBackupsToKeep());
        Assertions.assertEquals(1010479001, model.value().get(0).monthlyBackupsToKeep());
        Assertions.assertEquals(true, model.value().get(0).enabled());
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
