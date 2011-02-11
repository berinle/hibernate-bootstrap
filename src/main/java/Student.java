import javax.persistence.*;
import java.util.Set;

@Entity @Table(name="STUDENT")
public class Student {
    @Id
    private Long id;
    private String name;

    @ManyToMany
    @JoinTable(name="STUDENT_COURSES",
            joinColumns = @JoinColumn(name="STUDENT_ID"),
            inverseJoinColumns = @JoinColumn(name="COURSE_ID")
    )
    private Set<Course> courses;

    @ManyToMany
    @JoinTable(name="INSTITUTION",
            joinColumns = @JoinColumn(name="STUDENT_ID"),
            inverseJoinColumns = {@JoinColumn(name="INSTITUTION_ID"), @JoinColumn(name="STUDENT_ID")}
    )
    private Set<Institution> institutions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public Set<Institution> getInstitutions() {
        return institutions;
    }

    public void setInstitutions(Set<Institution> institutions) {
        this.institutions = institutions;
    }
}
