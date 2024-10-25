// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.FlowAccessControlConfigurationPolicy;
import com.azure.resourcemanager.logic.models.IpAddressRange;
import com.azure.resourcemanager.logic.models.OpenAuthenticationAccessPolicies;
import com.azure.resourcemanager.logic.models.OpenAuthenticationAccessPolicy;
import com.azure.resourcemanager.logic.models.OpenAuthenticationPolicyClaim;
import com.azure.resourcemanager.logic.models.OpenAuthenticationProviderType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class FlowAccessControlConfigurationPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FlowAccessControlConfigurationPolicy model = BinaryData.fromString(
            "{\"allowedCallerIpAddresses\":[{\"addressRange\":\"xpsiebtfhvpes\"},{\"addressRange\":\"skrdqmhjj\"},{\"addressRange\":\"tldwkyzxuutk\"}],\"openAuthenticationPolicies\":{\"policies\":{\"qugxywpmueefjzwf\":{\"type\":\"AAD\",\"claims\":[{\"name\":\"xotogtwrupqsxv\",\"value\":\"i\"},{\"name\":\"kvceoveilovnotyf\",\"value\":\"cnjbkcnxdhbt\"},{\"name\":\"phywpnvj\",\"value\":\"qnermclfplphoxu\"},{\"name\":\"rpabg\",\"value\":\"psbjta\"}]},\"uzbpzkafku\":{\"type\":\"AAD\",\"claims\":[{\"name\":\"dsuyonobgla\",\"value\":\"qxtccmgyudx\"},{\"name\":\"lmoyrx\",\"value\":\"fudwpznt\"},{\"name\":\"dzhlrq\",\"value\":\"hckfrlhrx\"},{\"name\":\"kyv\",\"value\":\"ca\"}]}}}}")
            .toObject(FlowAccessControlConfigurationPolicy.class);
        Assertions.assertEquals("xpsiebtfhvpes", model.allowedCallerIpAddresses().get(0).addressRange());
        Assertions.assertEquals(OpenAuthenticationProviderType.AAD,
            model.openAuthenticationPolicies().policies().get("qugxywpmueefjzwf").type());
        Assertions.assertEquals("xotogtwrupqsxv",
            model.openAuthenticationPolicies().policies().get("qugxywpmueefjzwf").claims().get(0).name());
        Assertions.assertEquals("i",
            model.openAuthenticationPolicies().policies().get("qugxywpmueefjzwf").claims().get(0).value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FlowAccessControlConfigurationPolicy model = new FlowAccessControlConfigurationPolicy()
            .withAllowedCallerIpAddresses(Arrays.asList(new IpAddressRange().withAddressRange("xpsiebtfhvpes"),
                new IpAddressRange().withAddressRange("skrdqmhjj"),
                new IpAddressRange().withAddressRange("tldwkyzxuutk")))
            .withOpenAuthenticationPolicies(
                new OpenAuthenticationAccessPolicies()
                    .withPolicies(mapOf("qugxywpmueefjzwf",
                        new OpenAuthenticationAccessPolicy().withType(OpenAuthenticationProviderType.AAD)
                            .withClaims(Arrays.asList(
                                new OpenAuthenticationPolicyClaim().withName("xotogtwrupqsxv").withValue("i"),
                                new OpenAuthenticationPolicyClaim().withName("kvceoveilovnotyf")
                                    .withValue("cnjbkcnxdhbt"),
                                new OpenAuthenticationPolicyClaim().withName("phywpnvj").withValue("qnermclfplphoxu"),
                                new OpenAuthenticationPolicyClaim().withName("rpabg").withValue("psbjta"))),
                        "uzbpzkafku",
                        new OpenAuthenticationAccessPolicy().withType(OpenAuthenticationProviderType.AAD)
                            .withClaims(Arrays.asList(
                                new OpenAuthenticationPolicyClaim().withName("dsuyonobgla").withValue("qxtccmgyudx"),
                                new OpenAuthenticationPolicyClaim().withName("lmoyrx").withValue("fudwpznt"),
                                new OpenAuthenticationPolicyClaim().withName("dzhlrq").withValue("hckfrlhrx"),
                                new OpenAuthenticationPolicyClaim().withName("kyv").withValue("ca"))))));
        model = BinaryData.fromObject(model).toObject(FlowAccessControlConfigurationPolicy.class);
        Assertions.assertEquals("xpsiebtfhvpes", model.allowedCallerIpAddresses().get(0).addressRange());
        Assertions.assertEquals(OpenAuthenticationProviderType.AAD,
            model.openAuthenticationPolicies().policies().get("qugxywpmueefjzwf").type());
        Assertions.assertEquals("xotogtwrupqsxv",
            model.openAuthenticationPolicies().policies().get("qugxywpmueefjzwf").claims().get(0).name());
        Assertions.assertEquals("i",
            model.openAuthenticationPolicies().policies().get("qugxywpmueefjzwf").claims().get(0).value());
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
