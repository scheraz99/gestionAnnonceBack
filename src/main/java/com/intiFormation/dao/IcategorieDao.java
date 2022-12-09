package com.intiFormation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiFormation.model.Categorie;


public interface IcategorieDao extends JpaRepository<Categorie, Integer>{

	public Categorie findByNomcat(String nomcat);
	
	public List<Categorie> findByNomcatStartingWith (String recherche);
}
