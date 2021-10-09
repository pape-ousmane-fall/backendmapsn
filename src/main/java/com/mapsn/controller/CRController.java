package com.mapsn.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapsn.model.CommunAr;
import com.mapsn.model.CommunRu;
import com.mapsn.service.impl.LocaliteServiceImpl;


@RestController
@RequestMapping("/api")
public class CRController {
	
	private LocaliteServiceImpl localiteServiceImpl;

	
	public CRController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@PostMapping("/communeRurale")
	public CommunRu saveCommunAr(@RequestBody  CommunRu  communRu)
	{
		return  localiteServiceImpl.saveCommunRu(communRu);
	}
	
	@GetMapping("/communeRurales")
    public List< CommunRu> findAllCommunRu()
	{
	  return  localiteServiceImpl.findAllCommunRu();
    }
	@GetMapping("/communeRurale/{codComRu}")
	public CommunRu findByCodComRu(@PathVariable String codComRu) {
		return localiteServiceImpl.findByCodeCRu(codComRu);
	}
	
	@DeleteMapping("/deleteCommuneRurale/{id}")
	public void deleteCommunRu(@PathVariable Long id)
	{
		 localiteServiceImpl.deletCommunRu(id);
	}
	
	@PutMapping("updateCommuneRurale")
	public  CommunRu updateCommunRu(@RequestBody  CommunRu  communRu)
	{
		return  localiteServiceImpl.updateCommunRu( communRu);
    }
}
