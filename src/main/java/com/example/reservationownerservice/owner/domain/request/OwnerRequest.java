package com.example.reservationownerservice.owner.domain.request;


import com.example.reservationownerservice.owner.domain.Status;
import com.example.reservationownerservice.owner.domain.entity.Owner;
import com.example.reservationownerservice.owner.domain.entity.Role;

import java.util.UUID;

public record OwnerRequest(
        UUID id,
        String email,
        String username,
        String role
) {
    public Owner toEntity(){
        return Owner.builder()
                .ownerId(id)
                .email(email)
                .userName(username)
                .role(Role.valueOf(role))
                .build();
    }
}
