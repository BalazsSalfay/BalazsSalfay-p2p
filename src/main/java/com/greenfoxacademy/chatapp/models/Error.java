package com.greenfoxacademy.chatapp.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
public class Error {

  private String status;

  public Error() {
  }

  public Error(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
