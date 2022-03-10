package sn.ept.gestion_soutenance.services.motcle;

import sn.ept.gestion_soutenance.entities.MotCle;

import java.util.List;

public class MotCleServiceImpl implements IMotCleService{

    private IMotCleService motCleService;

    public MotCleServiceImpl() {
        motCleService = new MotCleServiceImpl();
    }

    @Override
    public List<MotCle> listMotCle() {
        return motCleService.listMotCle();
    }

    @Override
    public void addMotCle(MotCle motCle) {
        motCleService.addMotCle(motCle);
    }

    @Override
    public void removeMotCle(Long Id) {
        motCleService.removeMotCle(Id);
    }

    @Override
    public MotCle findOne(Long id) {
        return motCleService.findOne(id);
    }
}
