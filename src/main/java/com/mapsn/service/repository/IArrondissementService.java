package com.mapsn.service.repository;

import java.util.List;

import com.mapsn.model.Arrondissement;

public interface IArrondissementService {
	void initArrondissement();
	Arrondissement saveArrondissement(Arrondissement arron);
	List<Arrondissement> findAllArrondissement();
	void deletArrondissement(Long id);
	Arrondissement updateArrondissement(Arrondissement arron);
	

}
