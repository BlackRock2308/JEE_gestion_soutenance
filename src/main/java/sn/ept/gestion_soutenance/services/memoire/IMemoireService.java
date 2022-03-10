package sn.ept.gestion_soutenance.services.memoire;

import sn.ept.gestion_soutenance.entities.Memoire;

import java.util.List;

public interface IMemoireService {

    public List<Memoire> listMemoires();

    public void addMemoire(Memoire memoire);

    public void removeMemoire(Long Id);

    public Memoire findOne(Long id);
}
