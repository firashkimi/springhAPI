package tn.firas.springsecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.firas.springsecurity.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

}