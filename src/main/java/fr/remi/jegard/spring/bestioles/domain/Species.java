package fr.remi.jegard.spring.bestioles.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "species")
public class Species {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "common_name")
    private String commonName;

    @Column(name = "latin_name")
    private String latinName;

    public Species() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    @Override
    public String toString() {
        return "Species{" +
                "id=" + id +
                ", commonName='" + commonName + '\'' +
                ", latinName='" + latinName + '\'' +
                '}';
    }
}
