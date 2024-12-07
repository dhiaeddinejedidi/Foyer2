package com.esprit.foyer2.repositories;

import com.esprit.foyer2.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, String> {
}
