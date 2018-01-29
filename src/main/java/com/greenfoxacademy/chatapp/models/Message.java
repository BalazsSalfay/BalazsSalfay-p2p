package com.greenfoxacademy.chatapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Message {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String timestamp;
  private String username;
  private String text;

  public Message() {
  }

  public Message(long id, String timestamp, String username, String text) {
    this.id = id;
    this.timestamp = LocalDateTime.now().toString();
    this.username = username;
    this.text = text;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
