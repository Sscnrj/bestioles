package fr.remi.jegard.spring.bestioles.repository;

import fr.remi.jegard.spring.bestioles.domain.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpeciesRepository extends JpaRepository<Species, Integer> {
    List<Species> findFirstByCommonName(String commonName);
    List<Species> findByLatinNameContainsIgnoreCase(String latinName);
}
