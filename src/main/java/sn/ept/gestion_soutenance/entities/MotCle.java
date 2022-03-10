package sn.ept.gestion_soutenance.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@NamedQueries({
        @NamedQuery(name = "MotCle.findAll", query = "SELECT e FROM MotCle e")
})
@Entity
public class MotCle implements Serializable {

    @EmbeddedId
    private MotClePk motClePK;

    @ManyToOne
    @MapsId("resumePK")
    private Resume resume;

    private Integer numero;

    public MotClePk getMotClePK() {
        return motClePK;
    }

    public void setMotClePK(MotClePk motClePK) {
        this.motClePK = motClePK;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MotCle motCle = (MotCle) o;
        return motClePK.equals(motCle.motClePK) && resume.equals(motCle.resume) && numero.equals(motCle.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(motClePK, resume, numero);
    }
}
