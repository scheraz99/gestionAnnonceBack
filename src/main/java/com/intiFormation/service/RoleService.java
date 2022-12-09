package com.intiFormation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.IroleDao;

import com.intiFormation.model.Role;

@Service
public class RoleService implements IroleService {

	@Autowired
	private IroleDao rDao;
	
	public void ajouter(Role r)
	{
		rDao.save(r);
	}
	
	public Role getById(int id)
	{
		Role r=rDao.findById(id).get();
		return r;
	}
	
	public List<Role> getAll()
	{
		List<Role> roles=rDao.findAll();
		return roles;
	}
	
	public void modifRole(Role r)
	{
		rDao.save(r);
	}
	
	public void supprRole(int id)
	{
		rDao.deleteById(id);
	}
	
}
