package com.esprit.foyer2.repositories;

import com.esprit.foyer2.entities.Reservation;
import com.esprit.foyer2.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}
