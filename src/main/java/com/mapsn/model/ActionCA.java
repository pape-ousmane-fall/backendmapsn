package com.mapsn.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ActionCA {
	@Id
	@GeneratedValue
	private Long id;
	private Date date;
	@ManyToOne
	private Utilisateur utilisateur;
	@ManyToOne
	private CommunAr codeCAr;

	public ActionCA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ActionCA(Date date, Utilisateur utilisateur, CommunAr codeCAr) {
		super();
		this.date = date;
		this.utilisateur = utilisateur;
		this.codeCAr = codeCAr;
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

	public CommunAr getCodeCAr() {
		return codeCAr;
	}

	public void setCodeCAr(CommunAr codeCAr) {
		this.codeCAr = codeCAr;
	}

}
