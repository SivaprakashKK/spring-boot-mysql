package com.example.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.db.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
