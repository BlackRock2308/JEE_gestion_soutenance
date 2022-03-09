package sn.ept.gestion_soutenance.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MotClePk implements Serializable {

    private String mot;

    private ResumePk resumePK;

    public String getMot() {
        return mot;
    }

    public void setMot(String mot) {
        this.mot = mot;
    }

    public ResumePk getResumePK() {
        return resumePK;
    }

    public void setResumePK(ResumePk resumePK) {
        this.resumePK = resumePK;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MotClePk motClePk = (MotClePk) o;
        return mot.equals(motClePk.mot) && resumePK.equals(motClePk.resumePK);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mot, resumePK);
    }
}