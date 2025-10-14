package com.ddbs.choroid_rarf_service.model;

public class Rarf {

    private Long session_id;
    private String user_id;
    private boolean feedback_filled;
    private Integer rating;
    private Integer understandable_score;
    private Integer confidence_score;
    private Integer expectations_score;
    private Integer engagement_score;
    private Integer organization_score;
    private Integer relevance_score;
    private Integer presenter_score;
    private Integer pace_score;
    private String most_valuable;
    private String suggestions;

    //Constructors, getters and setters

    public Rarf() {

    }

    public Rarf(Long session_id, String user_id, boolean feedback_filled, Integer rating, Integer understandable_score, Integer confidence_score, Integer expectations_score, Integer engagement_score, Integer organization_score, Integer relevance_score, Integer presenter_score, Integer pace_score, String most_valuable, String suggestions) {
        this.session_id = session_id;
        this.user_id = user_id;
        this.feedback_filled = feedback_filled;
        this.rating = rating;
        this.understandable_score = understandable_score;
        this.confidence_score = confidence_score;
        this.expectations_score = expectations_score;
        this.engagement_score = engagement_score;
        this.organization_score = organization_score;
        this.relevance_score = relevance_score;
        this.presenter_score = presenter_score;
        this.pace_score = pace_score;
        this.most_valuable = most_valuable;
        this.suggestions = suggestions;
    }

    public Long getSession_id() {
        return session_id;
    }
    public void setSession_id(Long session_id) {
        this.session_id = session_id;
    }
    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public boolean getFeedback_filled() {
        return feedback_filled;
    }
    public void setFeedback_filled(boolean feedback_filled) {
        this.feedback_filled = feedback_filled;
    }
    public Integer getRating() {
        return rating;
    }
    public void setRating(Integer rating) {
        this.rating = rating;
    }
    public Integer getUnderstandable_score() {
        return understandable_score;
    }
    public void setUnderstandable_score(Integer understandable_score) {
        this.understandable_score = understandable_score;
    }
    public Integer getConfidence_score() {
        return confidence_score;
    }
    public void setConfidence_score(Integer confidence_score) {
        this.confidence_score = confidence_score;
    }
    public Integer getExpectations_score() {
        return expectations_score;
    }
    public void setExpectations_score(Integer expectations_score) {
        this.expectations_score = expectations_score;
    }
    public Integer getEngagement_score() {
        return engagement_score;
    }
    public void setEngagement_score(Integer engagement_score) {
        this.engagement_score = engagement_score;
    }
    public Integer getOrganization_score() {
        return organization_score;
    }
    public void setOrganization_score(Integer organization_score) {
        this.organization_score = organization_score;
    }
    public Integer getRelevance_score() {
        return relevance_score;
    }
    public void setRelevance_score(Integer relevance_score) {
        this.relevance_score = relevance_score;
    }
    public Integer getPresenter_score() {
        return presenter_score;
    }
    public void setPresenter_score(Integer presenter_score) {
        this.presenter_score = presenter_score;
    }
    public Integer getPace_score() {
        return pace_score;
    }
    public void setPace_score(Integer pace_score) {
        this.pace_score = pace_score;
    }
    public String getMost_valuable() {
        return most_valuable;
    }
    public void setMost_valuable(String most_valuable) {
        this.most_valuable = most_valuable;
    }
    public String getSuggestions() {
        return suggestions;
    }
    public void setSuggestions(String suggestions) {
        this.suggestions = suggestions;
    }
}
