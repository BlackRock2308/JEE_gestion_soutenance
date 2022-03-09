package sn.ept.gestion_soutenance.dao.institut;

import sn.ept.gestion_soutenance.config.DbConfig;
import sn.ept.gestion_soutenance.entities.Evaluation;
import sn.ept.gestion_soutenance.entities.Institut;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class InstitutDaoImpl implements IInstitutDAO{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Institut> listInstituts() {

        EntityManager em = DbConfig.getInstance().getEm();

        Query q = em.createNamedQuery("Institut.findAll");
        return q.getResultList();
    }

    @Override
    public Institut save(Institut institut) {
        em.persist(institut);

        return institut;
    }
}
