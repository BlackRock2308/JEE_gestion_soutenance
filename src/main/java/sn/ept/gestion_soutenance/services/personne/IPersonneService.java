package sn.ept.gestion_soutenance.services.personne;

import sn.ept.gestion_soutenance.entities.Personne;

import java.util.List;

public interface IPersonneService {

    public List<Personne> listPersonnes();

    public Personne addPersonne(Personne personne);

    public void removePersonne(Integer Id);

    public Personne findOne(Integer id);
}
