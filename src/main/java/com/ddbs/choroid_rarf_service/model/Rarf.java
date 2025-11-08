package com.ddbs.choroid_rarf_service.model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Rarf {

    private String sessionId; //session ID
    private String userId; //username of the respondent

    private Boolean feedbackFilled; //whether the feedback form was filled
    private Integer rating; //overall session rating

    //how understandable was the material covered in the session
    //clarity of delivery and content complexity
    private Integer understandableScore;

    //how confident do you feel in applying what you learned
    //practical retention and applicability
    private Integer confidenceScore;

    //how well did the session meet your expectations
    //was it what was signed up for
    private Integer expectationsScore;

    //how engaging was the session
    //speaker/presenter and content interaction
    private Integer engagementScore;

    //how organized and well-structured was the session
    //session flow, time management and logical progression
    private Integer organizationScore;

    //how relevant was the session content to your interests/needs
    //topic-target fit
    private Integer relevanceScore;

    //how effective was the presenter/speaker in explaining the concepts
    //speaker performance
    private Integer presenterScore;

    //how appropriate was the pace of the session
    //too fast, too slow or just right
    private Integer paceScore;

    //what was most valuable about the session
    private String mostValuable;
    //suggestions for improvement
    private String suggestions;

}
