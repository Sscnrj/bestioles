package fr.remi.jegard.spring.bestioles.domain;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "age")
    private Integer age;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "login")
    private String login;

    @Column(name = "mdp")
    private String mdp;

    @Column(name = "active")
    private Byte active;

    @ManyToMany
    @JoinTable(
            name = "person_role",  // Nom de la table intermédiaire
            joinColumns = @JoinColumn(name = "person_id"),  // Clé étrangère vers Person
            inverseJoinColumns = @JoinColumn(name = "role_id") // Clé étrangère vers Role
    )
    private List<Role> roles; // Correction du nom de l’attribut

    @ManyToMany
    @JoinTable(
            name = "person_animals",  // Nom de la table intermédiaire (correction)
            joinColumns = @JoinColumn(name = "person_id"),  // Clé étrangère vers Person
            inverseJoinColumns = @JoinColumn(name = "animals_id")
    )
    private List<Animal> animals; // Correction du nom de l’attribut

    public Person() {
    }

    // Getters et Setters (corrections appliquées)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Byte getActive() {
        return active;
    }

    public void setActive(Byte active) {
        this.active = active;
    }

    public List<Role> getRoles() { // Correction du getter
        return roles;
    }

    public void setRoles(List<Role> roles) { // Correction du setter
        this.roles = roles;
    }

    public List<Animal> getAnimals() { // Correction du getter
        return animals;
    }

    public void setAnimals(List<Animal> animals) { // Correction du setter
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", login='" + login + '\'' +
                ", mdp='" + mdp + '\'' +
                ", active=" + active +
                '}';
    }
}
