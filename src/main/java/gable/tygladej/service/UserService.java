package gable.tygladej.service;

import java.util.List;

import gable.tygladej.entity.User;

public interface UserService {

	User findUserById(int id);
	
	List<User> findAll();

	List<User> findUsersWithName(String searchName);
	
	User save(User newUser);
	
	User update(int userId, User updatedUser);

}