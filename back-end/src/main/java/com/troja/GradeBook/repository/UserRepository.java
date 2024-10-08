package com.troja.GradeBook.repository;

import com.troja.GradeBook.entity.Role;
import com.troja.GradeBook.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findById(Long id);
    List<User> findByRole(Role role);
    boolean existsById(Long id);
    boolean existsByEmail(String email);
}
