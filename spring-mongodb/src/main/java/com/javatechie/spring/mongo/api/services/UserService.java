package com.javatechie.spring.mongo.api.services;
import java.util.*;

import com.javatechie.spring.mongo.api.entity.User;

public interface UserService {
   public User userService(User user);
   public List<User> getUsers();
   public User updateUser(long id,User user);
   public void deleteUser(Long id);
public User saveUser(User user);
   
   
}
