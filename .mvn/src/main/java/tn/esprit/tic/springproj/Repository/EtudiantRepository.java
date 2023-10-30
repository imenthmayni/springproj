package tn.esprit.tic.springproj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import  tn.esprit.tic.springproj.dao.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
