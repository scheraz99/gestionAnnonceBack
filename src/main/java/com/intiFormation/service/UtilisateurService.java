package com.intiFormation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.IutilisateurDao;
import com.intiFormation.model.Categorie;
import com.intiFormation.model.Utilisateur;

@Service
public class UtilisateurService implements IutilisateurService{

	@Autowired
	private IutilisateurDao uDao;
	
	public void ajouter(Utilisateur u)
	{
		uDao.save(u);
	}
	
	public Utilisateur getById(int id)
	{
		Utilisateur u=uDao.findById(id).get();
		return u;
	}
	
	public List<Utilisateur> getAll()
	{
		List<Utilisateur> utilisateurs=uDao.findAll();
		return utilisateurs;
	}
	
	public void modifUtil(Utilisateur u)
	{
		uDao.save(u);
	}
	
	public void supprUtil(int id)
	{
		uDao.deleteById(id);
	}
	
	public List<Utilisateur> chercherParNom(String nom)
	{
		List<Utilisateur> utilisateurs=uDao.findByNom(nom);
		return utilisateurs;
	}
	
	public List<Utilisateur> chercherParPrenom(String prenom)
	{
		List<Utilisateur> utilisateurs=uDao.findByPrenom(prenom);
		return utilisateurs;
	}
	
	public Utilisateur chercherParUsername(String username)
	{
		Utilisateur u=uDao.findByUsername(username);
		return u;
	}
}
