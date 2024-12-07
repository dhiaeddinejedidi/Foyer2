package com.esprit.foyer2.repositories;

import com.esprit.foyer2.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {


    //KEYWORDS
    Integer countByReservations_EstValideFalseAndReservations_AnneeUniversitaireBefore(Date anneeUniversitaire);
    //JPQL
    @Query("SELECT COUNT(c) FROM Chambre c JOIN c.reservations r WHERE r.estValide = false AND r.anneeUniversitaire < :anneeUniversitaire")
    Integer countChambresReservationsNonValides(@Param("anneeUniversitaire") Date anneeUniversitaire);

}
