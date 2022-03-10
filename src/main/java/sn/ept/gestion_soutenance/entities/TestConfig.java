package sn.ept.gestion_soutenance.entities;

import sn.ept.gestion_soutenance.config.DbConfig;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TestConfig {

    public static void main(String[] args) {

        EntityManager em = DbConfig.getInstance().getEm();
        
        
        System.out.println("Adding a new Personne");

        Personne p1 = new Personne("BALDE", "Aissatou", "baissatou@ept.sn");

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        em.persist(p1);

        tx.commit();
        em.close();
 
 
    }
}
