package gable.tygladej.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gable.tygladej.entity.Fabric;
import gable.tygladej.entity.User;
import gable.tygladej.entity.UserFabric;
import gable.tygladej.repository.UserFabricRepo;
import gable.tygladej.repository.UserRepo;

@Service
@Transactional
public class UserFabricServiceImpl implements UserFabricService {
	private UserFabricRepo userFabricRepo;
	private UserRepo userRepo;
	
	@Autowired
	public UserFabricServiceImpl(UserFabricRepo userFabricRepo, UserRepo userRepo) {
		super();
		this.userFabricRepo = userFabricRepo;
		this.userRepo = userRepo;
	}

	/** database table fields:
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

	@Override
	public UserFabric findById(int id) {
		Optional<UserFabric> result = userFabricRepo.findById(id);
		return result.orElseThrow(IllegalArgumentException::new);
	}

	@Override
	public List<UserFabric> findAllUsersWithFabric(Fabric searchFabric) {
		return userFabricRepo.findByFabric(searchFabric);
	}
	
	
	public List<UserFabric> findUsersAllFabric(int userId)
	{
		return this.findUsersAllFabric(userRepo.findUserById(userId));
	}

	@Override
	public List<UserFabric> findUsersAllFabric(User searchUser) {
		return userFabricRepo.findByUser(searchUser);
	}

	@Override
	public List<UserFabric> findUsersAllFabricsByLengthLargerThan(User theUser, int theLength) {
		return userFabricRepo.findByLengthGreaterThanEqual(theLength);
	}

	@Override
	public List<UserFabric> findAllPublicUserFabric(boolean isPublic) {
		return userFabricRepo.findByShowPublic(isPublic);
	}

	@Override
	public List<UserFabric> findUsersAllPublicFabric(User theUser, boolean isPublic) {
		return userFabricRepo.findByUserAndShowPublic(theUser, isPublic);
	}

	@Override
	public List<UserFabric> findUsersForSale(User theUser, boolean isForSale) {
		return userFabricRepo.findByUserAndForSale(theUser, isForSale);
	}

	@Override
	public List<UserFabric> findAllForSale(boolean isForSale) {
		return userFabricRepo.findByForSale(isForSale);
	}
}
