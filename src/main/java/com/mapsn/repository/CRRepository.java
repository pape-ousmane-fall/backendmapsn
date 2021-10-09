package com.mapsn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapsn.model.CommunRu;




@Repository
public interface CRRepository extends JpaRepository<CommunRu, Long>{
	CommunRu findByCodeCR(String codeCR);
	CommunRu findByName(String nameCr);
}