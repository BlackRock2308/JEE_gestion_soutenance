package sn.ept.gestion_soutenance.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@NamedQueries({
        @NamedQuery(name = "Personne.findAll", query = "SELECT p FROM Personne p")
})
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;

    private String prenom;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    private String lieuNaissance;

    @Column(name = "EMAIL_PROFESSIONNEL", unique = true, nullable = false)
    private String emailPro;

    @Column(name = "EMAIL_PERSONNEL", nullable = true, unique = true)
    private String emailPerso;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateEnregistrement;

    @Transient
    private Integer age;

    @OneToOne
    private Memoire memoire;

    public Personne(String nom, String prenom, String emailPro) {
        this.nom = nom;
        this.prenom = prenom;
        this.emailPro = emailPro;
    }

    public Personne(String nom,
                    String prenom,
                    String lieuNaissance,
                    String emailPro,
                    String emailPerso) {
        this.nom = nom;
        this.prenom = prenom;
        this.lieuNaissance = lieuNaissance;
        this.emailPro = emailPro;
        this.emailPerso = emailPerso;
    }

    public Personne() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getEmailPro() {
        return emailPro;
    }

    public void setEmailPro(String emailPro) {
        this.emailPro = emailPro;
    }

    public String getEmailPerso() {
        return emailPerso;
    }

    public void setEmailPerso(String emailPerso) {
        this.emailPerso = emailPerso;
    }

    public Date getDateEnregistrement() {
        return dateEnregistrement;
    }

    public void setDateEnregistrement(Date dateEnregistrement) {
        this.dateEnregistrement = dateEnregistrement;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Memoire getMemoire() {
        return memoire;
    }

    public void setMemoire(Memoire memoire) {
        this.memoire = memoire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return id.equals(personne.id) && Objects.equals(nom, personne.nom) && Objects.equals(prenom, personne.prenom) && Objects.equals(dateNaissance, personne.dateNaissance) && Objects.equals(lieuNaissance, personne.lieuNaissance) && Objects.equals(emailPro, personne.emailPro) && Objects.equals(emailPerso, personne.emailPerso) && Objects.equals(dateEnregistrement, personne.dateEnregistrement) && Objects.equals(age, personne.age) && Objects.equals(memoire, personne.memoire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, dateNaissance, lieuNaissance, emailPro, emailPerso, dateEnregistrement, age, memoire);
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", emailPro='" + emailPro + '\'' +
                '}';
    }
}
