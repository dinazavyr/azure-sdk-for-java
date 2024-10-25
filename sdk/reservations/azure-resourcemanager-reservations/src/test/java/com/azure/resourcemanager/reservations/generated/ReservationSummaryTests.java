// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.reservations.models.ReservationSummary;

public final class ReservationSummaryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReservationSummary model = BinaryData.fromString(
            "{\"succeededCount\":97.05061,\"failedCount\":66.746765,\"expiringCount\":45.434547,\"expiredCount\":84.36373,\"pendingCount\":53.358547,\"cancelledCount\":92.30203,\"processingCount\":29.975636,\"warningCount\":88.98033,\"noBenefitCount\":47.970165}")
            .toObject(ReservationSummary.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReservationSummary model = new ReservationSummary();
        model = BinaryData.fromObject(model).toObject(ReservationSummary.class);
    }
}
