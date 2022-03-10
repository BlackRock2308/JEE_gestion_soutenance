package sn.ept.gestion_soutenance.dao.institut;

import sn.ept.gestion_soutenance.config.DbConfig;
import sn.ept.gestion_soutenance.entities.Institut;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class InstitutDaoImpl implements IInstitutDAO{

    @PersistenceContext
    private EntityManager em = DbConfig.getInstance().getEm();;

    @Override
    public List<Institut> listInstituts() {

        Query q = em.createNamedQuery("Institut.findAll");
        return q.getResultList();
    }

    @Override
    public Institut save(Institut institut) {
        em.persist(institut);

        return institut;
    }

    @Override
    public Institut findOne(Long Id) {
        Institut response = (Institut) em.find(Institut.class,Id);

        return response;
    }

    @Override
    public void remove(Long Id) {
        Institut e = em.find(Institut.class,Id);
        em.remove(e);
    }
}
