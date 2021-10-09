package com.mapsn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapsn.model.Arrondissement;
import com.mapsn.model.Commun;
import com.mapsn.service.impl.CommunServiceImpl;
import com.mapsn.service.impl.LocaliteServiceImpl;

@RestController
@RequestMapping("/api")
public class CommunController {
	
	private LocaliteServiceImpl localiteServiceImpl;

	public CommunController(LocaliteServiceImpl localiteServiceImpl) {
		super();
		this.localiteServiceImpl = localiteServiceImpl;
	}

	@PostMapping("/commune")
	public Commun saveCommun(@RequestBody Commun commun) {
		return localiteServiceImpl.saveCommun(commun);
	}
	
	@PostMapping("/commune/addComArToCom")
	public void addComArToCom(@PathVariable String codeCom, @PathVariable String codeComAr) {
		localiteServiceImpl.addComArToCom(codeCom, codeComAr);
	}

	@GetMapping("/communes")
	public List<Commun> findAllCommun() {
		return localiteServiceImpl.findAllCommun();
	}
	@GetMapping("/commune/{codCom}")
	public Commun findByCodCom(@PathVariable String codCom) {
		return localiteServiceImpl.findByCodeCom(codCom);
	}

	@DeleteMapping("/deleteCommune/{id}")
	public void deletRegion(@PathVariable Long id) {
		localiteServiceImpl.deletCommun(id);
	}

	@PutMapping("updateCommune")
	public Commun updateCommun(@RequestBody Commun commun) {
		return localiteServiceImpl.updateCommun(commun);
	}
}
