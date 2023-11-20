package tn.esprit.tic.springproj.service;

import  tn.esprit.tic.springproj.dao.Bloc;
import tn.esprit.tic.springproj.dao.Etudiant;

import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveAllBlocs();

    Bloc addBloc(Bloc b);

    Bloc updateBloc(Bloc b);

    Bloc retrieveBloc(Long idBloc);

    void removeBloc(Long idBloc);
    Bloc affecterChambreABloc(List<Long> numeroChambre, String nomBloc);

    Bloc desaffecterChambreDeBloc(List<Long> numeroChambre);

}
