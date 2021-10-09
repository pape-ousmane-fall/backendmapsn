package com.mapsn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapsn.model.Region;



public interface IRegionRepository extends JpaRepository<Region, Long> {
	Region findByCodeRegion(String codeRegion);
	Region findByName(String regionName);

}


