package sn.ept.gestion_soutenance.entities;

import sn.ept.gestion_soutenance.config.DbConfig;
import sn.ept.gestion_soutenance.services.personne.IPersonneService;
import sn.ept.gestion_soutenance.services.personne.PersonneServiceImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TestConfig {

    private static IPersonneService personneService = new PersonneServiceImpl();


    public static void main(String[] args) {

        EntityManager em = DbConfig.getInstance().getEm();


        
        System.out.println("Adding a new Personne");

        Personne p1 = new Personne("BALDE", "Aissatou", "baissatou@ept.sn");

        Personne p2 = new Personne("Amar","Diallo","PA U15","dmamadouamar@ept.sn","amar@gmail.com");

        personneService.addPersonne(p1);
        personneService.addPersonne(p2);

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        em.persist(p1);

        tx.commit();
        em.close();
 
 
    }
}
