package tn.esprit.tic.springproj.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import  tn.esprit.tic.springproj.dao.Chambre;
import tn.esprit.tic.springproj.dao.Foyer;
import tn.esprit.tic.springproj.service.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerController {
    IFoyerService iFoyerService;

    @GetMapping("/allFoyer")
    public List<Foyer> getFoyer() {
        List<Foyer> listFoyer = iFoyerService.retrieveAllFoyers();
        return listFoyer;
    }

    @GetMapping("/Foyer/{id}")
    public Foyer retrieveFoyer(@PathVariable("id") Long id) {
        return iFoyerService.retrieveFoyer(id);
    }

    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        Foyer foyer = iFoyerService.addFoyer(f);
        return foyer;
    }

    @DeleteMapping("/RemoveFoyer/{id}")
    public void removeFoyer(@PathVariable("id") Long id) {
        iFoyerService.removeFoyer(id);
    }

    @PutMapping("/UpdateFoyer")
    public Foyer updateFoyer(@RequestBody Foyer f) {
        Foyer foyer= iFoyerService.updateFoyer(f);
        return foyer;
    }
}
