package com.esprit.foyer2.services;

import com.esprit.foyer2.entities.Bloc;
import com.esprit.foyer2.repositories.BlocRepository;

import java.util.List;

public class BlocServiceImpl implements IBlocService   {
  BlocRepository bl ;

    @Override
    public Bloc addBloc(Bloc bloc) {
        return bl.save(bloc);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return bl.save(bloc);
    }

    @Override
    public void deleteBloc(long id) {
   bl.deleteById(id);
    }

    @Override
    public Bloc getBlocById(long id) {
        return bl.findById(id).get();
    }

    @Override
    public List<Bloc> allBlocs() {
        return bl.findAll();
    }




}
