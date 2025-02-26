package fr.remi.jegard.spring.bestioles.repository;

import fr.remi.jegard.spring.bestioles.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
