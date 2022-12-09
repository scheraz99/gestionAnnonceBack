package com.intiFormation.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.IannonceDao;
import com.intiFormation.model.Annonce;


@Service
public class AnnonceService implements IannonceService {

	@Autowired
	private IannonceDao aDao;
	
	public void ajouter(Annonce a)
	{
		aDao.save(a);
	}
	
	public Annonce getById(int id)
	{
		Annonce a=aDao.findById(id).get();
		return a;
	}
	
	public List<Annonce> getAll()
	{
		List<Annonce> annonces=aDao.findAll();
		return annonces;
	}
	
	public void modifAnnonce(Annonce a)
	{
		aDao.save(a);
	}
	
	public void supprAnnonce(int id)
	{
		aDao.deleteById(id);
	}
	
	public List<Annonce> chercherParTitre(String titre)
	{
		List<Annonce> liste=aDao.findByTitre(titre);
		return liste;
	}
	
	public List<Annonce> chercherParDatePubli(Date datepubli)
	{
		List<Annonce> a=aDao.findByDatepubli(datepubli);
		return a;
	}
	
	public List<Annonce> chercherTitreqlcq(String recherche)
	{
		List<Annonce> annonces=aDao.findByTitreContaining(recherche);
		return annonces;
	}
}
