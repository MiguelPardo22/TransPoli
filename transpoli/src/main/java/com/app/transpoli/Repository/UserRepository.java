package com.app.transpoli.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.transpoli.Models.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByEmail(String email);
}
