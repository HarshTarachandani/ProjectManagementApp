package com.project.management.service;

import java.util.List;

import com.project.management.exception.ChatException;
import com.project.management.exception.ProjectException;
import com.project.management.exception.UserException;
import com.project.management.model.Message;

public interface MessageService {

    Message sendMessage(Long senderId, Long chatId, String content) throws UserException, ChatException, ProjectException;

    List<Message> getMessagesByProjectId(Long projectId) throws ProjectException, ChatException;
}

