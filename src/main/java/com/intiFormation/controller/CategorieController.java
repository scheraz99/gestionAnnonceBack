package com.intiFormation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.intiFormation.model.Categorie;
import com.intiFormation.service.IcategorieService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class CategorieController {

	
	@Autowired
	private IcategorieService catService;
	
	@GetMapping("/categories")
	public List<Categorie> getAll()
	{
		List<Categorie> liste=catService.getAll();
		return liste;
	}
	
	@GetMapping("/categories/{id}")
	public Categorie chercherparId(@PathVariable("id") int id)
	{
		Categorie cat=catService.getById(id);
		
		return cat;
	}
	
	@GetMapping("/categoriesBynom/{nomcat}")
	public Categorie chercherparNom(@PathVariable("nomcat") String nomcat)
	{
		Categorie cat=catService.chercherParNom(nomcat);
		return cat;
	}
	
	@PostMapping("/categories")
	public void ajouter(@RequestBody Categorie cat)
	{
		catService.ajouter(cat);
	}
	
	@DeleteMapping("/categories/{id}")
	public void supprimer(@PathVariable("id") int id)
	{
		Categorie cat=catService.getById(id);
		catService.supprCat(id);
	}
	
	@PutMapping("/categories")
	public void modifier(@RequestBody Categorie cat)
	{
		catService.ajouter(cat);
	}
	
	@GetMapping("/categoriesrecherche/{recherche}")
	public List<Categorie> rechercheCategorie(@PathVariable("recherche") String recherche)
	{
		List<Categorie> categories=catService.chercherCategorie(recherche);
		return categories;
		
	}
}
