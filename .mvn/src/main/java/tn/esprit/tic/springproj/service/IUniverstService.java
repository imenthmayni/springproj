package tn.esprit.tic.springproj.service;

import  tn.esprit.tic.springproj.dao.Universit;

import java.util.List;

public interface IUniverstService {
    List<Universit> retrieveAllUniversits();

    Universit addUniversit(Universit u);

    Universit updateUniversit(Universit u);

    Universit retrieveUniversit(Long idUniversit);

    Universit removeUniversit(Long idUniversit);

}
