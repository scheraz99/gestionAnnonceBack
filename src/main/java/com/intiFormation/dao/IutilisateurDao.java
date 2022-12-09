package com.intiFormation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiFormation.model.Utilisateur;

public interface IutilisateurDao extends JpaRepository<Utilisateur, Integer> {

	public List<Utilisateur> findByNom(String nom);
	public List<Utilisateur> findByPrenom(String prenom);
	public Utilisateur findByUsername(String username);
}
