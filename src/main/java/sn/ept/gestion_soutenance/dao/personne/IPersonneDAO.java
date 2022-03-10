package sn.ept.gestion_soutenance.dao.personne;

import sn.ept.gestion_soutenance.entities.Personne;

import java.util.List;

public interface IPersonneDAO {

    public List<Personne> listPersonnes();

    public Personne save(Personne personne);

    public Personne findOne(Integer Id);

    public void remove(Integer Id);

    public void update(Integer Id);



}
