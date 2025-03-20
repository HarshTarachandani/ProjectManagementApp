package com.project.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.management.model.Chat;
import com.project.management.model.Project;

public interface ChatRepository extends JpaRepository<Chat, Long> {
    

	Chat findByProject(Project projectById);
	
//	List<Chat> findByProjectNameContainingIgnoreCase(String projectName);
}

