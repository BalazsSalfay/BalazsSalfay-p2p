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
import java.util.Random;

@Entity
public class Message {

  @Id
  private long id;
  private String timestamp;
  private String username;
  private String text;

  public Message() {
    this.timestamp = LocalDateTime.now().toString();
  }

  public Message(String username, String text) {
    this.username = username;
    this.text = text;
    this.id = randomGeneratedId();
    this.timestamp = LocalDateTime.now().toString();
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = randomGeneratedId();
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

  public long randomGeneratedId() {
    return (long) (Math.random() * 99999999 + 1000000 );
  }
}
