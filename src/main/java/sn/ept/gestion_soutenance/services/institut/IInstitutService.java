package sn.ept.gestion_soutenance.services.institut;

import sn.ept.gestion_soutenance.entities.Institut;

import java.util.List;

public interface IInstitutService {

    public List<Institut> listInstituts();

    public void addInstitut(Institut institut);

    public void removeInstitut(Long Id);

    public Institut findOne(Long id);
}
