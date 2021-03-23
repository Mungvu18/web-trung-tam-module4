package alcoholcenter.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double score_lab;// điểm thực hành
    private double score_theory;// điểm lý thuyết
    private double score_attitude;// điểm thái độ
    @ManyToOne
    private Student student;
    @ManyToOne
    private Subjects subjects;


    public Score() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore_lab() {
        return score_lab;
    }

    public void setScore_lab(double score_lab) {
        this.score_lab = score_lab;
    }

    public double getScore_theory() {
        return score_theory;
    }

    public void setScore_theory(double score_theory) {
        this.score_theory = score_theory;
    }

    public double getScore_attitude() {
        return score_attitude;
    }

    public void setScore_attitude(double score_attitude) {
        this.score_attitude = score_attitude;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }
}
