package com.ddbs.choroid_rarf_service.mapper;

import com.ddbs.choroid_rarf_service.dto.RegistrationRequest;
import com.ddbs.choroid_rarf_service.model.Rarf;

public class RegistrationRequestMapper {

    //RegistrationRequest to Rarf
    public static Rarf convertToRarf(RegistrationRequest request)
    {
        return new Rarf(
                request.getSessionId(),
                request.getUserId().trim(),
                false,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null
        );
    }
}
