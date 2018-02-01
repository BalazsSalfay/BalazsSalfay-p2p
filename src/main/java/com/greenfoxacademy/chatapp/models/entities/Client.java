package com.greenfoxacademy.chatapp.models.entities;

public class Client {

  private String id;
  private String address;

  public Client() {
    this.id = System.getenv("CHAT_APP_UNIQUE_ID");
    this.address = System.getenv("CHAT_APP_PEER_ADDRESS");
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
