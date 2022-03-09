package sn.ept.gestion_soutenance.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ResumePk implements Serializable {


    private String codeLangue;

    private Long idMemoire;


    public String getCodeLangue() {
        return codeLangue;
    }

    public void setCodeLangue(String codeLangue) {
        this.codeLangue = codeLangue;
    }

    public Long getIdMemoire() {
        return idMemoire;
    }

    public void setIdMemoire(Long idMemoire) {
        this.idMemoire = idMemoire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResumePk resumePk = (ResumePk) o;
        return codeLangue.equals(resumePk.codeLangue) && idMemoire.equals(resumePk.idMemoire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeLangue, idMemoire);
    }
}
