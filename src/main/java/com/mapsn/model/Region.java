package com.mapsn.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Region {
	@Id
	@GeneratedValue
	private Long id;
	@Column(unique = true)
	private String codeRegion;
	private String name;
	private double superficie;
	private double population, latitude, longitute;
	private String detail;

	@OneToMany(mappedBy = "codeRegion", fetch = FetchType.LAZY)
	private Collection<Departement> depart = new ArrayList<>();
	
	@OneToMany(mappedBy = "codeRegion")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Collection<ActionRegion> region = new ArrayList<>();

	public Region(String codeRegion, String name, double superficie, double population, double latitude,
			double longitute, String detail, List<Departement> depart) {
		super();
		this.codeRegion = codeRegion;
		this.name = name;
		this.superficie = superficie;
		this.population = population;
		this.latitude = latitude;
		this.longitute = longitute;
		this.detail = detail;
		this.depart = depart;
	}

	public Region() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
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

	public Collection<Departement> getDepart() {
		return depart;
	}

	public void setDepart(Collection<Departement> depart) {
		this.depart = depart;
	}

	public Collection<ActionRegion> getRegion() {
		return region;
	}

	public void setRegion(Collection<ActionRegion> region) {
		this.region = region;
	}
	

}
