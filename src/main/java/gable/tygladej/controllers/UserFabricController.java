package gable.tygladej.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import gable.tygladej.entity.UserFabric;
import se.lexicon.spring_data_workshop.entity.Product;
import se.lexicon.spring_data_workshop.service.ProductService;

@RestController
public class UserFabricController {

	@Autowired
	public UserFabricController(UserFabricService service) {
		this.service = service;
	}
	
	@GetMapping("/product")
	public ResponseEntity<List<UserFabric>> get(){
		List<UserFabric> products = service.findAll();
		
		if(products.isEmpty()) {
			return ResponseEntity.noContent().build();
		}else {
			return ResponseEntity.ok(products);
		}		
	}	
}
