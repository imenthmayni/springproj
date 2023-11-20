package tn.esprit.tic.springproj.service;

import  tn.esprit.tic.springproj.dao.Foyer;

import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyers();

    Foyer addFoyer(Foyer f);

    Foyer updateFoyer(Foyer f);

    Foyer retrieveFoyer(Long idFoyer);

    void removeFoyer(Long idFoyer);
}
