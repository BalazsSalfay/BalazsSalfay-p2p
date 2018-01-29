package com.greenfoxacademy.chatapp.services;

import com.greenfoxacademy.chatapp.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

  void create(User user);
  void delete(int id);
  void update(User user);
  boolean isNameInTheList(String username);
}
