package com.ddbs.choroid_rarf_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RegistrationRequest {

    @NotNull(message = "sessionId must be provided")
    private UUID sessionId;

    @NotBlank(message = "userId must be provided")
    private String userId;
}
