package com.esprit.foyer2.repositories;


import com.esprit.foyer2.entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoyerRepository extends JpaRepository<Foyer, Long> {
}
