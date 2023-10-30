package tn.esprit.tic.springproj.dao;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private long idEtudiant;
    @Column(name="nom")
    private String nomEt;
    @Column(name="prenom")
    private String prenomEt;
    private long cin ;
    private String ecole;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    public Etudiant() {
    }

    public Etudiant(long idEtudiant, String nomEt, String prenomEt, long cin, String ecole, Date dateNaissance) {
        this.idEtudiant = idEtudiant;
        this.nomEt = nomEt;
        this.prenomEt = prenomEt;
        this.cin = cin;
        this.ecole = ecole;
        this.dateNaissance = dateNaissance;
    }

    public long getIdEtudiant() {
        return idEtudiant;
    }

    public String getNomEt() {
        return nomEt;
    }

    public String getPrenomEt() {
        return prenomEt;
    }

    public long getCin() {
        return cin;
    }

    public String getEcole() {
        return ecole;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setIdEtudiant(long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public void setNomEt(String nomEt) {
        this.nomEt = nomEt;
    }

    public void setPrenomEt(String prenomEt) {
        this.prenomEt = prenomEt;
    }

    public void setCin(long cin) {
        this.cin = cin;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
}
