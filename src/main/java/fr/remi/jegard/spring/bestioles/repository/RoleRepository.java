package fr.remi.jegard.spring.bestioles.repository;

import fr.remi.jegard.spring.bestioles.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
