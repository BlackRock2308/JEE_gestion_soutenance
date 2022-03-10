package sn.ept.gestion_soutenance.services.memoire;

import sn.ept.gestion_soutenance.dao.memoire.IMemoireDAO;
import sn.ept.gestion_soutenance.dao.memoire.MemoireDaoImpl;
import sn.ept.gestion_soutenance.entities.Memoire;

import java.util.List;

public class MemoireService implements IMemoireService{

    private IMemoireDAO memoireDAO = new MemoireDaoImpl();

    public IMemoireDAO getMemoireDAO() {
        return memoireDAO;
    }

    @Override
    public List<Memoire> listMemoires() {
        List<Memoire> memoires = memoireDAO.listMemoires();
        return memoires;
    }

    @Override
    public void addMemoire(Memoire memoire) {
        memoireDAO.save(memoire);
    }

    @Override
    public void removeMemoire(Long Id) {
        memoireDAO.remove(Id);
    }

    @Override
    public Memoire findOne(Long id) {
        return memoireDAO.findOne(id);
    }
}
