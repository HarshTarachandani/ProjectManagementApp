package com.project.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.management.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long>{
	 List<Message> findByChatIdOrderByCreatedAtAsc(Long chatId);
}
