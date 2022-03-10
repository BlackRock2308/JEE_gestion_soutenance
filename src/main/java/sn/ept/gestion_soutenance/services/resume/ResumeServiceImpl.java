package sn.ept.gestion_soutenance.services.resume;

import sn.ept.gestion_soutenance.dao.resume.IResumeDAO;
import sn.ept.gestion_soutenance.dao.resume.ResumeDaoImpl;
import sn.ept.gestion_soutenance.entities.Resume;

import java.util.List;

public class ResumeServiceImpl implements IResumeService{

    private IResumeDAO resumeDAO = new ResumeDaoImpl();

    public IResumeDAO getResumeDAO() {
        return resumeDAO;
    }

    @Override
    public List<Resume> listResumes() {
        List<Resume> resumes = resumeDAO.listResumes();
        return resumes;
    }

    @Override
    public void addResume(Resume resume) {

        resumeDAO.save(resume);
    }

    @Override
    public void removeResume(Long Id) {
        resumeDAO.remove(Id);
    }

    @Override
    public Resume findOne(Long id) {
        return resumeDAO.findOne(id);
    }
}
