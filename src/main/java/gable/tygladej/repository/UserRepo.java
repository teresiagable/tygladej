package gable.tygladej.repository;

import org.springframework.data.repository.CrudRepository;

import gable.tygladej.entity.User;

public interface UserRepo extends CrudRepository<User,Integer>{

}
