package sn.ept.gestion_soutenance.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.gestion_soutenance.entities.Institut;
import sn.ept.gestion_soutenance.entities.Memoire;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-03-10T16:10:57", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Evaluateur.class)
public class Evaluateur_ { 

    public static volatile SingularAttribute<Evaluateur, String> role;
    public static volatile SingularAttribute<Evaluateur, String> titre;
    public static volatile SingularAttribute<Evaluateur, Memoire> memoire;
    public static volatile SingularAttribute<Evaluateur, String> fonction;
    public static volatile SingularAttribute<Evaluateur, Institut> institut;

}