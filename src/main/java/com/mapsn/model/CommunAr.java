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
public class CommunAr {
	@Id
	@GeneratedValue
	private Long id;
	@Column(unique = true)
	private String codeCAr;
	private String name;
	private double superficie;
	private double population,latitude,longitute;
	private String detail;
	//
	@ManyToOne
	@JsonProperty(access = Access.WRITE_ONLY)
	private Commun codeCom;
	@OneToMany(mappedBy = "codeCAr",fetch = FetchType.EAGER)
	private Collection<CommunRu> commRu=new ArrayList<>();
	
	@OneToMany(mappedBy = "codeCAr")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<ActionCA> commAr;
	

	public CommunAr() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CommunAr(String codeCAr, String name, double superficie, double population, double latitude,
			double longitute, String detail, Commun codeCom, Collection<CommunRu> commRu) {
		super();
		this.codeCAr = codeCAr;
		this.name = name;
		this.superficie = superficie;
		this.population = population;
		this.latitude = latitude;
		this.longitute = longitute;
		this.detail = detail;
		this.codeCom = codeCom;
		this.commRu = commRu;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCodeCAr() {
		return codeCAr;
	}


	public void setCodeCAr(String codeCAr) {
		this.codeCAr = codeCAr;
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


	public Commun getCodeCom() {
		return codeCom;
	}


	public void setCodeCom(Commun codeCom) {
		this.codeCom = codeCom;
	}


	public Collection<CommunRu> getCommRu() {
		return commRu;
	}


	public void setCommRu(Collection<CommunRu> commRu) {
		this.commRu = commRu;
	}


	public List<ActionCA> getCommAr() {
		return commAr;
	}


	public void setCommAr(List<ActionCA> commAr) {
		this.commAr = commAr;
	}

}
