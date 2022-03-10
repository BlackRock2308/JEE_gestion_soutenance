package sn.ept.gestion_soutenance.dao.mot_cle;

import sn.ept.gestion_soutenance.entities.Institut;
import sn.ept.gestion_soutenance.entities.MotCle;

import java.util.List;

public interface IMotCleDAO {

    public List<MotCle> listMotCles();

    public MotCle save(MotCle motCle);

    public MotCle findOne(Long Id);

    public void remove(Long Id);
}
