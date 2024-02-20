package com.example.PP_3_1_5_Rest.repositories;

import com.example.PP_3_1_5_Rest.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
