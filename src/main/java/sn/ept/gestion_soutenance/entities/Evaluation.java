package sn.ept.gestion_soutenance.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
@NamedQueries({
        @NamedQuery(name = "Evaluation.findAll", query = "SELECT e FROM Evaluation e")
})
public class Evaluation implements Serializable {

    @EmbeddedId
    private EvaluationPk evaluationPk;

    @ManyToOne
    @MapsId("idEvaluateur")
    private Evaluateur evaluateur;

    @ManyToOne
    @MapsId("idMemoire")
    private Memoire memoire;

    @ManyToOne
    @MapsId("idElementCompetence")
    private ElementCompetence elementCompetence;

    private Short note;

    private String commentaire;

    public EvaluationPk getEvaluationPk() {
        return evaluationPk;
    }

    public void setEvaluationPk(EvaluationPk evaluationPk) {
        this.evaluationPk = evaluationPk;
    }

    public Evaluateur getEvaluateur() {
        return evaluateur;
    }

    public void setEvaluateur(Evaluateur evaluateur) {
        this.evaluateur = evaluateur;
    }

    public Memoire getMemoire() {
        return memoire;
    }

    public void setMemoire(Memoire memoire) {
        this.memoire = memoire;
    }

    public ElementCompetence getElementCompetence() {
        return elementCompetence;
    }

    public void setElementCompetence(ElementCompetence elementCompetence) {
        this.elementCompetence = elementCompetence;
    }

    public Short getNote() {
        return note;
    }

    public void setNote(Short note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Evaluation)) return false;
        Evaluation that = (Evaluation) o;
        return evaluationPk.equals(that.evaluationPk) && evaluateur.equals(that.evaluateur) && memoire.equals(that.memoire) && elementCompetence.equals(that.elementCompetence) && note.equals(that.note) && commentaire.equals(that.commentaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluationPk, evaluateur, memoire, elementCompetence, note, commentaire);
    }
}
