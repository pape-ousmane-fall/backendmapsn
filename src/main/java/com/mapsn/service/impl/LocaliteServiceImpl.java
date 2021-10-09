package com.mapsn.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.mapsn.model.Arrondissement;
import com.mapsn.model.Commun;
import com.mapsn.model.CommunAr;
import com.mapsn.model.CommunRu;
import com.mapsn.model.Departement;
import com.mapsn.model.Region;
import com.mapsn.repository.CARepository;
import com.mapsn.repository.CRRepository;
import com.mapsn.repository.DepRepository;
import com.mapsn.repository.IArrondissementRepository;
import com.mapsn.repository.ICommunRepository;
import com.mapsn.repository.IRegionRepository;
import com.mapsn.service.repository.ILocaliteService;

@Service
@Transactional
public class LocaliteServiceImpl implements ILocaliteService {
	private IRegionRepository iRegionRepository;
	private DepRepository depRepository;
	private ICommunRepository communRepository;
	private IArrondissementRepository arrondissementRepository;
	private CRRepository crRepository;
	private CARepository caRepository;

	public LocaliteServiceImpl(IRegionRepository iRegionRepository, DepRepository depRepository,
			ICommunRepository communRepository, IArrondissementRepository arrondissementRepository,
			CRRepository crRepository, CARepository caRepository) {
		super();
		this.iRegionRepository = iRegionRepository;
		this.depRepository = depRepository;
		this.communRepository = communRepository;
		this.arrondissementRepository = arrondissementRepository;
		this.crRepository = crRepository;
		this.caRepository = caRepository;
	}

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
	public Region findByCodeRegion(String codeRegion) {
		// TODO Auto-generated method stub
		return iRegionRepository.findByCodeRegion(codeRegion);
	}

	@Override
	public void deletRegion(Long id) {
		// TODO Auto-generated method stub
		iRegionRepository.deleteById(id);
	}

	@Override
	public Region updateRegion(Region region) {
		// TODO Auto-generated method stub
		return iRegionRepository.saveAndFlush(null);
	}

	@Override
	public void addDepartToRegion(String codeRegion, String codeDepart) {
		// TODO Auto-generated method stub
		Region region = iRegionRepository.findByCodeRegion(codeRegion);
		Departement departement = depRepository.findByCodeDep(codeDepart);
		if (region == null && departement == null) {
			System.out.println("not found codeRegion and codeDepart ");
		} else {
			departement.setCodeRegion(region);
			region.getDepart().add(departement);
		}

	}

	@Override
	public Departement saveDepartemnt(Departement departement) {
		// TODO Auto-generated method stub
		return depRepository.save(departement);
	}

	@Override
	public List<Departement> findAllDepartement() {
		// TODO Auto-generated method stub
		return depRepository.findAll();
	}

	@Override
	public Departement findByCodeDep(String codedep) {
		// TODO Auto-generated method stub
		return depRepository.findByCodeDep(codedep);
	}

	@Override
	public void deletDepartement(Long id) {
		// TODO Auto-generated method stub
		depRepository.deleteById(id);
	}

	@Override
	public Departement updateDepartement(Departement region) {
		// TODO Auto-generated method stub
		return depRepository.saveAndFlush(region);
	}

	@Override
	public void addArronToDepartement(String codeDepart, String codeArron) {
		// TODO Auto-generated method stub
		Departement departement = depRepository.findByCodeDep(codeDepart);
		Arrondissement arrondissement = arrondissementRepository.findByCodeAr(codeArron);
		if (departement == null && arrondissement == null) {
			System.out.println("not found codeRegion and codeDepart ");
		} else {
			arrondissement.setCodeAr(codeArron);
			departement.getArron().add(arrondissement);
		}

	}

	@Override
	public Arrondissement saveArrondissement(Arrondissement arrondissement) {
		// TODO Auto-generated method stub
		return arrondissementRepository.save(arrondissement);
	}

	@Override
	public List<Arrondissement> findAllArrondissement() {
		// TODO Auto-generated method stub
		return arrondissementRepository.findAll();
	}

	@Override
	public Arrondissement findByCodeArr(String codeArron) {
		// TODO Auto-generated method stub
		return arrondissementRepository.findByCodeAr(codeArron);
	}

