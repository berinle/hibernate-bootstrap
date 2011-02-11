package domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * User: berinle
 * Date: 2/11/11
 * Time: 4:25 PM
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.IdClass(domain.InstitutionEntityPK.class)
@javax.persistence.Table(name = "INSTITUTION", schema = "PUBLIC")
@Entity
public class InstitutionEntity {
    private String institutionId;

    @javax.persistence.Column(name = "INSTITUTION_ID")
    @Id
    public String getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
    }

    private String studentId;

    @javax.persistence.Column(name = "STUDENT_ID")
    @Id
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InstitutionEntity that = (InstitutionEntity) o;

        if (institutionId != null ? !institutionId.equals(that.institutionId) : that.institutionId != null)
            return false;
        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = institutionId != null ? institutionId.hashCode() : 0;
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        return result;
    }
}
