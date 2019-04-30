package gable.tygladej.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import gable.tygladej.entity.UserFabric;
import gable.tygladej.service.UserFabricService;


@RestController
public class UserFabricController {
	
	private UserFabricService UFService;
	@Autowired
	public UserFabricController(UserFabricService service) {
		this.UFService = service;
	}
	
	@GetMapping("/usersfabric/{id}")
	public ResponseEntity<UserFabric> getUsersFabric(@PathVariable int id){
		try {
			return ResponseEntity.ok( UFService.findAllFabricsWithUserId(id).get(0));
		
		}catch(IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}		
	}
}
