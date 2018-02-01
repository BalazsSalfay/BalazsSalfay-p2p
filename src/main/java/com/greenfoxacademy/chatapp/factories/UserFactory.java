package com.greenfoxacademy.chatapp.factories;

import com.greenfoxacademy.chatapp.models.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserFactory {

  public User getNewUser() {
    return new User();
  }
}
