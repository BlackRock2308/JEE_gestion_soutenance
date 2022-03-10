package sn.ept.gestion_soutenance.services.elementcompetence;

import sn.ept.gestion_soutenance.dao.element_comptence.ElementComptenceDaoImpl;
import sn.ept.gestion_soutenance.dao.element_comptence.IElementCompetenceDAO;
import sn.ept.gestion_soutenance.entities.ElementCompetence;

import java.util.List;

public class ElementCompetenceServiceImpl implements IElementCompetenceService{

    private IElementCompetenceDAO elementCompetenceDAO = new ElementComptenceDaoImpl();

    public IElementCompetenceDAO getElementCompetenceDAO() {
        return elementCompetenceDAO;
    }

    @Override
    public List<ElementCompetence> listElementCompetences() {
        return elementCompetenceDAO.listElementCompetences();
    }

    @Override
    public void addElementCompetence(ElementCompetence elementCompetence) {
        elementCompetenceDAO.save(elementCompetence);
    }

    @Override
    public void removeElementCompetence(Long Id) {
        elementCompetenceDAO.remove(Id);
    }

    @Override
    public ElementCompetence findOne(Long id) {
        return elementCompetenceDAO.findOne(id);
    }
}
