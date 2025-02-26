package fr.remi.jegard.spring.bestioles;

import fr.remi.jegard.spring.bestioles.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BestiolesApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BestiolesApplication.class, args);
    }

    @Autowired
    PersonRepository PersonRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Toutes les entités Person : " + this.PersonRepository.findAll());
    }

}
