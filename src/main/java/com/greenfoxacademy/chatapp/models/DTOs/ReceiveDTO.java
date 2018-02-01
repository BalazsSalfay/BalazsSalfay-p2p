package com.greenfoxacademy.chatapp.models.DTOs;

import com.greenfoxacademy.chatapp.models.entities.Client;
import com.greenfoxacademy.chatapp.models.entities.Message;

public class ReceiveDTO {

  private Message message;
  private Client client;

  public ReceiveDTO() {
  }

  public ReceiveDTO(Message message, Client client) {
    this.message = message;
    this.client = client;
  }

  public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }
}
