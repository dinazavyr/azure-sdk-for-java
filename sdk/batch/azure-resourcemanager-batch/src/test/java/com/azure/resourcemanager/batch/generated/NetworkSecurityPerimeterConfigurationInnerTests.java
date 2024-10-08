// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.fluent.models.NetworkSecurityPerimeterConfigurationInner;
import com.azure.resourcemanager.batch.models.AccessRule;
import com.azure.resourcemanager.batch.models.AccessRuleDirection;
import com.azure.resourcemanager.batch.models.AccessRuleProperties;
import com.azure.resourcemanager.batch.models.AccessRulePropertiesSubscriptionsItem;
import com.azure.resourcemanager.batch.models.NetworkSecurityPerimeter;
import com.azure.resourcemanager.batch.models.NetworkSecurityPerimeterConfigurationProperties;
import com.azure.resourcemanager.batch.models.NetworkSecurityProfile;
import com.azure.resourcemanager.batch.models.ResourceAssociation;
import com.azure.resourcemanager.batch.models.ResourceAssociationAccessMode;
import java.util.Arrays;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class NetworkSecurityPerimeterConfigurationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkSecurityPerimeterConfigurationInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Accepted\",\"provisioningIssues\":[{\"name\":\"fkbw\",\"properties\":{\"issueType\":\"Unknown\",\"severity\":\"Error\",\"description\":\"dw\",\"suggestedResourceIds\":[\"qek\"],\"suggestedAccessRules\":[{},{},{}]}}],\"networkSecurityPerimeter\":{\"id\":\"tjsyin\",\"perimeterGuid\":\"cb8920f0-f01e-432b-95cc-bfcab92d38f8\",\"location\":\"qatmtdhtmdvy\"},\"resourceAssociation\":{\"name\":\"kdgszywkbirr\",\"accessMode\":\"Enforced\"},\"profile\":{\"name\":\"hkjoqr\",\"accessRulesVersion\":115190409,\"accessRules\":[{\"name\":\"jinrvgoupmfiibfg\",\"properties\":{\"direction\":\"Inbound\",\"addressPrefixes\":[\"vrwxkv\",\"kkgll\",\"wjygvjayvblmhvk\"],\"subscriptions\":[{},{},{},{}],\"networkSecurityPerimeters\":[{}],\"fullyQualifiedDomainNames\":[\"yhgsopbyrqufe\",\"xuvw\"],\"emailAddresses\":[\"nhlmctlpdng\",\"tvgbmhrixkwmy\"],\"phoneNumbers\":[\"jvegrhbpnaixexcc\",\"dreaxh\",\"exdrrvqahqkg\",\"tpwijnh\"]}},{\"name\":\"svfycxzbfv\",\"properties\":{\"direction\":\"Outbound\",\"addressPrefixes\":[\"mtg\",\"qp\",\"y\"],\"subscriptions\":[{},{},{}],\"networkSecurityPerimeters\":[{}],\"fullyQualifiedDomainNames\":[\"myhgfipnsxkmc\"],\"emailAddresses\":[\"krrjrea\",\"xt\"],\"phoneNumbers\":[\"mhjglikkxwslolb\"]}},{\"name\":\"vuzlm\",\"properties\":{\"direction\":\"Outbound\",\"addressPrefixes\":[\"tgp\",\"crpw\"],\"subscriptions\":[{},{}],\"networkSecurityPerimeters\":[{},{},{}],\"fullyQualifiedDomainNames\":[\"gbrn\",\"w\"],\"emailAddresses\":[\"pn\"],\"phoneNumbers\":[\"zejjoqk\"]}},{\"name\":\"fhsxttaugz\",\"properties\":{\"direction\":\"Inbound\",\"addressPrefixes\":[\"pxdtnkdmkq\",\"jlwuenvrkp\"],\"subscriptions\":[{},{},{},{}],\"networkSecurityPerimeters\":[{},{}],\"fullyQualifiedDomainNames\":[\"ebqaaysjkixqtnq\",\"tezlwff\",\"iakp\"],\"emailAddresses\":[\"qmt\",\"d\",\"tmmjihyeozph\"],\"phoneNumbers\":[\"uyqncygupkvipmd\",\"cwxqu\",\"evzhfsto\"]}}],\"diagnosticSettingsVersion\":1386174682,\"enabledLogCategories\":[\"ujbypelmcuvhixb\",\"xyfwnylrcool\",\"ttpkiwkkbnujrywv\",\"y\"]}},\"id\":\"fpncurdo\",\"name\":\"wiithtywub\",\"type\":\"cbihwqk\"}")
            .toObject(NetworkSecurityPerimeterConfigurationInner.class);
        Assertions.assertEquals("tjsyin", model.properties().networkSecurityPerimeter().id());
        Assertions.assertEquals(UUID.fromString("cb8920f0-f01e-432b-95cc-bfcab92d38f8"),
            model.properties().networkSecurityPerimeter().perimeterGuid());
        Assertions.assertEquals("qatmtdhtmdvy", model.properties().networkSecurityPerimeter().location());
        Assertions.assertEquals("kdgszywkbirr", model.properties().resourceAssociation().name());
        Assertions.assertEquals(ResourceAssociationAccessMode.ENFORCED,
            model.properties().resourceAssociation().accessMode());
        Assertions.assertEquals("hkjoqr", model.properties().profile().name());
        Assertions.assertEquals(115190409, model.properties().profile().accessRulesVersion());
        Assertions.assertEquals("jinrvgoupmfiibfg", model.properties().profile().accessRules().get(0).name());
        Assertions.assertEquals(AccessRuleDirection.INBOUND,
            model.properties().profile().accessRules().get(0).properties().direction());
        Assertions.assertEquals("vrwxkv",
            model.properties().profile().accessRules().get(0).properties().addressPrefixes().get(0));
        Assertions.assertEquals("yhgsopbyrqufe",
            model.properties().profile().accessRules().get(0).properties().fullyQualifiedDomainNames().get(0));
        Assertions.assertEquals("nhlmctlpdng",
            model.properties().profile().accessRules().get(0).properties().emailAddresses().get(0));
        Assertions.assertEquals("jvegrhbpnaixexcc",
            model.properties().profile().accessRules().get(0).properties().phoneNumbers().get(0));
        Assertions.assertEquals(1386174682, model.properties().profile().diagnosticSettingsVersion());
        Assertions.assertEquals("ujbypelmcuvhixb", model.properties().profile().enabledLogCategories().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkSecurityPerimeterConfigurationInner model = new NetworkSecurityPerimeterConfigurationInner()
            .withProperties(new NetworkSecurityPerimeterConfigurationProperties()
                .withNetworkSecurityPerimeter(new NetworkSecurityPerimeter().withId("tjsyin")
                    .withPerimeterGuid(UUID.fromString("cb8920f0-f01e-432b-95cc-bfcab92d38f8"))
                    .withLocation("qatmtdhtmdvy"))
                .withResourceAssociation(new ResourceAssociation().withName("kdgszywkbirr")
                    .withAccessMode(ResourceAssociationAccessMode.ENFORCED))
                .withProfile(new NetworkSecurityProfile().withName("hkjoqr")
                    .withAccessRulesVersion(115190409)
                    .withAccessRules(Arrays.asList(
                        new AccessRule().withName("jinrvgoupmfiibfg")
                            .withProperties(new AccessRuleProperties().withDirection(AccessRuleDirection.INBOUND)
                                .withAddressPrefixes(Arrays.asList("vrwxkv", "kkgll", "wjygvjayvblmhvk"))
                                .withSubscriptions(Arrays.asList(new AccessRulePropertiesSubscriptionsItem(),
                                    new AccessRulePropertiesSubscriptionsItem(),
                                    new AccessRulePropertiesSubscriptionsItem(),
                                    new AccessRulePropertiesSubscriptionsItem()))
                                .withNetworkSecurityPerimeters(Arrays.asList(new NetworkSecurityPerimeter()))
                                .withFullyQualifiedDomainNames(Arrays.asList("yhgsopbyrqufe", "xuvw"))
                                .withEmailAddresses(Arrays.asList("nhlmctlpdng", "tvgbmhrixkwmy"))
                                .withPhoneNumbers(
                                    Arrays.asList("jvegrhbpnaixexcc", "dreaxh", "exdrrvqahqkg", "tpwijnh"))),
                        new AccessRule().withName("svfycxzbfv")
                            .withProperties(new AccessRuleProperties().withDirection(AccessRuleDirection.OUTBOUND)
                                .withAddressPrefixes(Arrays.asList("mtg", "qp", "y"))
                                .withSubscriptions(Arrays.asList(new AccessRulePropertiesSubscriptionsItem(),
                                    new AccessRulePropertiesSubscriptionsItem(),
                                    new AccessRulePropertiesSubscriptionsItem()))
                                .withNetworkSecurityPerimeters(Arrays.asList(new NetworkSecurityPerimeter()))
                                .withFullyQualifiedDomainNames(Arrays.asList("myhgfipnsxkmc"))
                                .withEmailAddresses(Arrays.asList("krrjrea", "xt"))
                                .withPhoneNumbers(Arrays.asList("mhjglikkxwslolb"))),
                        new AccessRule().withName("vuzlm")
                            .withProperties(new AccessRuleProperties().withDirection(AccessRuleDirection.OUTBOUND)
                                .withAddressPrefixes(Arrays.asList("tgp", "crpw"))
                                .withSubscriptions(Arrays.asList(new AccessRulePropertiesSubscriptionsItem(),
                                    new AccessRulePropertiesSubscriptionsItem()))
                                .withNetworkSecurityPerimeters(Arrays.asList(new NetworkSecurityPerimeter(),
                                    new NetworkSecurityPerimeter(), new NetworkSecurityPerimeter()))
                                .withFullyQualifiedDomainNames(Arrays.asList("gbrn", "w"))
                                .withEmailAddresses(Arrays.asList("pn"))
                                .withPhoneNumbers(Arrays.asList("zejjoqk"))),
                        new AccessRule().withName("fhsxttaugz")
                            .withProperties(new AccessRuleProperties().withDirection(AccessRuleDirection.INBOUND)
                                .withAddressPrefixes(Arrays.asList("pxdtnkdmkq", "jlwuenvrkp"))
                                .withSubscriptions(Arrays.asList(new AccessRulePropertiesSubscriptionsItem(),
                                    new AccessRulePropertiesSubscriptionsItem(),
                                    new AccessRulePropertiesSubscriptionsItem(),
                                    new AccessRulePropertiesSubscriptionsItem()))
                                .withNetworkSecurityPerimeters(
                                    Arrays.asList(new NetworkSecurityPerimeter(), new NetworkSecurityPerimeter()))
                                .withFullyQualifiedDomainNames(Arrays.asList("ebqaaysjkixqtnq", "tezlwff", "iakp"))
                                .withEmailAddresses(Arrays.asList("qmt", "d", "tmmjihyeozph"))
                                .withPhoneNumbers(Arrays.asList("uyqncygupkvipmd", "cwxqu", "evzhfsto")))))
                    .withDiagnosticSettingsVersion(1386174682)
                    .withEnabledLogCategories(
                        Arrays.asList("ujbypelmcuvhixb", "xyfwnylrcool", "ttpkiwkkbnujrywv", "y"))));
        model = BinaryData.fromObject(model).toObject(NetworkSecurityPerimeterConfigurationInner.class);
        Assertions.assertEquals("tjsyin", model.properties().networkSecurityPerimeter().id());
        Assertions.assertEquals(UUID.fromString("cb8920f0-f01e-432b-95cc-bfcab92d38f8"),
            model.properties().networkSecurityPerimeter().perimeterGuid());
        Assertions.assertEquals("qatmtdhtmdvy", model.properties().networkSecurityPerimeter().location());
        Assertions.assertEquals("kdgszywkbirr", model.properties().resourceAssociation().name());
        Assertions.assertEquals(ResourceAssociationAccessMode.ENFORCED,
            model.properties().resourceAssociation().accessMode());
        Assertions.assertEquals("hkjoqr", model.properties().profile().name());
        Assertions.assertEquals(115190409, model.properties().profile().accessRulesVersion());
        Assertions.assertEquals("jinrvgoupmfiibfg", model.properties().profile().accessRules().get(0).name());
        Assertions.assertEquals(AccessRuleDirection.INBOUND,
            model.properties().profile().accessRules().get(0).properties().direction());
        Assertions.assertEquals("vrwxkv",
            model.properties().profile().accessRules().get(0).properties().addressPrefixes().get(0));
        Assertions.assertEquals("yhgsopbyrqufe",
            model.properties().profile().accessRules().get(0).properties().fullyQualifiedDomainNames().get(0));
        Assertions.assertEquals("nhlmctlpdng",
            model.properties().profile().accessRules().get(0).properties().emailAddresses().get(0));
        Assertions.assertEquals("jvegrhbpnaixexcc",
            model.properties().profile().accessRules().get(0).properties().phoneNumbers().get(0));
        Assertions.assertEquals(1386174682, model.properties().profile().diagnosticSettingsVersion());
        Assertions.assertEquals("ujbypelmcuvhixb", model.properties().profile().enabledLogCategories().get(0));
    }
}
