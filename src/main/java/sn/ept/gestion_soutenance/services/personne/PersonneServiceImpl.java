package sn.ept.gestion_soutenance.services.personne;

import sn.ept.gestion_soutenance.dao.personne.IPersonneDAO;
import sn.ept.gestion_soutenance.dao.personne.PersonneDaoImpl;
import sn.ept.gestion_soutenance.entities.Personne;

import java.util.List;

public class PersonneServiceImpl implements IPersonneService{

    private IPersonneDAO personneDAO;

    public PersonneServiceImpl() {
        personneDAO = new PersonneDaoImpl();
    }

    @Override
    public List<Personne> listPersonnes() {
        List<Personne> personnes = personneDAO.listPersonnes();
        return personnes;
    }

    @Override
    public void addPersonne(Personne personne) {

        personneDAO.save(personne);
    }

    @Override
    public void removePersonne(Long Id) {
        personneDAO.remove(Id);
    }

    @Override
    public Personne findOne(Long id) {
        return personneDAO.findOne(id);
    }
}
