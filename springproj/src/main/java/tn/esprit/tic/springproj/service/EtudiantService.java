package tn.esprit.tic.springproj.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.Repository.ReservationRepository;
import  tn.esprit.tic.springproj.dao.Etudiant;
import  tn.esprit.tic.springproj.Repository.EtudiantRepository;
import tn.esprit.tic.springproj.dao.Reservation;

import java.util.List;

import java.util.Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Slf4j
@AllArgsConstructor
public class EtudiantService implements IEtudiantService{

    EtudiantRepository etudiantRepository;
    ReservationRepository reservationRepository;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public Etudiant affecterEtudiantAReservation(String nomEt, String prenomEt, String idReservation) {
        Reservation reservation = reservationRepository.findById(idReservation).get();
        Etudiant etudiant = etudiantRepository.findByNomEtAndPrenomEt( nomEt, prenomEt);
        ;
        Set<Reservation> Reservationmiseajour = new HashSet<>();
        if (etudiant.getReservations()!=null){
            Reservationmiseajour=etudiant.getReservations();
        }
        Reservationmiseajour.add(reservation);
        etudiant.setReservations(Reservationmiseajour);
        etudiantRepository.save(etudiant);
        return etudiant;



    }

}



