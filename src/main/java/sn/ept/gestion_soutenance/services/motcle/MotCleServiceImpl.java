package sn.ept.gestion_soutenance.services.motcle;

import sn.ept.gestion_soutenance.dao.mot_cle.IMotCleDAO;
import sn.ept.gestion_soutenance.dao.mot_cle.MotCleDaoImpl;
import sn.ept.gestion_soutenance.entities.MotCle;

import java.util.List;

public class MotCleServiceImpl implements IMotCleService{

    private IMotCleDAO motCleDAO = new MotCleDaoImpl();

    public IMotCleDAO getMotCleDAO() {
        return motCleDAO;
    }

    @Override
    public List<MotCle> listMotCle() {
        return motCleDAO.listMotCles();
    }

    @Override
    public void addMotCle(MotCle motCle) {
        motCleDAO.save(motCle);
    }

    @Override
    public void removeMotCle(Long Id) {
        motCleDAO.remove(Id);
    }

    @Override
    public MotCle findOne(Long id) {
        return motCleDAO.findOne(id);}
}
