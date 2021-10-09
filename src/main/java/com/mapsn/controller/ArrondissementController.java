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

import com.mapsn.model.Arrondissement;
import com.mapsn.service.impl.LocaliteServiceImpl;

@RestController
@RequestMapping("/api")
public class ArrondissementController {

	private LocaliteServiceImpl localiteServiceImpl;

	public ArrondissementController(LocaliteServiceImpl localiteServiceImpl) {
		super();
		this.localiteServiceImpl = localiteServiceImpl;
	}

	@PostMapping("/arrondissement")
	public Arrondissement saveArrondissement(@RequestBody Arrondissement arrondissement) {
		return localiteServiceImpl.saveArrondissement(arrondissement);
	}

	@PostMapping("/arrondissement/addComToArron")
	public void addComToArron(@PathVariable String CodeArron, @PathVariable String codeCom) {
		localiteServiceImpl.addCommToArron(CodeArron, codeCom);
	}

	@GetMapping("/arrondissements")
	public List<Arrondissement> findAllArrondissement() {
		return localiteServiceImpl.findAllArrondissement();
	}

	@GetMapping("/arrondissement/{codArron}")
	public Arrondissement findByCodArron(@PathVariable String codDepartement) {
		return localiteServiceImpl.findByCodeArr(codDepartement);
	}

	@DeleteMapping("/deletArrondissement/{id}")
	public void deletArrondissement(@PathVariable Long id) {
		localiteServiceImpl.deletArrondissement(id);
	}

	@PutMapping("updateArrondissement")
	public Arrondissement updateArrondissement(@RequestBody Arrondissement arrondissement) {
		return localiteServiceImpl.updateArrondissement(arrondissement);
	}
}
