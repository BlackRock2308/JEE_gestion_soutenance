package sn.ept.gestion_soutenance.dao.evaluateur;

import sn.ept.gestion_soutenance.config.DbConfig;
import sn.ept.gestion_soutenance.entities.Evaluateur;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class EvaluateurDaoImpl implements IEvaluateurDAO{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Evaluateur> listEvaluateurs() {
        EntityManager em = DbConfig.getInstance().getEm();

        Query q = em.createNamedQuery("Evaluateur.findAll");
        return q.getResultList();
    }

    @Override
    public Evaluateur save(Evaluateur evaluateur) {
        return null;
    }
}
