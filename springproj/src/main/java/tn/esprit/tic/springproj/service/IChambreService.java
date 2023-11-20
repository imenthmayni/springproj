package tn.esprit.tic.springproj.service;

import tn.esprit.tic.springproj.dao.Bloc;
import  tn.esprit.tic.springproj.dao.Chambre;
import  tn.esprit.tic.springproj.dao.Etudiant;
import tn.esprit.tic.springproj.dao.TypeChambre;

import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllChambres();

    Chambre addChambre(Chambre c);

    Chambre updateChambre(Chambre c);

    Chambre retrieveChambre(Long idChambre);

    void removeChambre(Long idChambre);

    long nbChambreParTypeEtBloc(TypeChambre typeChambre, Long idBloc);
}
