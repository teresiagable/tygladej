package gable.tygladej.service;

import java.util.List;
import java.util.Optional;

import gable.tygladej.entity.User;
import gable.tygladej.repository.UserRepo;

public class UserServiceImpl implements UserService {
	
	private UserRepo userRepo;
	
	public UserServiceImpl(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}
	
/* table fields:
	this.name = name;
	this.pictureUrl = pictureUrl;
	this.email = email;
	this.password = password;
	this.createDate = createDate;
	this.lastLoginDate = lastLoginDate;
*/
	

	/**
	 * @param productId
	 * @param updated
	 * @return
	 * @throws EntityNotFoundException
	 */
	@Override
	public User findUserById(int id) {
		Optional<User> result = userRepo.findById(id);
		return result.orElseThrow(IllegalArgumentException::new);
	}
	
	@Override
	public List<User> findAll() {
		return (List<User>) userRepo.findAll();
		
	}
 
	@Override
	public List<User> findUsersWithName(String searchName) {
		return userRepo.findByNameLike(searchName);
		
	}

	@Override
	public User save(User newUser) {
		return userRepo.save(newUser);
	}
	

	@Override
	public User update(int userId, User updatedUser) {
		
		User original = findUserById(userId);		
			original.setName(updatedUser.getName());
			original.setEmail(updatedUser.getEmail());
			original.setPictureUrl(updatedUser.getPictureUrl());
		return userRepo.save(original);
	
	}
}
