package sn.ept.gestion_soutenance.services.motcle;

import sn.ept.gestion_soutenance.entities.MotCle;

import java.util.List;

public interface IMotCleService {

    public List<MotCle> listMotCle();

    public void addMotCle(MotCle motCle);

    public void removeMotCle(Long Id);

    public MotCle findOne(Long id);
}
