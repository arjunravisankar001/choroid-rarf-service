package com.ddbs.choroid_rarf_service.service;

import com.ddbs.choroid_rarf_service.dto.*;
import com.ddbs.choroid_rarf_service.mapper.FillFeedbackRequestMapper;
import com.ddbs.choroid_rarf_service.mapper.RegistrationRequestMapper;
import com.ddbs.choroid_rarf_service.model.Rarf;
import com.ddbs.choroid_rarf_service.repository.RarfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RarfService {

    @Autowired
    private RarfRepository rarfRepository;

    //GET choroid/rarf/count
    public Long countAllRarfs()
    {
        return rarfRepository.countAllRarfRecords();
    }

    //GET choroid/rarf
    public List<Rarf> getAllRarfs()
    {
        return rarfRepository.findAllRarfRecords();
    }

    //GET choroid/rarf/session/{sessionId}/registeredCount
    public Long getRegisteredCountBySessionId(UUID sessionId)
    {
        return rarfRepository.registeredCountBySessionId(sessionId);
    }

    //GET choroid/rarf/user/{userId}/registeredCount
    public Long getRegisteredCountByUserId(String userId)
    {
        return rarfRepository.registeredCountByUserId(userId);
    }

    //GET choroid/rarf/session/{sessionId}/attendedCount
    public Long getAttendedCountBySessionId(UUID sessionId)
    {
        return rarfRepository.attendedCountBySessionId(sessionId);
    }

    //GET choroid/rarf/user/{userId}/attendedCount
    public Long getAttendedCountByUserId(String userId)
    {
        return rarfRepository.attendedCountByUserId(userId);
    }

    //GET choroid/rarf/session/{sessionId}/all
    public List<Rarf> getAllBySessionId(UUID sessionId)
    {
        return rarfRepository.findBySessionId(sessionId);
    }

    //GET choroid/rarf/user/{userId}/all
    public List<Rarf> getAllByUserId(String userId)
    {
        return rarfRepository.findByUserId(userId);
    }

    //GET choroid/rarf/session/{sessionId}/stats
    public Stats getStatsBySessionId(UUID sessionId)
    {
        return rarfRepository.getStatsBySessionId(sessionId);
    }

    //GET choroid/rarf/session/stats
    public List<Stats> getAllSessionStats()
    {
        return rarfRepository.getSessionStats();
    }

    //GET choroid/rarf/session/{sessionId}
    public PageResponse<Rarf> getBySessionId(UUID sessionId, int page, int size)
    {
        return rarfRepository.findBySessionId(sessionId, page, size);
    }

    //GET choroid/rarf/user/{userId}
    public PageResponse<Rarf> getByUserId(String userId, int page, int size)
    {
        return rarfRepository.findByUserId(userId, page, size);
    }

    //GET choroid/rarf/session/{sessionId}/user/{userId}
    public Rarf getBySessionIdAndUserId(UUID sessionId, String userId)
    {
        return rarfRepository.findBySessionIdAndUserId(sessionId, userId);
    }

    //POST choroid/rarf/register
    public Rarf save(RegistrationRequest request)
    {
        Rarf rarf = RegistrationRequestMapper.convertToRarf(request);
        return rarfRepository.save(rarf);
    }

    //PATCH choroid/rarf/session/{sessionId}/user/{userId}
    public Rarf update(UUID sessionId, String userId, FillFeedbackRequest request)
    {
        FeedbackFields feedbackFields = FillFeedbackRequestMapper.toFeedbackFields(request);
        return rarfRepository.update(sessionId, userId, feedbackFields);
    }

    //DELETE choroid/rarf/session/{sessionId}/user/{userId}
    public void delete(UUID sessionId, String userId)
    {
        rarfRepository.deleteBySessionIdAndUserId(sessionId, userId);
    }
}
