package fr.remi.jegard.spring.bestioles.repository;

import fr.remi.jegard.spring.bestioles.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    // 🔹 Trouver toutes les personnes ayant un âge donné
    List<Person> findByAge(Integer age);

    // 🔹 Trouver les personnes dont le prénom commence par une lettre donnée
    List<Person> findByFirstnameStartingWith(String prefix);

    // 🔹 Trouver les personnes actives (active = 1)
    List<Person> findByActive(Byte active);

}
