package sn.ept.gestion_soutenance.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@NamedQueries({
        @NamedQuery(name = "Institut.findAll", query = "SELECT e FROM Institut e")
})
public class Institut implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 45, name = "name")
    private String nom;

    @Column(length = 100)
    private String adresse;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Institut institut = (Institut) o;
        return Objects.equals(id, institut.id);
    }

    @Override
    public String toString() {
        return "Institut{" +
                "nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
