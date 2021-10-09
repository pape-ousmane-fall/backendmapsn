package com.mapsn.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mapsn.model.Region;
import com.mapsn.repository.IRegionRepository;
import com.mapsn.service.repository.IRegionService;

@Service
public class RegionServiceImpl  implements IRegionService{

	
	public RegionServiceImpl(IRegionRepository iRegionRepository) {
		super();
		this.iRegionRepository = iRegionRepository;
	}

	private IRegionRepository iRegionRepository;
	@Override
	public Region saveRegion(Region region) {
		// TODO Auto-generated method stub
		return iRegionRepository.save(region);
	}

	@Override
	public List<Region> findAllRegion() {
		// TODO Auto-generated method stub
		return iRegionRepository.findAll();
	}

	@Override
	public void deletRegion(Long id) {
		// TODO Auto-generated method stub
		Optional<Region> region=iRegionRepository.findById(id);
		if(region.isPresent()) {
			iRegionRepository.delete(region.get());
		}
		else {
			System.out.println("Region n'existe pas");
		}
	}

	@Override
	public Region updateRegion(Region region) {
		// TODO Auto-generated method stub
		return iRegionRepository.saveAndFlush(region);
	}

	@Override
	public void initRegion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Region findByCodeRegion(String codeRegion) {
		// TODO Auto-generated method stub
		Region region=iRegionRepository.findByCodeRegion(codeRegion);
		if(region==null) {
			System.out.println("Code region n'existe pas !!!");
		}
		return iRegionRepository.findByCodeRegion(codeRegion);
	}



	

}
