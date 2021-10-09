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

import com.mapsn.model.Region;
import com.mapsn.service.impl.LocaliteServiceImpl;

@RestController
@RequestMapping("/api")
public class RegionController {

	public RegionController( LocaliteServiceImpl localiteServiceImpl) {
		super();
		
		this.localiteServiceImpl = localiteServiceImpl;
	}

	private LocaliteServiceImpl localiteServiceImpl;

	@PostMapping("/region")
	public Region saveRegion(@RequestBody Region region) {
		return localiteServiceImpl.saveRegion(region);
	}

	@PostMapping("/region/addDepToRegion")
	public void addDepToRegion(@PathVariable String codeRegion, @PathVariable String CodeDep) {
		localiteServiceImpl.addDepartToRegion(codeRegion, CodeDep);
	}


	@GetMapping("/regions")
	public List<Region> findAllRegion() {
		return localiteServiceImpl.findAllRegion();
	}

	@GetMapping("/region/{codRregion}")
	public Region findByCodeRegion(@PathVariable String codRregion) {
		return localiteServiceImpl.findByCodeRegion(codRregion);
	}

	@DeleteMapping("/deletRegion/{id}")
	public void deletRegion(@PathVariable Long id) {
		localiteServiceImpl.deletRegion(id);
	}

	@PutMapping("updateRegion")
	public Region updateRegion(@RequestBody Region region) {
		return localiteServiceImpl.updateRegion(region);
	}
}
