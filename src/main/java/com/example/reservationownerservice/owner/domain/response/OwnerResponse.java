package com.example.reservationownerservice.owner.domain.response;

import com.example.reservationownerservice.owner.domain.Status;
import com.example.reservationownerservice.owner.domain.entity.Role;


import java.util.UUID;

public record OwnerResponse(

        UUID ownerId, String email, String status

) {
}
