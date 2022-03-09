package sn.ept.gestion_soutenance.dao.evaluation;

import sn.ept.gestion_soutenance.config.DbConfig;
import sn.ept.gestion_soutenance.entities.Evaluation;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class EvaluationDaoImpl implements IEvaluationDAO{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Evaluation> listEvaluations() {

        EntityManager em = DbConfig.getInstance().getEm();

        Query q = em.createNamedQuery("Evaluation.findAll");
        return q.getResultList();
    }

    @Override
    public Evaluation save(Evaluation evaluation) {
        em.persist(evaluation);

        return evaluation;
    }
}