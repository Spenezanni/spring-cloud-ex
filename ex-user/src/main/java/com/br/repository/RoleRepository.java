package com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.domain.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
