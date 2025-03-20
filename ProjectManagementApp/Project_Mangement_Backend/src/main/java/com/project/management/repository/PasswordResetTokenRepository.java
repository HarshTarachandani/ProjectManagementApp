package com.project.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.management.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
