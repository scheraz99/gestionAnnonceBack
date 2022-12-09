package com.intiFormation.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiFormation.model.Annonce;

public interface IannonceDao extends JpaRepository<Annonce, Integer> {

	public List<Annonce> findByTitre(String titre);
	
	public List<Annonce> findByDatepubli(Date datepubli);
	
	public List<Annonce> findByTitreContaining(String recherche);
	
}
