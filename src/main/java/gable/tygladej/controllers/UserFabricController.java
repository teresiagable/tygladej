package gable.tygladej.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import gable.tygladej.entity.UserFabric;
import gable.tygladej.forms_and_views.UserFabricForm;
import gable.tygladej.service.UserFabricService;

@RestController
public class UserFabricController {

	private UserFabricService UFService;

	@Autowired
	public UserFabricController(UserFabricService service) {
		this.UFService = service;
	}

	@CrossOrigin("*")
	@GetMapping("/usersfabric/{id}")
	public ResponseEntity<List<UserFabricForm>> getUsersFabric(@PathVariable int id) {
		try {
			
			List<UserFabric> userFabrics = UFService.findAllFabricsWithUserId(id);
			List<UserFabricForm> UFForms = new ArrayList<>();
			for (UserFabric uF : userFabrics) {

				UserFabricForm UFForm = new UserFabricForm();
				UFForm.setId(uF.getId());
				UFForm.setUserName(uF.getUser().getName());
				UFForm.setFabricName(uF.getFabric().getName());
				UFForm.setType(uF.getFabric().getType());
				UFForm.setPrint(uF.getFabric().getPrint());
				UFForm.setColor(uF.getFabric().getColorway());
				UFForm.setLength(uF.getLength());
				UFForm.setPurchaseDate(uF.getPurchaseDate());
				UFForm.setPurchasePoint(uF.getPurchasePoint());
				UFForm.setPreWashed(uF.isPreWashed());
				UFForm.setShowPublic(uF.isShowPublic());
				UFForm.setForSale(uF.isForSale());

				UFForms.add(UFForm);
			}	
			return ResponseEntity.ok(UFForms);
			
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}
	}
}
