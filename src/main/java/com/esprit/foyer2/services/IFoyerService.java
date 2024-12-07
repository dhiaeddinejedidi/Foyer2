package com.esprit.foyer2.services;

import com.esprit.foyer2.entities.Foyer;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);

    Foyer updateFoyer(Foyer foyer);

    void deleteFoyer(Long id);

    Foyer getFoyerById(Long id);

}
