package com.ddbs.choroid_rarf_service.service;

import com.ddbs.choroid_rarf_service.model.Rarf;
import com.ddbs.choroid_rarf_service.repository.RarfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RarfService {

    @Autowired
    private RarfRepository rarfRepository;

    public List<Rarf> getBySessionId(Long sessionId) {
        return rarfRepository.findBySessionId(sessionId);
    }

    public List<Rarf> getByUserId(String userId) {
        return rarfRepository.findByUserId(userId);
    }

    public Optional<Rarf> getBySessionIdAndUserId(Long sessionId, String userId) {
        return rarfRepository.findBySessionIdAndUserId(sessionId, userId);
    }

    public Rarf createRarf(Rarf rarf) {
        return rarfRepository.save(rarf);
    }

    public Optional<Rarf> updateRarf(Long sessionId, String userId, Rarf rarf) {
        return rarfRepository.findBySessionIdAndUserId(sessionId, userId).map(existingRarf -> {
            existingRarf.setFeedback_filled(rarf.getFeedback_filled());
            existingRarf.setRating(rarf.getRating());
            existingRarf.setUnderstandable_score(rarf.getUnderstandable_score());
            existingRarf.setConfidence_score(rarf.getConfidence_score());
            existingRarf.setExpectations_score(rarf.getExpectations_score());
            existingRarf.setEngagement_score(rarf.getEngagement_score());
            existingRarf.setOrganization_score(rarf.getOrganization_score());
            existingRarf.setRelevance_score(rarf.getRelevance_score());
            existingRarf.setPresenter_score(rarf.getPresenter_score());
            existingRarf.setPace_score(rarf.getPace_score());
            existingRarf.setMost_valuable(rarf.getMost_valuable());
            existingRarf.setSuggestions(rarf.getSuggestions());
            return rarfRepository.update(existingRarf);
        });
    }

    public void deleteRarf(Long sessionId, String userId) {
        rarfRepository.deleteBySessionIdAndUserId(sessionId, userId);
    }
}
