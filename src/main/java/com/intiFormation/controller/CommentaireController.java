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

import com.intiFormation.model.Commentaire;
import com.intiFormation.service.IcommentaireService;

@RestController
@RequestMapping("/api")
public class CommentaireController {

	
	@Autowired
	private IcommentaireService comService;
	
	@GetMapping("/commentaires")
	public List<Commentaire> getAll()
	{
		List<Commentaire> liste=comService.getAll();
		return liste;
	}
	
	@GetMapping("/commentaires/{id}")
	public Commentaire chercherparId(@PathVariable("id") int id)
	{
		Commentaire com=comService.getById(id);
		
		return com;
	}
	
	@GetMapping("/commentairesByannonce/{id_annonce}")
	public List<Commentaire> afficherCommentairesAnnonce(@PathVariable("id_annonce") int id)
	{
		List<Commentaire> liste=comService.afficherlescom(id);
		
		return liste;
	}
	
	@PostMapping("/commentaires")
	public void ajouter(@RequestBody Commentaire com)
	{
		comService.ajouter(com);
	}
	
	@DeleteMapping("/commentaires/{id}")
	public void supprimer(@PathVariable("id") int id)
	{
		Commentaire com=comService.getById(id);
		comService.supprCom(id);
	}
	
	@PutMapping("/commentaires")
	public void modifier(@RequestBody Commentaire com)
	{
		comService.ajouter(com);
	}
}
