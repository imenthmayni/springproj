package tn.esprit.tic.springproj.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import  tn.esprit.tic.springproj.dao.Chambre;
import tn.esprit.tic.springproj.dao.Etudiant;
import tn.esprit.tic.springproj.service.IEtudiantService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {
    IEtudiantService iEtudiantService;

    @GetMapping("/allEtudiant")
    public List<Etudiant> getBloc() {
        List<Etudiant> listEtudiant = iEtudiantService.retrieveAllEtudiants();
        return listEtudiant;
    }

    @GetMapping("/Etudiant/{id}")
    public Etudiant retrieveEtudiant(@PathVariable("id") Long id) {
        return iEtudiantService.retrieveEtudiant(id);
    }

    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = iEtudiantService.addEtudiant(e);
        return etudiant;
    }

    @DeleteMapping("/RemoveEtudiant/{id}")
    public void removeEtudiant(@PathVariable("id") Long id) {
        iEtudiantService.removeEtudiant(id);
    }

    @PutMapping("/UpdateEtudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant= iEtudiantService.updateEtudiant(e);
        return etudiant;
    }
    @PutMapping("/affecter/{nomEt}/{prenomEt}/{idReservation}")
    public void affecterEtudiantAReservation(@PathVariable("nomEt")String nomEt,@PathVariable("prenomEt")String prenomEt,@PathVariable("idReservation")String idReservation){
        Etudiant etudiant=iEtudiantService.affecterEtudiantAReservation(nomEt,prenomEt,idReservation);

    }
}
