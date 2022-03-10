package sn.ept.gestion_soutenance.dao.mot_cle;

import sn.ept.gestion_soutenance.config.DbConfig;
import sn.ept.gestion_soutenance.entities.MotCle;
import sn.ept.gestion_soutenance.entities.Personne;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class MotCleDaoImpl implements IMotCleDAO{

    @PersistenceContext
    private EntityManager em = DbConfig.getInstance().getEm();

    @Override
    public List<MotCle> listMotCles() {
        Query q = em.createNamedQuery("MotCle.findAll");
        return q.getResultList();
    }

    @Override
    public MotCle save(MotCle motCle) {
        em.persist(motCle);

        return motCle;
    }

    @Override
    public MotCle findOne(Long Id) {
        MotCle motCle =  em.find(MotCle.class,Id);

        return motCle;
    }

    @Override
    public void remove(Long Id) {
        MotCle m =em.find(MotCle.class,Id);
        em.remove(m);

    }
}
