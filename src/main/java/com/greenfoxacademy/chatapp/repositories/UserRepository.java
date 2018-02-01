package com.greenfoxacademy.chatapp.repositories;

import com.greenfoxacademy.chatapp.models.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

  List<User> findUserByUsername(String username);
  User findUserById(int id);
}
