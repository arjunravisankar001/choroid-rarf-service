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

@Slf4j
@Repository
public class RarfRepository {

    private final JdbcTemplate  jdbcTemplate;

    public RarfRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<Rarf> rarfRowMapper = (rs, rowNum) -> {
        Rarf rarf = new Rarf();
        rarf.setSessionId(rs.getString("session_id"));
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
    public Long registeredCountBySessionId(String sessionId)
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
    public Long attendedCountBySessionId(String sessionId)
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
    public List<Rarf> findBySessionId(String sessionId)
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
    public Stats getStatsBySessionId(String sessionId)
    {
        try {
            // Fetch all records for the session
            List<Rarf> records = jdbcTemplate.query(
                "SELECT * FROM rarf WHERE session_id = ? AND feedback_filled = true", 
                rarfRowMapper, 
                sessionId
            );
            
            if (records.isEmpty()) {
                throw new RuntimeException("No feedback records found for sessionId: " + sessionId);
            }
            
            Stats stats = new Stats();
            stats.setSessionId(sessionId);
            
            // Calculate stats for each field
            stats.setRating(calculateFieldStats(records, Rarf::getRating));
            stats.setUnderstandableScore(calculateFieldStats(records, Rarf::getUnderstandableScore));
            stats.setConfidenceScore(calculateFieldStats(records, Rarf::getConfidenceScore));
            stats.setExpectationsScore(calculateFieldStats(records, Rarf::getExpectationsScore));
            stats.setEngagementScore(calculateFieldStats(records, Rarf::getEngagementScore));
            stats.setOrganizationScore(calculateFieldStats(records, Rarf::getOrganizationScore));
            stats.setRelevanceScore(calculateFieldStats(records, Rarf::getRelevanceScore));
            stats.setPresenterScore(calculateFieldStats(records, Rarf::getPresenterScore));
            stats.setPaceScore(calculateFieldStats(records, Rarf::getPaceScore));
            
            return stats;
        } catch (DataAccessException e) {
            log.error("Database error fetching stats by sessionId: {}", sessionId, e);
            throw new RuntimeException("Database error occurred while fetching stats by sessionId: " + sessionId, e);
        }
        catch (Exception e) {
            log.error("Unexpected error fetching stats by sessionId: {}", sessionId, e);
            throw new RuntimeException("Unexpected error fetching stats by sessionId: " + sessionId, e);
        }
    }
    
    private Map<String, Integer> calculateFieldStats(List<Rarf> records, java.util.function.ToIntFunction<Rarf> fieldExtractor) {
        List<Integer> values = records.stream()
            .map(fieldExtractor::applyAsInt)
            .sorted()
            .toList();
        
        Map<String, Integer> stats = new HashMap<>();
        
        // Min and Max
        stats.put("min", values.get(0));
        stats.put("max", values.get(values.size() - 1));
        
        // Average
        int sum = values.stream().mapToInt(Integer::intValue).sum();
        stats.put("avg", sum / values.size());
        
        // Median
        int median;
        int size = values.size();
        if (size % 2 == 0) {
            median = (values.get(size / 2 - 1) + values.get(size / 2)) / 2;
        } else {
            median = values.get(size / 2);
        }
        stats.put("median", median);
        
        // Mode (most frequent value)
        Map<Integer, Integer> frequency = new HashMap<>();
        for (Integer value : values) {
            frequency.put(value, frequency.getOrDefault(value, 0) + 1);
        }
        int mode = frequency.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse(values.get(0));
        stats.put("mode", mode);
        
        return stats;
    }

    //GET choroid/rarf/session/stats
    public List<Stats> getSessionStats()
    {
        // For MySQL, we'll retrieve all sessions and compute stats for each one
        try {
            List<String> sessionIds = jdbcTemplate.query(
                "SELECT DISTINCT session_id FROM rarf",
                (rs, rowNum) -> rs.getString("session_id")
            );
            
            List<Stats> statsList = new java.util.ArrayList<>();
            for (String sessionId : sessionIds) {
                Stats stats = getStatsBySessionId(sessionId);
                statsList.add(stats);
            }
            return statsList;
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
    public PageResponse<Rarf> findBySessionId(String sessionId, int page, int size)
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
    public Rarf findBySessionIdAndUserId(String sessionId, String userId)
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
    public Rarf update(String sessionId, String userId, FeedbackFields feedbackFields)
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
    public void deleteBySessionIdAndUserId(String sessionId, String userId)
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
