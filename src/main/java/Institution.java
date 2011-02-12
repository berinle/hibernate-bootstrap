import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

//some legacy database somewhere with some weird mapping
@Entity @Table(name="INSTITUTION")
public class Institution {

    @EmbeddedId
    private InstitutionId institutionId;

//    @Transient //@ManyToMany(mappedBy = "institutions")
//    private Set<Student> students;

    @ManyToOne @JoinColumn(name="STUDENT_ID", insertable = false, updatable = false)
    private Student student;

    public InstitutionId getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(InstitutionId institutionId) {
        this.institutionId = institutionId;
    }

/*    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }*/
}

@Embeddable
class InstitutionId implements Serializable {

    @Column(name="INSTITUTION_ID")
    private String institutionId;
    @Column(name="STUDENT_ID")
    private String studentId;

    public String getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
