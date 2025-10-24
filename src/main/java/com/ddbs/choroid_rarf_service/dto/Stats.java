package com.ddbs.choroid_rarf_service.dto;


import lombok.*;

import java.util.Map;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Stats {

    private UUID sessionId;

    private Map<String, Integer> rating;
    private Map<String, Integer> understandableScore;
    private Map<String, Integer> confidenceScore;
    private Map<String, Integer> expectationsScore;
    private Map<String, Integer> engagementScore;
    private Map<String, Integer> organizationScore;
    private Map<String, Integer> relevanceScore;
    private Map<String, Integer> presenterScore;
    private Map<String, Integer> paceScore;

}
