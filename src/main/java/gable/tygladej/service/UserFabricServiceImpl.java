package gable.tygladej.service;

import java.util.*;	
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gable.tygladej.entity.Fabric;
import gable.tygladej.entity.UserFabric;
import gable.tygladej.repository.UserFabricRepo;

@Service
@Transactional
public class UserFabricServiceImpl {
	private UserFabricRepo userFabricRepo;
	
	
	/**
	 * @param id
	 * @param fabric
	 * @param user
	 * @param length
	 * @param purchaseDate
	 * @param purchasePoint
	 * @param preWashed
	 * @param showPublic
	 * @param forSale
	 */
	
	public UserFabric findById(int id)
	{
		Optional<UserFabric> result = userFabricRepo.findById(id);
		return result.orElseThrow(IllegalArgumentException::new);	
	}

	public UserFabric findByFabric(Fabric searchFabric)
	{
	
	}
}
