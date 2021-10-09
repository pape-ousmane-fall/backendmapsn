package com.mapsn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapsn.model.Arrondissement;

public interface IArrondissementRepository extends JpaRepository<Arrondissement, Long> {
	Arrondissement findByCodeAr(String codeAr);
	Arrondissement findByName (String nameAr);

}
