package com.mapsn.service.repository;

import com.mapsn.model.Departement;

import antlr.collections.List;

public interface DepService {
 void initDepartement();
 Departement saveDepartement( Departement  departement);
	java.util.List<Departement> findAllDepartement();
	void deleteDepartement(Long id);
	 Departement updateDepartement( Departement  departement);

}
	
 

