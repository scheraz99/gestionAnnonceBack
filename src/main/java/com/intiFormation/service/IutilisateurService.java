package com.intiFormation.service;

import java.util.List;

import com.intiFormation.model.Utilisateur;

public interface IutilisateurService {

	
	public void ajouter(Utilisateur u);
	public Utilisateur getById(int id);
	public List<Utilisateur> getAll();
	public void modifUtil(Utilisateur u);
	public void supprUtil(int id);
	public List<Utilisateur> chercherParNom(String nom);
	public List<Utilisateur> chercherParPrenom(String prenom);
	public Utilisateur chercherParUsername(String username);
}
