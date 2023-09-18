package com.example.reservationownerservice.owner.controller;


import com.example.reservationownerservice.owner.domain.entity.Owner;
import com.example.reservationownerservice.owner.domain.request.OwnerRequest;
import com.example.reservationownerservice.owner.domain.response.OwnerResponse;
import com.example.reservationownerservice.owner.service.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/owner")
public class OwnerController {
    private final OwnerService ownerService;
    @GetMapping("/{ownerId}")
    public OwnerResponse getById(@PathVariable UUID id){
        return ownerService.getById(id);
    }
    @PostMapping("/signup")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveOwner(@RequestBody OwnerRequest request){

        ownerService.save(request);
    }
}
