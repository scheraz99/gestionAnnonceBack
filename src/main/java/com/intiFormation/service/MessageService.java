package com.intiFormation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.ImessageDao;
import com.intiFormation.model.Message;


@Service
public class MessageService implements ImessageService {

	@Autowired
	private ImessageDao mDao;
	
	public void ajouter(Message msg)
	{
		mDao.save(msg);
	}
	
	public Message getById(int id)
	{
		Message msg=mDao.findById(id).get();
		return msg;
	}
	
	public List<Message> getAll()
	{
		List<Message> messages=mDao.findAll();
		return messages;
	}
	
	public void modifMsg(Message msg)
	{
		mDao.save(msg);
	}
	
	public void supprMsg(int id)
	{
		mDao.deleteById(id);
	}
	
	public List<Message> chercherParObjet(String objet)
	{
		List<Message> messages=mDao.findByObjet(objet);
		
		return messages;
		
	}
}
