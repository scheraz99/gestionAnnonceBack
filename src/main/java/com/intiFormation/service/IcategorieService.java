package com.intiFormation.service;

import java.util.List;

import com.intiFormation.model.Categorie;

public interface IcategorieService {

	public void ajouter(Categorie cat);
	public Categorie getById(int id);
	public List<Categorie> getAll();
	public void modifCat(Categorie cat);
	public void supprCat(int id);
	public Categorie chercherParNom(String nomcat);
	public List<Categorie> chercherCategorie(String recherche);
}
