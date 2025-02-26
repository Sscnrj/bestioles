package fr.remi.jegard.spring.bestioles.repository;
import fr.remi.jegard.spring.bestioles.domain.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}