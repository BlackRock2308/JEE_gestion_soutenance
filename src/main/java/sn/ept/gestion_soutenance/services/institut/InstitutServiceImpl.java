package sn.ept.gestion_soutenance.services.institut;

import sn.ept.gestion_soutenance.dao.institut.IInstitutDAO;
import sn.ept.gestion_soutenance.dao.institut.InstitutDaoImpl;
import sn.ept.gestion_soutenance.entities.Institut;

import java.util.List;

public class InstitutServiceImpl implements IInstitutService{

    private IInstitutDAO institutDAO = new InstitutDaoImpl();

    public IInstitutDAO getInstitutDAO() {
        return institutDAO;
    }

    @Override
    public List<Institut> listInstituts() {
        return institutDAO.listInstituts();
    }

    @Override
    public void addInstitut(Institut institut) {
        institutDAO.save(institut);
    }

    @Override
    public void removeInstitut(Long Id) {
        institutDAO.remove(Id);
    }

    @Override
    public Institut findOne(Long id) {
        return institutDAO.findOne(id);
    }
}
