package com.ddbs.choroid_rarf_service.repository;

import com.ddbs.choroid_rarf_service.dto.FeedbackFields;
import com.ddbs.choroid_rarf_service.dto.PageResponse;
import com.ddbs.choroid_rarf_service.dto.Stats;
import com.ddbs.choroid_rarf_service.model.Rarf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    private final RowMapper<Stats> statsRowMapper = (rs, rowNum) -> {
        Stats stats = new Stats();

        stats.setSessionId(UUID.fromString(rs.getString("session_id")));
        Map<String, Integer> map = new HashMap<>();

        map.put("min", rs.getInt("minRating"));
        map.put("max", rs.getInt("maxRating"));
        map.put("avg", rs.getInt("avgRating"));
        map.put("median", rs.getInt("medianRating"));
        map.put("mode", rs.getInt("modeRating"));
        stats.setRating(map);

        map.put("min", rs.getInt("minUnderstandableScore"));
        map.put("max", rs.getInt("maxUnderstandableScore"));
        map.put("avg", (int) rs.getDouble("avgUnderstandableScore"));
        map.put("median", (int) rs.getDouble("medianUnderstandableScore"));
        map.put("mode", rs.getInt("modeUnderstandableScore"));
        stats.setUnderstandableScore(map);

        map.put("min", rs.getInt("minConfidenceScore"));
        map.put("max", rs.getInt("maxConfidenceScore"));
        map.put("avg", (int) rs.getDouble("avgConfidenceScore"));
        map.put("median", (int) rs.getDouble("medianConfidenceScore"));
        map.put("mode", rs.getInt("modeConfidenceScore"));
        stats.setConfidenceScore(map);

        map.put("min", rs.getInt("minExpectationsScore"));
        map.put("max", rs.getInt("maxExpectationsScore"));
        map.put("avg", (int) rs.getDouble("avgExpectationsScore"));
        map.put("median", (int) rs.getDouble("medianExpectationsScore"));
        map.put("mode", rs.getInt("modeExpectationsScore"));
        stats.setExpectationsScore(map);

        map.put("min", rs.getInt("minEngagementScore"));
        map.put("max", rs.getInt("maxEngagementScore"));
        map.put("avg", (int) rs.getDouble("avgEngagementScore"));
        map.put("median", (int) rs.getDouble("medianEngagementScore"));
        map.put("mode", rs.getInt("modeEngagementScore"));
        stats.setEngagementScore(map);

        map.put("min", rs.getInt("minOrganizationScore"));
        map.put("max", rs.getInt("maxOrganizationScore"));
        map.put("avg", (int) rs.getDouble("avgOrganizationScore"));
        map.put("median", (int) rs.getDouble("medianOrganizationScore"));
        map.put("mode", rs.getInt("modeOrganizationScore"));
        stats.setOrganizationScore(map);

        map.put("min", rs.getInt("minRelevanceScore"));
        map.put("max", rs.getInt("maxRelevanceScore"));
        map.put("avg", (int) rs.getDouble("avgRelevanceScore"));
        map.put("median", (int) rs.getDouble("medianRelevanceScore"));
        map.put("mode", rs.getInt("modeRelevanceScore"));
        stats.setRelevanceScore(map);

        map.put("min", rs.getInt("minPresenterScore"));
        map.put("max", rs.getInt("maxPresenterScore"));
        map.put("avg", (int) rs.getDouble("avgPresenterScore"));
        map.put("median", (int) rs.getDouble("medianPresenterScore"));
        map.put("mode", rs.getInt("modePresenterScore"));
        stats.setPresenterScore(map);

        map.put("min", rs.getInt("minPaceScore"));
        map.put("max", rs.getInt("maxPaceScore"));
        map.put("avg", (int) rs.getDouble("avgPaceScore"));
        map.put("median", (int) rs.getDouble("medianPaceScore"));
        map.put("mode", rs.getInt("modePaceScore"));
        stats.setPaceScore(map);

        return stats;
    };

    //GET choroid/rarf/count
    public Long countAllRarfRecords()
    {
        try {
            Long count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM rarf", countRowMapper);
            return count != null ? count : 0L;
        } catch (DataAccessException e) {
            log.error("Database error counting rarf records", e);
            throw new RuntimeException("Database error occurred while counting rarf records", e);
        } catch (Exception e) {
            log.error("Unexpected error counting rarf records", e);
            throw new RuntimeException("Unexpected error occurred while counting rarf records", e);
        }
    }

    //GET choroid/rarf
    public List<Rarf> findAllRarfRecords()
    {
        try {
            return jdbcTemplate.query("SELECT * FROM rarf", rarfRowMapper);
        } catch (DataAccessException e) {
            log.error("Database error fetching all rarf records", e);
            throw new RuntimeException("Database error occurred while fetching all rarf records", e);
        } catch (Exception e) {
            log.error("Unexpected error fetching all rarf records", e);
            throw new RuntimeException("Unexpected error occurred while fetching all rarf records", e);
        }
    }

    //GET choroid/rarf/session/{sessionId}/registeredCount
    public Long registeredCountBySessionId(UUID sessionId)
    {
        try {
            Long count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM rarf WHERE session_id = ?", countRowMapper, sessionId);
            return count != null ? count : 0L;
        } catch (DataAccessException e) {
            log.error("Database error counting rarf records by sessionId: {}", sessionId, e);
            throw new RuntimeException("Database error occurred while counting rarf records by sessionId: " + sessionId, e);
        } catch (Exception e) {
            log.error("Unexpected error counting rarf by sessionId: {}", sessionId, e);
            throw new RuntimeException("Unexpected error occurred while counting rarf records by sessionId: " + sessionId, e);
        }
    }

    //GET choroid/rarf/user/{userId}/registeredCount
    public Long registeredCountByUserId(String userId)
    {
        try {
            Long count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM rarf WHERE user_id = ?", countRowMapper, userId);
            return count != null ? count : 0L;
        } catch (DataAccessException e) {
            log.error("Database error counting rarf records by userId: {}", userId, e);
            throw new RuntimeException("Database error occurred while counting rarf records by userId: " + userId, e);
        } catch (Exception e) {
            log.error("Unexpected error counting rarf by userId: {}", userId, e);
            throw new RuntimeException("Unexpected error occurred while counting rarf records by userId: " + userId, e);
        }
    }


    //GET choroid/rarf/session/{sessionId}/attendedCount
    public Long attendedCountBySessionId(UUID sessionId)
    {
        try {
            Long count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM rarf WHERE session_id = ? AND feedback_filled = true", countRowMapper, sessionId);
            return count != null ? count : 0L;
        } catch (DataAccessException e) {
            log.error("Database error counting attended rarf records by sessionId: {}", sessionId, e);
            throw new RuntimeException("Database error occurred while counting attended rarf records by sessionId: " + sessionId, e);
        } catch (Exception e) {
            log.error("Unexpected error counting attended rarf by sessionId: {}", sessionId, e);
            throw new RuntimeException("Unexpected error occurred while counting attended rarf records by sessionId: " + sessionId, e);
        }
    }

    //GET choroid/rarf/session/{sessionId}/attendedCount
    public Long attendedCountByUserId(String userId)
    {
        try {
            Long count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM rarf WHERE user_id = ? AND feedback_filled = true", countRowMapper, userId);
            return count != null ? count : 0L;
        } catch (DataAccessException e) {
            log.error("Database error counting attended rarf records by userId: {}", userId, e);
            throw new RuntimeException("Database error occurred while counting attended rarf records by userId: " + userId, e);
        } catch (Exception e) {
            log.error("Unexpected error counting attended rarf by userId: {}", userId, e);
            throw new RuntimeException("Unexpected error occurred while counting attended rarf records by userId: " + userId, e);
        }
    }

    //GET choroid/rarf/session/{sessionId}/all
    public List<Rarf> findBySessionId(UUID sessionId)
    {
        try {
            return jdbcTemplate.query("SELECT * FROM rarf WHERE session_id = ?", rarfRowMapper, sessionId);
        } catch (DataAccessException e) {
            log.error("Database error fetching rarf records by sessionId: {}", sessionId, e);
            throw new RuntimeException("Database error occurred while fetching rarf records by sessionId: " + sessionId, e);
        }
        catch (Exception e) {
            log.error("Unexpected error fetching rarf by sessionId: {}", sessionId, e);
            throw new RuntimeException("Unexpected error fetching rarf by sessionId: " + sessionId, e);
        }
    }

    //GET choroid/rarf/user/{userId}/all
    public List<Rarf> findByUserId(String userId)
    {
        try {
            return jdbcTemplate.query("SELECT * FROM rarf WHERE user_id = ?", rarfRowMapper, userId);
        } catch (DataAccessException e) {
            log.error("Database error fetching rarf records by userId: {}", userId, e);
            throw new RuntimeException("Database error occurred while fetching rarf records by userId: " + userId, e);
        }
        catch (Exception e) {
            log.error("Unexpected error fetching rarf by userId: {}", userId, e);
            throw new RuntimeException("Unexpected error fetching rarf by userId: " + userId, e);
        }
    }

    //GET choroid/rarf/session/{sessionId}/stats
    public Stats getStatsBySessionId(UUID sessionId)
    {
        String sql = "SELECT " +

                "session_id, " +

                "MIN(rating) AS minRating, MAX(rating) AS maxRating, AVG(rating) AS avgRating, " +
                "PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY rating) AS medianRating, " +
                "MODE() WITHIN GROUP (ORDER BY rating) AS modeRating, " +

                "MIN(understandable_score) AS minUnderstandableScore, MAX(understandable_score) AS maxUnderstandableScore, AVG(understandable_score) AS avgUnderstandableScore, " +
                "PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY understandable_score) AS medianUnderstandableScore, " +
                "MODE() WITHIN GROUP (ORDER BY understandable_score) AS modeUnderstandableScore, " +

                "MIN(confidence_score) AS minConfidenceScore, MAX(confidence_score) AS maxConfidenceScore, AVG(confidence_score) AS avgConfidenceScore, " +
                "PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY confidence_score) AS medianConfidenceScore, " +
                "MODE() WITHIN GROUP (ORDER BY confidence_score) AS modeConfidenceScore, " +

                "MIN(expectations_score) AS minExpectationsScore, MAX(expectations_score) AS maxExpectationsScore, AVG(expectations_score) AS avgExpectationsScore, " +
                "PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY expectations_score) AS medianExpectationsScore, " +
                "MODE() WITHIN GROUP (ORDER BY expectations_score) AS modeExpectationsScore, " +

                "MIN(engagement_score) AS minEngagementScore, MAX(engagement_score) AS maxEngagementScore, AVG(engagement_score) AS avgEngagementScore, " +
                "PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY engagement_score) AS medianEngagementScore, " +
                "MODE() WITHIN GROUP (ORDER BY engagement_score) AS modeEngagementScore, " +

                "MIN(organization_score) AS minOrganizationScore, MAX(organization_score) AS maxOrganizationScore, AVG(organization_score) AS avgOrganizationScore, " +
                "PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY organization_score) AS medianOrganizationScore, " +
                "MODE() WITHIN GROUP (ORDER BY organization_score) AS modeOrganizationScore, " +

                "MIN(relevance_score) AS minRelevanceScore, MAX(relevance_score) AS maxRelevanceScore, AVG(relevance_score) AS avgRelevanceScore, " +
                "PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY relevance_score) AS medianRelevanceScore, " +
                "MODE() WITHIN GROUP (ORDER BY relevance_score) AS modeRelevanceScore, " +

                "MIN(presenter_score) AS minPresenterScore, MAX(presenter_score) AS maxPresenterScore, AVG(presenter_score) AS avgPresenterScore, " +
                "PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY presenter_score) AS medianPresenterScore, " +
                "MODE() WITHIN GROUP (ORDER BY presenter_score) AS modePresenterScore, " +

                "MIN(pace_score) AS minPaceScore, MAX(pace_score) AS maxPaceScore, AVG(pace_score) AS avgPaceScore, " +
                "PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY pace_score) AS medianPaceScore, " +
                "MODE() WITHIN GROUP (ORDER BY pace_score) AS modePaceScore " +

                "FROM rarf WHERE session_id = ? GROUP BY session_id";
        try {
            return jdbcTemplate.queryForObject(sql, statsRowMapper, sessionId);
        } catch (DataAccessException e) {
            log.error("Database error fetching stats by sessionId: {}", sessionId, e);
            throw new RuntimeException("Database error occurred while fetching stats by sessionId: " + sessionId, e);
        }
        catch (Exception e) {
            log.error("Unexpected error fetching stats by sessionId: {}", sessionId, e);
            throw new RuntimeException("Unexpected error fetching stats by sessionId: " + sessionId, e);
        }
    }

    //GET choroid/rarf/session/stats
    public List<Stats> getSessionStats()
    {
        String sql = "SELECT " +

                "session_id, " +

                "MIN(rating) AS minRating, MAX(rating) AS maxRating, AVG(rating) AS avgRating, " +
                "PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY rating) AS medianRating, " +
                "MODE() WITHIN GROUP (ORDER BY rating) AS modeRating, " +

                "MIN(understandable_score) AS minUnderstandableScore, MAX(understandable_score) AS maxUnderstandableScore, AVG(understandable_score) AS avgUnderstandableScore, " +
                "PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY understandable_score) AS medianUnderstandableScore, " +
                "MODE() WITHIN GROUP (ORDER BY understandable_score) AS modeUnderstandableScore, " +

                "MIN(confidence_score) AS minConfidenceScore, MAX(confidence_score) AS maxConfidenceScore, AVG(confidence_score) AS avgConfidenceScore, " +
                "PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY confidence_score) AS medianConfidenceScore, " +
                "MODE() WITHIN GROUP (ORDER BY confidence_score) AS modeConfidenceScore, " +

                "MIN(expectations_score) AS minExpectationsScore, MAX(expectations_score) AS maxExpectationsScore, AVG(expectations_score) AS avgExpectationsScore, " +
                "PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY expectations_score) AS medianExpectationsScore, " +
                "MODE() WITHIN GROUP (ORDER BY expectations_score) AS modeExpectationsScore, " +

                "MIN(engagement_score) AS minEngagementScore, MAX(engagement_score) AS maxEngagementScore, AVG(engagement_score) AS avgEngagementScore, " +
                "PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY engagement_score) AS medianEngagementScore, " +
                "MODE() WITHIN GROUP (ORDER BY engagement_score) AS modeEngagementScore, " +

                "MIN(organization_score) AS minOrganizationScore, MAX(organization_score) AS maxOrganizationScore, AVG(organization_score) AS avgOrganizationScore, " +
                "PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY organization_score) AS medianOrganizationScore, " +
                "MODE() WITHIN GROUP (ORDER BY organization_score) AS modeOrganizationScore, " +

                "MIN(relevance_score) AS minRelevanceScore, MAX(relevance_score) AS maxRelevanceScore, AVG(relevance_score) AS avgRelevanceScore, " +
                "PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY relevance_score) AS medianRelevanceScore, " +
                "MODE() WITHIN GROUP (ORDER BY relevance_score) AS modeRelevanceScore, " +

                "MIN(presenter_score) AS minPresenterScore, MAX(presenter_score) AS maxPresenterScore, AVG(presenter_score) AS avgPresenterScore, " +
                "PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY presenter_score) AS medianPresenterScore, " +
                "MODE() WITHIN GROUP (ORDER BY presenter_score) AS modePresenterScore, " +

                "MIN(pace_score) AS minPaceScore, MAX(pace_score) AS maxPaceScore, AVG(pace_score) AS avgPaceScore, " +
                "PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY pace_score) AS medianPaceScore, " +
                "MODE() WITHIN GROUP (ORDER BY pace_score) AS modePaceScore " +

                "FROM rarf GROUP BY session_id";
        try {
            return jdbcTemplate.query(sql, statsRowMapper);
        } catch (DataAccessException e) {
            log.error("Database error fetching session stats", e);
            throw new RuntimeException("Database error occurred while fetching session stats ", e);
        }
        catch (Exception e) {
            log.error("Unexpected error fetching session stats", e);
            throw new RuntimeException("Unexpected error fetching session stats", e);
        }
    }

    //GET choroid/rarf/session/{sessionId}
    public PageResponse<Rarf> findBySessionId(UUID sessionId, int page, int size)
    {
        try {
            List<Rarf> items = jdbcTemplate.query("SELECT * FROM rarf WHERE session_id = ? ORDER BY user_id LIMIT ? OFFSET ?", rarfRowMapper, sessionId, size, page*size);
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

    //GET choroid/rarf/user/{userId}
    public PageResponse<Rarf> findByUserId(String userId, int page, int size)
    {
        try {
            List<Rarf> items = jdbcTemplate.query("SELECT * FROM rarf WHERE user_id = ? ORDER BY session_id LIMIT ? OFFSET ?", rarfRowMapper, userId, size, page*size);
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

    //GET choroid/rarf/session/{sessionId}/user/{userId}
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

    //POST choroid/rarf/register
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

    //PATCH choroid/rarf/session/{sessionId}/user/{userId}
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

    //DELETE choroid/rarf/session/{sessionId}/user/{userId}
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
