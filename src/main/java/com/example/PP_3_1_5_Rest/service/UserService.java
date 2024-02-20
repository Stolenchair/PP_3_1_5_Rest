package com.example.PP_3_1_5_Rest.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.example.PP_3_1_5_Rest.models.User;


import java.util.List;

public interface UserService extends UserDetailsService {

    void addUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    User findByUsername(String username);

}
