package gable.tygladej.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import gable.tygladej.entity.Colorways;
import gable.tygladej.entity.Fabric;
import gable.tygladej.entity.FabricType;
import gable.tygladej.entity.Prints;
import gable.tygladej.entity.UserFabric;
import gable.tygladej.service.FabricService;
import gable.tygladej.service.UserFabricService;

@RestController
public class FabricController {

	private FabricService FService;
	
	@Autowired
	public FabricController(FabricService fService) {
		super();
		FService = fService;
	}

	
	
	@GetMapping("/fabric/{id}")
	public ResponseEntity<Fabric> getFabric(@PathVariable int id){
		try {
			return ResponseEntity.ok( FService.findById(id));
		
		}catch(IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}		
	}
	@GetMapping("/fabric/type={fabricType}")
	public ResponseEntity<List<Fabric>> getFabricOfType(@PathVariable String fabricType){
		try {
			FabricType theType = FabricType.valueOf(fabricType);
			return ResponseEntity.ok( FService.findFabricByFabricType(theType));
		
		}catch(IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}		
	}
	
	@GetMapping("/fabric/color={colorway}")
	public ResponseEntity<List<Fabric>> getFabricsByColor(@PathVariable String colorway){
		try {
			Colorways theColor = Colorways.valueOf(colorway);
			return ResponseEntity.ok( FService.findFabricByColorway(theColor));
		
		}catch(IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}		
	}
	
	@GetMapping("/fabric/print={searchPrint}")
	public ResponseEntity<List<Fabric>> getFabric(@PathVariable String searchPrint){
		try {
			Prints thePrint = Prints.valueOf(searchPrint);
			return ResponseEntity.ok( FService.findFabricByPrint(thePrint));
		
		}catch(IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}		
	}
}
