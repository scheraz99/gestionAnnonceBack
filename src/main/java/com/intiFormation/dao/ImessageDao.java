package com.intiFormation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiFormation.model.Message;

public interface ImessageDao extends JpaRepository<Message, Integer>{

	public List<Message> findByObjet(String objet);
	
}
