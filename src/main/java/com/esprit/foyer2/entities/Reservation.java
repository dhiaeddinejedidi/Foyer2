package com.esprit.foyer2.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String idReservation ;
    private Date anneeUniversitaire ;
    private Boolean estValide;
     @ManyToMany
    private List<Etudiant> etudiants;

}
