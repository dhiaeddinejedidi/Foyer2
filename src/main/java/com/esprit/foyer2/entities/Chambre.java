package com.esprit.foyer2.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;

    private long numChambre;

    private TypeChambre TypeC;

    @ManyToOne
    private Bloc bloc ;

    @OneToMany
    private List<Reservation> reservations ;
}
