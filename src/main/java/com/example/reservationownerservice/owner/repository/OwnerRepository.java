package com.example.reservationownerservice.owner.repository;


import com.example.reservationownerservice.owner.domain.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OwnerRepository
        extends JpaRepository<Owner, UUID> {


    Owner findByEmail(String email);
}
