package com.example.web.service;

import com.example.web.model.Role;
import com.example.web.repositories.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class RoleServiceImp implements RoleService {

    private final RoleRepository roleRepository;


    @Override
    public Set<Role> getAllRoles() {
        List<Role> list = roleRepository.findAll();
        return new HashSet<>(list);
    }
}