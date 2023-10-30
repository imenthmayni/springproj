package tn.esprit.tic.springproj.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import  tn.esprit.tic.springproj.dao.Foyer;
import  tn.esprit.tic.springproj.dao.Reservation;
import  tn.esprit.tic.springproj.service.IReservationService;

import java.util.List;

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
}
