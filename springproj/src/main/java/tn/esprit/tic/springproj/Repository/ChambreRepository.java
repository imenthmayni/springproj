package tn.esprit.tic.springproj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.springproj.dao.Bloc;
import  tn.esprit.tic.springproj.dao.Chambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    List<Chambre> findByNumChambreIn(List<Long> numeroChambre);
   Chambre findByNumeroChambre(Long  numeroChambre);

}
