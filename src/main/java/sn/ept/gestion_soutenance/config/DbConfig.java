package sn.ept.gestion_soutenance.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class DbConfig {

    private static DbConfig instance;

    private final EntityManager em;

    public EntityManager getEm() {
        return em;
    }



    private DbConfig() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionsoutenancePU2");
        em = emf.createEntityManager();
    }

    public static DbConfig getInstance() {

        if(instance == null){
            instance = new DbConfig();
        }
        return instance;
    }
}
