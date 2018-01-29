package com.greenfoxacademy.chatapp.services;

import com.greenfoxacademy.chatapp.models.User;
import com.greenfoxacademy.chatapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    userRepository.save(user);
  }

  @Override
  public boolean isNameInTheList(String username) {
    return !(userRepository.findUserByUsername(username).isEmpty());
  }
}
