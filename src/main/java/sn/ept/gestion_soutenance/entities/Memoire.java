package sn.ept.gestion_soutenance.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

@Entity
@NamedQueries({
        @NamedQuery(name = "Memoire.findAll", query = "SELECT m FROM Memoire m")
})
public class Memoire implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 45)
    private String sujet;

    private String langue;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateSoutenance;

    private String lieu;

    @Lob
    private byte[] pdf;


    @OneToOne
    @JoinColumn(name = "ID_ETUDIANT",nullable = false)
    private Personne etudiant;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public Date getDateSoutenance() {
        return dateSoutenance;
    }

    public void setDateSoutenance(Date dateSoutenance) {
        this.dateSoutenance = dateSoutenance;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public byte[] getPdf() {
        return pdf;
    }

    public void setPdf(byte[] pdf) {
        this.pdf = pdf;
    }

    public Personne getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Personne etudiant) {
        this.etudiant = etudiant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Memoire memoire = (Memoire) o;
        return id.equals(memoire.id) && sujet.equals(memoire.sujet) && langue.equals(memoire.langue) && dateSoutenance.equals(memoire.dateSoutenance) && lieu.equals(memoire.lieu) && Arrays.equals(pdf, memoire.pdf) && etudiant.equals(memoire.etudiant);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, sujet, langue, dateSoutenance, lieu, etudiant);
        result = 31 * result + Arrays.hashCode(pdf);
        return result;
    }

    @Override
    public String toString() {
        return "Memoire{" +
                "sujet='" + sujet + '\'' +
                ", langue='" + langue + '\'' +
                ", dateSoutenance=" + dateSoutenance +
                ", lieu='" + lieu + '\'' +
                ", etudiant=" + etudiant +
                '}';
    }
}
