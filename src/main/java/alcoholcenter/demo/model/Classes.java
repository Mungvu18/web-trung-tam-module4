package alcoholcenter.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String name;
    @OneToMany
    private List<Diary> diary;
    @ManyToOne
    private Category category;

    public Classes() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Diary> getDiary() {
        return diary;
    }

    public void setDiary(List<Diary> diary) {
        this.diary = diary;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
