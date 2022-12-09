package com.intiFormation.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_msg;
	private String mail;
	private String objet;
	
	@ManyToMany
	@JoinTable(name = "user_msg",
	joinColumns =@JoinColumn(name="id_msg"),
	inverseJoinColumns=@JoinColumn(name="id_user"))
	@JsonIgnore
	private List<Utilisateur> users;
	
	@ManyToOne
	@JoinColumn(name="id_annonce")
	@JsonIgnore
	private Annonce annonce;

	public int getId_msg() {
		return id_msg;
	}

	public void setId_msg(int id_msg) {
		this.id_msg = id_msg;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getObjet() {
		return objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	public List<Utilisateur> getUsers() {
		return users;
	}

	public void setUsers(List<Utilisateur> users) {
		this.users = users;
	}

	public Annonce getAnnonce() {
		return annonce;
	}

	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}
	
	
}
