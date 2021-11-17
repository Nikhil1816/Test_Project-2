package com.javatechie.spring.mongo.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.spring.mongo.api.entity.User;
import com.javatechie.spring.mongo.api.repository.UserRepository;
import com.javatechie.spring.mongo.api.services.UserService;
@Service
public abstract class UserServiceImpl implements UserService {
   
	@Autowired
	private UserRepository userRepository;
	@Override
	public User userService(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User updateUser(long id, User user) {
		// TODO Auto-generated method stub
		Optional<User> findById=userRepository.findById(id);
		if(findById.isPresent()) {
			User userEntity=findById.get();
			if(user.getName()!=null&&!user.getName().isEmpty()) {
				userEntity.setName(user.getName());
			}if(user.getName()!=null) {
				userEntity.setAge(user.getAge());
			}userRepository.save(userEntity);
		}
		return user;
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
	    userRepository.deleteById(id);
	    
	}

}
