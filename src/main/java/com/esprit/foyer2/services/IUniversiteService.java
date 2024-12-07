package com.esprit.foyer2.services;

import com.esprit.foyer2.entities.Universite;

import java.util.List;

public interface IUniversiteService {

    Universite addUniversite(Universite universite);

    Universite updateUniversite(Universite universite);

    void deleteUniversite(Long id);

    Universite getUniversiteById(Long id);

    List<Universite> allUniversites();
}
