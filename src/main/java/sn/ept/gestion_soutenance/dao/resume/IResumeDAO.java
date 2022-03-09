package sn.ept.gestion_soutenance.dao.resume;

import sn.ept.gestion_soutenance.entities.Institut;
import sn.ept.gestion_soutenance.entities.Personne;
import sn.ept.gestion_soutenance.entities.Resume;

import java.util.List;

public interface IResumeDAO {


    public List<Resume> listResumes();

    public Resume save(Resume resume);

    public Resume findOne(Long Id);

    public void remove(Long Id);

    public void update(Long Id);
}
