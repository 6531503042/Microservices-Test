package dev.bengi.userservice.repository;

import dev.bengi.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query("SELECT u FROM users u WHERE u.username = ?1")
    User findByUsername(String username);

    @Query("SELECT u FROM users u WHERE u.email = ?1")
    User findByEmail(String email);
}
