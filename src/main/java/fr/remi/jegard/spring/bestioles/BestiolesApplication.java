package fr.remi.jegard.spring.bestioles;

import fr.remi.jegard.spring.bestioles.domain.Animal;
import fr.remi.jegard.spring.bestioles.domain.Person;
import fr.remi.jegard.spring.bestioles.domain.Role;
import fr.remi.jegard.spring.bestioles.domain.Species;
import fr.remi.jegard.spring.bestioles.repository.AnimalRepository;
import fr.remi.jegard.spring.bestioles.repository.PersonRepository;
import fr.remi.jegard.spring.bestioles.repository.RoleRepository;
import fr.remi.jegard.spring.bestioles.repository.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class BestiolesApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BestiolesApplication.class, args);
    }



    @Autowired
    public BestiolesApplication(PersonRepository personRepository, RoleRepository roleRepository, SpeciesRepository speciesRepository, AnimalRepository animalRepository) {
        this.personRepository = personRepository;
        this.roleRepository = roleRepository;
        this.speciesRepository = speciesRepository;
        this.animalRepository = animalRepository;
    }

    private PersonRepository personRepository; // Correction de la convention de nommage
    private RoleRepository roleRepository; // Ajout du repository pour Role
    private SpeciesRepository speciesRepository; // Ajout du repository pour Species
    private AnimalRepository animalRepository; // Ajout du repository pour Animal




    @Override
    public void run(String... args) throws Exception {

        // 🔍 Rechercher les personnes de 25 ans
        List<Person> personsByAge = personRepository.findByAge(25);
        System.out.println("🔍 Personnes de 25 ans : " + personsByAge);

        // 🔍 Rechercher les personnes dont le prénom commence par "A"
        List<Person> personsByFirstnamePrefix = personRepository.findByFirstnameStartingWith("A");
        System.out.println("🔍 Personnes dont le prénom commence par 'A' : " + personsByFirstnamePrefix);

        // 🔍 Rechercher les personnes actives (active = 1)
        List<Person> activePersons = personRepository.findByActive((byte) 1);
        System.out.println("🔍 Personnes actives : " + activePersons);

        List<Species> firstSpecies = speciesRepository.findFirstByCommonName("Chat");
        System.out.println("🔍 Species : " + firstSpecies);

        List<Species> speciesByLatinName = speciesRepository.findByLatinNameContainsIgnoreCase("lup");
        System.out.println("🔍 Species : " + speciesByLatinName);

    }
}
