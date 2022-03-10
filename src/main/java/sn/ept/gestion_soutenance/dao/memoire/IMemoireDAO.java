package sn.ept.gestion_soutenance.dao.memoire;

import sn.ept.gestion_soutenance.entities.Evaluation;
import sn.ept.gestion_soutenance.entities.Memoire;

import java.util.List;

public interface IMemoireDAO {

    public List<Memoire> listMemoires();

    public Memoire save(Memoire memoire);

    public Memoire findOne(Long Id);

    public void remove(Long Id);
}
