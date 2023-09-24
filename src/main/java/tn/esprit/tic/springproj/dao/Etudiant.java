package tn.esprit.tic.springproj.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
 @Entity
public class Etudiant {
     @Id
     private long idEtudiant;
    private String nomET;
    private String prenomET;
    private long cin;
    private String ecole;
    private LocalDate dateNaissance;

    public long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getNomET() {
        return nomET;
    }

    public void setNomET(String nomET) {
        this.nomET = nomET;
    }

    public String getPrenomET() {
        return prenomET;
    }

    public void setPrenomET(String prenomET) {
        this.prenomET = prenomET;
    }

    public long getCin() {
        return cin;
    }

    public void setCin(long cin) {
        this.cin = cin;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
