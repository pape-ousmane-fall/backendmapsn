package com.mapsn.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ActionRegion {
	@Id
	@GeneratedValue
	private Long id;
	private Date date;
	@ManyToOne
	private Region codeRegion;
	@ManyToOne
	private Utilisateur utilisateur;

	public ActionRegion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ActionRegion(Date date, Region codeRegion, Utilisateur utilisateur) {
		super();
		this.date = date;
		this.codeRegion = codeRegion;
		this.utilisateur = utilisateur;
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

	public Region getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(Region codeRegion) {
		this.codeRegion = codeRegion;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}
