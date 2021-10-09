package com.mapsn.service.repository;

import java.util.List;

import com.mapsn.model.Arrondissement;
import com.mapsn.model.Commun;
import com.mapsn.model.CommunAr;
import com.mapsn.model.CommunRu;
import com.mapsn.model.Departement;
import com.mapsn.model.Region;

public interface ILocaliteService {

	Region saveRegion(Region region);

	List<Region> findAllRegion();

	Region findByCodeRegion(String codeRegion);

	void deletRegion(Long id);

	Region updateRegion(Region region);

	void addDepartToRegion(String codeRegion, String codeDepart);

	// department
	Departement saveDepartemnt(Departement departement);

	List<Departement> findAllDepartement();

	Departement findByCodeDep(String codedep);

	void deletDepartement(Long id);

	Departement updateDepartement(Departement region);

	void addArronToDepartement(String codeDepart, String codeArron);

//Arrondissement
	Arrondissement saveArrondissement(Arrondissement arrondissement);

	List<Arrondissement> findAllArrondissement();

	Arrondissement findByCodeArr(String codeArron);

	void deletArrondissement(Long id);

	Arrondissement updateArrondissement(Arrondissement arrondissement);

	void addCommToArron(String codeArron, String codeCom);

	// Commun
	Commun saveCommun(Commun commun);

	List<Commun> findAllCommun();

	Commun findByCodeCom(String codeCom);

	void deletCommun(Long id);

	Commun updateCommun(Commun commun);

	void addComArToCom(String codeCom, String codeCAr);

	// Comun Arrondissement
	CommunAr saveCommunAr(CommunAr communAr);

	List<CommunAr> findAllCommunAr();

	CommunAr findByCodeCAR(String codeCAR);

	void deletCommunAr(Long id);

	CommunAr updateCommunAr(CommunAr communAr);

	void addComRuToComAr(String codeCAr, String codeCRu);

	// commune Rural
	CommunRu saveCommunRu(CommunRu communRu);

	List<CommunRu> findAllCommunRu();

	CommunRu findByCodeCRu(String codeCRu);

	void deletCommunRu(Long id);

	CommunRu updateCommunRu(CommunRu communRu);

}
