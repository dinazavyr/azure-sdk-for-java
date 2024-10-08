// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.anomalydetector.generated;

import com.azure.ai.anomalydetector.models.AnomalyState;
import com.azure.ai.anomalydetector.models.ErrorResponse;
import com.azure.ai.anomalydetector.models.MultivariateBatchDetectionOptions;
import com.azure.ai.anomalydetector.models.MultivariateBatchDetectionResultSummary;
import com.azure.ai.anomalydetector.models.MultivariateBatchDetectionStatus;
import com.azure.ai.anomalydetector.models.MultivariateDetectionResult;
import java.time.OffsetDateTime;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public final class DetectMultivariateBatchAnomalyTests extends AnomalyDetectorClientTestBase {
    @Test
    @Disabled
    public void testDetectMultivariateBatchAnomalyTests() {
        // method invocation
        MultivariateDetectionResult response
            = multivariateClient.detectMultivariateBatchAnomaly("45aad126-aafd-11ea-b8fb-d89ef3400c5f",
                new MultivariateBatchDetectionOptions(
                    "https://multiadsample.blob.core.windows.net/data/sample_data_2_1000.csv",
                    OffsetDateTime.parse("2019-04-01T00:15:00Z"), OffsetDateTime.parse("2019-04-01T00:40:00Z"))
                        .setTopContributorCount(10));

        // response assertion
        Assertions.assertNotNull(response);
        // verify property "resultId"
        Assertions.assertEquals("663884e6-b117-11ea-b3de-0242ac130004", response.getResultId());
        // verify property "summary"
        MultivariateBatchDetectionResultSummary responseSummary = response.getSummary();
        Assertions.assertNotNull(responseSummary);
        Assertions.assertEquals(MultivariateBatchDetectionStatus.CREATED, responseSummary.getStatus());
        List<ErrorResponse> responseSummaryErrors = responseSummary.getErrors();
        Assertions.assertEquals(0, responseSummaryErrors.size());
        MultivariateBatchDetectionOptions responseSummarySetupInfo = responseSummary.getSetupInfo();
        Assertions.assertNotNull(responseSummarySetupInfo);
        Assertions.assertEquals("https://multiadsample.blob.core.windows.net/data/sample_data_2_1000.csv",
            responseSummarySetupInfo.getDataSource());
        Assertions.assertEquals(10, responseSummarySetupInfo.getTopContributorCount());
        Assertions.assertNotNull(responseSummarySetupInfo.getStartTime());
        Assertions.assertNotNull(responseSummarySetupInfo.getEndTime());
        // verify property "results"
        List<AnomalyState> responseResults = response.getResults();
        Assertions.assertEquals(0, responseResults.size());
    }
}
