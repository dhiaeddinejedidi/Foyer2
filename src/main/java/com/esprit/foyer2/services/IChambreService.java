package com.esprit.foyer2.services;

import com.esprit.foyer2.entities.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre);

    Chambre updateChambre(Chambre chambre);

    void deleteChambre(Long id);
    Chambre getChambre(Long id);
    List<Chambre> allChambres();

}
