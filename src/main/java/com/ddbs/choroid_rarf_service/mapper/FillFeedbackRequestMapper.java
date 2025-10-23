package com.ddbs.choroid_rarf_service.mapper;

import com.ddbs.choroid_rarf_service.dto.FeedbackFields;
import com.ddbs.choroid_rarf_service.dto.FillFeedbackRequest;

public class FillFeedbackRequestMapper {

    public static FeedbackFields toFeedbackFields(FillFeedbackRequest request)
    {
        FeedbackFields feedbackFields = new FeedbackFields();

        feedbackFields.addField("feedback_filled", true);
        feedbackFields.addField("rating", request.getRating());
        feedbackFields.addField("understandable_score", request.getUnderstandableScore());
        feedbackFields.addField("confidence_score", request.getConfidenceScore());
        feedbackFields.addField("expectations_score", request.getExpectationsScore());
        feedbackFields.addField("engagement_score", request.getEngagementScore());
        feedbackFields.addField("organization_score", request.getOrganizationScore());
        feedbackFields.addField("relevance_score", request.getRelevanceScore());
        feedbackFields.addField("presenter_score", request.getPresenterScore());
        feedbackFields.addField("pace_score", request.getPaceScore());
        feedbackFields.addField("most_valuable", request.getMostValuable());
        feedbackFields.addField("suggestions", request.getSuggestions());

        return feedbackFields;
    }
}
