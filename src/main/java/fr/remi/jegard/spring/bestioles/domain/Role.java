package fr.remi.jegard.spring.bestioles.domain;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "label")
    private String label;

    @ManyToMany(mappedBy = "roles") // Correction : "roles" est l’attribut de Person
    private List<Person> persons; // Correction du nom de la variable

    public Role() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Person> getPersons() { // Correction du getter
        return persons;
    }

    public void setPersons(List<Person> persons) { // Correction du setter
        this.persons = persons;
    }
}
