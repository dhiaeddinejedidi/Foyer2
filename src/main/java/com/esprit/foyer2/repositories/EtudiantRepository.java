package com.esprit.foyer2.repositories;

import com.esprit.foyer2.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {


    //keywords
    List<String> findDistinctNomEtByReservationsEstValideTrueAndReservationsAnneeUniversitaire(Date anneeUniversitaire);

    //jpql
    @Query("SELECT e.nomEt FROM Etudiant e JOIN e.reservations r WHERE r.estValide = true " +
            "AND FUNCTION('YEAR', r.anneeUniversitaire) = :currentYear")
    List<String> findNomEtudiantByReservationValideAndAnneeUniversitaire(@Param("currentYear") Date currentYear);

}
