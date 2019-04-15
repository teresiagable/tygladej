package gable.tygladej.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import gable.tygladej.entity.User;

public interface UserRepo extends CrudRepository<User,Integer>{

	List<User> findByNameLike(String searchName);

	User findUserById(int userId);

}
