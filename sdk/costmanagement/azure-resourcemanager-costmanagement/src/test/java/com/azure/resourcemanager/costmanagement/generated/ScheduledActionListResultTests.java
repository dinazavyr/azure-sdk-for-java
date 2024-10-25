// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.costmanagement.models.ScheduledActionListResult;

public final class ScheduledActionListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduledActionListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"displayName\":\"owqkdwytisi\",\"notificationEmail\":\"cgpik\",\"scope\":\"imejzanl\",\"status\":\"Disabled\",\"viewId\":\"xi\"},\"eTag\":\"rmbzo\",\"kind\":\"Email\",\"id\":\"xrjqcirgzpfrlazs\",\"name\":\"rnwoiindfp\",\"type\":\"pj\"},{\"properties\":{\"displayName\":\"wbtlhflsjcdh\",\"notificationEmail\":\"jvfbgofelja\",\"scope\":\"qmqhldvriii\",\"status\":\"Expired\",\"viewId\":\"nalghfkvtvsexso\"},\"eTag\":\"el\",\"kind\":\"InsightAlert\",\"id\":\"ahhxvrh\",\"name\":\"zkw\",\"type\":\"jgwwspughftq\"},{\"properties\":{\"displayName\":\"hqxujxukndxdi\",\"notificationEmail\":\"guufzd\",\"scope\":\"yqtfihwh\",\"status\":\"Disabled\",\"viewId\":\"tzingamvpph\"},\"eTag\":\"zqzudph\",\"kind\":\"Email\",\"id\":\"dkfw\",\"name\":\"nwcvtbvkayhmtnv\",\"type\":\"qiatkzwpcnp\"}],\"nextLink\":\"cjaesgvvs\"}")
            .toObject(ScheduledActionListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduledActionListResult model = new ScheduledActionListResult();
        model = BinaryData.fromObject(model).toObject(ScheduledActionListResult.class);
    }
}
