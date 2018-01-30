package com.greenfoxacademy.chatapp.services;

import com.greenfoxacademy.chatapp.models.Message;
import com.greenfoxacademy.chatapp.models.User;
import com.greenfoxacademy.chatapp.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

  @Autowired
  MessageRepository messageRepository;

  @Override
  public void create(Message message, User user) {
    message.setUsername(user.getUsername());
    messageRepository.save(message);
  }

  @Override
  public List<Message> findAllMessages() {
    return (List<Message>) messageRepository.findAll();
  }
}
