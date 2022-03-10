package sn.ept.gestion_soutenance.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
@NamedQueries({
        @NamedQuery(name = "Resume.findAll", query = "SELECT r FROM Resume r")
})
public class Resume implements Serializable {

    @EmbeddedId
    private ResumePk resumePK;

    @Column(length = 5000)
    private String resume;

    @ManyToOne
    @MapsId("idMemoire")
    private Memoire memoire;

    public ResumePk getResumePK() {
        return resumePK;
    }

    public void setResumePK(ResumePk resumePK) {
        this.resumePK = resumePK;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
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
        Resume resume1 = (Resume) o;
        return resumePK.equals(resume1.resumePK) && resume.equals(resume1.resume) && memoire.equals(resume1.memoire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resumePK, resume, memoire);
    }


}