package com.example.reservationownerservice.owner.domain.request;


import com.example.reservationownerservice.owner.domain.entity.Owner;
import com.example.reservationownerservice.owner.domain.entity.Role;
import com.example.reservationownerservice.owner.domain.entity.Status;

import java.util.UUID;

public record OwnerRequest(
        UUID id,
        String email,
        String username

) {
    public Owner toEntity(){
        return Owner.builder()
                .ownerId(id)
                .email(email)
                .userName(username)
                .status(Status.APPLY)
                .build();
    }
}
