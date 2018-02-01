package com.greenfoxacademy.chatapp.controllers;

import com.greenfoxacademy.chatapp.models.DTOs.ReceiveDTO;
import com.greenfoxacademy.chatapp.models.entities.Client;
import com.greenfoxacademy.chatapp.models.entities.Error;
import com.greenfoxacademy.chatapp.models.entities.Message;
import com.greenfoxacademy.chatapp.models.entities.User;
import com.greenfoxacademy.chatapp.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChatRestController {

  @Autowired
  MessageService messageService;

  @Autowired
  Error error;

  @PostMapping("/api/message/receive")
  @CrossOrigin("*")
  public ReceiveDTO getMessage(@RequestBody ReceiveDTO receiveDTO) {
    if (receiveDTO != null) {
      messageService.saveMessage(receiveDTO.getMessage(), new User(receiveDTO.getMessage().getUsername()));
      return new ReceiveDTO(receiveDTO.getMessage(),receiveDTO.getClient());
    } else {
      return new ReceiveDTO(receiveDTO.getMessage(), receiveDTO.getClient());
    }
  }
}
