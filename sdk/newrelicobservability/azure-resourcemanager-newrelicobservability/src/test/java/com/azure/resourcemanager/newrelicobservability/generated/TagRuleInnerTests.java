// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.newrelicobservability.fluent.models.MetricRulesInner;
import com.azure.resourcemanager.newrelicobservability.fluent.models.TagRuleInner;
import com.azure.resourcemanager.newrelicobservability.models.FilteringTag;
import com.azure.resourcemanager.newrelicobservability.models.LogRules;
import com.azure.resourcemanager.newrelicobservability.models.SendAadLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendActivityLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendMetricsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendSubscriptionLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.TagAction;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TagRuleInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TagRuleInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Deleting\",\"logRules\":{\"sendAadLogs\":\"Enabled\",\"sendSubscriptionLogs\":\"Enabled\",\"sendActivityLogs\":\"Disabled\",\"filteringTags\":[{\"name\":\"yokacspkw\",\"value\":\"zdobpxjmflbvvnch\",\"action\":\"Include\"},{\"name\":\"iwwzjuqk\",\"value\":\"sa\",\"action\":\"Exclude\"},{\"name\":\"uo\",\"value\":\"skghsauuimj\",\"action\":\"Exclude\"}]},\"metricRules\":{\"sendMetrics\":\"Disabled\",\"filteringTags\":[{\"name\":\"idyjrrfbyaosvexc\",\"value\":\"npc\",\"action\":\"Exclude\"},{\"name\":\"ohslkevlegg\",\"value\":\"buhfmvfaxkffeiit\",\"action\":\"Include\"}],\"userEmail\":\"ez\"}},\"id\":\"shxmzsbbzoggigrx\",\"name\":\"burvjxxjnspy\",\"type\":\"ptkoenkoukn\"}")
            .toObject(TagRuleInner.class);
        Assertions.assertEquals(SendAadLogsStatus.ENABLED, model.logRules().sendAadLogs());
        Assertions.assertEquals(SendSubscriptionLogsStatus.ENABLED, model.logRules().sendSubscriptionLogs());
        Assertions.assertEquals(SendActivityLogsStatus.DISABLED, model.logRules().sendActivityLogs());
        Assertions.assertEquals("yokacspkw", model.logRules().filteringTags().get(0).name());
        Assertions.assertEquals("zdobpxjmflbvvnch", model.logRules().filteringTags().get(0).value());
        Assertions.assertEquals(TagAction.INCLUDE, model.logRules().filteringTags().get(0).action());
        Assertions.assertEquals(SendMetricsStatus.DISABLED, model.metricRules().sendMetrics());
        Assertions.assertEquals("idyjrrfbyaosvexc", model.metricRules().filteringTags().get(0).name());
        Assertions.assertEquals("npc", model.metricRules().filteringTags().get(0).value());
        Assertions.assertEquals(TagAction.EXCLUDE, model.metricRules().filteringTags().get(0).action());
        Assertions.assertEquals("ez", model.metricRules().userEmail());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TagRuleInner model = new TagRuleInner().withLogRules(new LogRules().withSendAadLogs(SendAadLogsStatus.ENABLED)
            .withSendSubscriptionLogs(SendSubscriptionLogsStatus.ENABLED)
            .withSendActivityLogs(SendActivityLogsStatus.DISABLED)
            .withFilteringTags(Arrays.asList(
                new FilteringTag().withName("yokacspkw").withValue("zdobpxjmflbvvnch").withAction(TagAction.INCLUDE),
                new FilteringTag().withName("iwwzjuqk").withValue("sa").withAction(TagAction.EXCLUDE),
                new FilteringTag().withName("uo").withValue("skghsauuimj").withAction(TagAction.EXCLUDE))))
            .withMetricRules(new MetricRulesInner().withSendMetrics(SendMetricsStatus.DISABLED)
                .withFilteringTags(Arrays.asList(
                    new FilteringTag().withName("idyjrrfbyaosvexc").withValue("npc").withAction(TagAction.EXCLUDE),
                    new FilteringTag().withName("ohslkevlegg")
                        .withValue("buhfmvfaxkffeiit")
                        .withAction(TagAction.INCLUDE)))
                .withUserEmail("ez"));
        model = BinaryData.fromObject(model).toObject(TagRuleInner.class);
        Assertions.assertEquals(SendAadLogsStatus.ENABLED, model.logRules().sendAadLogs());
        Assertions.assertEquals(SendSubscriptionLogsStatus.ENABLED, model.logRules().sendSubscriptionLogs());
        Assertions.assertEquals(SendActivityLogsStatus.DISABLED, model.logRules().sendActivityLogs());
        Assertions.assertEquals("yokacspkw", model.logRules().filteringTags().get(0).name());
        Assertions.assertEquals("zdobpxjmflbvvnch", model.logRules().filteringTags().get(0).value());
        Assertions.assertEquals(TagAction.INCLUDE, model.logRules().filteringTags().get(0).action());
        Assertions.assertEquals(SendMetricsStatus.DISABLED, model.metricRules().sendMetrics());
        Assertions.assertEquals("idyjrrfbyaosvexc", model.metricRules().filteringTags().get(0).name());
        Assertions.assertEquals("npc", model.metricRules().filteringTags().get(0).value());
        Assertions.assertEquals(TagAction.EXCLUDE, model.metricRules().filteringTags().get(0).action());
        Assertions.assertEquals("ez", model.metricRules().userEmail());
    }
}
