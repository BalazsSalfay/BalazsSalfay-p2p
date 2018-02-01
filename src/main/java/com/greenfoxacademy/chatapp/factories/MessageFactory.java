package com.greenfoxacademy.chatapp.factories;

import com.greenfoxacademy.chatapp.models.entities.Message;
import org.springframework.stereotype.Component;

@Component
public class MessageFactory {

  public Message getNewMessage() {
    return new Message();
  }

  public Message getDefaultMessage() {
    return new Message("App","Hi there! Submit your message using the send button!");
  }
}
