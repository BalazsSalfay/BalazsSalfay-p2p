package com.greenfoxacademy.chatapp.repositories;

import com.greenfoxacademy.chatapp.models.entities.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends CrudRepository<Message, Integer> {
}
