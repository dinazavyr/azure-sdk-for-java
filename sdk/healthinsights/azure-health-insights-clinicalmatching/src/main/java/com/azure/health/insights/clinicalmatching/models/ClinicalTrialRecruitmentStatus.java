// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.clinicalmatching.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Possible recruitment status of a clinical trial.
 */
public final class ClinicalTrialRecruitmentStatus extends ExpandableStringEnum<ClinicalTrialRecruitmentStatus> {

    /**
     * Static value unknownStatus for ClinicalTrialRecruitmentStatus.
     */
    @Generated
    public static final ClinicalTrialRecruitmentStatus UNKNOWN_STATUS = fromString("unknownStatus");

    /**
     * Static value notYetRecruiting for ClinicalTrialRecruitmentStatus.
     */
    @Generated
    public static final ClinicalTrialRecruitmentStatus NOT_YET_RECRUITING = fromString("notYetRecruiting");

    /**
     * Static value recruiting for ClinicalTrialRecruitmentStatus.
     */
    @Generated
    public static final ClinicalTrialRecruitmentStatus RECRUITING = fromString("recruiting");

    /**
     * Static value enrollingByInvitation for ClinicalTrialRecruitmentStatus.
     */
    @Generated
    public static final ClinicalTrialRecruitmentStatus ENROLLING_BY_INVITATION = fromString("enrollingByInvitation");

    /**
     * Creates a new instance of ClinicalTrialRecruitmentStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public ClinicalTrialRecruitmentStatus() {
    }

    /**
     * Creates or finds a ClinicalTrialRecruitmentStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ClinicalTrialRecruitmentStatus.
     */
    @Generated
    public static ClinicalTrialRecruitmentStatus fromString(String name) {
        return fromString(name, ClinicalTrialRecruitmentStatus.class);
    }

    /**
     * Gets known ClinicalTrialRecruitmentStatus values.
     *
     * @return known ClinicalTrialRecruitmentStatus values.
     */
    @Generated
    public static Collection<ClinicalTrialRecruitmentStatus> values() {
        return values(ClinicalTrialRecruitmentStatus.class);
    }
}
