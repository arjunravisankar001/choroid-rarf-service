package com.ddbs.choroid_rarf_service.repository;

import com.ddbs.choroid_rarf_service.dto.FeedbackFields;
import com.ddbs.choroid_rarf_service.dto.PageResponse;
import com.ddbs.choroid_rarf_service.model.Rarf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Slf4j
@Repository
public class RarfRepository {

    private final JdbcTemplate  jdbcTemplate;

    public RarfRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<Rarf> rarfRowMapper = (rs, rowNum) -> {
        Rarf rarf = new Rarf();
        rarf.setSessionId(UUID.fromString(rs.getString("session_id")));
        rarf.setUserId(rs.getString("user_id"));
        rarf.setFeedbackFilled(rs.getBoolean("feedback_filled"));
        rarf.setRating(rs.getInt("rating"));
        rarf.setUnderstandableScore(rs.getInt("understandable_score"));
        rarf.setConfidenceScore(rs.getInt("confidence_score"));
        rarf.setExpectationsScore(rs.getInt("expectations_score"));
        rarf.setEngagementScore(rs.getInt("engagement_score"));
        rarf.setOrganizationScore(rs.getInt("organization_score"));
        rarf.setRelevanceScore(rs.getInt("relevance_score"));
        rarf.setPresenterScore(rs.getInt("presenter_score"));
        rarf.setPaceScore(rs.getInt("pace_score"));
        rarf.setMostValuable(rs.getString("most_valuable"));
        rarf.setSuggestions(rs.getString("suggestions"));
        return rarf;
    };

    private final RowMapper<Long> countRowMapper = (rs, rowNum) -> rs.getLong(1);

    public PageResponse<Rarf> findBySessionId(UUID sessionId, int page, int size)
    {
        try {
            List<Rarf> items = jdbcTemplate.query("SELECT * FROM rarf WHERE session_id = ? LIMIT ? OFFSET ?", rarfRowMapper, sessionId, size, page*size);
            long totalItems = jdbcTemplate.query("SELECT COUNT(*) FROM rarf WHERE session_id = ?", countRowMapper, sessionId).getFirst();
            int totalPages = (int) Math.ceil((double) totalItems / size);
            return new PageResponse<Rarf>(items, page, size, totalItems, totalPages);
        } catch (DataAccessException e) {
            log.error("Database error fetching rarf records by sessionId: {}", sessionId, e);
            throw new RuntimeException("Database error occurred while fetching rarf records by sessionId: " + sessionId, e);
        }
        catch (Exception e) {
            log.error("Unexpected error fetching rarf by sessionId: {}", sessionId, e);
            throw new RuntimeException("Unexpected error fetching rarf by sessionId: " + sessionId, e);
        }
    }

    public PageResponse<Rarf> findByUserId(String userId, int page, int size)
    {
        try {
            List<Rarf> items = jdbcTemplate.query("SELECT * FROM rarf WHERE user_id = ?", rarfRowMapper, userId);
            long totalItems = jdbcTemplate.query("SELECT COUNT(*) FROM rarf WHERE user_id = ?", countRowMapper, userId).getFirst();
            int totalPages = (int) Math.ceil((double) totalItems / size);
            return new PageResponse<Rarf>(items, page, size, totalItems, totalPages);
        } catch (DataAccessException e) {
            log.error("Database error fetching rarf records by userId: {}", userId, e);
            throw new RuntimeException("Database error occurred while fetching rarf records by userId: " + userId, e);
        }
        catch (Exception e) {
            log.error("Unexpected error fetching rarf by userId: {}", userId, e);
            throw new RuntimeException("Unexpected error fetching rarf by userId: " + userId, e);
        }
    }

    public Rarf findBySessionIdAndUserId(UUID sessionId, String userId)
    {
        String sql = "SELECT * FROM rarf WHERE session_id = ? AND user_id = ?";
        try {
            List<Rarf> results = jdbcTemplate.query(sql, rarfRowMapper, sessionId, userId);
            if (results.isEmpty()) {
                log.error("No rarf record found for sessionId: {} and userId: {}", sessionId, userId);
                throw new RuntimeException("Rarf record not found for sessionId: " + sessionId + " and userId: " + userId);
            }
            else {
                return results.getFirst();
            }
        }
        catch (DataAccessException e) {
            log.error("Database error fetching rarf record for sessionId: {} and userId: {}", sessionId, userId, e);
            throw new RuntimeException("Database error occurred while fetching rarf record for sessionId: " + sessionId + " and userId: " + userId, e);
        }
        catch (Exception e) {
            if (e.getMessage().contains("not found")) {
                throw (RuntimeException) e; // rethrow not found exception
            }
            log.error("Unexpected error fetching rarf for sessionId: {} and userId: {}", sessionId, userId, e);
            throw new RuntimeException("Unexpected error occurred while fetching rarf for sessionId: " + sessionId + " and userId: " + userId, e);
        }
    }

