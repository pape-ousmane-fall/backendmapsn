package com.mapsn.service.repository;

import java.util.List;

import com.mapsn.model.Region;

public interface IRegionService {
	void initRegion();
	Region findByCodeRegion(String codeRegion);
	Region saveRegion(Region region);
	List<Region> findAllRegion();
	void deletRegion(Long id);
	Region updateRegion(Region region);
	
}
