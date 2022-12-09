package com.intiFormation.service;

import java.util.List;

import com.intiFormation.model.Role;

public interface IroleService {

	public void ajouter(Role r);
	public Role getById(int id);
	public List<Role> getAll();
	public void modifRole(Role r);
	public void supprRole(int id);
}
