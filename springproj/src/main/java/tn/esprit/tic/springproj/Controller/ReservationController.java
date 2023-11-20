package tn.esprit.tic.springproj.Controller;

import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import  tn.esprit.tic.springproj.dao.Reservation;
import  tn.esprit.tic.springproj.service.IReservationService;

import java.util.List;

import java.util.Date;


@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {
    IReservationService iReservationService;

    @GetMapping("/allReservation")
    public List<Reservation> getReservation() {
        List<Reservation> listReservation = iReservationService.retrieveAllReservations();
        return listReservation;
    }

    @GetMapping("/Reservation/{id}")
    public Reservation retrieveReservation(@PathVariable("id") String id) {
        return iReservationService.retrieveReservation(id);
    }

    @PostMapping("/addReservation")
    public Reservation addFoyer(@RequestBody Reservation r) {
        Reservation reservation = iReservationService.addReservation(r);
        return reservation;
    }

    @DeleteMapping("/RemoveReservation/{id}")
    public void removeReservation(@PathVariable("id") String id) {
        iReservationService.removeReservation(id);
    }

    @PutMapping("/UpdateReservation")
    public Reservation updateFoyer(@RequestBody Reservation f) {
        Reservation reservation= iReservationService.updateReservation(f);
        return reservation;
    }
    @GetMapping("/getReservationParAnneeUniversitaire/{dateDebut}/{dateFin}")
    public List<Reservation> getReservationParAnneeUniversitaire(@PathVariable  @DateTimeFormat(pattern="yyyy-MM-dd") Date dateDebut, @PathVariable  @DateTimeFormat(pattern="yyyy-MM-dd") Date dateFin) {
        List<Reservation> reservation = iReservationService.getReservationParAnneeUniversitaire(dateDebut, dateFin);
        return reservation;
    }

}
