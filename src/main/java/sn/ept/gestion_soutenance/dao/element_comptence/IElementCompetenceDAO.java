package sn.ept.gestion_soutenance.dao.element_comptence;

import sn.ept.gestion_soutenance.entities.ElementCompetence;
import sn.ept.gestion_soutenance.entities.Evaluateur;

import java.util.List;

public interface IElementCompetenceDAO {

    public List<ElementCompetence> listElementCompetences();

    public ElementCompetence save(ElementCompetence elementCompetence);

    public void remove(long id);

    public ElementCompetence findOne(Long Id);
}
