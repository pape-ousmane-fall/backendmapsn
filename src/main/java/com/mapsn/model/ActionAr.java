package com.mapsn.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ActionAr {
	@Id
	@GeneratedValue
	private Long id;
	private Date date;
	@ManyToOne
	private Utilisateur utilisateur;
	@ManyToOne
	private Arrondissement codeAr;

	public ActionAr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ActionAr(Date date, Utilisateur utilisateur, Arrondissement codeAr) {
		super();
		this.date = date;
		this.utilisateur = utilisateur;
		this.codeAr = codeAr;
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

	public Arrondissement getCodeAr() {
		return codeAr;
	}

	public void setCodeAr(Arrondissement codeAr) {
		this.codeAr = codeAr;
	}

}
