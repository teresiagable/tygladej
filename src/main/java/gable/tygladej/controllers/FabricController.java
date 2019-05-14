package gable.tygladej.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import gable.tygladej.entity.Colorways;
import gable.tygladej.entity.Fabric;
import gable.tygladej.entity.FabricType;
import gable.tygladej.entity.Prints;
import gable.tygladej.forms_and_views.FabricForm;
import gable.tygladej.service.FabricService;

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
	
	@GetMapping("/fabric/")
	public ResponseEntity<List<Fabric>> getAllFabric(){
		try {
			return ResponseEntity.ok( FService.getAllFabric());
		
		}catch(IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}		
	}
	
	@PostMapping("/fabric")
	public ResponseEntity<Fabric> create(@RequestBody @Valid FabricForm form){
		
		//Fabric(String name, String pictureUrl, String type, String print, String colorway, String designer)
		
		Fabric newFabric = FService.save(new Fabric(
								form.getName(),
								form.getPictureUrl(),
								form.getType(),
								form.getPrint(),
								form.getColorway(),
								form.getDesigner()));

		return ResponseEntity.status(HttpStatus.CREATED).body(newFabric);
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
