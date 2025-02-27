package fr.remi.jegard.spring.bestioles;

import fr.remi.jegard.spring.bestioles.domain.Person;
import fr.remi.jegard.spring.bestioles.domain.Role;
import fr.remi.jegard.spring.bestioles.repository.PersonRepository;
import fr.remi.jegard.spring.bestioles.repository.RoleRepository;
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
    private PersonRepository personRepository; // Correction de la convention de nommage

    @Autowired
    private RoleRepository roleRepository; // Ajout du repository pour Role

    @Override
    public void run(String... args) throws Exception {
        long countBefore = personRepository.count();
        System.out.println("🔢 Nombre total de personnes AVANT suppression : " + countBefore);

        // 🔹 Suppression d'une personne (exemple avec ID = 1)
        Integer personIdToDelete = 1;
        if (personRepository.existsById(personIdToDelete)) {
            personRepository.deleteById(personIdToDelete);
            System.out.println("🗑️ Personne avec ID " + personIdToDelete + " supprimée !");
        } else {
            System.out.println("❌ Aucune personne trouvée avec l'ID " + personIdToDelete);
        }

        // 🔹 Affichage du nombre total de personnes APRÈS suppression
        long countAfter = personRepository.count();
        System.out.println("🔢 Nombre total de personnes APRÈS suppression : " + countAfter);
    }
}
