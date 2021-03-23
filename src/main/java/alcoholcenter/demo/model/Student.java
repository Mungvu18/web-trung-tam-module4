package alcoholcenter.demo.model;

import org.springframework.security.core.userdetails.User;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double tuition;// học phí
    @ManyToOne
    private Status status;
    @OneToOne
    private UserApp userApp;
    @ManyToOne
    private Classes classes;
    @OneToMany
    private List<Diary> diary;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTuition() {
        return tuition;
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public UserApp getUserApp() {
        return userApp;
    }

    public void setUserApp(UserApp userApp) {
        this.userApp = userApp;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public List<Diary> getDiary() {
        return diary;
    }

    public void setDiary(List<Diary> diary) {
        this.diary = diary;
    }
}
