package com.ddbs.choroid_rarf_service.service;

import com.ddbs.choroid_rarf_service.dto.FeedbackFields;
import com.ddbs.choroid_rarf_service.dto.FillFeedbackRequest;
import com.ddbs.choroid_rarf_service.dto.PageResponse;
import com.ddbs.choroid_rarf_service.dto.RegistrationRequest;
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

    public PageResponse<Rarf> getBySessionId(UUID sessionId, int page, int size)
    {
        return rarfRepository.findBySessionId(sessionId, page, size);
    }

    public PageResponse<Rarf> getByUserId(String userId, int page, int size)
    {
        return rarfRepository.findByUserId(userId, page, size);
    }

    public Rarf getBySessionIdAndUserId(UUID sessionId, String userId)
    {
        return rarfRepository.findBySessionIdAndUserId(sessionId, userId);
    }

    public Rarf save(RegistrationRequest request)
    {
        Rarf rarf = RegistrationRequestMapper.convertToRarf(request);
        return rarfRepository.save(rarf);
    }

    public Rarf update(UUID sessionId, String userId, FillFeedbackRequest request)
    {
        FeedbackFields feedbackFields = FillFeedbackRequestMapper.toFeedbackFields(request);
        return rarfRepository.update(sessionId, userId, feedbackFields);
    }

    public void delete(UUID sessionId, String userId)
    {
        rarfRepository.deleteBySessionIdAndUserId(sessionId, userId);
    }
}
