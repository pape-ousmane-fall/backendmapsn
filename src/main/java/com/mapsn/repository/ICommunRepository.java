package com.mapsn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapsn.model.Commun;

public interface ICommunRepository extends JpaRepository<Commun, Long> {
	Commun findByCodeCom(String codeCom);
	Commun findByName(String nameCom);

}
