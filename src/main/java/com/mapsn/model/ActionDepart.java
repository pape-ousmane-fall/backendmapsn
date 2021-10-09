package com.mapsn.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ActionDepart {
	@Id
	@GeneratedValue
	private Long id;
	private Date date;
	@ManyToOne
	private Utilisateur utilisateur;
	@ManyToOne
	private Departement codeDep;

	public ActionDepart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ActionDepart(Date date, Utilisateur utilisateur, Departement codeDep) {
		super();
		this.date = date;
		this.utilisateur = utilisateur;
		this.codeDep = codeDep;
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

	public Departement getCodeDep() {
		return codeDep;
	}

	public void setCodeDep(Departement codeDep) {
		this.codeDep = codeDep;
	}

}
