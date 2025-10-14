package com.ddbs.choroid_rarf_service.controller;

import com.ddbs.choroid_rarf_service.model.Rarf;
import com.ddbs.choroid_rarf_service.service.RarfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rarf")
public class RarfController {

    @Autowired
    private RarfService rarfService;

    @GetMapping("/session/{sessionId}")
    public List<Rarf> getBySessionId(@PathVariable Long sessionId) {
        return rarfService.getBySessionId(sessionId);
    }

    @GetMapping("/user/{userId}")
    public List<Rarf> getByUserId(@PathVariable String userId) {
        return rarfService.getByUserId(userId);
    }

    @GetMapping("/session/{sessionId}/user/{userId}")
    public Optional<Rarf> getBySessionIdAndUserId(@PathVariable Long sessionId, @PathVariable String userId) {
        return rarfService.getBySessionIdAndUserId(sessionId, userId);
    }

    @PostMapping
    public Rarf createRarf(@RequestBody Rarf rarf) {
        return rarfService.createRarf(rarf);
    }

    @PutMapping
    public Optional<Rarf> updateRarf(@RequestBody Rarf rarf) {
        return rarfService.updateRarf(rarf.getSession_id(), rarf.getUser_id(), rarf);
    }

    @DeleteMapping("/session/{sessionId}/user/{userId}")
    public void deleteRarf(@PathVariable Long sessionId, @PathVariable String userId) {
        rarfService.deleteRarf(sessionId, userId);
    }
}
