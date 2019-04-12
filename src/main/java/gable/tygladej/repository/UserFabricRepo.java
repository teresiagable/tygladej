package gable.tygladej.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import gable.tygladej.entity.Fabric;
import gable.tygladej.entity.User;
import gable.tygladej.entity.UserFabric;

public interface UserFabricRepo extends CrudRepository<UserFabric, Integer>{

	List<UserFabric> findByFabric(Fabric searchFabric);

	List<UserFabric> findByUser(User searchUser);

	List<UserFabric> findByLengthGreaterThanEqual(int theLength);

	List<UserFabric> findByShowPublic(boolean isPublic);

	List<UserFabric> findByForSale(boolean isForSale);

	List<UserFabric> findByUserAndShowPublic(User theUser, boolean isPublic);

	List<UserFabric> findByUserAndForSale(User theUser, boolean isForSale);

}
