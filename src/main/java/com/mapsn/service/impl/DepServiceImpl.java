package com.mapsn.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.mapsn.model.Departement;
import com.mapsn.model.Region;
import com.mapsn.repository.DepRepository;
import com.mapsn.service.repository.DepService;

@Service
public  class DepServiceImpl  implements DepService{

	
	public DepServiceImpl(DepRepository depRepository) {
		super();
		this.depRepository = depRepository;
	}

	private DepRepository depRepository;
	@Override
	public Departement saveDepartement(Departement departement) {
		return depRepository.save(departement);
	}

	@Override
	public List<Departement> findAllDepartement() {
		return depRepository.findAll();
	}

	
	@Override
	public void deleteDepartement(Long id) {
		Optional<Departement> departement=depRepository.findById(id);
		if(departement.isPresent()) {
			depRepository.delete(departement.get());
		} 
		else {
			System.out.println("Departement n'existe pas");
		}
	}

	@Override
	public Departement updateDepartement(Departement departement) {
		return depRepository.saveAndFlush(departement);
	}

	@Override
	public void initDepartement() {
	
	}

}
