package gable.tygladej.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import gable.tygladej.entity.Fabric;
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
	
	@GetMapping (path="/hello-world")
	public String helloWorld() {
		return "hello world!";
	}
	@GetMapping (path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("hellllllo");
	}
	
	@GetMapping (path="/fabric")
	public Fabric getFabric2(){
		//try {	
			Fabric theFab=FService.findById(2);
			return theFab;
					//ResponseEntity.ok( );
		
//		}catch(IllegalArgumentException e) {
//			return ResponseEntity.notFound().build();
//		}		
	}
}
