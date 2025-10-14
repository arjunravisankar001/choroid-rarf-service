package com.ddbs.choroid_rarf_service.repository;

import com.ddbs.choroid_rarf_service.model.Rarf;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public class RarfRepository {

    private final JdbcTemplate  jdbcTemplate;

    public RarfRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<Rarf> rarfRowMapper = (rs, rowNum) -> {
        Rarf rarf = new Rarf();
        rarf.setSession_id(rs.getLong("session_id"));
        rarf.setUser_id(rs.getString("user_id"));
        rarf.setFeedback_filled(rs.getBoolean("feedback_filled"));
        rarf.setRating(rs.getInt("rating"));
        rarf.setUnderstandable_score(rs.getInt("understandable_score"));
        rarf.setConfidence_score(rs.getInt("confidence_score"));
        rarf.setExpectations_score(rs.getInt("expectations_score"));
        rarf.setEngagement_score(rs.getInt("engagement_score"));
        rarf.setOrganization_score(rs.getInt("organization_score"));
        rarf.setRelevance_score(rs.getInt("relevance_score"));
        rarf.setPresenter_score(rs.getInt("presenter_score"));
        rarf.setPace_score(rs.getInt("pace_score"));
        rarf.setMost_valuable(rs.getString("most_valuable"));
        rarf.setSuggestions(rs.getString("suggestions"));
        return rarf;
    };

    public List<Rarf> findBySessionId(Long session_id) {
        return jdbcTemplate.query("SELECT * FROM rarf WHERE session_id = ?", rarfRowMapper, session_id);
    }

    public List<Rarf> findByUserId(String user_id) {
        return jdbcTemplate.query("SELECT * FROM rarf WHERE user_id = ?", rarfRowMapper, user_id);
    }

    public Optional<Rarf> findBySessionIdAndUserId(Long session_id, String user_id) {
        List<Rarf> results = jdbcTemplate.query("SELECT * FROM rarf WHERE session_id = ? AND user_id = ?", rarfRowMapper, session_id, user_id);
        return results.stream().findFirst();
    }

    public Rarf save(Rarf rarf) {
        jdbcTemplate.update(
                "INSERT INTO rarf (session_id, user_id, feedback_filled, rating, understandable_score, confidence_score, expectations_score, engagement_score, organization_score, relevance_score, presenter_score, pace_score, most_valuable, suggestions) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                rarf.getSession_id(),
                rarf.getUser_id(),
                rarf.getFeedback_filled(),
                rarf.getRating(),
                rarf.getUnderstandable_score(),
                rarf.getConfidence_score(),
                rarf.getExpectations_score(),
                rarf.getEngagement_score(),
                rarf.getOrganization_score(),
                rarf.getRelevance_score(),
                rarf.getPresenter_score(),
                rarf.getPace_score(),
                rarf.getMost_valuable(),
                rarf.getSuggestions()
        );
        return rarf;
    }

    public Rarf update(Rarf rarf) {
        jdbcTemplate.update(
                "UPDATE rarf SET feedback_filled = ?, rating = ?, understandable_score = ?, confidence_score = ?, expectations_score = ?, engagement_score = ?, organization_score = ?, relevance_score = ?, presenter_score = ?, pace_score = ?, most_valuable = ?, suggestions = ? WHERE session_id = ? AND user_id = ?",
                rarf.getFeedback_filled(),
                rarf.getRating(),
                rarf.getUnderstandable_score(),
                rarf.getConfidence_score(),
                rarf.getExpectations_score(),
                rarf.getEngagement_score(),
                rarf.getOrganization_score(),
                rarf.getRelevance_score(),
                rarf.getPresenter_score(),
                rarf.getPace_score(),
                rarf.getMost_valuable(),
                rarf.getSuggestions(),
                rarf.getSession_id(),
                rarf.getUser_id()
        );
        return rarf;
    }

    public void deleteBySessionIdAndUserId(Long session_id, String user_id) {
        jdbcTemplate.update("DELETE FROM rarf WHERE session_id = ? AND user_id = ?", session_id, user_id);
    }
}
