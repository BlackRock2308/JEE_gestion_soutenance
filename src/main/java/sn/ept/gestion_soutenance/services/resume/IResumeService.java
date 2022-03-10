package sn.ept.gestion_soutenance.services.resume;

import sn.ept.gestion_soutenance.entities.Resume;

import java.util.List;

public interface IResumeService {

    public List<Resume> listResumes();

    public void addResume(Resume resume);

    public void removeResume(Long Id);

    public Resume findOne(Long id);
}
