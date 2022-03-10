package sn.ept.gestion_soutenance.dao.evaluation;

import sn.ept.gestion_soutenance.entities.Evaluation;

import java.util.List;

public interface IEvaluationDAO {

    public List<Evaluation> listEvaluations();

    public Evaluation save(Evaluation evaluation);

    public Evaluation findOne(Long Id);

    public void remove(Long Id);

}
