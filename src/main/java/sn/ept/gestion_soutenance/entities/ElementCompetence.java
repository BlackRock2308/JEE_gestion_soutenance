package sn.ept.gestion_soutenance.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@NamedQueries({
        @NamedQuery(name = "ElementCompetence.findAll", query = "SELECT e FROM ElementCompetence e")
})
@Entity
public class ElementCompetence implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;

    @Column(length = 45)
    private String nom;

    private Double coeficient;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getCoeficient() {
        return coeficient;
    }

    public void setCoeficient(Double coeficient) {
        this.coeficient = coeficient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ElementCompetence)) return false;
        ElementCompetence that = (ElementCompetence) o;
        return id.equals(that.id) && nom.equals(that.nom) && coeficient.equals(that.coeficient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, coeficient);
    }
}