import javax.persistence.*;
import java.util.Set;

@Entity @Table(name="COURSE")
public class Course {
    @Id
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
