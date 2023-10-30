package tn.esprit.tic.springproj.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.dao.Universit;
import  tn.esprit.tic.springproj.Repository.UniversitRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class UniversitService implements IUniverstService{
    UniversitRepository universitRepository;
    @Override
    public List<Universit> retrieveAllUniversits() {
        return universitRepository.findAll();
    }

    @Override
    public Universit addUniversit(Universit u) {
        return universitRepository.save(u);
    }

    @Override
    public Universit updateUniversit(Universit u) {
        return universitRepository.save(u);
    }

    @Override
    public Universit retrieveUniversit(Long idUniversit) {
        return universitRepository.findById(idUniversit).get();
    }

    @Override
    public Universit removeUniversit(Long idUniversit) {
    universitRepository.deleteById(idUniversit);
        return null;
    }
}
