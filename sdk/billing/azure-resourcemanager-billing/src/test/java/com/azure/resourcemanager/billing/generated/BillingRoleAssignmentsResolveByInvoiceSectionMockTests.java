// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.billing.BillingManager;
import com.azure.resourcemanager.billing.models.BillingRoleAssignmentListResult;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BillingRoleAssignmentsResolveByInvoiceSectionMockTests {
    @Test
    public void testResolveByInvoiceSection() throws Exception {
        String responseStr
            = "{\"nextLink\":\"xpmhzghhhk\",\"value\":[{\"properties\":{\"provisioningState\":\"New\",\"createdOn\":\"2021-04-04T03:21:50Z\",\"createdByPrincipalTenantId\":\"zvhn\",\"createdByPrincipalId\":\"pmxnht\",\"createdByPrincipalPuid\":\"stqlfxolrwv\",\"createdByUserEmailAddress\":\"gxyfjsweq\",\"modifiedOn\":\"2021-03-11T09:47:37Z\",\"modifiedByPrincipalPuid\":\"yyopoaytwwgw\",\"modifiedByUserEmailAddress\":\"b\",\"modifiedByPrincipalId\":\"bvufrkwjiemimdtn\",\"modifiedByPrincipalTenantId\":\"wew\",\"principalPuid\":\"kreeeddd\",\"principalId\":\"tfquu\",\"principalTenantId\":\"clhsiigeeuw\",\"roleDefinitionId\":\"rn\",\"scope\":\"xfedqnetdqw\",\"userAuthenticationType\":\"xoqgvbzpggpw\",\"userEmailAddress\":\"y\",\"principalTenantName\":\"qajejirvavrvkgp\",\"principalDisplayName\":\"plbjuvlnhxnr\",\"principalType\":\"User\",\"billingRequestId\":\"na\",\"billingAccountId\":\"esbxnepqmjmoplu\",\"billingAccountDisplayName\":\"ykkfhsovadkrm\",\"billingProfileId\":\"mwqpdkesjqbzkqm\",\"billingProfileDisplayName\":\"poriwbwggijtspzj\",\"invoiceSectionId\":\"rhikwsbzrhdug\",\"invoiceSectionDisplayName\":\"htrgz\",\"customerId\":\"unjf\",\"customerDisplayName\":\"jhiycbauseqnczk\"},\"tags\":{\"gzunkfnyskwwunqh\":\"vtuwyjsqwzszosz\",\"ojmslhip\":\"za\",\"vchyluqalpcufj\":\"ukvbljpxpr\",\"tiztqds\":\"f\"},\"id\":\"h\",\"name\":\"hs\",\"type\":\"axxsritr\"},{\"properties\":{\"provisioningState\":\"Expired\",\"createdOn\":\"2020-12-25T06:15:34Z\",\"createdByPrincipalTenantId\":\"yyefmxwoqotiiqb\",\"createdByPrincipalId\":\"asrvrmtist\",\"createdByPrincipalPuid\":\"kjhorlxkpy\",\"createdByUserEmailAddress\":\"ennycntr\",\"modifiedOn\":\"2021-02-28T07:36:33Z\",\"modifiedByPrincipalPuid\":\"tdmbqjtsuhq\",\"modifiedByUserEmailAddress\":\"oxtdyqavfx\",\"modifiedByPrincipalId\":\"mzxsyaksinpaa\",\"modifiedByPrincipalTenantId\":\"hwbghvwtgp\",\"principalPuid\":\"chcgsfz\",\"principalId\":\"jkiysqbjsdj\",\"principalTenantId\":\"xeysgwkcffe\",\"roleDefinitionId\":\"znzcbivoveomkhfe\",\"scope\":\"ooplfpohim\",\"userAuthenticationType\":\"kycjpeebznbz\",\"userEmailAddress\":\"sulou\",\"principalTenantName\":\"pbmxooqoh\",\"principalDisplayName\":\"ncdmwkh\",\"principalType\":\"None\",\"billingRequestId\":\"sl\",\"billingAccountId\":\"dzauiunyev\",\"billingAccountDisplayName\":\"zdsytciks\",\"billingProfileId\":\"camwuynfxkcgs\",\"billingProfileDisplayName\":\"mvhadrpbatvy\",\"invoiceSectionId\":\"ljqkqwsyjtvjkowg\",\"invoiceSectionDisplayName\":\"awwdmbypnkteiidl\",\"customerId\":\"vwbclp\",\"customerDisplayName\":\"eganihk\"},\"tags\":{\"kyjulskwwn\":\"er\"},\"id\":\"qlq\",\"name\":\"pwxtvc\",\"type\":\"bav\"},{\"properties\":{\"provisioningState\":\"Expired\",\"createdOn\":\"2021-11-21T17:33:30Z\",\"createdByPrincipalTenantId\":\"genlrjcsmwevguyf\",\"createdByPrincipalId\":\"xelrjk\",\"createdByPrincipalPuid\":\"cdetowwezhy\",\"createdByUserEmailAddress\":\"di\",\"modifiedOn\":\"2021-11-28T21:52:31Z\",\"modifiedByPrincipalPuid\":\"lqacsfqbi\",\"modifiedByUserEmailAddress\":\"ybcelfjnxodnjy\",\"modifiedByPrincipalId\":\"faxs\",\"modifiedByPrincipalTenantId\":\"vuelumodpegqxso\",\"principalPuid\":\"hazrqoxz\",\"principalId\":\"lbeqvh\",\"principalTenantId\":\"b\",\"roleDefinitionId\":\"pwxslaj\",\"scope\":\"fzga\",\"userAuthenticationType\":\"hawkmibuydwi\",\"userEmailAddress\":\"nicupdyt\",\"principalTenantName\":\"miuvjplosebmhhtu\",\"principalDisplayName\":\"txynoflqobfixngx\",\"principalType\":\"User\",\"billingRequestId\":\"exhnkingi\",\"billingAccountId\":\"dolrpgup\",\"billingAccountDisplayName\":\"lbsm\",\"billingProfileId\":\"a\",\"billingProfileDisplayName\":\"ncuyjeykcnhppl\",\"invoiceSectionId\":\"cfzxjziu\",\"invoiceSectionDisplayName\":\"rlnewnuwkkfzzetl\",\"customerId\":\"dyxzlvwywjvr\",\"customerDisplayName\":\"qpwwlzpddarc\"},\"tags\":{\"knmstbdoprwkamp\":\"whslxebaja\",\"rcycmwhuzymhl\":\"hwpbldzniu\",\"knlvk\":\"ih\"},\"id\":\"bzk\",\"name\":\"paiildcpudkhqu\",\"type\":\"syjo\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        BillingManager manager = BillingManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        BillingRoleAssignmentListResult response = manager.billingRoleAssignments()
            .resolveByInvoiceSection("fzdos", "zkdiuvflgzhcw", "gwahcrxo", false, "rutvnpccxz",
                com.azure.core.util.Context.NONE);

    }
}
