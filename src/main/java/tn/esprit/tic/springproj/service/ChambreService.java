package tn.esprit.tic.springproj.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import  tn.esprit.tic.springproj.dao.Chambre;
import  tn.esprit.tic.springproj.Repository.ChambreRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class ChambreService implements IChambreService{
   ChambreRepository chambreRepository;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

    @Override
    public void removeChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);
    }
}
