package tn.esprit.tic.springproj.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.springproj.dao.Bloc;
import tn.esprit.tic.springproj.dao.Universit;
import  tn.esprit.tic.springproj.service.BlocService;
import  tn.esprit.tic.springproj.service.IBlocService;
import tn.esprit.tic.springproj.service.IUniverstService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocController {
    IBlocService iBlocService;
    BlocService blocService;

    @GetMapping("/allBloc")
    public List<Bloc> getBloc() {
        List<Bloc> listBlocs = iBlocService.retrieveAllBlocs();
        return listBlocs;
    }

    @GetMapping("/Bloc/{id}")
    public Bloc retrievebloc(@PathVariable("id") Long id) {
        return iBlocService.retrieveBloc(id);
    }

    @PostMapping("/addBloc")
    public Bloc addEtudiant(@RequestBody Bloc b) {
        Bloc bloc = iBlocService.addBloc(b);
        return bloc;
    }

    @DeleteMapping("/RemoveBloc/{id}")
    public void removeBloc(@PathVariable("id") Long id) {
        iBlocService.removeBloc(id);
    }

    @PutMapping("/UpdateBloc")
    public Bloc updateBloc(@RequestBody Bloc e) {
        Bloc bloc= iBlocService.updateBloc(e);
        return bloc;
    }
    @PutMapping("/affecter/{nomUniversite}/{idFoyer}")
    @ResponseBody
    public Universit affecterFoyerAUniversite(@PathVariable("nomUniversite") String nomUniversite, @PathVariable("idFoyer") Long idFoyer){
        Universit universite= IUniverstService.affecterFoyerAUniversite(idFoyer,nomUniversite);
        return universite;
    }
    @PutMapping("/affecter/{nomBloc}")
    @ResponseBody
    public Bloc affecterChambreABloc(@RequestBody List<Long>numeroChambre,@PathVariable("nomBloc") String nomBloc ) {
        Bloc bloc = iBlocService.affecterChambreABloc(numeroChambre,nomBloc);
        return bloc;
    }

    @PutMapping("/desaffecter/{numeroChambre}")
    @ResponseBody
    public Bloc desaffecterChambreDeBloc(@PathVariable("numeroChambre") List<Long> numeroChambre) {
        Bloc bloc = iBlocService.desaffecterChambreDeBloc(numeroChambre);
        return bloc;
    }

}
