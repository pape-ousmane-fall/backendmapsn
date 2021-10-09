package com.mapsn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapsn.model.Departement;


@Repository
public interface DepRepository extends JpaRepository<Departement, Long>{
	Departement findByCodeDep(String codeDep);
	Departement findByName(String nameDep);

}