package com.greenfoxacademy.chatapp.controllers;

import com.greenfoxacademy.chatapp.factories.UserFactory;
import com.greenfoxacademy.chatapp.models.Error;
import com.greenfoxacademy.chatapp.models.User;
import com.greenfoxacademy.chatapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class ChatWebController {

  @Autowired
  UserFactory userFactory;

  @Autowired
  UserService userService;

  @Autowired
  Error error;

  @GetMapping("/enter")
  public String showEnterPage(Model model) {
    User user = userFactory.getNewUser();
    model.addAttribute("user", user);
    return "enter";
  }

  @PostMapping("/enter")
  public String enterIntoTheMainPage(@ModelAttribute User user, Model model) {
    if (user.getUsername().isEmpty()) {
      model.addAttribute("error", "The username field is empty. Please choose a username!");
      return "enter";
    } else if (userService.isNameInTheList(user.getUsername())) {
      model.addAttribute("error", "The username is already exist! Please choose another one!");
      return "enter";
    } else {
      userService.create(user);
      return "redirect:/";
    }
  }

  @GetMapping("/")
  public String showMainPage(@ModelAttribute User user, Model model) {
    if (!userService.isUserExist()) {
      return "redirect:/enter";
    } else {
      model.addAttribute("user", userService.getUserById(1));
      return "index";
    }
  }

  @PostMapping("/")
    public String updateUsername(@ModelAttribute User user, Model model) {
      if (user.getUsername().isEmpty()) {
        model.addAttribute("error", "The username field is empty. Please choose a username!");
        return "index";
      } else if (userService.isNameInTheList(user.getUsername())) {
        model.addAttribute("error", "The username is already exist! Please choose another one!");
        return "index";
      } else {
        userService.update(user);
        return "redirect:/";
      }
    }

}

