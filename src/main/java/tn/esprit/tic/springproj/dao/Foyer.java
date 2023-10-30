package tn.esprit.tic.springproj.dao;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Foyer {
    @Id
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;


    public Foyer() {
    }

    public Foyer (long idFoyer, String nomFoyer, long capaciteFoyer) {
        this.idFoyer = idFoyer;
        this.nomFoyer = nomFoyer;
        this.capaciteFoyer = capaciteFoyer;

    }

    public long getIdFoyer() {
        return idFoyer;
    }

    public String getNomFoyer() {
        return nomFoyer;
    }

    public long getCapaciteFoyer() {
        return capaciteFoyer;
    }

    public void setIdFoyer(long idFoyer) {
        this.idFoyer = idFoyer;
    }

    public void setNomFoyer(String nomFoyer) {
        this.nomFoyer = nomFoyer;
    }

    public void setCapaciteFoyer(long capaciteFoyer) {
        this.capaciteFoyer = capaciteFoyer;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
    private Set<Bloc> blocs;
    @OneToOne
    private Universit universit;
}
