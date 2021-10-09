package com.mapsn.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ActionCom {
	@Id
	@GeneratedValue
	private Long id;
	private Date date;
	@ManyToOne
	private Utilisateur utilisateur;
	@ManyToOne
	private Commun codeCom;

	public ActionCom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ActionCom(Date date, Utilisateur utilisateur, Commun codeCom) {
		super();
		this.date = date;
		this.utilisateur = utilisateur;
		this.codeCom = codeCom;
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

	public Commun getCodeCom() {
		return codeCom;
	}

	public void setCodeCom(Commun codeCom) {
		this.codeCom = codeCom;
	}

}
