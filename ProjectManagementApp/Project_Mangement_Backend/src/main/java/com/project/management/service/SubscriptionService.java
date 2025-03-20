package com.project.management.service;

import com.project.management.domain.PlanType;
import com.project.management.model.Subscription;
import com.project.management.model.User;

public interface SubscriptionService {
    Subscription createSubscription(User user);
    Subscription getUserSubscription(Long userId) throws Exception;
    Subscription upgradeSubscription(Long userId, PlanType planType);

    boolean isValid(Subscription subscription);
}
