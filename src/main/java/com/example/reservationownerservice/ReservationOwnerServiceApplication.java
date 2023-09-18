package com.example.reservationownerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ReservationOwnerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationOwnerServiceApplication.class, args);
	}

}
