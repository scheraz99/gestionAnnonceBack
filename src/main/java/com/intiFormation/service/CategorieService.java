package com.intiFormation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.IcategorieDao;
import com.intiFormation.model.Categorie;

@Service
public class CategorieService implements IcategorieService{

	@Autowired
	private IcategorieDao catdao;
	
	public void ajouter(Categorie cat)
	{
		catdao.save(cat);
	}
	
	public Categorie getById(int id)
	{
		Categorie cat=catdao.findById(id).get();
		return cat;
	}
	
	public List<Categorie> getAll()
	{
		List<Categorie> categories=catdao.findAll();
		return categories;
	}
	
	public void modifCat(Categorie cat)
	{
		catdao.save(cat);
	}
	
	public void supprCat(int id)
	{
		catdao.deleteById(id);
	}
	
	public Categorie chercherParNom(String nomcat)
	{
		Categorie cat=catdao.findByNomcat(nomcat);
		return cat;
	}
	
	public List<Categorie> chercherCategorie(String recherche)
	{
		List<Categorie> categories=catdao.findByNomcatStartingWith(recherche);
		return categories;
	}
}
