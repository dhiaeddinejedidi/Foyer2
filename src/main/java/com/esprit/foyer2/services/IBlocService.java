package com.esprit.foyer2.services;

import com.esprit.foyer2.entities.Bloc;

import java.util.List;

public interface IBlocService {

    Bloc addBloc(Bloc bloc);

    Bloc updateBloc(Bloc bloc);

    void deleteBloc(long id);

    Bloc getBlocById(long id);

    List<Bloc> allBlocs();
}
