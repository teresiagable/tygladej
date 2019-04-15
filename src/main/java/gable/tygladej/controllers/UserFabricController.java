package gable.tygladej.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import gable.tygladej.entity.User;
import gable.tygladej.entity.UserFabric;
import gable.tygladej.service.UserFabricService;
import gable.tygladej.service.UserService;


@RestController
public class UserFabricController {
	
	private UserFabricService UFService;
	private UserService UService;

	@Autowired
	public UserFabricController(UserFabricService service) {
		this.UFService = service;
	}
	
	@GetMapping("/UsersFabric/{id}")
	public ResponseEntity<List<UserFabric>> getUsersFabric(@PathVariable int id, List<UserFabric> theFabricList){
		try {
			return ResponseEntity.ok( UFService.findUsersAllFabric(id));
		
		}catch(IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}		
	}	
}
