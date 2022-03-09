package sn.ept.gestion_soutenance.dao.institut;

import sn.ept.gestion_soutenance.entities.Evaluation;
import sn.ept.gestion_soutenance.entities.Institut;

import java.util.List;

public interface IInstitutDAO {

    public List<Institut> listInstituts();

    public Institut save(Institut institut);
}
