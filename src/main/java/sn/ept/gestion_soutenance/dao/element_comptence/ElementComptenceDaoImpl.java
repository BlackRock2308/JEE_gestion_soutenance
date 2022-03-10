package sn.ept.gestion_soutenance.dao.element_comptence;

import sn.ept.gestion_soutenance.config.DbConfig;
import sn.ept.gestion_soutenance.entities.ElementCompetence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class ElementComptenceDaoImpl implements IElementCompetenceDAO{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<ElementCompetence> listElementCompetences() {
        EntityManager em = DbConfig.getInstance().getEm();

        Query q = em.createNamedQuery("ElementCompetence.findAll");
        return q.getResultList();
    }

    @Override
    public ElementCompetence save(ElementCompetence elementCompetence) {
        em.persist(elementCompetence);

        return elementCompetence;
    }

    @Override
    public void remove(long id) {
        ElementCompetence e = em.find(ElementCompetence.class,id);
        em.remove(e);

    }
}
