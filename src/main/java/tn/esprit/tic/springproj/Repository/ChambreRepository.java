package tn.esprit.tic.springproj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import  tn.esprit.tic.springproj.dao.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
