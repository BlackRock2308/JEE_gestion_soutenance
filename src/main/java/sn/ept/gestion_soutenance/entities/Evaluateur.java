package sn.ept.gestion_soutenance.entities;

import javax.persistence.*;
import java.util.Objects;

@NamedQueries({
        @NamedQuery(name = "Evaluateur.findAll", query = "SELECT e FROM Evaluateur e")
})
@Entity
public class Evaluateur extends Personne {


    private String fonction;

    @Column(name = "ROLE_EVALUATEUR")
    private String role;

    private String titre;

    @ManyToOne
    private Memoire memoire;

    @ManyToOne
    private Institut institut;

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public Memoire getMemoire() {
        return memoire;
    }

    @Override
    public void setMemoire(Memoire memoire) {
        this.memoire = memoire;
    }

    public Institut getInstitut() {
        return institut;
    }

    public void setInstitut(Institut institut) {
        this.institut = institut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Evaluateur)) return false;
        if (!super.equals(o)) return false;
        Evaluateur that = (Evaluateur) o;
        return fonction.equals(that.fonction) && role.equals(that.role) && titre.equals(that.titre) && memoire.equals(that.memoire) && institut.equals(that.institut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fonction, role, titre, memoire, institut);
    }
}
