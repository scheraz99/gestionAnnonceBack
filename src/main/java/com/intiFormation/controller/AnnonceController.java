package com.intiFormation.controller;

import java.sql.Date;
import java.util.List;

import javax.websocket.server.PathParam;

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

import com.intiFormation.model.Annonce;
import com.intiFormation.service.IannonceService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class AnnonceController {

	@Autowired
	private IannonceService aService;
	
	@GetMapping("/annonces")
	public List<Annonce> getAll()
	{
		List<Annonce> liste=aService.getAll();
		return liste;
	}
	
	@GetMapping("/annonces/{id}")
	public Annonce chercherparId(@PathVariable("id") int id)
	{
		Annonce a=aService.getById(id);
		
		return a;
	}
	
	@GetMapping("/annoncesBytitre/{titre}")
	public List<Annonce> getParTitre(@PathVariable("titre") String titre)
	{
		List<Annonce> liste=aService.chercherParTitre(titre);
		return liste;
	}
	
	@GetMapping("/annoncesBydate/{datepubli}")
	public List<Annonce> getParTitre(@PathVariable("datepubli") Date datepubli)
	{
		List<Annonce> liste=aService.chercherParDatePubli(datepubli);
		return liste;
	}
	
	@PostMapping("/annonces")
	public void ajouter(@RequestBody Annonce a)
	{
		aService.ajouter(a);
	}
	
	@DeleteMapping("/annonces/{id}")
	public void supprimer(@PathVariable("id") int id)
	{
		Annonce a=aService.getById(id);
		aService.supprAnnonce(id);
	}
	
	@PutMapping("/annonces")
	public void modifier(@RequestBody Annonce a)
	{
		aService.ajouter(a);
	}
	
	@GetMapping("/annoncesrecherche/{recherche}")
	public List<Annonce> getParmotcle(@PathVariable("recherche") String recherche)
	{
		List<Annonce> liste=aService.chercherTitreqlcq(recherche);
		return liste;
	}
}
