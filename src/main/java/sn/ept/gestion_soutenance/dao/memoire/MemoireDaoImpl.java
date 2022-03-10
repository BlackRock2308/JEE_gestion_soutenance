package sn.ept.gestion_soutenance.dao.memoire;

import sn.ept.gestion_soutenance.config.DbConfig;
import sn.ept.gestion_soutenance.entities.Memoire;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class MemoireDaoImpl implements IMemoireDAO {

    @PersistenceContext
    private EntityManager em = DbConfig.getInstance().getEm();

    @Override
    public List<Memoire> listMemoires() {

        Query q = em.createNamedQuery("Memoire.findAll");
        return q.getResultList();
    }

    @Override
    public Memoire save(Memoire memoire) {
        em.persist(memoire);

        return memoire;
    }

    @Override
    public Memoire findOne(Long Id) {
        Memoire response = (Memoire) em.find(Memoire.class,Id);

        return response;
    }

    @Override
    public void remove(Long Id) {

        Memoire m =em.find(Memoire.class,Id);
        em.remove(m);

    }

}
