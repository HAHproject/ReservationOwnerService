package com.example.reservationownerservice.owner.domain.entity;


import com.example.reservationownerservice.owner.domain.Status;
import jakarta.persistence.*;
import jakarta.ws.rs.DefaultValue;
import lombok.*;


import java.util.UUID;

@Table(name="Owners")
@Entity

@AllArgsConstructor @NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder @Getter
public class Owner {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID ownerId;
    private String userName;
    private String email;
    private Role role;

    private String status;
}
