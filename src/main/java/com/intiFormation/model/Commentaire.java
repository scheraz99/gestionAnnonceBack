package com.intiFormation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Commentaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_comm;
	private String comm;
	
	@ManyToOne
	@JoinColumn(name = "id_annonce")
	@JsonIgnore
	private Annonce annonce;
	
	@ManyToOne
	@JoinColumn(name="id_user")
	@JsonIgnore
	private Utilisateur user;

	public int getId_comm() {
		return id_comm;
	}

	public void setId_comm(int id_comm) {
		this.id_comm = id_comm;
	}

	public String getComm() {
		return comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	public Annonce getAnnonce() {
		return annonce;
	}

	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}

	public Utilisateur getUser() {
		return user;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}
	
	
}
