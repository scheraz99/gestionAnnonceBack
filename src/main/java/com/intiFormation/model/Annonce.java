package com.intiFormation.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Annonce {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_annonce")
	private int idannonce;
	private String titre;
	
	@Column(length = 100)
	private String description;
	
	//@JsonFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date datepubli;
	
	//@JsonFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date dateexpi;
	private String photo;
	
	private boolean valide;
	
	@ManyToOne
	@JoinColumn(name = "id_cat")
	@JsonIgnore
	private Categorie categorie;
	
	@OneToMany(mappedBy = "annonce")
	@JsonIgnore
	private List<Commentaire> commentaires;
	
	@ManyToOne
	@JoinColumn(name="id_user")
	@JsonIgnore
	private Utilisateur user;
	
	@OneToMany(mappedBy = "annonce")
	@JsonIgnore
	private List<Message> messages;

	public int getIdannonce() {
		return idannonce;
	}

	public void setIdannonce(int idannonce) {
		this.idannonce = idannonce;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDatepubli() {
		return datepubli;
	}

	public void setDatepubli(Date datepubli) {
		this.datepubli = datepubli;
	}

	public Date getDateexpi() {
		return dateexpi;
	}

	public void setDateexpi(Date dateexpi) {
		this.dateexpi = dateexpi;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public List<Commentaire> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	public Utilisateur getUser() {
		return user;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public boolean isValide() {
		return valide;
	}

	public void setValide(boolean valide) {
		this.valide = valide;
	}
	
	
}
