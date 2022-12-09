package com.intiFormation.service;

import java.util.List;

import com.intiFormation.model.Commentaire;

public interface IcommentaireService {

	public void ajouter(Commentaire com);
	public Commentaire getById(int id);
	public List<Commentaire> getAll();
	public void modifCom(Commentaire com);
	public void supprCom(int id);
	public List<Commentaire> afficherlescom( int id);
}
