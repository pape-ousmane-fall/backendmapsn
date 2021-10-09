package com.mapsn.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.mapsn.model.Commun;
import com.mapsn.repository.ICommunRepository;
import com.mapsn.service.repository.ICommunService;

@Service
public class CommunServiceImpl implements ICommunService {

	private ICommunRepository iCommunRepository;

	public CommunServiceImpl(ICommunRepository iCommunRepository) {
		super();
		this.iCommunRepository = iCommunRepository;
	}

	@Override
	public void initCommun() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Commun saveCommun(Commun commun) {
		// TODO Auto-generated method stub
		return iCommunRepository.save(commun);
	}

	@Override
	public List<Commun> findAllCommun() {
		// TODO Auto-generated method stub
		return iCommunRepository.findAll();
	}

	@Override
	public void deletCommun(Long id) {
		// TODO Auto-generated method stub
		Optional<Commun> com = iCommunRepository.findById(id);
		if (com.isPresent()) {
			iCommunRepository.deleteById(id);
		} else {
			System.out.println("Arrondissement n'existe pas");
		}
	}

	@Override
	public Commun updateCommun(Commun commun) {
		// TODO Auto-generated method stub
		return iCommunRepository.saveAndFlush(commun);
	}

}
