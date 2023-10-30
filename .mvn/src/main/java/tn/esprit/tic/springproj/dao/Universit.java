package tn.esprit.tic.springproj.dao;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Universit {
    @Id
    private long idUniversite;
    private String nomUniversite;
    private String adresse;


    public Universit(Foyer foyer) {
        this.foyer = foyer;
    }

    public Universit(long idUniversite, String nomUniversite, String adresse, Foyer foyer) {
        this.idUniversite = idUniversite;
        this.nomUniversite = nomUniversite;
        this.adresse = adresse;
        this.foyer = foyer;
    }

    public Universit() {

    }

    public long getIdUniversite() {
        return idUniversite;
    }

    public void setIdUniversite(long idUniversite) {
        this.idUniversite = idUniversite;
    }

    public String getNomUniversite() {
        return nomUniversite;
    }

    public void setNomUniversite(String nomUniversite) {
        this.nomUniversite = nomUniversite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @OneToOne(mappedBy = "universit") // Correct the mappedBy attribute
    private Foyer foyer;
}
