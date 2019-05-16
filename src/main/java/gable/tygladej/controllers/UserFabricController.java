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
		System.out.println("kalle");
		try {
			
			List<UserFabric> userFabrics = UFService.findAllFabricsWithUserId(id);
			List<UserFabricForm> UFForms = new ArrayList<>();
//			UserFabricForm UFForm = new UserFabricForm();
			for (UserFabric uF : userFabrics) {
//				UserFabricForm UFForm = new UserFabricForm(uF.getId(), uF.getUser(), uF.getFabric(), uF.getLength(),
//						uF.getPurchaseDate(), uF.getPurchasePoint(), uF.isPreWashed(), uF.isShowPublic(),
//						uF.isForSale());


				UserFabricForm UFForm = new UserFabricForm();
				UFForm.setId(uF.getId());
				UFForm.setUserName(uF.getUser().getName());
				UFForm.setFabricName(uF.getFabric().getName());
				UFForm.setColor(uF.getFabric().getColorway());
//				FabricForm(uF.getId(), uF.getUser(), uF.getFabric(), uF.getLength(),
//						uF.getPurchaseDate(), uF.getPurchasePoint(), uF.isPreWashed(), uF.isShowPublic(),
//						uF.isForSale()));
				UFForms.add(UFForm);
//				UFForms.add(UFForm);
//				break;
				
				
			}	

//			return ResponseEntity.ok(UFForm);
//			System.out.println(UFForms.size());
			return ResponseEntity.ok(UFForms);
			
			
//			UserFabric uF = userFabrics.get(0);
//			UserFabricForm UFForm = new UserFabricForm(uF.getId(), uF.getUser(), uF.getFabric(), uF.getLength(),
//					uF.getPurchaseDate(), uF.getPurchasePoint(), uF.isPreWashed(), uF.isShowPublic(),
//					uF.isForSale());
//			return ResponseEntity.ok(UFForm);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}
	}
}
