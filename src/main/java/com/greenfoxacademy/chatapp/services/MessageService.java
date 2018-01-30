package com.greenfoxacademy.chatapp.services;

import com.greenfoxacademy.chatapp.models.Message;
import com.greenfoxacademy.chatapp.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageService {

  void create(Message message, User user);
  List<Message> findAllMessages();
}
