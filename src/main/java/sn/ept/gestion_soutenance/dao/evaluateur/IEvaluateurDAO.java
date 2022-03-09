package sn.ept.gestion_soutenance.dao.evaluateur;

import sn.ept.gestion_soutenance.entities.Evaluateur;
import sn.ept.gestion_soutenance.entities.Evaluation;

import java.util.List;

public interface IEvaluateurDAO {

    public List<Evaluateur> listEvaluateurs();

    public Evaluateur save(Evaluateur evaluateur);
}
