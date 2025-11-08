package com.ddbs.choroid_rarf_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RegistrationRequest {

    @NotBlank(message = "sessionId must be provided")
    private String sessionId;

    @NotBlank(message = "userId must be provided")
    private String userId;
}
