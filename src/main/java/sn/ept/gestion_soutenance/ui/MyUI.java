package sn.ept.gestion_soutenance.ui;

import sn.ept.gestion_soutenance.config.DbConfig;
import sn.ept.gestion_soutenance.entities.Personne;
import sn.ept.gestion_soutenance.services.personne.IPersonneService;
import sn.ept.gestion_soutenance.services.personne.PersonneServiceImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class MyUI {

    private static IPersonneService personneService = new PersonneServiceImpl();

    public static void main(String[] args) {

        EntityManager em = DbConfig.getInstance().getEm();


        Personne p1 = new Personne("BALDE", "Aissatou", "baissatou@ept.sn");

        Personne p2 = new Personne("Amar","Diallo","PA U15","dmamadouamar@ept.sn","amar@gmail.com");



        EntityTransaction tx = em.getTransaction();
        tx.begin();

        personneService.addPersonne(p1);
        personneService.addPersonne(p2);

        //System.out.println(personneService.findOne((2)));

        List<Personne> personneList = personneService.listPersonnes();
        for (Personne p : personneList)
            System.out.println("Found Personne: " + p);

        tx.commit();
        em.close();

    }
}
