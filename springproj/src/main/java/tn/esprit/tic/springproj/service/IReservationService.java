package tn.esprit.tic.springproj.service;

import  tn.esprit.tic.springproj.dao.Reservation;

import java.util.Date;
import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservations();

    Reservation addReservation(Reservation r);

    Reservation updateReservation(Reservation r);

    Reservation retrieveReservation(String idReservation);

    void removeReservation(String idReservation);

    List<Reservation> getReservationParAnneeUniversitaire(Date dateDebut, Date dateFin);
}
