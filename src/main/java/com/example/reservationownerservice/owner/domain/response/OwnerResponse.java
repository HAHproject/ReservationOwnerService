package com.example.reservationownerservice.owner.domain.response;


import java.util.UUID;

public record OwnerResponse(

        UUID ownerId, String email, String status

) {
}
