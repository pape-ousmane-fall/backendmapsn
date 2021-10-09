package com.mapsn.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity

public class CommunRu {
	@Id
	@GeneratedValue
	private Long id;
	@Column(unique = true)
	private String codeCR;
	private String name;
	private double superficie;
	private double population,latitude,longitute;
	private String detail;
	
	@ManyToOne
	@JsonProperty(access = Access.WRITE_ONLY)
	private CommunAr codeCAr;
	@OneToMany(mappedBy = "codeCR")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<ActionCR> commR;
	
	public CommunRu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommunRu(String codeCR, String name, double superficie, double population, double latitude, double longitute,
			String detail, CommunAr codeCAr) {
		super();
		this.codeCR = codeCR;
		this.name = name;
		this.superficie = superficie;
		this.population = population;
		this.latitude = latitude;
		this.longitute = longitute;
		this.detail = detail;
		this.codeCAr = codeCAr;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodeCR() {
		return codeCR;
	}

	public void setCodeCR(String codeCR) {
		this.codeCR = codeCR;
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

	public CommunAr getCodeCAr() {
		return codeCAr;
	}

	public void setCodeCAr(CommunAr codeCAr) {
		this.codeCAr = codeCAr;
	}

	public List<ActionCR> getCommR() {
		return commR;
	}

	public void setCommR(List<ActionCR> commR) {
		this.commR = commR;
	}

}
