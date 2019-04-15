package gable.tygladej.service;

import java.util.List;

import gable.tygladej.entity.User;

public interface UserService {

	User findUserById(int id);

	List<User> findUsersWithName(String searchName);

}