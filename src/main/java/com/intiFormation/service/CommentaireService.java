package com.intiFormation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.IcommentaireDao;
import com.intiFormation.model.Commentaire;


@Service
public class CommentaireService implements IcommentaireService {

	@Autowired
	private IcommentaireDao comDao;
	
	public void ajouter(Commentaire com)
	{
		comDao.save(com);
	}
	
	public Commentaire getById(int id)
	{
		Commentaire com=comDao.findById(id).get();
		return com;
	}
	
	public List<Commentaire> getAll()
	{
		List<Commentaire> commentaires=comDao.findAll();
		return commentaires;
	}
	
	public void modifCom(Commentaire com)
	{
		comDao.save(com);
	}
	
	public void supprCom(int id)
	{
		comDao.deleteById(id);
	}
	
	public List<Commentaire> afficherlescom( int id)
	{
		List<Commentaire> commentaires=comDao.findByAnnonce_idannonce(id);
		return commentaires;
	}
}
