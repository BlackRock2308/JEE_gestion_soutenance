package sn.ept.gestion_soutenance.services.personne;

import sn.ept.gestion_soutenance.dao.personne.IPersonneDAO;
import sn.ept.gestion_soutenance.dao.personne.PersonneDaoImpl;
import sn.ept.gestion_soutenance.entities.Personne;

import java.util.List;

public class PersonneServiceImpl implements IPersonneService{

    private IPersonneDAO personneDAO = new PersonneDaoImpl();


    public IPersonneDAO getPersonneDAO() {
        return personneDAO;
    }

    @Override
    public List<Personne> listPersonnes() {
        List<Personne> personnes = personneDAO.listPersonnes();

        return personnes;
    }

    @Override
    public Personne addPersonne(Personne personne) {

       return personneDAO.save(personne);
    }

    @Override
    public void removePersonne(Integer Id) {
        personneDAO.remove(Id);
    }

    @Override
    public Personne findOne(Integer id) {
        return personneDAO.findOne(id);
    }
}
