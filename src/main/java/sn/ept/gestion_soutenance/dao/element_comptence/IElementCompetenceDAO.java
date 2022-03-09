package sn.ept.gestion_soutenance.dao.element_comptence;

import sn.ept.gestion_soutenance.entities.ElementCompetence;

import java.util.List;

public interface IElementCompetenceDAO {

    public List<ElementCompetence> listElementCompetences();

    public ElementCompetence save(ElementCompetence elementCompetence);
}
