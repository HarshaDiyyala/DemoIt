package project;

import jakarta.persistence.*;
@Entity
@Table(name = "ITStudent_details")
public class project {

    @Id
    @Column(name = "student_id")
    private int id;

    @Column(name = "student_name")
    private String name;

    // Default constructor
    public project() {
    }

    // Parameterized constructor
    public project(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}
