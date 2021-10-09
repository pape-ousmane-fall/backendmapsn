package com.mapsn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapsn.model.CommunAr;




@Repository
public interface CARepository extends JpaRepository<CommunAr, Long>{
	CommunAr findByCodeCAr(String codeCAr);
	CommunAr findByName (String nameCAR);

}