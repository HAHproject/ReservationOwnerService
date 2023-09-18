package com.example.reservationownerservice.owner.domain.entity;


import jakarta.persistence.*;
import lombok.*;


import java.util.UUID;

@Table(name="Owners")
@Entity
@Setter
@AllArgsConstructor @NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder @Getter
public class Owner {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID ownerId;
    private String userName;
    private String email;

    @Enumerated(EnumType.STRING)
    private Status status;

}