	@Override
	public void deletArrondissement(Long id) {
		// TODO Auto-generated method stub
		arrondissementRepository.deleteById(id);
	}

	@Override
	public Arrondissement updateArrondissement(Arrondissement arrondissement) {
		// TODO Auto-generated method stub
		return arrondissementRepository.saveAndFlush(arrondissement);
	}

	@Override
	public void addCommToArron(String codeArron, String codeCom) {
		// TODO Auto-generated method stub
		Arrondissement arrondissement = arrondissementRepository.findByCodeAr(codeArron);
		Commun commun = communRepository.findByCodeCom(codeCom);
		if (arrondissement == null && commun == null) {

			System.out.println("not found codeRegion and codeDepart ");
		}
		{
			commun.setCodeCom(codeCom);
			arrondissement.getCommun().add(commun);

		}

	}

	@Override
	public Commun saveCommun(Commun commun) {
		// TODO Auto-generated method stub
		return communRepository.save(commun);
	}

	@Override
	public List<Commun> findAllCommun() {
		// TODO Auto-generated method stub
		return communRepository.findAll();
	}

	@Override
	public Commun findByCodeCom(String codeCom) {
		// TODO Auto-generated method stub
		return communRepository.findByCodeCom(codeCom);
	}

	@Override
	public void deletCommun(Long id) {
		// TODO Auto-generated method stub
		communRepository.deleteById(id);
	}

	@Override
	public Commun updateCommun(Commun commun) {
		// TODO Auto-generated method stub
		return communRepository.saveAndFlush(commun);
	}

	@Override
	public void addComArToCom(String codeCom, String codeCAr) {
		// TODO Auto-generated method stub

		Commun commun = communRepository.findByCodeCom(codeCom);
		CommunAr communAr = caRepository.findByCodeCAr(codeCAr);
		if (commun == null && communAr == null) {
			System.out.println("not found codeRegion and codeDepart ");
		}
		{
			communAr.setCodeCAr(codeCAr);
			commun.getCommAr().add(communAr);
		}

	}

	@Override
	public CommunAr saveCommunAr(CommunAr communAr) {
		// TODO Auto-generated method stub
		return caRepository.save(communAr);
	}

	@Override
	public List<CommunAr> findAllCommunAr() {
		// TODO Auto-generated method stub
		return caRepository.findAll();
	}

	@Override
	public CommunAr findByCodeCAR(String codeCAR) {
		// TODO Auto-generated method stub
		return caRepository.findByCodeCAr(codeCAR);
	}

	@Override
	public void deletCommunAr(Long id) {
		// TODO Auto-generated method stub
		caRepository.deleteById(id);
	}

	@Override
	public CommunAr updateCommunAr(CommunAr communAr) {
		// TODO Auto-generated method stub
		return caRepository.saveAndFlush(communAr);
	}

	@Override
	public void addComRuToComAr(String codeCAr, String codeCRu) {
		// TODO Auto-generated method stub
		CommunAr communAr = caRepository.findByCodeCAr(codeCAr);
		CommunRu communRu = crRepository.findByCodeCR(codeCRu);

		if (communAr == null && communRu == null) {
			System.out.println("not found codeRegion and codeDepart ");
		}
		{
			communRu.setCodeCR(codeCRu);
			communAr.getCommRu().add(communRu);
		}
	}

	@Override
	public CommunRu saveCommunRu(CommunRu communRu) {
		// TODO Auto-generated method stub
		return crRepository.save(communRu);
	}

	@Override
	public List<CommunRu> findAllCommunRu() {
		// TODO Auto-generated method stub
		return crRepository.findAll();
	}

	@Override
	public CommunRu findByCodeCRu(String codeCRu) {
		// TODO Auto-generated method stub
		return crRepository.findByCodeCR(codeCRu);
	}

	@Override
	public void deletCommunRu(Long id) {
		// TODO Auto-generated method stub
		crRepository.deleteById(id);
	}

	@Override
	public CommunRu updateCommunRu(CommunRu communRu) {
		// TODO Auto-generated method stub
		return crRepository.saveAndFlush(communRu);
	}

}
