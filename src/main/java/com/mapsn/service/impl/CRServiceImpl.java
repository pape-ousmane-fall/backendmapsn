package com.mapsn.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.mapsn.model.CommunRu;
import com.mapsn.repository.CRRepository;
import com.mapsn.service.repository.CRService;


@Service
public  class CRServiceImpl  implements CRService{

	
	public CRServiceImpl(CRRepository crRepository) {
		super();
		this.crRepository=crRepository;
	}

private CRRepository crRepository;
	@Override
	public CommunRu saveCommunRu(  CommunRu  communRu )
	  {
		  return crRepository.save( communRu );
	  }

	@Override
	public List<  CommunRu > findAllCommunRu() {
		return crRepository.findAll();
	}

	
	@Override
	public void deleteCommunRu (Long id) {
		Optional<  CommunRu >   communRu =crRepository.findById(id);
		if(  communRu.isPresent()) {
			crRepository.delete(  communRu.get());
		} 
		else {
			System.out.println(" CommunRu n'existe pas");
		}
	}

	@Override
	public CommunRu updateCommunRu(CommunRu communRu) {
		return crRepository.saveAndFlush(communRu);
	}

	@Override
	public void initCommunRu() {
	
	}

}
