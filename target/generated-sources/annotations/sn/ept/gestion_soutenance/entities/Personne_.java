package sn.ept.gestion_soutenance.entities;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.gestion_soutenance.entities.Memoire;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-03-10T16:10:54", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Personne.class)
public class Personne_ { 

    public static volatile SingularAttribute<Personne, String> lieuNaissance;
    public static volatile SingularAttribute<Personne, String> emailPerso;
    public static volatile SingularAttribute<Personne, Date> dateNaissance;
    public static volatile SingularAttribute<Personne, Memoire> memoire;
    public static volatile SingularAttribute<Personne, Integer> id;
    public static volatile SingularAttribute<Personne, String> emailPro;
    public static volatile SingularAttribute<Personne, String> nom;
    public static volatile SingularAttribute<Personne, String> prenom;
    public static volatile SingularAttribute<Personne, Date> dateEnregistrement;

}