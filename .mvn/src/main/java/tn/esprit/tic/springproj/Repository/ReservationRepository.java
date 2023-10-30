package tn.esprit.tic.springproj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import  tn.esprit.tic.springproj.dao.Chambre;
import tn.esprit.tic.springproj.dao.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
