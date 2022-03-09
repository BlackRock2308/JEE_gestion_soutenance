package sn.ept.gestion_soutenance.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EvaluationPk implements Serializable {

    private Long idMemoire;

    private Long idEvaluateur;

    private Short idElementCompetence;

    public Long getIdMemoire() {
        return idMemoire;
    }

    public void setIdMemoire(Long idMemoire) {
        this.idMemoire = idMemoire;
    }

    public Long getIdEvaluateur() {
        return idEvaluateur;
    }

    public void setIdEvaluateur(Long idEvaluateur) {
        this.idEvaluateur = idEvaluateur;
    }

    public Short getIdElementCompetence() {
        return idElementCompetence;
    }

    public void setIdElementCompetence(Short idElementCompetence) {
        this.idElementCompetence = idElementCompetence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EvaluationPk)) return false;
        EvaluationPk that = (EvaluationPk) o;
        return idMemoire.equals(that.idMemoire) && idEvaluateur.equals(that.idEvaluateur) && idElementCompetence.equals(that.idElementCompetence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMemoire, idEvaluateur, idElementCompetence);
    }
}
