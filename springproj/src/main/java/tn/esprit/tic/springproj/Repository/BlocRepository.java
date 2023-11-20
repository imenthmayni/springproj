package tn.esprit.tic.springproj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.springproj.dao.Bloc;
import  tn.esprit.tic.springproj.dao.Etudiant;
import tn.esprit.tic.springproj.dao.Universit;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
    Bloc findByNomBloc(String nomBloc);
    Bloc findBynomBloc( String nomBloc);

}
