package com.intiFormation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiFormation.model.Commentaire;

public interface IcommentaireDao extends JpaRepository<Commentaire, Integer> {

	public List<Commentaire> findByAnnonce_idannonce(int id);
}
