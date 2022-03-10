package sn.ept.gestion_soutenance.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.gestion_soutenance.entities.MotClePk;
import sn.ept.gestion_soutenance.entities.Resume;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-03-10T15:43:22", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(MotCle.class)
public class MotCle_ { 

    public static volatile SingularAttribute<MotCle, Resume> resume;
    public static volatile SingularAttribute<MotCle, Integer> numero;
    public static volatile SingularAttribute<MotCle, MotClePk> motClePK;

}