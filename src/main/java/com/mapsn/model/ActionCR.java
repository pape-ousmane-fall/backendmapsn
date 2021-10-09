package com.mapsn.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ActionCR {
	@Id
	@GeneratedValue
	private Long id;
	private Date date;
	@ManyToOne
	private Utilisateur utilisateur;
	@ManyToOne
	private CommunRu codeCR;

	public ActionCR() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ActionCR(Date date, Utilisateur utilisateur, CommunRu codeCR) {
		super();
		this.date = date;
		this.utilisateur = utilisateur;
		this.codeCR = codeCR;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public CommunRu getCodeCR() {
		return codeCR;
	}

	public void setCodeCR(CommunRu codeCR) {
		this.codeCR = codeCR;
	}

}
