package com.project.management.service;

import java.util.List;

import com.project.management.exception.IssueException;
import com.project.management.exception.UserException;
import com.project.management.model.Comment;

public interface CommentService {
    Comment createComment(Long issueId,Long userId,String comment) throws UserException, IssueException;

    void  deleteComment(Long commentId, Long userId) throws UserException, IssueException;

    List<Comment> findCommentByIssueId(Long issueId);

}
