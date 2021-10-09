package com.mapsn.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity

public class Commun {
	@Id
	@GeneratedValue
	private Long id;
	@Column(unique = true)
	private String codeCom;
	private String name;
	private double superficie;
	private double population,latitude,longitute;
	private String detail;
	//;
	@ManyToOne
	@JsonProperty(access = Access.WRITE_ONLY)
	private Arrondissement codeAr;
	
	@OneToMany(mappedBy = "codeCom",fetch = FetchType.EAGER)
	private Collection<CommunAr> commAr =new ArrayList<>();
	
	@OneToMany(mappedBy = "codeCom")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<ActionCom> com;
	
	

	public Commun() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Commun(String codeCom, String name, double superficie, double population, double latitude, double longitute,
			String detail, Arrondissement codeAr, Collection<CommunAr> commAr) {
		super();
		this.codeCom = codeCom;
		this.name = name;
		this.superficie = superficie;
		this.population = population;
		this.latitude = latitude;
		this.longitute = longitute;
		this.detail = detail;
		this.codeAr = codeAr;
		this.commAr = commAr;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getCodeCom() {
		return codeCom;
	}



	public void setCodeCom(String codeCom) {
		this.codeCom = codeCom;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSuperficie() {
		return superficie;
	}



	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}



	public double getPopulation() {
		return population;
	}



	public void setPopulation(double population) {
		this.population = population;
	}



	public double getLatitude() {
		return latitude;
	}



	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}



	public double getLongitute() {
		return longitute;
	}



	public void setLongitute(double longitute) {
		this.longitute = longitute;
	}



	public String getDetail() {
		return detail;
	}



	public void setDetail(String detail) {
		this.detail = detail;
	}



	public Arrondissement getCodeAr() {
		return codeAr;
	}



	public void setCodeAr(Arrondissement codeAr) {
		this.codeAr = codeAr;
	}



	public Collection<CommunAr> getCommAr() {
		return commAr;
	}



	public void setCommAr(Collection<CommunAr> commAr) {
		this.commAr = commAr;
	}



	public List<ActionCom> getCom() {
		return com;
	}



	public void setCom(List<ActionCom> com) {
		this.com = com;
	}
	

}
