package sn.ept.gestion_soutenance.services.evaluation;

import sn.ept.gestion_soutenance.entities.Evaluation;

import java.util.List;

public interface IEvaluationService {

    public List<Evaluation> listEvaluations();

    public void addEvaluation(Evaluation evaluation);

    public void removeEvaluation(Long Id);

    public Evaluation findOne(Long id);
}
