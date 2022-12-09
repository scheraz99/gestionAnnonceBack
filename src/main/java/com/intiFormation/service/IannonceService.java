package com.intiFormation.service;

import java.util.Date;
import java.util.List;

import com.intiFormation.model.Annonce;

public interface IannonceService {

	
	public void ajouter(Annonce a);
	public Annonce getById(int id);
	public List<Annonce> getAll();
	public void modifAnnonce(Annonce a);
	public void supprAnnonce(int id);
	public List<Annonce> chercherParTitre(String titre);
	public List<Annonce> chercherParDatePubli(Date datepubli);
	public List<Annonce> chercherTitreqlcq(String recherche);
	
}
