package com.intiFormation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intiFormation.model.Role;
import com.intiFormation.service.IroleService;

@RestController
@RequestMapping("/api")
public class RoleController {

	@Autowired
	private IroleService rService;
	
	@GetMapping("/roles")
	public List<Role> getAll()
	{
		List<Role> liste=rService.getAll();
		return liste;
	}
	
	@GetMapping("/roles/{id}")
	public Role chercherparId(@PathVariable("id") int id)
	{
		Role r=rService.getById(id);
		
		return r;
	}
	
	@PostMapping("/roles")
	public void ajouter(@RequestBody Role r)
	{
		rService.ajouter(r);
	}
	
	@DeleteMapping("/roles/{id}")
	public void supprimer(@PathVariable("id") int id)
	{
		Role r=rService.getById(id);
		rService.supprRole(id);
	}
	
	@PutMapping("/roles")
	public void modifier(@RequestBody Role r)
	{
		rService.ajouter(r);
	}
}
