package com.ddbs.choroid_rarf_service.controller;

import com.ddbs.choroid_rarf_service.dto.FillFeedbackRequest;
import com.ddbs.choroid_rarf_service.dto.PageResponse;
import com.ddbs.choroid_rarf_service.dto.RegistrationRequest;
import com.ddbs.choroid_rarf_service.dto.Stats;
import com.ddbs.choroid_rarf_service.model.Rarf;
import com.ddbs.choroid_rarf_service.service.RarfService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/choroid/rarf")
public class RarfController {

    @Autowired
    private RarfService rarfService;

    @GetMapping("/count")
    public Long countAll()
    {
        return rarfService.countAllRarfs();
    }

    @GetMapping
    public List<Rarf> getAll()
    {
        return rarfService.getAllRarfs();
    }

    @GetMapping("/session/{sessionId}/registeredCount")
    public Long getRegisteredCountBySessionId(@PathVariable UUID sessionId)
    {
        return rarfService.getRegisteredCountBySessionId(sessionId);
    }

    @GetMapping("/user/{userId}/registeredCount")
    public Long getRegisteredCountByUserId(@PathVariable String userId)
    {
        return rarfService.getRegisteredCountByUserId(userId);
    }

    @GetMapping("/session/{sessionId}/attendedCount")
    public Long getAttendedCountBySessionId(@PathVariable UUID sessionId)
    {
        return rarfService.getAttendedCountBySessionId(sessionId);
    }

    @GetMapping("/user/{userId}/attendedCount")
    public Long getAttendedCountByUserId(@PathVariable String userId)
    {
        return rarfService.getAttendedCountByUserId(userId);
    }

    @GetMapping("/session/{sessionId}/all")
    public List<Rarf> getAllBySessionId(@PathVariable UUID sessionId)
    {
        return rarfService.getAllBySessionId(sessionId);
    }

    @GetMapping("/user/{userId}/all")
    public List<Rarf> getAllByUserId(@PathVariable String userId)
    {
        return rarfService.getAllByUserId(userId);
    }

    @GetMapping("/session/{sessionId}/stats")
    public Stats getStatsBySessionId(@PathVariable UUID sessionId)
    {
        return rarfService.getStatsBySessionId(sessionId);
    }

    @GetMapping("/session/stats")
    public List<Stats> getAllStats()
    {
        return rarfService.getAllSessionStats();
    }

    @GetMapping("/session/{sessionId}")
    public PageResponse<Rarf> getRarfsBySessionId(@PathVariable UUID sessionId,
                                                  @RequestParam(defaultValue = "0") @Min(0) Integer page,
                                                  @RequestParam(defaultValue = "20") @Min(0) Integer size) {
        return rarfService.getBySessionId(sessionId, page, size);
    }

    @GetMapping("/user/{userId}")
    public PageResponse<Rarf> getRarfsByUserId(@PathVariable String userId,
                                               @RequestParam(defaultValue = "0") @Min(0) Integer page,
                                               @RequestParam(defaultValue = "20") @Min(0) Integer size) {
        return rarfService.getByUserId(userId, page, size);
    }

    @GetMapping("/session/{sessionId}/user/{userId}")
    public Rarf getRarfBySessionIdAndUserId(@PathVariable UUID sessionId, @PathVariable String userId) {
        return rarfService.getBySessionIdAndUserId(sessionId, userId);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/register")
    public Rarf registerRarf(@RequestBody @Valid RegistrationRequest request) {
        return rarfService.save(request);
    }

    @PatchMapping("/session/{sessionId}/user/{userId}")
    public Rarf fillFeedback(@PathVariable UUID sessionId, @PathVariable String userId,
                             @RequestBody @Valid FillFeedbackRequest request)
    {
        return rarfService.update(sessionId, userId, request);
    }

    @DeleteMapping("/session/{sessionId}/user/{userId}")
    public void deleteRarf(@PathVariable UUID sessionId, @PathVariable String userId) {
        rarfService.delete(sessionId, userId);
    }

}
