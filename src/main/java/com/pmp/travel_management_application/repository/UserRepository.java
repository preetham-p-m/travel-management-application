package com.pmp.travel_management_application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pmp.travel_management_application.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserNameOrEmail(String userId, String email);
}
