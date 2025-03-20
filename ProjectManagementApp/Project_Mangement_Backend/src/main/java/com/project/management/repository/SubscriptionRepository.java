package com.project.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.management.model.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription,Long> {
    Subscription findByUserId(Long userId);
}
