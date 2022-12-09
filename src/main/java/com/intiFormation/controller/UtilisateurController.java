package com.intiFormation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intiFormation.model.Utilisateur;
import com.intiFormation.service.IutilisateurService;

@RestController
@RequestMapping("/api")
public class UtilisateurController {

	@Autowired
	private IutilisateurService userService;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@GetMapping("/utilisateurs")
	public List<Utilisateur> getAll()
	{
		List<Utilisateur> liste=userService.getAll();
		return liste;
	}
	
	@GetMapping("/utilisateurs/{id}")
	public Utilisateur chercherparId(@PathVariable("id") int id)
	{
		Utilisateur u=userService.getById(id);
		
		return u;
	}
	
	@GetMapping("/utilisateursBynom/{nom}")
	public List<Utilisateur> chercherparNom(@PathVariable("nom") String nom)
	{
		List<Utilisateur> liste=userService.chercherParNom(nom);
		
		return liste;
	}
	
	@GetMapping("/utilisateursByprenom/{prenom}")
	public List<Utilisateur> chercherparPrenom(@PathVariable("prenom") String prenom)
	{
		List<Utilisateur> liste=userService.chercherParPrenom(prenom);
		
		return liste;
	}
	
	@GetMapping("/utilisateursByusername/{username}")
	public Utilisateur chercherparUSername(@PathVariable("username") String username)
	{
		Utilisateur u=userService.chercherParUsername(username);
		
		return u;
	}
	
	@PostMapping("/utilisateurs")
	public void ajouter(@RequestBody Utilisateur u)
	{
		
		userService.ajouter(u);
	}
	
	@DeleteMapping("/utilisateurs/{id}")
	public void supprimer(@PathVariable("id") int id)
	{
		Utilisateur u=userService.getById(id);
		userService.supprUtil(id);
	}
	
	@PutMapping("/utilisateurs")
	public void modifier(@RequestBody Utilisateur u)
	{
		userService.ajouter(u);
	}
}
