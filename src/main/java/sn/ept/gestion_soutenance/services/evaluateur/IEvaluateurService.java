package sn.ept.gestion_soutenance.services.evaluateur;

import sn.ept.gestion_soutenance.entities.Evaluateur;
import sn.ept.gestion_soutenance.entities.Evaluation;

import java.util.List;

public interface IEvaluateurService {

    public List<Evaluateur> listEvaluateurs();

    public void addEvaluateur(Evaluateur evaluateur);

    public void removeEvaluateur(Long Id);

    public Evaluateur findOne(Long id);
}

