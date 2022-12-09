package com.intiFormation.service;

import java.util.List;

import com.intiFormation.model.Message;

public interface ImessageService {

	public void ajouter(Message msg);
	public Message getById(int id);
	public List<Message> getAll();
	public void modifMsg(Message msg);
	public void supprMsg(int id);
	public List<Message> chercherParObjet(String objet);
}
