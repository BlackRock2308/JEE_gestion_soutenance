package sn.ept.gestion_soutenance.entities;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.gestion_soutenance.entities.Personne;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-03-10T00:04:53", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Memoire.class)
public class Memoire_ { 

    public static volatile SingularAttribute<Memoire, byte[]> pdf;
    public static volatile SingularAttribute<Memoire, Long> id;
    public static volatile SingularAttribute<Memoire, String> langue;
    public static volatile SingularAttribute<Memoire, String> sujet;
    public static volatile SingularAttribute<Memoire, Date> dateSoutenance;
    public static volatile SingularAttribute<Memoire, Personne> etudiant;
    public static volatile SingularAttribute<Memoire, String> lieu;

}