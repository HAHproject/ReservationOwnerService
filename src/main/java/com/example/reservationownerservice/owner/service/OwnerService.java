package com.example.reservationownerservice.owner.service;


import com.example.reservationownerservice.owner.domain.entity.Owner;
import com.example.reservationownerservice.owner.domain.request.OwnerRequest;
import com.example.reservationownerservice.owner.domain.response.OwnerResponse;
import com.example.reservationownerservice.owner.repository.OwnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OwnerService {
    private final OwnerRepository ownerRepository;
    public void save(OwnerRequest ownerRequest){
        ownerRepository.save(ownerRequest.toEntity());
    }
    public OwnerResponse getById(UUID id){
        Optional<Owner> byId = ownerRepository.findById(id);
        return new OwnerResponse(byId.get().getOwnerId(),byId.get().getEmail(), byId.get().getStatus());
    }

}
