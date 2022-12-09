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

import com.intiFormation.model.Message;

import com.intiFormation.service.ImessageService;

@RestController
@RequestMapping("/api")
public class MessageController {

	
	@Autowired
	private ImessageService mService;
	
	@GetMapping("/messages")
	public List<Message> getAll()
	{
		List<Message> liste=mService.getAll();
		return liste;
	}
	
	@GetMapping("/messages/{id}")
	public Message chercherparId(@PathVariable("id") int id)
	{
		Message m=mService.getById(id);
		
		return m;
	}
	
	@GetMapping("/messagesByobjet/{objet}")
	public List<Message> chercherparObjet(@PathVariable("objet") String objet)
	{
		List<Message> liste=mService.chercherParObjet(objet);
		
		return liste;
	}
	
	@PostMapping("/messages")
	public void ajouter(@RequestBody Message m)
	{
		mService.ajouter(m);
	}
	
	@DeleteMapping("/messages/{id}")
	public void supprimer(@PathVariable("id") int id)
	{
		Message m=mService.getById(id);
		mService.supprMsg(id);
	}
	
	@PutMapping("/messages")
	public void modifier(@RequestBody Message m)
	{
		mService.ajouter(m);
	}
}
