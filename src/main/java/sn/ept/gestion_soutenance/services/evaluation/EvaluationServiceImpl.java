package sn.ept.gestion_soutenance.services.evaluation;

import sn.ept.gestion_soutenance.dao.evaluation.EvaluationDaoImpl;
import sn.ept.gestion_soutenance.dao.evaluation.IEvaluationDAO;
import sn.ept.gestion_soutenance.entities.Evaluation;

import java.util.List;

public class EvaluationServiceImpl implements IEvaluationService{

    private IEvaluationDAO evaluationDAO;

    public EvaluationServiceImpl(){
        evaluationDAO = new EvaluationDaoImpl();
    }
    @Override
    public List<Evaluation> listEvaluations() {
        return evaluationDAO.listEvaluations();
    }

    @Override
    public void addEvaluation(Evaluation evaluation) {
        evaluationDAO.save(evaluation);
    }

    @Override
    public void removeEvaluation(Long Id) {
        evaluationDAO.remove(Id);
    }

    @Override
    public Evaluation findOne(Long id) {
        return evaluationDAO.findOne(id);
    }
}
