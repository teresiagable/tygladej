package gable.tygladej.service;

import java.util.List;
import java.util.Optional;

import gable.tygladej.entity.User;
import gable.tygladej.repository.UserRepo;

public class UserServiceImpl implements UserService {
	
	private UserRepo userRepo;
/*
	this.name = name;
	this.pictureUrl = pictureUrl;
	this.email = email;
	this.password = password;
	this.createDate = createDate;
	this.lastLoginDate = lastLoginDate;
*/
	
	@Override
	public User findUserById(int id) {
		Optional<User> result = userRepo.findById(id);
		return result.orElseThrow(IllegalArgumentException::new);
	}

	@Override
	public List<User> findUsersWithName(String searchName) {
		return userRepo.findByNameLike(searchName);
		
	}
}
