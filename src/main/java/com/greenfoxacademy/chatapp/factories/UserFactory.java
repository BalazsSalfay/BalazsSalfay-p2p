package com.greenfoxacademy.chatapp.factories;

import com.greenfoxacademy.chatapp.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserFactory {

  public User getNewUser() {
    return new User();
  }
}
