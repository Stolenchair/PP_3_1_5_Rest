package com.example.PP_3_1_5_Rest.service;

import com.example.PP_3_1_5_Rest.models.Role;

import java.util.List;

public interface RoleService {
    void addRole(Role role);

    List<Role> getAllRoles();
}
