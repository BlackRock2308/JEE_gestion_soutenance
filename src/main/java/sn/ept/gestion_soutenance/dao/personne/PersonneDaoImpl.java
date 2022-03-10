package sn.ept.gestion_soutenance.dao.personne;

import sn.ept.gestion_soutenance.config.DbConfig;
import sn.ept.gestion_soutenance.entities.Personne;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class PersonneDaoImpl implements IPersonneDAO {

    @PersistenceContext
    private EntityManager em = DbConfig.getInstance().getEm();

    @Override
    public List<Personne> listPersonnes() {
        Query q = em.createNamedQuery("Personne.findAll");
        return (List<Personne>) q.getResultList();

    }

    @Override
    public Personne save(Personne personne) {
        em.persist(personne);

        return personne;
    }

    @Override
    public Personne findOne(Integer Id) {
        Personne response = (Personne) em.find(Personne.class,Id);

        return response;
    }

    @Override
    public void remove(Integer Id) {
        Personne p =em.find(Personne.class,Id);
        em.remove(p);
    }

    @Override
    public void update(Integer Id) {

    }
}
