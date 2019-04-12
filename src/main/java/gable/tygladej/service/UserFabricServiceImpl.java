package gable.tygladej.service;

import java.util.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gable.tygladej.entity.Fabric;
import gable.tygladej.entity.User;
import gable.tygladej.entity.UserFabric;
import gable.tygladej.repository.UserFabricRepo;

@Service
@Transactional
public class UserFabricServiceImpl {
	private UserFabricRepo userFabricRepo;

	/**
	 * UserFabric class
	 * 
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

	public UserFabric findById(int id) {
		Optional<UserFabric> result = userFabricRepo.findById(id);
		return result.orElseThrow(IllegalArgumentException::new);
	}

	public List<UserFabric> findAllUsersWithFabric(Fabric searchFabric) {
		return userFabricRepo.findByFabric(searchFabric);
	}

	public List<UserFabric> findUsersAllFabric(User searchUser) {
		return userFabricRepo.findByUser(searchUser);
	}

	public List<UserFabric> findUsersAllFabricsByLengthLargerThan(User theUser, int theLength) {
		return userFabricRepo.findByLengthGreaterThanEqual(theLength);
	}

	public List<UserFabric> findAllPublicUserFabric(boolean isPublic) {
		return userFabricRepo.findByShowPublic(isPublic);
	}

	public List<UserFabric> findUsersAllPublicFabric(User theUser, boolean isPublic) {
		return userFabricRepo.findByUserAndShowPublic(theUser, isPublic);
	}

	public List<UserFabric> findUsersForSale(User theUser, boolean isForSale) {
		return userFabricRepo.findByUserAndForSale(theUser, isForSale);
	}

	public List<UserFabric> findAllForSale(boolean isForSale) {
		return userFabricRepo.findByForSale(isForSale);
	}
}