    public Rarf save(Rarf rarf) {
        //Check for duplicate registration
        String checkSql = "SELECT COUNT(*) FROM rarf WHERE session_id = ? AND user_id = ?";
        Long count = 0L;
        try {
            count = jdbcTemplate.queryForObject(checkSql, countRowMapper, rarf.getSessionId(), rarf.getUserId());
        } catch (DataAccessException e) {
            log.error("Database error checking for existing rarf record for sessionId: {} and userId: {}", rarf.getSessionId(), rarf.getUserId(), e);
            throw new RuntimeException("Database error occurred while checking for existing rarf record for sessionId: " + rarf.getSessionId() + " and userId: " + rarf.getUserId(), e);
        } catch (Exception e) {
            log.error("Unexpected error checking for existing rarf record for sessionId: {} and userId: {}", rarf.getSessionId(), rarf.getUserId(), e);
            throw new RuntimeException("Unexpected error occurred while checking for existing rarf record for sessionId: " + rarf.getSessionId() + " and userId: " + rarf.getUserId(), e);
        }
        if (count != null && count > 0) {
            log.error("Duplicate registration detected for sessionId: {} and userId: {}", rarf.getSessionId(), rarf.getUserId());
            throw new RuntimeException("Duplicate registration detected for sessionId: " + rarf.getSessionId() + " and userId: " + rarf.getUserId());
        }

        String sql = "INSERT INTO rarf (session_id, user_id, feedback_filled, rating, understandable_score, confidence_score, expectations_score, engagement_score, organization_score, relevance_score, presenter_score, pace_score, most_valuable, suggestions) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            jdbcTemplate.update(sql,
                    rarf.getSessionId(),
                    rarf.getUserId(),
                    rarf.getFeedbackFilled(),
                    rarf.getRating(),
                    rarf.getUnderstandableScore(),
                    rarf.getConfidenceScore(),
                    rarf.getExpectationsScore(),
                    rarf.getEngagementScore(),
                    rarf.getOrganizationScore(),
                    rarf.getRelevanceScore(),
                    rarf.getPresenterScore(),
                    rarf.getPaceScore(),
                    rarf.getMostValuable(),
                    rarf.getSuggestions()
            );
            return rarf;
        } catch (DataAccessException e) {
            log.error("Database error occurred while registering for sessionId: {} by userId: {}", rarf.getSessionId(), rarf.getUserId(), e);
            throw new RuntimeException("Database error occurred while registering for sessionId: " + rarf.getSessionId() + " by userId: " + rarf.getUserId(), e);
        } catch (Exception e) {
            log.error("Unexpected error saving registration for sessionId: {} by userId: {}", rarf.getSessionId(), rarf.getUserId(), e);
            throw new RuntimeException("Unexpected error occurred while registering for sessionId: " + rarf.getSessionId() + " by userId: " + rarf.getUserId(), e);
        }
    }

    public Rarf update(UUID sessionId, String userId, FeedbackFields feedbackFields)
    {
        try {
            Rarf rarf = findBySessionIdAndUserId(sessionId, userId);
            String sql = feedbackFields.getSql();
            Object[] params = feedbackFields.getUpdateParams(sessionId, userId);
            int rowsAffected = jdbcTemplate.update(sql, params);
            if (rowsAffected == 0) {
                log.error("No feedback filled for sessionId: {} by userId: {}", sessionId, userId);
                throw new RuntimeException("No feedback filled for sessionId: " + sessionId + " by userId: " + userId);
            }
            rarf = findBySessionIdAndUserId(sessionId, userId);
            return rarf;
        } catch (DataAccessException e) {
            log.error("Database error occurred while filling feedback for sessionId: {} by userId: {}", sessionId, userId, e);
            throw new RuntimeException("Database error occurred while filling feedback for sessionId: " + sessionId + " by userId: " + userId, e);
        }
        catch (Exception e) {
            if (e.getMessage().contains("not found") || e.getMessage().contains("No feedback filled")) {
                throw (RuntimeException) e; // rethrow not found exception
            }
            log.error("Unexpected error filling feedback for sessionId: {} by userId: {}", sessionId, userId, e);
            throw new RuntimeException("Unexpected error occurred while filling feedback for sessionId: " + sessionId + " by userId: " + userId, e);
        }
    }

    public void deleteBySessionIdAndUserId(UUID sessionId, String userId)
    {
        String sql = "DELETE FROM rarf WHERE session_id = ? AND user_id = ?";
        try {
            int rowsAffected = jdbcTemplate.update(sql, sessionId, userId);
            if (rowsAffected == 0) {
                log.error("No rows deleted for sessionId: {} and userId: {}", sessionId, userId);
                throw new RuntimeException("No rows deleted for for sessionId: " + sessionId + " and userId: " + userId);
            }
        } catch (DataAccessException e) {
            log.error("Database error occurred while deleting rarf record for sessionId: {} by userId: {}", sessionId, userId, e);
            throw new RuntimeException("Database error occurred while deleting rarf record for sessionId: " + sessionId + " by userId: " + userId, e);
        } catch (Exception e) {
            if (e.getMessage().contains("not found") || e.getMessage().contains("no rows deleted")) {
                throw (RuntimeException) e; // rethrow not found exception
            }
            log.error("Unexpected error deleting rarf record for sessionId: {} by userId: {}", sessionId, userId, e);
            throw new RuntimeException("Unexpected error occurred while deleting rarf record for sessionId: " + sessionId + " by userId: " + userId, e);
        }
    }
}
