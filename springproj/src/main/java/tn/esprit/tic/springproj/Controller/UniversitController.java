package tn.esprit.tic.springproj.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import  tn.esprit.tic.springproj.dao.Reservation;
import  tn.esprit.tic.springproj.dao.Universit;
import  tn.esprit.tic.springproj.service.IUniverstService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universit")
public class UniversitController {
    IUniverstService iUniverstService;

    @GetMapping("/allUniversit")
    public List<Universit> getUniversit() {
        List<Universit> listUniversit = iUniverstService.retrieveAllUniversits();
        return listUniversit;
    }

    @GetMapping("/Universit/{id}")
    public Universit retrieveUniversit(@PathVariable("id") Long id) {
        return iUniverstService.retrieveUniversit(id);
    }

    @PostMapping("/addUniversit")
    public Universit addUniversit(@RequestBody Universit u) {
        Universit universit = iUniverstService.addUniversit(u);
        return universit;
    }

    @DeleteMapping("/RemoveUniversit/{id}")
    public void removeUniversit(@PathVariable("id") Long id) {
        iUniverstService.removeUniversit(id);
    }

    @PutMapping("/UpdateUniversit")
    public Universit updateUniversit(@RequestBody Universit f) {
        Universit universit= iUniverstService.updateUniversit(f);
        return universit;
    }
    @PutMapping("/affecter/{nomUniversite}/{idFoyer}")
    @ResponseBody
    public Universit affecterFoyerAUniversite(@PathVariable("nomUniversite") String nomUniversite,@PathVariable("idFoyer") Long idFoyer){
        Universit universite= IUniverstService.affecterFoyerAUniversite(idFoyer,nomUniversite);
        return universite;
    }
    @PutMapping("/desaffecter/{idUniversite}")
    @ResponseBody
    public Universit desaffecterFoyerAUniversite(@PathVariable("idUniversite") Long idUniversite){
        Universit universite= iUniverstService.desaffecterFoyerAUniversite(idUniversite);
        return universite;
    }


}
