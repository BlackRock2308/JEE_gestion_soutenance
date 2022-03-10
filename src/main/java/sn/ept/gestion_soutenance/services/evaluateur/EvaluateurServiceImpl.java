package sn.ept.gestion_soutenance.services.evaluateur;

import sn.ept.gestion_soutenance.dao.evaluateur.EvaluateurDaoImpl;
import sn.ept.gestion_soutenance.dao.evaluateur.IEvaluateurDAO;
import sn.ept.gestion_soutenance.entities.Evaluateur;

import java.util.List;

public class EvaluateurServiceImpl implements IEvaluateurService{

    private IEvaluateurDAO evaluateurDAO = new EvaluateurDaoImpl();

    public IEvaluateurDAO getEvaluateurDAO() {
        return evaluateurDAO;
    }

    @Override
    public List<Evaluateur> listEvaluateurs() {
        return evaluateurDAO.listEvaluateurs();
    }

    @Override
    public void addEvaluateur(Evaluateur evaluateur) {
        evaluateurDAO.save(evaluateur);
    }

    @Override
    public void removeEvaluateur(Long Id) {
        evaluateurDAO.remove(Id);
    }

    @Override
    public Evaluateur findOne(Long id) {
        return null;
    }
}
