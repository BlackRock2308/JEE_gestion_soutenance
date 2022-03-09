package sn.ept.gestion_soutenance.dao.resume;

import sn.ept.gestion_soutenance.config.DbConfig;
import sn.ept.gestion_soutenance.entities.Personne;
import sn.ept.gestion_soutenance.entities.Resume;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class ResumeDaoImpl implements IResumeDAO{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Resume> listResumes() {
        EntityManager em = DbConfig.getInstance().getEm();

        Query q = em.createNamedQuery("Resume.findAll");
        return q.getResultList();
    }

    @Override
    public Resume save(Resume Resume) {
        em.persist(Resume);

        return Resume;
    }

    @Override
    public Resume findOne(Long Id) {
        Resume response = (Resume) em.find(Resume.class,Id);

        return response;
    }

    @Override
    public void remove(Long Id) {

        em.remove(Id);

    }

    @Override
    public void update(Long Id) {

    }
}
