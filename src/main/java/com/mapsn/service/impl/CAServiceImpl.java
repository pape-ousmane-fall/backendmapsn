package com.mapsn.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.mapsn.model.CommunAr;
import com.mapsn.repository.CARepository;
import com.mapsn.service.repository.CAService;


@Service
public  class CAServiceImpl  implements CAService{

	
	public CAServiceImpl(CARepository caRepository) {
		super();
		this.caRepository=caRepository;
	}

private CARepository caRepository;
	@Override
	public CommunAr saveCommunAr( CommunAr communAr )
	  {
		  return caRepository.save( communAr );
	  }

	@Override
	public List< CommunAr > findAllCommunAr() {
		return caRepository.findAll();
	}

	
	@Override
	public void deleteCommunAr (Long id) {
		Optional< CommunAr >  communAr =caRepository.findById(id);
		if( communAr.isPresent()) {
			caRepository.delete( communAr.get());
		} 
		else {
			System.out.println("CommunAr n'existe pas");
		}
	}

	@Override
	public CommunAr updateCommunAr(CommunAr communAr) {
		return caRepository.saveAndFlush(communAr);
	}

	@Override
	public void initCommunAr() {
	
	}

}
