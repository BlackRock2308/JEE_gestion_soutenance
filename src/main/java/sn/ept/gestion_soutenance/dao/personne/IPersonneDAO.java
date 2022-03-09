package sn.ept.gestion_soutenance.dao.personne;

import sn.ept.gestion_soutenance.entities.Personne;

import java.util.List;

public interface IPersonneDAO {

    public List<Personne> listPersonnes();

    public Personne save(Personne personne);

    public Personne findOne(Long Id);

    public void remove(Long Id);

    public void update(Long Id);



}
