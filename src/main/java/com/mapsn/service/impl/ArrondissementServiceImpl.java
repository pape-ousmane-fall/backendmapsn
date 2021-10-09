package com.mapsn.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapsn.model.Arrondissement;
import com.mapsn.model.Region;
import com.mapsn.repository.IArrondissementRepository;
import com.mapsn.repository.IRegionRepository;
import com.mapsn.service.repository.IArrondissementService;
import com.mapsn.service.repository.IRegionService;

@Service
public class ArrondissementServiceImpl implements IArrondissementService {
	@Autowired
	private IArrondissementRepository iArrondissementRepository;

	@Override
	public void initArrondissement() {
		// TODO Auto-generated method stub

	}

	@Override
	public Arrondissement saveArrondissement(Arrondissement arron) {
		// TODO Auto-generated method stub
		return iArrondissementRepository.save(arron);
	}

	@Override
	public List<Arrondissement> findAllArrondissement() {
		// TODO Auto-generated method stub
		return iArrondissementRepository.findAll();
	}

	@Override
	public void deletArrondissement(Long id) {
		// TODO Auto-generated method stub
		Optional<Arrondissement> arond = iArrondissementRepository.findById(id);
		if (arond.isPresent()) {
			iArrondissementRepository.deleteById(id);
		} else {
			System.out.println("Arrondissement n'existe pas");
		}
	}

	@Override
	public Arrondissement updateArrondissement(Arrondissement arron) {
		// TODO Auto-generated method stub
		return iArrondissementRepository.saveAndFlush(arron);
	}

}
