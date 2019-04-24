package gable.tygladej.service;

import java.util.List;

import gable.tygladej.entity.Fabric;
import gable.tygladej.entity.User;
import gable.tygladej.entity.UserFabric;

public interface UserFabricService {

	/** table fields
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

	UserFabric findById(int id);

	List<UserFabric> findAllUsersWithFabric(Fabric searchFabric);

	List<UserFabric> findUsersAllFabric(User searchUser);

	List<UserFabric> findUsersAllFabric(int id);

	List<UserFabric> findUsersAllFabricsByLengthLargerThan(User theUser, int theLength);

	List<UserFabric> findAllPublicUserFabric(boolean isPublic);

	List<UserFabric> findUsersAllPublicFabric(User theUser, boolean isPublic);

	List<UserFabric> findUsersForSale(User theUser, boolean isForSale);

	List<UserFabric> findAllForSale(boolean isForSale);




}