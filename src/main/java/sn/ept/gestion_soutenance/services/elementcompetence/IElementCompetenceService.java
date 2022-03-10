package sn.ept.gestion_soutenance.services.elementcompetence;

import sn.ept.gestion_soutenance.entities.ElementCompetence;
import sn.ept.gestion_soutenance.entities.Evaluateur;

import java.util.List;

public interface IElementCompetenceService {

    public List<ElementCompetence> listElementCompetences();

    public void addElementCompetence(ElementCompetence elementCompetence);

    public void removeElementCompetence(Long Id);

    public ElementCompetence findOne(Long id);
}
