package com.greenfoxacademy.chatapp.services;

import com.greenfoxacademy.chatapp.models.entities.Message;
import com.greenfoxacademy.chatapp.models.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageService {

  void saveMessage(Message message, User user);
  List<Message> findAllMessages();
}
