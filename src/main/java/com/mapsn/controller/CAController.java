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
import com.mapsn.service.impl.LocaliteServiceImpl;

@RestController
@RequestMapping("/api")
public class CAController {

	private LocaliteServiceImpl localiteServiceImpl;

	public CAController(LocaliteServiceImpl localiteServiceImpl) {
		super();
		this.localiteServiceImpl = localiteServiceImpl;
	}

	@PostMapping("/comArrondissement")
	public CommunAr saveCommunAr(@RequestBody CommunAr communAr) {
		return localiteServiceImpl.saveCommunAr(communAr);
	}

	@PostMapping("/comAr/addComRuToComAr")
	public void addComRuToComAr(@PathVariable String codeComAr, @PathVariable String codeComRu) {
		localiteServiceImpl.addComRuToComAr(codeComAr, codeComRu);
	}

	@GetMapping("/comArrondissements")
	public List<CommunAr> findAllCommunAr() {
		return localiteServiceImpl.findAllCommunAr();
	}

	@GetMapping("/comArrondissement/{codComAr}")
	public CommunAr findByCodComAr(@PathVariable String codComAr) {
		return localiteServiceImpl.findByCodeCAR(codComAr);
	}

	@DeleteMapping("/deleteComArrondissement/{id}")
	public void deleteCommunAr(@PathVariable Long id) {
		localiteServiceImpl.deletCommunAr(id);
	}

	@PutMapping("updateComArrondissement")
	public CommunAr updateCommunAr(@RequestBody CommunAr communAr) {
		return localiteServiceImpl.updateCommunAr(communAr);
	}
}
