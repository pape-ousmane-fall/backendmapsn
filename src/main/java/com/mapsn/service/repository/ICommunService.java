package com.mapsn.service.repository;

import java.util.List;

import com.mapsn.model.Commun;

public interface ICommunService {
	void initCommun();
	Commun saveCommun(Commun commun);
	List<Commun> findAllCommun();
	void deletCommun(Long id);
	Commun updateCommun(Commun commun);
	

}
