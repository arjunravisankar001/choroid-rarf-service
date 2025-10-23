package com.ddbs.choroid_rarf_service.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FillFeedbackRequest {

    @NotNull(message = "rating must be provided")
    @Min(value = 0, message = "rating must be at least 0")
    @Max(value = 5, message = "rating must be at most 5")
    private Integer rating;

    @NotNull(message = "understandableScore must be provided")
    @Min(value = 0, message = "understandableScore must be at least 0")
    @Max(value = 10, message = "understandableScore must be at most 10")
    private Integer understandableScore;

    @NotNull(message = "confidenceScore must be provided")
    @Min(value = 0, message = "confidenceScore must be at least 0")
    @Max(value = 10, message = "confidenceScore must be at most 10")
    private Integer confidenceScore;

    @NotNull(message = "expectationsScore must be provided")
    @Min(value = 0, message = "expectationsScore must be at least 0")
    @Max(value = 10, message = "expectationsScore must be at most 10")
    private Integer expectationsScore;

    @NotNull(message = "engagementScore must be provided")
    @Min(value = 0, message = "engagementScore must be at least 0")
    @Max(value = 10, message = "engagementScore must be at most 10")
    private Integer engagementScore;

    @NotNull(message = "organizationScore must be provided")
    @Min(value = 0, message = "organizationScore must be at least 0")
    @Max(value = 10, message = "organizationScore must be at most 10")
    private Integer organizationScore;

    @NotNull(message = "relevanceScore must be provided")
    @Min(value = 0, message = "relevanceScore must be at least 0")
    @Max(value = 10, message = "relevanceScore must be at most 10")
    private Integer relevanceScore;

    @NotNull(message = "presenterScore must be provided")
    @Min(value = 0, message = "presenterScore must be at least 0")
    @Max(value = 10, message = "presenterScore must be at most 10")
    private Integer presenterScore;

    @NotNull(message = "paceScore must be provided")
    @Min(value = 0, message = "paceScore must be at least 0")
    @Max(value = 10, message = "paceScore must be at most 10")
    private Integer paceScore;

    @NotBlank
    private String mostValuable;

    @NotBlank
    private String suggestions;
}
