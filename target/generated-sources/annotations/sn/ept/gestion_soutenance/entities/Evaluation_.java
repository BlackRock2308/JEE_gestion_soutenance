package sn.ept.gestion_soutenance.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.gestion_soutenance.entities.ElementCompetence;
import sn.ept.gestion_soutenance.entities.Evaluateur;
import sn.ept.gestion_soutenance.entities.EvaluationPk;
import sn.ept.gestion_soutenance.entities.Memoire;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-03-10T10:18:02", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Evaluation.class)
public class Evaluation_ { 

    public static volatile SingularAttribute<Evaluation, EvaluationPk> evaluationPk;
    public static volatile SingularAttribute<Evaluation, Short> note;
    public static volatile SingularAttribute<Evaluation, ElementCompetence> elementCompetence;
    public static volatile SingularAttribute<Evaluation, Memoire> memoire;
    public static volatile SingularAttribute<Evaluation, Evaluateur> evaluateur;
    public static volatile SingularAttribute<Evaluation, String> commentaire;

}