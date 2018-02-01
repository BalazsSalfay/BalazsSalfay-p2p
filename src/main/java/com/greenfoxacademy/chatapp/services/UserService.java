package com.greenfoxacademy.chatapp.services;

import com.greenfoxacademy.chatapp.models.entities.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

  void create(User user);
  void delete(int id);
  void update(User user);
  boolean isNameInTheList(String username);
  boolean isUserExist();
  User getUserById(int id);
}
