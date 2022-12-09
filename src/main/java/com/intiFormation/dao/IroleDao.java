package com.intiFormation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiFormation.model.Role;

public interface IroleDao extends JpaRepository<Role, Integer> {

}
