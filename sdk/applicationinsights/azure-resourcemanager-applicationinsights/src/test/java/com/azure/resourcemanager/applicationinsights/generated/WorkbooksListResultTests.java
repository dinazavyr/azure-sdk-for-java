// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.applicationinsights.models.WorkbooksListResult;
import org.junit.jupiter.api.Assertions;

public final class WorkbooksListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkbooksListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"displayName\":\"lxprglyatddckcbc\",\"serializedData\":\"ejrjxgciqibrho\",\"version\":\"sdqrhzoymibmrq\",\"timeModified\":\"2021-07-29T17:32:56Z\",\"category\":\"ahwfluszdtmhrk\",\"tags\":[\"yyv\",\"qacpiex\"],\"userId\":\"tg\",\"sourceId\":\"bwoenwashrt\",\"storageUri\":\"kcnqxwbpo\",\"description\":\"lpiujwaa\",\"revision\":\"pqiiobyuqe\"},\"identity\":{\"principalId\":\"b568da33-96e4-49bf-b866-fd28fa17f530\",\"tenantId\":\"64131a35-36dc-44b7-a84d-412ba0f1fdf9\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"uqgbdbutauvfbt\":{\"principalId\":\"251f4150-6ca4-4224-89a6-9430ed2c1a33\",\"clientId\":\"8ada2840-0767-412c-b1b4-52295d21f691\"},\"hhmhykojoxa\":{\"principalId\":\"955aaa31-77a9-419a-9499-1d6f647d7f36\",\"clientId\":\"9803f7b0-3299-473c-9d37-5772b9ba45b1\"},\"dlpichkoymkcdyhb\":{\"principalId\":\"c7250d61-b2ad-4ba2-bf22-c046d20113d1\",\"clientId\":\"bffc5fd0-98fd-4e89-b4f1-a87516a93f40\"},\"pwdreqnovvqf\":{\"principalId\":\"f4d3abeb-8932-4658-8f13-9a49c01055ec\",\"clientId\":\"78db0b61-ddd8-4270-a366-e275de6beaee\"}}},\"kind\":\"shared\",\"etag\":\"xywsuws\",\"location\":\"rsndsytgadgvra\",\"tags\":{\"arrwlquu\":\"neqn\"},\"id\":\"jfqka\",\"name\":\"e\",\"type\":\"iipfpubj\"},{\"properties\":{\"displayName\":\"wwiftohqkvpuv\",\"serializedData\":\"sgplsakn\",\"version\":\"fsynljphuop\",\"timeModified\":\"2021-05-14T18:56:32Z\",\"category\":\"lqiyntorzihl\",\"tags\":[\"jswsrmslyz\",\"pzbchck\"],\"userId\":\"zqioxiysuii\",\"sourceId\":\"nkedyatrwyhqmib\",\"storageUri\":\"hwit\",\"description\":\"ypyynpcdpumnzg\",\"revision\":\"z\"},\"identity\":{\"principalId\":\"99904b08-6582-4bbd-b67e-9f56371e7a3f\",\"tenantId\":\"81b69643-0b74-444d-ae64-c76f483679b1\",\"type\":\"None\",\"userAssignedIdentities\":{\"gj\":{\"principalId\":\"354a5541-ece0-4fa4-abd8-0e1ac44b693c\",\"clientId\":\"5a551776-bb13-4426-8c3e-acf817e32722\"},\"ldtlwwr\":{\"principalId\":\"6120ed22-c8e3-4a32-b0dd-6913d89aaa70\",\"clientId\":\"48a664b6-0cf7-4b65-892e-41b121208ca7\"}}},\"kind\":\"shared\",\"etag\":\"tncvokot\",\"location\":\"lxdy\",\"tags\":{\"cogjltdtbn\":\"y\",\"cikhnv\":\"hadoocrk\",\"gxk\":\"amqgxqquezikyw\",\"melwuipiccjz\":\"lla\"},\"id\":\"z\",\"name\":\"v\",\"type\":\"vvcnayr\"},{\"properties\":{\"displayName\":\"rnxxmueed\",\"serializedData\":\"drd\",\"version\":\"tkwqqtchealm\",\"timeModified\":\"2021-09-27T23:43:44Z\",\"category\":\"d\",\"tags\":[\"gdv\",\"vgpiohgwxrt\"],\"userId\":\"dxepxgyq\",\"sourceId\":\"vrvmnpkukghim\",\"storageUri\":\"lxgwimfnjhf\",\"description\":\"wmszkk\",\"revision\":\"qreyfkzi\"},\"identity\":{\"principalId\":\"4da2c09b-213e-4fdb-81a7-659b4b5c24bf\",\"tenantId\":\"f8562579-6ea1-4505-bb77-75bf8263a961\",\"type\":\"None\",\"userAssignedIdentities\":{\"xwczelpcire\":{\"principalId\":\"fa93a833-3e39-470a-bcfe-0baf0b674e44\",\"clientId\":\"7836fff6-07cf-46b8-b499-9587bc2c68cd\"}}},\"kind\":\"shared\",\"etag\":\"aenwabf\",\"location\":\"tkl\",\"tags\":{\"zjosp\":\"bjhwuaan\",\"rvxaglrvimjwosy\":\"youlp\",\"kfcktqum\":\"xitc\",\"gqggebdunygae\":\"ekkezzikhlyfjh\"},\"id\":\"idb\",\"name\":\"fatpxllrxcyjmoa\",\"type\":\"su\"}],\"nextLink\":\"r\"}")
            .toObject(WorkbooksListResult.class);
        Assertions.assertEquals("r", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkbooksListResult model = new WorkbooksListResult().withNextLink("r");
        model = BinaryData.fromObject(model).toObject(WorkbooksListResult.class);
        Assertions.assertEquals("r", model.nextLink());
    }
}
