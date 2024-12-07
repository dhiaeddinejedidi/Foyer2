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

public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;

    @ManyToOne
    private Foyer foyer ;
    @OneToMany(mappedBy = "bloc")
    private List<Chambre> chambres;


}
