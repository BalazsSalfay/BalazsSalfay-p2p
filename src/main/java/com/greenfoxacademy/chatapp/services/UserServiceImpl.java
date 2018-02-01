package com.greenfoxacademy.chatapp.services;

import com.greenfoxacademy.chatapp.models.entities.User;
import com.greenfoxacademy.chatapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserRepository userRepository;

  @Override
  public void create(User user) {
    userRepository.save(user);
  }

  @Override
  public void delete(int id) {
    userRepository.delete(id);
  }

  @Override
  public void update(User user) {
    User updatedUser = userRepository.findOne(user.getId());
    updatedUser.setUsername(user.getUsername());
    userRepository.save(updatedUser);
  }

  @Override
  public boolean isNameInTheList(String username) {
    return !(userRepository.findUserByUsername(username).isEmpty());
  }

  @Override
  public boolean isUserExist() {
    return (userRepository.findOne(1) != null);
  }

  @Override
  public User getUserById(int id) {
    return userRepository.findUserById(id);
  }
}
